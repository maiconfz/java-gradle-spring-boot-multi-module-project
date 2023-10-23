package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.impl;

import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.UserRoleService;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.dto.user_role.UserRoleCreationDto;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.dto.user_role.UserRoleDto;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.dto.user_role.UserRoleRemovalDto;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.dto.user_role.UserRoleUpdateDto;

public class UserRoleServiceImpl implements UserRoleService {

    @Override
    public Optional<UserRoleDto> findByName(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByName'");
    }

    @Override
    public UserRoleCreationDto create(UserRoleCreationDto o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public UserRoleUpdateDto update(UserRoleUpdateDto o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Stream<UserRoleDto> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Page<UserRoleDto> findAll(Pageable pageable) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Optional<UserRoleDto> findById(UUID id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public Stream<UserRoleDto> findAllById(Stream<UUID> ids) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAllById'");
    }

    @Override
    public UserRoleDto validateExistenceAndFind(UserRoleDto o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'validateExistenceAndFind'");
    }

    @Override
    public Stream<UserRoleDto> validateExistenceAndFind(Stream<UserRoleDto> stream) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'validateExistenceAndFind'");
    }

    @Override
    public UserRoleUpdateDto approve(UserRoleUpdateDto o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'approve'");
    }

    @Override
    public void delete(UserRoleRemovalDto o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public void hardDelete(UserRoleRemovalDto o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hardDelete'");
    }

}
