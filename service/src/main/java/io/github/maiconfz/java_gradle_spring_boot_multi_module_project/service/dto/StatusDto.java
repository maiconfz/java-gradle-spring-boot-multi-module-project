package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.dto;

import java.util.UUID;

import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.Status;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class StatusDto extends NamedDto {

    @EqualsAndHashCode.Include
    private final UUID id;

    public static StatusDtoBuilder<?, ?> builderOf(Status status) {
        return StatusDto.builder().id(status.getId()).name(status.getName()).displayName(status.getName());
    }

    public static StatusDto of(Status status) {
        return builderOf(status).build();
    }
}
