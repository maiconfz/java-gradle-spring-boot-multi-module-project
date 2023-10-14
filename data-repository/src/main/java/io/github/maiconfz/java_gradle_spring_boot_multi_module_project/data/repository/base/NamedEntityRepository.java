package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.repository.base;

import java.util.Optional;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.Status;

@NoRepositoryBean
public interface NamedEntityRepository<K, ID> extends BaseEntityRepository<K, ID> {

    @Transactional(readOnly = true)
    Optional<K> findByName(String name);

    @Transactional(readOnly = true)
    Optional<K> findByNameAndStatus(String name, Status status);

}
