package com.petclinic.petclinic.service.map;
import com.petclinic.petclinic.model.*;
import com.petclinic.petclinic.service.SpecilityService;
import com.petclinic.petclinic.service.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
@Profile({"default","map"})
public class VetServiceMap extends AbstractServicesMap<Vet,Long> implements VetService {
    SpecilityService specilityService;

    public VetServiceMap(SpecilityService specilityService) {
        this.specilityService = specilityService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(long ID) {
        return super.findById(ID);
    }

    @Override
    public void deleetById(Long id) {
        super.deleetById(id);
    }

    @Override
    public void deleet(Vet object) {
    deleet(object);
    }

    @Override
    public Vet save(Vet object) {
        if (object.getSpeciality().size() > 0){
            object.getSpeciality().forEach(speciality -> {
                if(speciality.getId() == null){
                    Speciality savedSpecialty = specilityService.save(speciality);
                    speciality.setId(savedSpecialty.getId());
                }
            });
        }

        return super.save(object);
    }
}