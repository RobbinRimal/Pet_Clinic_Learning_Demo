package com.petclinic.petclinic.service;

import com.petclinic.petclinic.model.Owner;

import java.util.Set;




    public interface OwnerService extends  crudService<Owner ,Long> {
        Owner findByLastname(String lastname);

      }

