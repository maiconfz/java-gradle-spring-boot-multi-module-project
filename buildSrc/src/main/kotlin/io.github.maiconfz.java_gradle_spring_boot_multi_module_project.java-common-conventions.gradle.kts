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
    implementation("com.google.guava:guava:32.1.3-jre")
    implementation("org.apache.commons:commons-lang3:3.13.0")
    implementation("org.apache.commons:commons-collections4:4.4")
    implementation("org.apache.commons:commons-text:1.10.0")
    implementation("org.tinylog:tinylog-api:2.6.2")
    implementation("org.tinylog:tinylog-impl:2.6.2")
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
