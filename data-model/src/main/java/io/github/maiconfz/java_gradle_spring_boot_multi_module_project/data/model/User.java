package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model;

import java.util.Set;

import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.base.NamedEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "USER")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
@ToString(callSuper = true, onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
public class User extends NamedEntity {
    private static final long serialVersionUID = 4690675104269372053L;

    @Column(name = "EMAIL", nullable = false)
    @ToString.Include
    private String email;

    @Column(name = "PASSWORD", nullable = false)
    @ToString.Include
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "USER_USER_ROLE", joinColumns = @JoinColumn(name = "USER_ID"), inverseJoinColumns = @JoinColumn(name = "USER_ROLE_ID"))
    private Set<UserRole> roles;

    @OneToOne(mappedBy = "user")
    @JoinColumn(name = "SYS_ADMIN_ID")
    private SysAdmin sysAdmin;
}
