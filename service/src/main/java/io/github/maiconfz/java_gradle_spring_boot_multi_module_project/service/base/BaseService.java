package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.base;

import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BaseService<C, R, U, D> {

    C create(C o);

    U update(U o);

    Stream<R> findAll();

    Page<R> findAll(Pageable pageable);

    Optional<R> findById(UUID id);

    Stream<R> findAllById(Stream<UUID> ids);

    R validateExistenceAndFind(R o);

    Stream<R> validateExistenceAndFind(Stream<R> stream);

    U approve(U o);

    void delete(D o);

    void hardDelete(D o);

}
