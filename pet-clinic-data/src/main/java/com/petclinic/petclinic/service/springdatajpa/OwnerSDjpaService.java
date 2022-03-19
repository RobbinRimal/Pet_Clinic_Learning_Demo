package com.petclinic.petclinic.service.springdatajpa;

import com.petclinic.petclinic.model.Owner;
import com.petclinic.petclinic.reposotaries.OwnerReposataries;
import com.petclinic.petclinic.reposotaries.PetReposataries;
import com.petclinic.petclinic.reposotaries.*;
import com.petclinic.petclinic.service.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("jpa")
public class OwnerSDjpaService implements OwnerService {
private  final PetReposataries petReposataries;
private  final OwnerReposataries ownerReposataries;
private  final PetTypeRepositaries petTypeRepositaries;

    public OwnerSDjpaService(PetReposataries petReposataries,
                             OwnerReposataries ownerReposataries,
                             PetTypeRepositaries petTypeRepositaries) {

        this.petReposataries = petReposataries;
        this.ownerReposataries = ownerReposataries;
        this.petTypeRepositaries = petTypeRepositaries;
    }

    @Override
    public Owner findByLastname(String lastname) {
     return ownerReposataries.findByLastname(lastname);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners= new HashSet<>();
        ownerReposataries.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner save(Owner object) {

        return ownerReposataries.save(object);
    }

    @Override
    public Owner findById(long ID) {
        Optional<Owner> optionalOwner=ownerReposataries.findById(ID);
        return optionalOwner.orElse(null);
    }

    @Override
    public void deleet(Owner object) {
        ownerReposataries.delete(object);

    }

    @Override
    public void deleetById(Long aLong) {
        ownerReposataries.deleteById(aLong);

    }
}
