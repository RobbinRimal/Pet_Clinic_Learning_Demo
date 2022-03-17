package com.petclinic.petclinic.model;
import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "visits")
public class Visit extends  BaseEntity{

                                    @ManyToOne
                                    @JoinColumn(name = "pet_id")
                                    private  pet pet;
                                    @Column(name = "discription")
                                    private  String discription;
                                    @Column(name = "date")
                                    private LocalDate date;



}
