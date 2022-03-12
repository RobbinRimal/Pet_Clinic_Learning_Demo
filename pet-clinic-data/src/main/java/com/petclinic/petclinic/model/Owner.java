package com.petclinic.petclinic.model;

import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class Owner extends Person{
    private Set<pet> pets= new HashSet<>();
    private String address;
    private String city;
    private  String contactNo;

    public Set<pet> getPets() {
        return pets;
    }

    public void setPets(Set<pet> pets) {
        this.pets = pets;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
}
