plugins {
    id("io.github.maiconfz.java_gradle_spring_boot_multi_module_project.java-common-conventions")
    `java-library`
}

tasks.named("bootJar") {
    enabled = false
}

tasks.named("jar") {
    enabled = true
}