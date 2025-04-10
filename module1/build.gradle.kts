group = rootProject.group
version = rootProject.version

plugins {
    kotlin("jvm") // Ensure Kotlin plugin is applied
}

dependencies {
    implementation(project(":module2")) // Existing dependency
    testImplementation(libs.junit.jupiter.api) // Reference from libs.versions.toml
    testRuntimeOnly(libs.junit.jupiter.engine) // Reference from libs.versions.toml
}


// Add this test configuration block:
tasks.test {
    useJUnitPlatform() // Enable JUnit 5
    testLogging {
        events("passed", "skipped", "failed") // Show test results in logs
    }
}