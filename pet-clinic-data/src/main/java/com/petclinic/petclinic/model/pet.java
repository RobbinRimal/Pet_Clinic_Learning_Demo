package com.petclinic.petclinic.model;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
@Component
public class pet extends BaseEntity {

    private  Owner owner;
     private  petType petType;
    private LocalDate birthDay;
    private  String petName;

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public com.petclinic.petclinic.model.petType getPetType() {
        return petType;
    }

    public void setPetType(com.petclinic.petclinic.model.petType petType) {
        this.petType = petType;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }
}
