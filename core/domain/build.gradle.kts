plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.android.kotlin)
    alias(libs.plugins.hilt)
    id("kotlin-kapt")
}
kapt {
    correctErrorTypes = true
}

android {
    namespace = "com.core.domain"
    compileSdk = libs.versions.sdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.minSdk.get().toInt()
        targetSdk = libs.versions.sdk.get().toInt()

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.compose.compiler.v.get()
        kotlinCompilerVersion = libs.versions.kotlin.compiler.version.v.get()
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.coroutines)
    implementation(libs.bundles.di)
    kapt(libs.bundles.di.kapt)

//    implementation "com.google.dagger:hilt-android:$hilt_plugin_version"
//    kapt "com.google.dagger:hilt-android-compiler:$hilt_plugin_version"
//    def core_coroutine_version = "1.6.1"
//
//    implementation "org.jetbrains.kotlinx:kotlinx-coroutines-android:$core_coroutine_version"
//
//    testApi 'junit:junit:4.13.2'
//    testApi 'com.google.truth:truth:1.1.3'
//    androidTestApi 'androidx.test.ext:junit:1.1.3'
//    androidTestApi 'androidx.test.espresso:espresso-core:3.4.0'
//    androidTestApi 'com.google.truth:truth:1.1.3'
//    androidTestApi "androidx.compose.ui:ui-test-junit4:$compose_version"
//    debugImplementation "androidx.compose.ui:ui-tooling:$compose_version"
//    debugImplementation "androidx.compose.ui:ui-test-manifest:$compose_version"
}
// Allow references to generated code
