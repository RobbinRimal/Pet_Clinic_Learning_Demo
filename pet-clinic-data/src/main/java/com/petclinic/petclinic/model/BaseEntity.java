package com.petclinic.petclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {
    private  Long id;

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
