package com.petclinic.petclinic.service.springdatajpa;

import com.petclinic.petclinic.model.Vet;
import com.petclinic.petclinic.reposotaries.VetReposataries;
import com.petclinic.petclinic.service.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("Spring data jpa")
public class VetsSDjpaService implements VetService {
    private final VetReposataries vetReposataries;

    public VetsSDjpaService(VetReposataries vetReposataries) {
        this.vetReposataries = vetReposataries;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vetSet= new HashSet<>();
        vetReposataries.findAll().forEach(vetSet::add);
        return vetSet;
    }

    @Override
    public Vet save(Vet object) {
        return vetReposataries.save(object);
    }

    @Override
    public Vet findById(long ID) {

        return vetReposataries.findById(ID).orElse(null);
    }

    @Override
    public void deleet(Vet object) {
        vetReposataries.delete(object);

    }

    @Override
    public void deleetById(Long aLong) {
    vetReposataries.deleteById(aLong);
    }
}
