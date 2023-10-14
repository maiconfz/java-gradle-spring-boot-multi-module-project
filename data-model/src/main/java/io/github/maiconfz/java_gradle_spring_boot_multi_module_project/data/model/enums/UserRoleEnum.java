package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.enums;

import java.util.Optional;
import java.util.stream.Stream;

import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.UserRole;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UserRoleEnum {
    USER("USER"),
    SYS_ADMIN("SYS_ADMIN");

    private final String name;

    public Optional<UserRoleEnum> of(UserRole userRole) {
        return Stream.of(UserRoleEnum.values()).filter(e -> e.name.equals(userRole.getName())).findFirst();
    }
}
