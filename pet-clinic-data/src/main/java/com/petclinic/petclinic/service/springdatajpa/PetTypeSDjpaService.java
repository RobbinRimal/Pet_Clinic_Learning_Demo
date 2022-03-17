package com.petclinic.petclinic.service.springdatajpa;

import com.petclinic.petclinic.model.petType;
import com.petclinic.petclinic.reposotaries.PetTypeRepositaries;
import com.petclinic.petclinic.service.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("Spring data jpa")
public class PetTypeSDjpaService implements PetTypeService {
     private final PetTypeRepositaries petTypeRepositaries;

    public PetTypeSDjpaService(PetTypeRepositaries petTypeRepositaries) {
        this.petTypeRepositaries = petTypeRepositaries;
    }

    @Override
    public Set<petType> findAll() {
        Set<petType> petTypes= new HashSet<>();
        petTypeRepositaries.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public petType save(petType object) {

        return petTypeRepositaries.save(object);
    }

    @Override
    public petType findById(long ID) {
        return petTypeRepositaries.findById(ID).orElse(null);
    }

    @Override
    public void deleet(petType object) {
            petTypeRepositaries.delete(object);
    }

    @Override
    public void deleetById(Long aLong) {
    petTypeRepositaries.deleteById(aLong);
    }
}
