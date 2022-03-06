package com.petclinic.petclinic.model;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
@Component
public class pet extends BaseEntity {
    private  Owner owner;
    private petType petType;
    private LocalDate birthDay;

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public petType getPetType() {
        return petType;
    }

    public void setPetType(petType petType) {
        this.petType = petType;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }
}
