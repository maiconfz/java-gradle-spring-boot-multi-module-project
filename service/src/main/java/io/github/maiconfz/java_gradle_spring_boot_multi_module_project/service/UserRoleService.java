package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service;

import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.enums.UserRoleEnum;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.base.NamedDtoService;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.dto.UserRoleDto;

public interface UserRoleService extends NamedDtoService<UserRoleDto> {

    UserRoleDto findByUserRoleEnum(UserRoleEnum userRoleEnum);

}
