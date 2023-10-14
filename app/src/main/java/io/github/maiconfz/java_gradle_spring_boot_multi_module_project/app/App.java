package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "io.github.maiconfz")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
