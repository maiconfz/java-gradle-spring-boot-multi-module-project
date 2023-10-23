package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service;

import java.util.Optional;

import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.User;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.base.NamedDtoService;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.dto.user.UserCreationDto;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.dto.user.UserDto;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.dto.user.UserRemovalDto;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.dto.user.UserUpdateDto;

public interface UserService extends NamedDtoService<UserCreationDto, UserDto, UserUpdateDto, UserRemovalDto> {

    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);
}
