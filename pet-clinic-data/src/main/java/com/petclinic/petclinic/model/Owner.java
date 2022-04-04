package com.petclinic.petclinic.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "owners")
@Getter
@Setter

@NoArgsConstructor
public class Owner extends Person{



    @Builder
    public Owner(Long Id, String firstname, String lastname, String address, String city, String contactNo, Set<pet> pets) {
        super(Id, firstname, lastname);
        this.address = address;
        this.city = city;
        this.contactNo = contactNo;
        this.pets = pets;
    }

    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "contact_no")
    private  String contactNo;
    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "owner")
    @Column(name = "pets")
    private Set<pet> pets= new HashSet<>();


}
