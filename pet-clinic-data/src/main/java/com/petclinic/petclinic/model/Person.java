package com.petclinic.petclinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Getter
@MappedSuperclass
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person extends  BaseEntity{

    @Column(name = "first_name")
    private  String firstname;
    @Column(name = "last_name")
    private  String lastname;

    public Person(Long Id ,String firstname, String lastname) {
        super(Id);
        this.firstname = firstname;
        this.lastname = lastname;
    }
}
