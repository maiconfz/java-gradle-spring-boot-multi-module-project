plugins {
    id("io.github.maiconfz.java_gradle_spring_boot_multi_module_project.java-application-conventions")
}

dependencies {
    implementation(project(":data"))
}

application {
    mainClass.set("io.github.maiconfz.java_gradle_spring_boot_multi_module_project.app.App")
}
