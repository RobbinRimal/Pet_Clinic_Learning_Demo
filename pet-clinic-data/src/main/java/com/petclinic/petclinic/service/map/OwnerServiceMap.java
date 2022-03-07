package com.petclinic.petclinic.service.map;
import com.petclinic.petclinic.service.OwnerService;
import  com.petclinic.petclinic.model.*;

import com.petclinic.petclinic.model.Owner;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class OwnerServiceMap extends AbstractMapServices<Owner,Long> implements OwnerService {
    private  final  pet pet;
    private  final  petType petType;

    public OwnerServiceMap(com.petclinic.petclinic.model.pet pet, com.petclinic.petclinic.model.petType petType) {
        this.pet = pet;
        this.petType = petType;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object);
    }


    @Override
    public Owner findById(long id) {
        return super.findById(id);
    }

    @Override
    public void deleetById(Long id) {
        super.deleetById(id);

    }

    @Override
    public void deleet(Owner object) {
    super.deleet(object);
    }

    @Override
    public Owner findByLastname(String lastname) {
        return null;
    }
}
