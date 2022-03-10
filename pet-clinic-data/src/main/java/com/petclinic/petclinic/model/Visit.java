package com.petclinic.petclinic.model;

import java.time.LocalDate;

public class Visit extends  BaseEntity{
    private LocalDate date;
    private  pet pet;
    private  String discription;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public com.petclinic.petclinic.model.pet getPet() {
        return pet;
    }

    public void setPet(com.petclinic.petclinic.model.pet pet) {
        this.pet = pet;
    }
}
