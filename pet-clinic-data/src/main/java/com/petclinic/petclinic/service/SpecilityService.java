package com.petclinic.petclinic.service;

import com.petclinic.petclinic.model.Speciality;
import com.petclinic.petclinic.model.Vet;
import com.petclinic.petclinic.service.crudService;
import org.springframework.stereotype.Service;

@Service
public interface SpecilityService extends crudService<Speciality, Long> {
}
