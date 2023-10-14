package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model;

import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.base.NamedEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "USER_ROLE")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
@ToString(callSuper = true, onlyExplicitlyIncluded = true)
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
public class UserRole extends NamedEntity {
    private static final long serialVersionUID = 7518558519768581574L;

}
