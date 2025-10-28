pluginManagement {
    repositories {
        // 阿里云镜像在 JitPack 环境不稳定,已注释
        // maven { url = uri("https://maven.aliyun.com/repository/gradle-plugin") }
        // maven { url = uri("https://maven.aliyun.com/repository/google") }
        // maven { url = uri("https://maven.aliyun.com/repository/central") }
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

rootProject.name = "AAChartCore-Kotlin"
include("charts", "sample")