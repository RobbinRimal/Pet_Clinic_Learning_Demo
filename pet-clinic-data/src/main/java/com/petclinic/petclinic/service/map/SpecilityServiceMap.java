package com.petclinic.petclinic.service.map;

import com.petclinic.petclinic.model.Speciality;
import com.petclinic.petclinic.service.SpecilityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
@Profile({"default","map"})
public class SpecilityServiceMap extends AbstractServicesMap<Speciality,Long> implements SpecilityService {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }



    @Override
    public void deleetById(Long id) {
    super.deleetById(id);
    }

    @Override
    public void deleet(Speciality object) {
    super.deleet(object);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public Speciality findById(long ID) {
        return super.findById(ID);
    }


}
