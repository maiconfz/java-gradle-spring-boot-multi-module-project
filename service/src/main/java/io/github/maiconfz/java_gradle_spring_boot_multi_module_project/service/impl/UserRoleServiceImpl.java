package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.impl;

import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;

import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.UserRole;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.enums.StatusEnum;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.enums.UserRoleEnum;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.repository.StatusRepository;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.repository.UserRoleRepository;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.UserRoleService;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.dto.UserRoleDto;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserRoleServiceImpl implements UserRoleService {

    private final UserRoleRepository userRoleRepository;
    private final StatusRepository statusRepository;

    @Override
    public UserRoleDto create(UserRoleDto userRoleDto) {
        final UserRole userRole = UserRole.builder().name(userRoleDto.getName()).displayName(userRoleDto.getDisplayName()).status(this.statusRepository.findByStatusEnum(StatusEnum.PENDING_APPROVAL)).build();

        return UserRoleDto.of(this.userRoleRepository.save(userRole));
    }

    @Override
    public boolean exists(UserRoleDto userRoleDto) {
        return this.exists(userRoleDto.getId());
    }

    @Override
    public boolean exists(UUID id) {
        return this.findById(id).isPresent();
    }

    @Override
    public UserRoleDto update(UserRoleDto userRoleDto) {
        final UserRole userRole = this.findPersistedUserRoleByIdOrElseThrow(userRoleDto.getId());

        userRole.setDisplayName(userRoleDto.getDisplayName());

        return UserRoleDto.of(this.userRoleRepository.save(userRole));
    }

    @Override
    public Stream<UserRoleDto> findAll() {
        return this.userRoleRepository.findAll().map(userROle -> UserRoleDto.builder().id(userROle.getId()).name(userROle.getName()).displayName(userROle.getDisplayName()).build());
    }

    private UserRole findPersistedUserRoleByIdOrElseThrow(UUID id) {
        return this.userRoleRepository.findById(id).orElseThrow(() -> new IllegalStateException("UserRole not found"));
    }

    @Override
    public Optional<UserRoleDto> findById(UUID id) {
        final Optional<UserRole> userRole = this.userRoleRepository.findById(id);

        if (userRole.isEmpty()) {
            return Optional.empty();
        }

        return Optional.of(UserRoleDto.of(userRole.get()));
    }

    @Override
    public UserRoleDto findByUserRoleEnum(UserRoleEnum userRoleEnum) {
        return UserRoleDto.of(this.userRoleRepository.findByUserRoleEnum(userRoleEnum));
    }

    @Override
    public Optional<UserRoleDto> findByName(String name) {
        final Optional<UserRole> userRole = this.userRoleRepository.findByName(name);

        if (userRole.isEmpty()) {
            return Optional.empty();
        }

        return Optional.of(UserRoleDto.of(userRole.get()));
    }

    @Override
    public UserRoleDto approve(UserRoleDto userRoleDto) {
        final UserRole userRole = this.findPersistedUserRoleByIdOrElseThrow(userRoleDto.getId());

        userRole.setStatus(this.statusRepository.findByStatusEnum(StatusEnum.ACTIVE));

        return UserRoleDto.of(this.userRoleRepository.save(userRole));
    }

    @Override
    public void delete(UserRoleDto userRoleDto) {
        final UserRole userRole = this.findPersistedUserRoleByIdOrElseThrow(userRoleDto.getId());

        userRole.setStatus(this.statusRepository.findByStatusEnum(StatusEnum.DELETED));

        this.userRoleRepository.save(userRole);
    }

    @Override
    public void hardDelete(UserRoleDto userRoleDto) {
        this.findPersistedUserRoleByIdOrElseThrow(userRoleDto.getId());
        this.userRoleRepository.deleteById(userRoleDto.getId());
    }

}
