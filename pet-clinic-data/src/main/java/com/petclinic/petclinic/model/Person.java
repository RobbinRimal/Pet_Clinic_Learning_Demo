package com.petclinic.petclinic.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Getter
@MappedSuperclass
@Setter
public class Person extends  BaseEntity{
    @Column(name = "first_name")
    private  String firstname;
    @Column(name = "last_name")
    private  String lastname;


}
