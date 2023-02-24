plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.android.kotlin)
    alias(libs.plugins.hilt)
//    alias(libs.plugins.google.firebase)
    id("kotlin-kapt")
}
kapt {
    correctErrorTypes =  true
}

android {
    namespace = "com.northsoltech.app"
    compileSdk = libs.versions.sdk.get().toInt()

    defaultConfig {
        applicationId = "com.northsoltech.bikeagb"
        minSdk = libs.versions.minSdk.get().toInt()
        targetSdk = libs.versions.sdk.get().toInt()
        versionCode  = 1
        versionName  = "1.0.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        signingConfig = signingConfigs.getByName("debug")
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        debug {}
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.compose.compiler.v.get()
    }
    compileOptions {
        isCoreLibraryDesugaringEnabled = true
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }

    buildFeatures {
        compose  = true
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
            excludes += "/META-INF/INDEX.LIST"
            excludes += "/META-INF/DEPENDENCIES"
        }
    }
}

dependencies {
    implementation(project(":framework"))
    implementation(project(":feature:sign"))
    implementation(project(":feature:home"))
    implementation(project(":core:network"))

    coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:1.2.2")

    implementation(libs.bundles.di)
    kapt(libs.bundles.di.kapt)

//    //Dagger - Hilt
//    implementation "com.google.dagger:hilt-android:$hilt_plugin_version"
//    kapt "com.google.dagger:hilt-android-compiler:$hilt_plugin_version"
//    kapt "androidx.hilt:hilt-compiler:1.0.0"
//    implementation 'androidx.hilt:hilt-navigation-compose:1.0.0'
//
//    testImplementation 'junit:junit:4.13.2'
//    testImplementation 'com.google.truth:truth:1.1.3'
//    androidTestImplementation 'androidx.test.ext:junit:1.1.3'
//    androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'
//    androidTestImplementation 'com.google.truth:truth:1.1.3'
//    androidTestImplementation "androidx.compose.ui:ui-test-junit4:$compose_version"
//    debugImplementation "androidx.compose.ui:ui-tooling:$compose_version"
//    debugImplementation "androidx.compose.ui:ui-test-manifest:$compose_version"
////    implementation("androidx.appcompat:appcompat:1.3.1")';9/

}