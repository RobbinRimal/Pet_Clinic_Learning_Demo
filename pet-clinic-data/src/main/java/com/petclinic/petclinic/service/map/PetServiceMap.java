package com.petclinic.petclinic.service.map;
import com.petclinic.petclinic.model.pet;
import com.petclinic.petclinic.service.crudService;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class PetServiceMap extends  AbstractMapServices<pet,Long> implements crudService<pet,Long> {

    @Override
    public Set<pet> findAll() {
        return super.findAll();
    }

    @Override
    public pet save(pet object) {
        return save(object.getId(),object);
    }

    @Override
    public pet findById(long id) {
        return super.findById(id);
    }



    @Override
    public void deleetById(Long id) {
        super.deleetById(id);

    }

    @Override
    public void deleet(pet object) {
        super.deleet(object);
    }
}
