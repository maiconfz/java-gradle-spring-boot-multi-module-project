package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.repository;

import java.util.UUID;

import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.Status;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.repository.base.NamedEntityRepository;

public interface StatusRepository extends NamedEntityRepository<Status, UUID> {

}
