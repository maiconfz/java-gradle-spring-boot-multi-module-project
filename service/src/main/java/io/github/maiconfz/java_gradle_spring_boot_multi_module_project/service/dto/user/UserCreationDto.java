package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.dto.user;

import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.dto.base.NamedDto;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class UserCreationDto extends NamedDto {
    private final String email;
    private final String password;
}
