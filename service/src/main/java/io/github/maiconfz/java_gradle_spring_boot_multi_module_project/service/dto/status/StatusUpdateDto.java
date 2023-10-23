package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.dto.status;

import java.util.UUID;

import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.dto.base.NamedDto;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@ToString
@EqualsAndHashCode(callSuper = true)
public class StatusUpdateDto extends NamedDto {
    private final UUID id;
}
