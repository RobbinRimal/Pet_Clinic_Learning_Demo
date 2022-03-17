package com.petclinic.petclinic.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "pets")
@Getter
@Setter
public class pet extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private  Owner owner;
    @ManyToOne()
    @JoinColumn(name ="type_id")
     private  petType petType;
    @Column(name = "birth_day")
    private LocalDate birthDay;
    @Column(name = "pet_name")
    private  String petName;


}
