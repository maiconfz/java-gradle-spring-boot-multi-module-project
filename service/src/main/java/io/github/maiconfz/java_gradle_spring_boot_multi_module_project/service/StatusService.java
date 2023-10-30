package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service;

import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.enums.StatusEnum;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.base.NamedDtoService;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.dto.StatusDto;

public interface StatusService extends NamedDtoService<StatusDto> {

    StatusDto findByStatusEnum(StatusEnum statusEnum);

}
