package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.impl;

import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.Status;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.enums.StatusEnum;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.StatusService;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.dto.status.StatusCreationDto;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.dto.status.StatusDto;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.dto.status.StatusRemovalDto;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.dto.status.StatusUpdateDto;

public class StatusServiceImpl implements StatusService {

    @Override
    public Optional<StatusDto> findByName(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByName'");
    }

    @Override
    public StatusCreationDto create(StatusCreationDto o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public StatusUpdateDto update(StatusUpdateDto o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Stream<StatusDto> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Page<StatusDto> findAll(Pageable pageable) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Optional<StatusDto> findById(UUID id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public Stream<StatusDto> findAllById(Stream<UUID> ids) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAllById'");
    }

    @Override
    public StatusDto validateExistenceAndFind(StatusDto o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'validateExistenceAndFind'");
    }

    @Override
    public Stream<StatusDto> validateExistenceAndFind(Stream<StatusDto> stream) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'validateExistenceAndFind'");
    }

    @Override
    public StatusUpdateDto approve(StatusUpdateDto o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'approve'");
    }

    @Override
    public void delete(StatusRemovalDto o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public void hardDelete(StatusRemovalDto o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hardDelete'");
    }

    @Override
    public Status findByStatusEnum(StatusEnum statusEnum) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByStatusEnum'");
    }

}
