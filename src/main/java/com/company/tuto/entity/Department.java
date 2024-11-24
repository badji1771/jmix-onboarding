package com.company.tuto.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

@JmixEntity
@Table(name = "UU1_DEPARTMENT", indexes = {
        @Index(name = "IDX_UU1_DEPARTMENT_HR_MANAGER", columnList = "HR_MANAGER_ID")
}, uniqueConstraints = {
        @UniqueConstraint(name = "IDX_UU1_DEPARTMENT_UNQ", columnNames = {"NAME"})
})
@Entity(name = "UU1_Department")
public class Department {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @InstanceName
    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;

    @NotNull
    @JoinColumn(name = "HR_MANAGER_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private User hrManager;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    public User getHrManager() {
        return hrManager;
    }

    public void setHrManager(User hrManager) {
        this.hrManager = hrManager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}