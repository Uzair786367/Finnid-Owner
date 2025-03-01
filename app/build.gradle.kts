plugins {
    id("com.android.application")
}

android {
    namespace = "com.infotech.finnid"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.infotech.finnid"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
}

dependencies {


    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.activity:activity:1.9.0")
    testImplementation("junit:junit:4.13.2")
    //dimensions
    implementation("com.intuit.ssp:ssp-android:1.0.5")
    implementation("com.intuit.sdp:sdp-android:1.0.5")
    implementation("com.google.code.gson:gson:2.10.1")
    implementation("com.google.android.material:material:1.5.0")
    //SweetAlert
    //Retrofit
   /* implementation("androidx.lifecycle:lifecycle-extensions:2.2.0")
    annotationProcessor("androidx.lifecycle:lifecycle-compiler:2.7.0")*/
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.retrofit2:converter-scalars:2.9.0")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:retrofit-adapters:2.8.1")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.retrofit2:converter-scalars:2.9.0")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.github.f0ris.sweetalert:library:1.6.2")
    implementation("com.squareup.okhttp3:logging-interceptor:4.9.0")
    implementation("jp.wasabeef:glide-transformations:4.3.0")
    implementation("com.github.bumptech.glide:glide:4.15.1")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}