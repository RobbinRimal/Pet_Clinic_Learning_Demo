package com.petclinic.petclinic.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component

public class Speciality extends BaseEntity{
private String discription;

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }
}
