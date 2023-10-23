package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.dto.user;

import java.util.UUID;

import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.dto.base.NamedDto;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class UserDto extends NamedDto {
    @EqualsAndHashCode.Include
    private final UUID id;
    private final String email;
}
