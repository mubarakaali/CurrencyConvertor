// To fix https://youtrack.jetbrains.com/issue/KTIJ-19369
@file:Suppress("DSL_SCOPE_VIOLATION")

import com.android.build.api.variant.ApplicationAndroidComponentsExtension
import com.android.build.api.variant.LibraryAndroidComponentsExtension

plugins {
    alias(libs.plugins.versions)
    alias(libs.plugins.versions.catelog)

    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.android.kotlin) apply false

    alias(libs.plugins.hilt) apply false
    alias(libs.plugins.kotlin.serialization) apply false
    alias(libs.plugins.google.firebase) apply false
}

versionCatalogUpdate {
    keep {
        keepUnusedVersions.set(true)
        keepUnusedLibraries.set(true)
        keepUnusedPlugins.set(true)
    }
}

fun isNonStable(version: String): Boolean {
    val stableKeyword = listOf("RELEASE", "FINAL", "GA").any { version.toUpperCase().contains(it) }
    val regex = "^[0-9,.v-]+(-r)?$".toRegex()
    val isStable = stableKeyword || regex.matches(version)
    return isStable.not()
}

tasks.withType<com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask> {
    rejectVersionIf {
        isNonStable(candidate.version)
    }
}

subprojects {
    extensions.getByTypeOrNull<ApplicationAndroidComponentsExtension>()?.apply {
        onVariants {
            if (it.name == "debug") it.packaging.resources.excludes.add("META-INF/**")
        }
    }
    extensions.getByTypeOrNull<LibraryAndroidComponentsExtension>()?.apply {
        onVariants {
            if (it.name == "debug") it.packaging.resources.excludes.add("META-INF/**")
        }
    }

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
        kotlinOptions {
            if (project.findProperty("northsoltech.enableComposeCompilerReports") == "true") {
                freeCompilerArgs += listOf(
                    "-P",
                    "plugin:androidx.compose.compiler.plugins.kotlin:reportsDestination=" + project.buildDir.absolutePath + "/compose_metrics"
                )
                freeCompilerArgs += listOf(
                    "-P",
                    "plugin:androidx.compose.compiler.plugins.kotlin:metricsDestination=" + project.buildDir.absolutePath + "/compose_metrics"
                )
            }
        }
    }
}

inline fun <reified T : Any> ExtensionContainer.getByTypeOrNull(): T? = try {
    getByType(T::class)
} catch (e: Exception) {
    null
}