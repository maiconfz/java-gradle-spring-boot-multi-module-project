/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("io.github.maiconfz.java_gradle_spring_boot_multi_module_project.java-application-conventions")
}

dependencies {
    implementation("org.apache.commons:commons-text")
    implementation(project(":utilities"))
}

application {
    // Define the main class for the application.
    mainClass.set("io.github.maiconfz.java_gradle_spring_boot_multi_module_project.app.App")
}
