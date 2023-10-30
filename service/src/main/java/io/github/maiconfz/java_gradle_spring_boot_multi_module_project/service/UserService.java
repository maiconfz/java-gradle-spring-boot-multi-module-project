package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service;

import java.util.Optional;

import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.base.NamedDtoService;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.dto.UserDto;

public interface UserService extends NamedDtoService<UserDto> {

    Optional<UserDto> findByEmail(String email);
}
