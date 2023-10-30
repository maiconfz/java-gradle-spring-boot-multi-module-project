package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.dto;

import java.util.UUID;

import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.User;
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

    public static UserDtoBuilder<?, ?> builderOf(User user) {
        return UserDto.builder().id(user.getId()).name(user.getName()).displayName(user.getName());
    }

    public static UserDto of(User userRole) {
        return builderOf(userRole).build();
    }
}
