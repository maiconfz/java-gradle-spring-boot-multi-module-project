package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service;

import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.base.NamedDtoService;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.dto.user_role.UserRoleCreationDto;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.dto.user_role.UserRoleDto;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.dto.user_role.UserRoleRemovalDto;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.dto.user_role.UserRoleUpdateDto;

public interface UserRoleService
        extends NamedDtoService<UserRoleCreationDto, UserRoleDto, UserRoleUpdateDto, UserRoleRemovalDto> {
}
