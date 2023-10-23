package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.base;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
@ToString(callSuper = true)
@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
public class NamedEntity extends BaseEntity {
    private static final long serialVersionUID = -701453400504180336L;

    @Column(name = "NAME", nullable = false, unique = true)
    private String name;
    @Column(name = "DISPLAY_NAME")
    private String displayName;
}