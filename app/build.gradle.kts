plugins {
    id("io.github.maiconfz.java_gradle_spring_boot_multi_module_project.java-application-conventions")
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-hateoas")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.data:spring-data-rest-hal-explorer")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    implementation(project(":data"))
}
