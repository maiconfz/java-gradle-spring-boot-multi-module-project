/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.utilities;

import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.list.LinkedList;

public class StringUtils {
    public static String join(LinkedList source) {
        return JoinUtils.join(source);
    }

    public static LinkedList split(String source) {
        return SplitUtils.split(source);
    }
}
