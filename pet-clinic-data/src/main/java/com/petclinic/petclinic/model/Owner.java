package com.petclinic.petclinic.model;

import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class Owner extends Person{
    private Set<petType> pets;

    public Set<petType> getPets() {
        return pets;
    }

    public void setPets(Set<petType> pets) {
        this.pets = pets;
    }
}
