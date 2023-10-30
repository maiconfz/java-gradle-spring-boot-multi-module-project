package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.commons.result;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder(builderMethodName = "resultDoubleBuilder")
@Getter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class ResultDouble<A, B> extends ResultSingle<A> {
    private final B valueB;

    public static <A, B> ResultDouble<A, B> successOf(A value, B valueB) {
        return (ResultDouble<A, B>) resultDoubleBuilder().success(true).value(value).valueB(valueB).build();
    }

    public static <A, B> ResultDouble<A, B> failureOf(A value, B valueB) {
        return (ResultDouble<A, B>) resultDoubleBuilder().success(false).value(value).valueB(valueB).build();
    }

}
