package com.petclinic.petclinic.service;

import com.petclinic.petclinic.model.Owner;
import org.springframework.stereotype.Service;

@Service
    public interface OwnerService extends  crudService<Owner ,Long> {
        Owner findByLastname(String lastname);

      }

