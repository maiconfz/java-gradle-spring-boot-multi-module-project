package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service;

import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.Status;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.enums.StatusEnum;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.base.NamedEntityService;

public interface StatusService extends NamedEntityService<Status> {

    Status findByStatusEnum(StatusEnum statusEnum);
}
