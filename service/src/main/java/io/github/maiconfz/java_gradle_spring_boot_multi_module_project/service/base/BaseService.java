package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.base;

import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;

public interface BaseService<T> {

    T create(T o);

    T update(T o);

    boolean exists(T o);

    boolean exists(UUID id);

    Stream<T> findAll();

    Optional<T> findById(UUID id);

    T approve(T o);

    void delete(T o);

    void hardDelete(T o);

}
