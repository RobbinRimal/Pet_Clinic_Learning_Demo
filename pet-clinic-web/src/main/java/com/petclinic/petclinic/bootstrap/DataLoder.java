package com.petclinic.petclinic.bootstrap;

import com.petclinic.petclinic.model.Owner;
import com.petclinic.petclinic.model.Vet;
import com.petclinic.petclinic.model.pet;
import com.petclinic.petclinic.model.petType;
import com.petclinic.petclinic.service.*;
import com.petclinic.petclinic.service.map.OwnerServiceMap;
import com.petclinic.petclinic.service.map.PetServiceMap;
import com.petclinic.petclinic.service.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoder implements CommandLineRunner {

    private  final OwnerService ownerService;
    private  final VetService vetService;

    public DataLoder() {
        ownerService= new OwnerServiceMap();
        vetService = new VetServiceMap();
        com.petclinic.petclinic.service.petService petService = new PetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1=new Owner();
        owner1.setId(1L);
        owner1.setFirstname("Mahendra kumar");
        owner1.setLastname("rimal");
        ownerService.save(owner1);


        Owner owner2=new Owner();
        owner2.setId(33L);
        owner2.setFirstname("Mahendra ");
        owner2.setLastname("Segal");
        ownerService.save(owner2);

        Vet vet1= new Vet();
        vet1.setId(45L);
        vet1.setFirstname("kashmir");
        vet1.setLastname("lahor");
        vetService.save(vet1);

        Vet vet2 =new Vet();
        vet2.setId(54L);
        vet2.setLastname("kathmandu");
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
