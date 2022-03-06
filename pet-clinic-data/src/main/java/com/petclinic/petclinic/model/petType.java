package com.petclinic.petclinic.model;

import org.springframework.stereotype.Component;

@Component
public class petType extends BaseEntity{
    private  String pettype;

    public String getPettype() {
        return pettype;
    }

    public void setPettype(String pettype) {
        this.pettype = pettype;
    }
}
