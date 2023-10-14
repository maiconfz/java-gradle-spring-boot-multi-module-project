package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.transaction.annotation.Transactional;

import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.Status;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.User;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.repository.base.NamedEntityRepository;

public interface UserRepository extends NamedEntityRepository<User, UUID> {

    @Transactional(readOnly = true)
    Optional<User> findByUsername(String username);

    @Transactional(readOnly = true)
    Optional<User> findByEmail(String email);

    @Transactional(readOnly = true)
    Optional<User> findByEmailAndStatus(String email, Status status);

}
