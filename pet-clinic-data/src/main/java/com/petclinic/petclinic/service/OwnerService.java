package com.petclinic.petclinic.service;

import com.petclinic.petclinic.model.Owner;






    public interface OwnerService extends  crudService<Owner ,Long> {
        Owner findByLastname(String lastname);

      }

