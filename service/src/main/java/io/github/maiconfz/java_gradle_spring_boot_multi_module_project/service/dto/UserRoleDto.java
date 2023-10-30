package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.dto;

import java.util.UUID;

import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.UserRole;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class UserRoleDto extends NamedDto {

    @EqualsAndHashCode.Include
    private UUID id;

    public static UserRoleDtoBuilder<?, ?> builderOf(UserRole userRole) {
        return UserRoleDto.builder().id(userRole.getId()).name(userRole.getName()).displayName(userRole.getName());
    }

    public static UserRoleDto of(UserRole userRole) {
        return builderOf(userRole).build();
    }

}
