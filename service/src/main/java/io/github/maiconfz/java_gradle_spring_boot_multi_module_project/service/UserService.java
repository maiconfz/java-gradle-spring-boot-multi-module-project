package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service;

import java.util.Optional;

import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.User;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.base.NamedEntityService;

public interface UserService extends NamedEntityService<User> {

    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);
}
