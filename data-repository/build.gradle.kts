plugins {
    id("io.github.maiconfz.java_gradle_spring_boot_multi_module_project.java-library-conventions")
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation(project(":data-model"))
}
