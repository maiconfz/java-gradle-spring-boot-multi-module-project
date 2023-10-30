package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.Status;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.enums.StatusEnum;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.repository.base.NamedEntityRepository;

public interface StatusRepository extends NamedEntityRepository<Status, UUID> {
    @Query(value = "select s from #{#entityName} s where s.name = :#{#statusEnum.name}")
    public Status findByStatusEnum(@Param("statusEnum") StatusEnum statusEnum);
}
