package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.commons.result;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Result {
    private final boolean success;

    public static Result success() {
        return builder().success(true).build();
    }

    public static Result failure() {
        return builder().success(false).build();
    }
}
