pluginManagement {
    val redirectModule = mapOf(
        "dagger.hilt.android.plugin" to "com.google.dagger:hilt-android-gradle-plugin",
        "com.google.firebase.crashlytics" to "com.google.firebase:firebase-crashlytics-gradle"
    )

    resolutionStrategy {
        eachPlugin {
            if (requested.id.id in redirectModule) {
                useModule("${redirectModule[requested.id.id]}:${requested.version}")
            }
        }
    }

    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven(url = "https://www.jitpack.io")
    }
}
rootProject.name = "CurrencyConvertor"
include(":app")
include(":framework")
include(":core")
include(":core:domain")
include(":core:network")
include(":feature")
include(":feature:home")
