package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model;

import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.base.NamedEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "SYS_ADMIN")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
@ToString(callSuper = true, onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
public class SysAdmin extends NamedEntity {
    private static final long serialVersionUID = 5733610111121661186L;

    @OneToOne(optional = false)
    @JoinColumn(name = "USER_ID")
    private User user;
}
