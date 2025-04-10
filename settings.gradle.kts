pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
    resolutionStrategy {
        eachPlugin {
            if (requested.id.namespace == "org.jetbrains.kotlin") {
                useVersion("1.7.21")
            }
        }
    }
}
rootProject.name = "gradle-broken-build-hw"
include("module1", "module2")