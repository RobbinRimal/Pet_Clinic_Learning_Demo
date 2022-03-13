package com.petclinic.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.petclinic.petclinic.bootstrap")
@ComponentScan("com.petclinic.petclinic.controller")
@ComponentScan("com.petclinic.petclinic.service.SpecilityService")
public class PetClinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetClinicApplication.class, args);
		System.out.println("up and running");

	}

}
