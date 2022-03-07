package com.petclinic.petclinic.bootstrap;

import com.petclinic.petclinic.model.*;
import com.petclinic.petclinic.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

@Controller
public class DataLoder implements CommandLineRunner {

    private  final OwnerService ownerService;

    private  final VetService vetService;

    public DataLoder(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args)  {
        Owner owner1=new Owner();
        owner1.setFirstname("Mahendra kumar");
        owner1.setLastname("rimal");
        ownerService.save(owner1);


        Owner owner2=new Owner();

        owner2.setFirstname("Mahendra ");
        owner2.setLastname("Segal");
        ownerService.save(owner2);

        Vet vet1= new Vet();
        vet1.setFirstname("kashmir");
        vet1.setLastname("lahor");
        vetService.save(vet1);

        Vet vet2 =new Vet();
        vet2.setFirstname("Kathmandu");
        vet2.setLastname("pokhrel");
        vetService.save(vet2);
        System.out.println("loding completer");



        petType petType1=new petType();
        petType1.setPettype("dog");
        petType1.setId(13L);
        pet pet1= new pet();
        pet1.setId(14L);

        pet1.setPetType(petType1);
        System.out.println("everything okay");

    }
}
