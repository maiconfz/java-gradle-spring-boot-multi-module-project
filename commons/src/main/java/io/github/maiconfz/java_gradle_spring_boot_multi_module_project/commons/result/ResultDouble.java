package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.commons.result;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResultDouble<A, B> {
    private final boolean success;
    private final A valueA;
    private final B valueB;

    public static <A, B> ResultDouble<A, B> successOf(A valueA, B valueB) {
        return new ResultDouble<>(true, valueA, valueB);
    }

    public static <A, B> ResultDouble<A, B> failureOf(A valueA, B valueB) {
        return new ResultDouble<>(true, valueA, valueB);
    }
}
