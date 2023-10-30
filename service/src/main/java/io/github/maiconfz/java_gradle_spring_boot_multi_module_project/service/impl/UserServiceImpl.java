package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.impl;

import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;

import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.User;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.enums.StatusEnum;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.repository.StatusRepository;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.repository.UserRepository;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.repository.UserRoleRepository;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.UserService;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.service.dto.UserDto;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserRoleRepository userRoleRepository;
    private final StatusRepository statusRepository;

    @Override
    public UserDto create(UserDto userDto) {
        final User user = User.builder().name(userDto.getName()).displayName(userDto.getDisplayName()).email(userDto.getEmail()).status(this.statusRepository.findByStatusEnum(StatusEnum.PENDING_APPROVAL)).build();

        return UserDto.of(this.userRepository.save(user));
    }

    @Override
    public boolean exists(UserDto userDto) {
        return this.exists(userDto.getId());
    }

    @Override
    public boolean exists(UUID id) {
        return this.findById(id).isPresent();
    }

    @Override
    public UserDto update(UserDto userDto) {
        final User user = this.findPersistedUserByIdOrElseThrow(userDto.getId());

        user.setDisplayName(userDto.getDisplayName());

        return UserDto.of(this.userRepository.save(user));
    }

    @Override
    public Stream<UserDto> findAll() {
        return this.userRoleRepository.findAll().map(userROle -> UserDto.builder().id(userROle.getId()).name(userROle.getName()).displayName(userROle.getDisplayName()).build());
    }

    private User findPersistedUserByIdOrElseThrow(UUID id) {
        return this.userRepository.findById(id).orElseThrow(() -> new IllegalStateException("User not found"));
    }

    @Override
    public Optional<UserDto> findById(UUID id) {
        final Optional<User> user = this.userRepository.findById(id);

        if (user.isEmpty()) {
            return Optional.empty();
        }

        return Optional.of(UserDto.of(user.get()));
    }

    @Override
    public Optional<UserDto> findByName(String name) {
        final Optional<User> user = this.userRepository.findByName(name);

        if (user.isEmpty()) {
            return Optional.empty();
        }

        return Optional.of(UserDto.of(user.get()));
    }

    @Override
    public Optional<UserDto> findByEmail(String email) {
        final Optional<User> user = this.userRepository.findByEmail(email);

        if (user.isEmpty()) {
            return Optional.empty();
        }

        return Optional.of(UserDto.of(user.get()));
    }

    @Override
    public UserDto approve(UserDto userDto) {
        final User user = this.findPersistedUserByIdOrElseThrow(userDto.getId());

        user.setStatus(this.statusRepository.findByStatusEnum(StatusEnum.ACTIVE));

        return UserDto.of(this.userRepository.save(user));
    }

    @Override
    public void delete(UserDto userDto) {
        final User user = this.findPersistedUserByIdOrElseThrow(userDto.getId());

        user.setStatus(this.statusRepository.findByStatusEnum(StatusEnum.DELETED));

        this.userRepository.save(user);
    }

    @Override
    public void hardDelete(UserDto userDto) {
        this.findPersistedUserByIdOrElseThrow(userDto.getId());
        this.userRoleRepository.deleteById(userDto.getId());
    }

}
