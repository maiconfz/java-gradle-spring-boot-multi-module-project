package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.dto;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class NamedDto {

    private final String name;
    private final String displayName;

}
