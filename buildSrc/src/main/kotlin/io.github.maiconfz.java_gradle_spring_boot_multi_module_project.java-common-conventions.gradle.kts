plugins {
    id("org.springframework.boot") apply(false)
    id("io.spring.dependency-management")
    id("io.freefair.lombok")
    java
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
