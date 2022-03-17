package com.petclinic.petclinic.service.springdatajpa;

import com.petclinic.petclinic.model.Speciality;
import com.petclinic.petclinic.reposotaries.specialityRepositaries;
import com.petclinic.petclinic.service.SpecilityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("Spring data jpa")
public class SpecilitySDjpaService implements SpecilityService {
   private final specialityRepositaries specialityRepositaries;

    public SpecilitySDjpaService(com.petclinic.petclinic.reposotaries.specialityRepositaries specialityRepositaries) {
        this.specialityRepositaries = specialityRepositaries;
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialitySet= new HashSet<>();
        specialityRepositaries.findAll().forEach(specialitySet::add);

        return specialitySet;
    }

    @Override
    public Speciality save(Speciality object) {
        return specialityRepositaries.save(object);
    }

    @Override
    public Speciality findById(long ID) {
        return specialityRepositaries.findById(ID).orElse(null);
    }

    @Override
    public void deleet(Speciality object) {
        specialityRepositaries.delete(object);

    }

    @Override
    public void deleetById(Long aLong) {
        specialityRepositaries.deleteById(aLong);
    }
}
