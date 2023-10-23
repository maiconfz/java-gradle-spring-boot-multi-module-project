package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.impl;

import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.User;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.UserService;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.dto.user.UserCreationDto;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.dto.user.UserDto;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.dto.user.UserRemovalDto;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.dto.user.UserUpdateDto;

public class UserServiceImpl implements UserService {

    @Override
    public Optional<UserDto> findByName(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByName'");
    }

    @Override
    public UserCreationDto create(UserCreationDto o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public UserUpdateDto update(UserUpdateDto o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Stream<UserDto> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Page<UserDto> findAll(Pageable pageable) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Optional<UserDto> findById(UUID id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public Stream<UserDto> findAllById(Stream<UUID> ids) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAllById'");
    }

    @Override
    public UserDto validateExistenceAndFind(UserDto o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'validateExistenceAndFind'");
    }

    @Override
    public Stream<UserDto> validateExistenceAndFind(Stream<UserDto> stream) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'validateExistenceAndFind'");
    }

    @Override
    public UserUpdateDto approve(UserUpdateDto o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'approve'");
    }

    @Override
    public void delete(UserRemovalDto o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public void hardDelete(UserRemovalDto o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hardDelete'");
    }

    @Override
    public Optional<User> findByUsername(String username) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByUsername'");
    }

    @Override
    public Optional<User> findByEmail(String email) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByEmail'");
    }

}
