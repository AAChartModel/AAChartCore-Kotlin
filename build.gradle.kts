buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath(Libs.com_android_tools_build_gradle)
        classpath(Libs.org_jetbrains_kotlin_kotlin_gradle_plugin)
    }
}

plugins {
    mavenPublish
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven(url = "https://jitpack.io")
    }
}

task<Delete>("clean") {
    delete(rootProject.buildDir)
}

tasks.withType<Javadoc> {
    options {
        this as StandardJavadocDocletOptions
        addStringOption("Xdoclint:none", "-quiet")
        addStringOption("encoding", "UTF-8")
    }
}

//For Groovy build.gradle files
project.extra.apply {
    set("minSdkVersion", AndroidConstants.minSdkVersion)
    set("targetSdkVersion", AndroidConstants.targetSdkVersion)
    set("compileSdkVersion", AndroidConstants.compileSdkVersions)
    set("buildToolsVersion", AndroidConstants.buildToolsVersion)
}
