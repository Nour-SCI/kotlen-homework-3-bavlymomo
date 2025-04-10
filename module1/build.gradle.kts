plugins {
    id("org.jetbrains.kotlin.jvm") // Apply plugin directly by ID
}

group = rootProject.group
version = rootProject.version

dependencies {
    implementation(project(":module2")) // Use implementation scope

    // Add test dependencies using version catalog
    testImplementation(libs.junit.jupiter.api)
    testImplementation(libs.junit.jupiter.params)
    testRuntimeOnly(libs.junit.jupiter.engine)
    testRuntimeOnly(libs.junit.platform.console)
}

// Configure JUnit Platform for tests in this module
tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}