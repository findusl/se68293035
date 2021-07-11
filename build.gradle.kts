import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile

plugins {
    kotlin("js") version "1.5.20"
}

group = "de.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(npm("obsidian", "0.12.5", false))
}

kotlin {
    js(IR) {
        moduleName = "main"
        binaries.executable()
        browser {
            webpackTask {
                output.libraryTarget = "umd"
            }
        }
    }
}

tasks.withType<KotlinJsCompile>().configureEach {
    kotlinOptions.moduleKind = "umd"
}
