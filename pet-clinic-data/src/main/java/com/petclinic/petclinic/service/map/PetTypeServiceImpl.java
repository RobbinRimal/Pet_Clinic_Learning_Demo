package com.petclinic.petclinic.service.map;

import com.petclinic.petclinic.model.petType;
import com.petclinic.petclinic.service.PetTypeService;

import java.util.Set;

public class PetTypeServiceImpl extends AbstractMapServices<petType,Long> implements PetTypeService {
    @Override
    public Set<petType> findAll() {
        return super.findAll();
    }

    @Override
    public petType save(petType object) {
        return super.save(object);
    }

    @Override
    public petType findById(long ID) {
        return super.findById(ID);
    }



    @Override
    public void deleetById(Long id) {
        super.deleetById(id);

    }

    @Override
    public void deleet(petType object) {
    super.deleet(object);
    }
}
