package com.petclinic.petclinic.service.springdatajpa;

import com.petclinic.petclinic.model.pet;
import com.petclinic.petclinic.reposotaries.PetReposataries;
import com.petclinic.petclinic.service.petService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("Spring data jpa")
public class PetSDjpaService  implements petService {
    public PetSDjpaService(PetReposataries petReposataries) {
        this.petReposataries = petReposataries;
    }

    private  final PetReposataries petReposataries;

    @Override
    public Set<pet> findAll() {
        Set<pet> petSet= new HashSet<>();
        petReposataries.findAll().forEach(petSet::add);
        return petSet;
    }

    @Override
    public pet save(pet object) {
        return petReposataries.save(object);
    }

    @Override
    public pet findById(long ID) {
        return petReposataries.findById(ID).orElse(null);
    }

    @Override
    public void deleet(pet object) {
petReposataries.delete(object);
    }

    @Override
    public void deleetById(Long aLong) {
    petReposataries.deleteById(aLong);
    }
}
