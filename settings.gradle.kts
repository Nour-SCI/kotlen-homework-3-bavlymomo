pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        google()  // Add this if needed for some plugins
    }

    // Explicit resolution strategy for Kotlin plugins
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "org.jetbrains.kotlin.jvm") {
                useVersion("1.9.0")
            }
        }
    }
}

rootProject.name = "gradle-broken-build-hw"
include("module1", "module2")