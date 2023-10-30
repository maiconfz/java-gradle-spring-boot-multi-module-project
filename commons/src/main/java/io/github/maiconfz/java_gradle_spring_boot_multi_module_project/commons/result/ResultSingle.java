package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.commons.result;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder(builderMethodName = "resultSingleBuilder")
@Getter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class ResultSingle<A> extends Result {
    private final A value;

    public static <A> ResultSingle<A> successOf(A value) {
        return (ResultSingle<A>) resultSingleBuilder().success(true).value(value).build();
    }

    public static <A> ResultSingle<A> failureOf(A value) {
        return (ResultSingle<A>) resultSingleBuilder().success(false).value(value).build();
    }

}
