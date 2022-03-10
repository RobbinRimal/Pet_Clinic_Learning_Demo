package com.petclinic.petclinic.model;

import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class Vet extends Person{
    private Set<Speciality> speciality;

    public Set<Speciality> getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Set<Speciality> speciality) {
        this.speciality = speciality;
    }
}
