package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.enums;

import java.util.Optional;
import java.util.stream.Stream;

import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StatusEnum {
    PENDING_APPROVAL("PENDING_APPROVAL"), ACTIVE("ACTIVE"), INACTIVE("INACTIVE"), DELETED("DELETED");

    private final String name;

    public Optional<StatusEnum> of(Status status) {
        return Stream.of(StatusEnum.values()).filter(e -> e.name.equals(status.getName())).findFirst();
    }
}
