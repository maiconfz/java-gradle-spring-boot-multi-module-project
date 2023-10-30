package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.impl;

import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;

import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.Status;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.enums.StatusEnum;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.repository.StatusRepository;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.StatusService;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.dto.StatusDto;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StatusServiceImpl implements StatusService {

    private final StatusRepository statusRepository;

    @Override
    public StatusDto create(StatusDto statusDto) {
        final Status status = Status.builder().name(statusDto.getName()).displayName(statusDto.getDisplayName()).status(this.statusRepository.findByStatusEnum(StatusEnum.PENDING_APPROVAL)).build();

        return StatusDto.of(this.statusRepository.save(status));
    }

    @Override
    public boolean exists(StatusDto statusDto) {
        return this.exists(statusDto.getId());
    }

    @Override
    public boolean exists(UUID id) {
        return this.findById(id).isPresent();
    }

    @Override
    public StatusDto update(StatusDto statusDto) {
        final Status status = this.findPersistedStatusByIdOrElseThrow(statusDto.getId());

        status.setDisplayName(statusDto.getDisplayName());

        return StatusDto.of(this.statusRepository.save(status));
    }

    @Override
    public Stream<StatusDto> findAll() {
        return this.statusRepository.findAll().map(status -> StatusDto.builder().id(status.getId()).name(status.getName()).displayName(status.getDisplayName()).build());
    }

    private Status findPersistedStatusByIdOrElseThrow(UUID id) {
        return this.statusRepository.findById(id).orElseThrow(() -> new IllegalStateException("Status not found"));
    }

    @Override
    public Optional<StatusDto> findById(UUID id) {
        final Optional<Status> status = this.statusRepository.findById(id);

        if (status.isEmpty()) {
            return Optional.empty();
        }

        return Optional.of(StatusDto.of(status.get()));
    }

    @Override
    public StatusDto findByStatusEnum(StatusEnum statusEnum) {
        return StatusDto.of(this.statusRepository.findByStatusEnum(statusEnum));
    }

    @Override
    public Optional<StatusDto> findByName(String name) {
        final Optional<Status> status = this.statusRepository.findByName(name);

        if (status.isEmpty()) {
            return Optional.empty();
        }

        return Optional.of(StatusDto.of(status.get()));
    }

    @Override
    public StatusDto approve(StatusDto statusDto) {
        final Status status = this.findPersistedStatusByIdOrElseThrow(statusDto.getId());

        status.setStatus(this.statusRepository.findByStatusEnum(StatusEnum.ACTIVE));

        return StatusDto.of(this.statusRepository.save(status));
    }

    @Override
    public void delete(StatusDto statusDto) {
        final Status status = this.findPersistedStatusByIdOrElseThrow(statusDto.getId());

        status.setStatus(this.statusRepository.findByStatusEnum(StatusEnum.DELETED));

        this.statusRepository.save(status);
    }

    @Override
    public void hardDelete(StatusDto statusDto) {
        this.findPersistedStatusByIdOrElseThrow(statusDto.getId());
        this.statusRepository.deleteById(statusDto.getId());
    }

}
