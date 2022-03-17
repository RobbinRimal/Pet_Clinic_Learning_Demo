package com.petclinic.petclinic.model;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "types")
@Getter
@Setter
public class petType extends BaseEntity{
    @Column(name = "pet_type")
    private  String pettype;



}
