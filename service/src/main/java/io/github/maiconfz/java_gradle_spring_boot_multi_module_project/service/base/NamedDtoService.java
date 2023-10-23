package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.base;

import java.util.Optional;

public interface NamedDtoService<C, R, U, D> extends BaseService<C, R, U, D> {

    Optional<R> findByName(String name);

}
