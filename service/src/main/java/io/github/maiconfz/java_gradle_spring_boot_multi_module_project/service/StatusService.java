package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service;

import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.Status;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.enums.StatusEnum;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.base.NamedDtoService;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.dto.status.StatusCreationDto;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.dto.status.StatusDto;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.dto.status.StatusRemovalDto;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.dto.status.StatusUpdateDto;

public interface StatusService
        extends NamedDtoService<StatusCreationDto, StatusDto, StatusUpdateDto, StatusRemovalDto> {

    Status findByStatusEnum(StatusEnum statusEnum);
}
