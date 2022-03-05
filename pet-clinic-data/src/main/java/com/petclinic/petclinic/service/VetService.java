package com.petclinic.petclinic.service;
import com.petclinic.petclinic.model.Vet;
import java.util.Set;

public interface VetService extends crudService<Vet,Long>{
              Vet findByLastname(String lastname);

    }

