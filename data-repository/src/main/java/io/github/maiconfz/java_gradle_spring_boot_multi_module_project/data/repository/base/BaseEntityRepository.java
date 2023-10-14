package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.repository.base;

import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.Status;

@NoRepositoryBean
public interface BaseEntityRepository<K, ID> extends Repository<K, ID> {

    @Transactional(readOnly = true)
    Optional<K> findById(ID id);

    K save(K entity);

    @Transactional(readOnly = true)
    Stream<K> findAll();

    @Transactional(readOnly = true)
    Page<K> findAll(Pageable pageable);

    @Transactional(readOnly = true)
    Stream<K> findAllByStatus(Status status);

}
