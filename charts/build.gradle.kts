plugins {
    id("com.android.library")
    kotlin("android")
}

buildscript {
    repositories {
        mavenCentral()
    }

}
apply(plugin = Libs.maven_publish)

android {
    compileSdkVersion(AndroidConstants.compileSdkVersions)

    defaultConfig {
        minSdkVersion(AndroidConstants.minSdkVersion)
        targetSdkVersion(AndroidConstants.targetSdkVersion)
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(Libs.gson)
}

afterEvaluate {
    configure<PublishingExtension> {
        val artifact = "charts"
        val publishedGroupId = "com.github.aachartmodel.aainfographics"
        val libraryName = "AAChartCore-Kotlin"

        publications {
            create<MavenPublication>("maven") {
                groupId = publishedGroupId
                artifactId = artifact
                version = "1.0.0"

                artifact(tasks.getByName("sourcesJar"))
                artifact("$buildDir/outputs/aar/${artifactId}-release.aar") {
                    builtBy(tasks.getByName("assemble"))
                }

                pom {
                    packaging = "aar"
                    name.set(libraryName)
                    licenses {
                        license {
                            name.set("The Apache Software License, Version 2.0")
                            url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                        }
                    }
                    withXml {
                        val dependenciesNode = asNode().appendNode("dependencies")
                        // note: replace with the desired configuration (ex: api, testImplementation, etc...)
                        configurations.getByName("implementation") {
                            dependencies.forEach {
                                val dependencyNode = dependenciesNode.appendNode("dependency")
                                dependencyNode.appendNode("groupId", it.group)
                                dependencyNode.appendNode("artifactId", it.name)
                                dependencyNode.appendNode("version", it.version)
                            }
                        }
                    }
                }
            }
        }
    }
}

val sourcesJar by tasks.registering(Jar::class) {
    archiveClassifier.set("sources")
    from(android.sourceSets.getByName("main").java.srcDirs)
}