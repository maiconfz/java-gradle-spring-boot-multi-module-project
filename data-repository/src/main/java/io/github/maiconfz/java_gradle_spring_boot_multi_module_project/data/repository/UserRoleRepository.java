package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.UserRole;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.enums.UserRoleEnum;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.repository.base.NamedEntityRepository;

public interface UserRoleRepository extends NamedEntityRepository<UserRole, UUID> {

    @Query(value = "select ur from #{#entityName} ur where ur.name = :#{#userRoleEnum.name}")
    public UserRole findByUserRoleEnum(@Param("userRoleEnum") UserRoleEnum userRoleEnum);

}
