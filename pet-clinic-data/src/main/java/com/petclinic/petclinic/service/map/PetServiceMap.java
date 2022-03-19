package com.petclinic.petclinic.service.map;
import com.petclinic.petclinic.model.pet;
import com.petclinic.petclinic.service.petService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default","map"})
public class PetServiceMap extends AbstractServicesMap<pet,Long> implements petService {

    @Override
    public Set<pet> findAll() {
        return super.findAll();
    }

    @Override
    public pet save(pet object) {
        return super.save(object);
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
