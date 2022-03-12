package com.petclinic.petclinic.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
@Component
public class BaseEntity implements Serializable {
    private  Long id;

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
