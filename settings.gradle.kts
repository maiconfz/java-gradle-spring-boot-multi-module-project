plugins {
    // Apply the foojay-resolver plugin to allow automatic download of JDKs
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.7.0"
}

rootProject.name = "java-gradle-spring-boot-multi-module-project"
include("app", "service", "data", "data-model", "data-repository", "commons")