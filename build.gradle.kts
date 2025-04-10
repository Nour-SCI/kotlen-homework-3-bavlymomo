import buildutils.configureDetekt
import buildutils.createDetektTask
import buildutils.configureDiktat
import buildutils.createDiktatTask
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

@Suppress("DSL_SCOPE_VIOLATION")

plugins {
//    id 'org.jetbrains.kotlin.jvm' version '1.9.0' apply false
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.buildconfig) apply false
}

group = "org.example"
version = "1.0-SNAPSHOT"

allprojects {
    repositories {
        mavenCentral()
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "1.8"
    }
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")

    dependencies {
        implementation("org.junit.jupiter:junit-jupiter-api:5.9.0")
        runtimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.0")
        runtimeOnly("org.junit.platform:junit-platform-console:1.9.0")
    }
    tasks.withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "1.8"
    }

    configureDiktat()
    configureDetekt()
}

createDiktatTask()
createDetektTask()