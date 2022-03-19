package com.petclinic.petclinic.bootstrap;

import com.petclinic.petclinic.model.*;
import com.petclinic.petclinic.service.*;
import com.petclinic.petclinic.service.SpecilityService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;

@Controller
public class DataLoder implements CommandLineRunner {
    private  final VisitService visitService;

    private  final OwnerService ownerService;
    private  final VetService vetService;
    private  final PetTypeService petTypeService;
    private  final SpecilityService specilityService;

    public DataLoder(VisitService visitService, OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecilityService specilityService) {
        this.visitService = visitService;
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specilityService = specilityService;
    }

    @Override
    public void run(String... args)  {
        petType dog = new petType();
        dog.setPettype("dog");
      petType savedog=  petTypeService.save(dog);

        petType cat=new petType();
        dog.setPettype("cat");
        petType savecat =petTypeService.save(cat);

        Owner owner1=new Owner();
        owner1.setFirstname("Mahendra kumar");
        owner1.setLastname("rimal");
        owner1.setAddress("sanischere");
        owner1.setCity("Arjundhara");
        owner1.setContactNo("9842773326");
        pet mahendrakumar =new pet();

        Speciality surgery = new Speciality();
        surgery.setDiscription("Surgery");
        Speciality savesurgery;
        savesurgery = specilityService.save(surgery);

        mahendrakumar.setPetType(savecat);
        mahendrakumar.setOwner(owner1);
        mahendrakumar.setBirthDay(LocalDate.now());
        mahendrakumar.setPetName("pussy");
        owner1.getPets().add(mahendrakumar);

        ownerService.save(owner1);


        Owner owner2=new Owner();

        owner2.setFirstname("Mahendra ");
        owner2.setLastname("Segal");
        owner2.setAddress("butabari");
        owner2.setCity("Arjundhara");
        owner2.setContactNo("9815087869");
        ownerService.save(owner2);

        Speciality radiology = new Speciality();
        radiology.setDiscription("Radiology");
        Speciality saverasdiology =specilityService.save(radiology);

        pet rosspet =new pet();
        rosspet.setPetType(savedog);
        rosspet.setPetName("wolf");
        rosspet.setOwner(owner2);
        rosspet.setBirthDay(LocalDate.now());
        owner1.getPets().add(rosspet);

        Visit visitcat = new Visit();
        visitcat.setPet(rosspet);
        visitcat.setDate(LocalDate.MIN);
        visitcat.setDiscription("she died");

        Vet vet1= new Vet();
        vet1.setFirstname("kashmir");
        vet1.setLastname("lahor");

      //  vet1.getSpeciality().add(saverasdiology);
        vetService.save(vet1);
        Vet vet2 =new Vet();
        vet2.setFirstname("Kathmandu");
        vet2.setLastname("pokhrel");

        System.out.println("loding completer");
       // vet2.getSpeciality().add(savesurgery);
        vetService.save(vet2);

        petType petType1=new petType();
        petType1.setPettype("dog");
        petType1.setId(13L);
        pet pet1= new pet();
        pet1.setId(14L);

        pet1.setPetType(petType1);
        System.out.println("everything okay");

    }
}
