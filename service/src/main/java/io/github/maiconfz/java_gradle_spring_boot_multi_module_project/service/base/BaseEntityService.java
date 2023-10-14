package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.base;

import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BaseEntityService<K> {

    K register(K o);

    K update(K o);

    Stream<K> findAll();

    Page<K> findAll(Pageable pageable);

    Optional<K> findById(UUID id);

    Stream<K> findAllById(Stream<UUID> ids);

    K validateExistenceAndFind(K o);

    Stream<K> validateExistenceAndFind(Stream<K> stream);

    K approve(K o);

    void delete(K o);

    void hardDelete(K o);

}
