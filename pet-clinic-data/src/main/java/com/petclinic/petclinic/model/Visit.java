package com.petclinic.petclinic.model;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "visits")
@Getter
@Setter
public class Visit extends  BaseEntity{

                                    @ManyToOne
                                    @JoinColumn(name = "pet_id")
                                    private  pet pet;
                                    @Column(name = "discription")
                                    private  String discription;
                                    @Column(name = "date")
                                    private LocalDate date;



}
