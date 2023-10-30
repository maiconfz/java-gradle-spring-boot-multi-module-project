package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.commons.result;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResultSingle<A> {
    private final boolean success;
    private final A value;

    public static <A> ResultSingle<A> successOf(A value) {
        return new ResultSingle<>(true, value);
    }

    public static <A> ResultSingle<A> failureOf(A value) {
        return new ResultSingle<>(false, value);
    }

}
