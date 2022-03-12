package com.petclinic.petclinic.service;

import com.petclinic.petclinic.model.petType;
import org.springframework.stereotype.Service;

@Service
public interface PetTypeService extends crudService<petType,Long>{
}
