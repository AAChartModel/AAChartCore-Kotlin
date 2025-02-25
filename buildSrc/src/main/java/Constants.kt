import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

object AndroidConstants {
    const val minSdkVersion = 19
    const val targetSdkVersion = 30
    const val compileSdkVersions = 30
    const val buildToolsVersion = "30.0.2"
}

object Versions {
    const val build_gradle_version = "7.3.1"
    const val kotlin_gradle_plugin_version = "1.9.23"
    const val bintray_plugin_version = "1.8.5"

    const val bintray_version = "1.8.5"
    const val kotlin_stdlib_version = "1.4.10"
    const val gson_version = "2.10.1"
}

object Libs {
    const val com_jfrog_bintray = "com.jfrog.bintray.gradle"
    const val maven_publish = "maven-publish"

    const val com_android_tools_build_gradle = "com.android.tools.build:gradle:${Versions.build_gradle_version}"
    const val org_jetbrains_kotlin_kotlin_gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin_gradle_plugin_version}"
    const val com_jfrog_bintray_gradle_bintray_plugin = com_jfrog_bintray + ":gradle-bintray-plugin:${Versions.bintray_plugin_version}"

    const val kotlin_jdk = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin_stdlib_version}"
    const val gson = "com.google.code.gson:gson:${Versions.gson_version}"
}

val PluginDependenciesSpec.mavenPublish: PluginDependencySpec
    inline get() = id(Libs.maven_publish)

val PluginDependenciesSpec.bintray: PluginDependencySpec
    inline get() = id(Libs.com_jfrog_bintray).version(Versions.bintray_version)