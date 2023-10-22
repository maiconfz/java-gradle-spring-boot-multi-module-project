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

    @ManyToOne
    @JoinColumn(name = "STATUS_ID")
    private Status status;

    @Column(name = "DATA_CREATION_DATE")
    @DateTimeFormat(iso = ISO.DATE_TIME)
    private LocalDateTime dataCreationDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DATA_CREATION_USER_ID")
    private User dataCreationUser;

    @Column(name = "DATA_LAST_UPDATE_DATE")
    @DateTimeFormat(iso = ISO.DATE_TIME)
    private LocalDateTime dataLastUpdateDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DATA_LAST_UPDATE_USER_ID")
    private User dataLastUpdateUser;

    @Column(name = "DATA_REMOVAL_DATE")
    @DateTimeFormat(iso = ISO.DATE_TIME)
    private LocalDateTime dataRemovalDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DATA_REMOVAL_USER_ID")
    private User dataRemovalUser;

    public boolean isNew() {
        return this.id == null;
    }
}
