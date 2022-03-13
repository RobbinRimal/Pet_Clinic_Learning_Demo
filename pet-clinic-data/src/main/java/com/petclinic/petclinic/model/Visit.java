package com.petclinic.petclinic.model;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
@Component
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

    public pet getPet() {
        return pet;
    }

    public void setPet(pet pet) {
        this.pet = pet;
    }
}
