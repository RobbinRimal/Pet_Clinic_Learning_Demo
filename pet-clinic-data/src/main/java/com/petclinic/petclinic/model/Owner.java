package com.petclinic.petclinic.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "owners")
@Getter
@Setter
public class Owner extends Person{
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
