package io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.base;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.id.uuid.UuidGenerator;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.Status;
import io.github.maiconfz.java_gradle_spring_boot_multi_module_project.data.model.User;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@MappedSuperclass
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(callSuper = true, onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = -7960279755296936677L;

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", type = UuidGenerator.class)
    @Column(name = "ID", updatable = false, nullable = false)
    @EqualsAndHashCode.Include
    @ToString.Include
    private UUID id;

    @Column(name = "REGISTER_CREATION_DATE")
    @DateTimeFormat(iso = ISO.DATE_TIME)
    private LocalDateTime registerCreationDate;

    @Column(name = "REGISTER_LAST_UPDATE_DATE")
    @DateTimeFormat(iso = ISO.DATE_TIME)
    private LocalDateTime registerLastUpdateDate;

    @Column(name = "REGISTER_DELETE_DATE")
    @DateTimeFormat(iso = ISO.DATE_TIME)
    private LocalDateTime registerDeleteDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "REGISTER_CREATOR_ID")
    private User registerCreator;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "REGISTER_LAST_UPDATE_USER_ID")
    private User registerLastUpdateUser;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "REGISTER_DELETE_USER_ID")
    private User registerDeleteUser;

    @ManyToOne
    @JoinColumn(name = "STATUS_ID")
    private Status status;

    public Boolean isNew() {
        return this.id == null;
    }
}
