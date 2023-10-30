package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.base;

import java.util.Optional;

public interface NamedDtoService<T> extends BaseService<T> {

    Optional<T> findByName(String name);

}
