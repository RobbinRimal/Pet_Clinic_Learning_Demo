package com.petclinic.petclinic.service.map;
import com.petclinic.petclinic.service.OwnerService;
import  com.petclinic.petclinic.service.crudService;

import com.petclinic.petclinic.model.Owner;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapServices<Owner,Long> implements OwnerService {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
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
