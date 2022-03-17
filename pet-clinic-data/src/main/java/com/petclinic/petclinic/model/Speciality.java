package com.petclinic.petclinic.model;



import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "speciality")
@Getter
@Setter

public class Speciality extends BaseEntity{
    @Column(name = "discription")
    private String discription;


}
