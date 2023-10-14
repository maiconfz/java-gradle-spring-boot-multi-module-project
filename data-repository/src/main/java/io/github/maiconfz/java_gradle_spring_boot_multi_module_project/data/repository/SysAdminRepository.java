package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.transaction.annotation.Transactional;

import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.Status;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.SysAdmin;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.User;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.repository.base.NamedEntityRepository;

public interface SysAdminRepository extends NamedEntityRepository<SysAdmin, UUID> {

    @Transactional(readOnly = true)
    Optional<SysAdmin> findByUser(User user);

    @Transactional(readOnly = true)
    Optional<SysAdmin> findByUserAndStatus(User user, Status status);

}
