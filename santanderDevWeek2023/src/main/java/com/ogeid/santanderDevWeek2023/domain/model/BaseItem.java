package com.ogeid.santanderDevWeek2023.domain.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Icon;
    private String Description;

    public void setId(Long id) {
        this.id = id;
    }

    public void setIcon(String icon) {
        Icon = icon;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Long getId() {
        return id;
    }

    public String getIcon() {
        return Icon;
    }

    public String getDescription() {
        return Description;
    }
}
