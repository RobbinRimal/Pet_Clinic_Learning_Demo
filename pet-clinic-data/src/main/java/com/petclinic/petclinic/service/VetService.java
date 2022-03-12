package com.petclinic.petclinic.service;
import com.petclinic.petclinic.model.Vet;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public interface VetService extends crudService<Vet,Long>{
              Vet findByLastname(String lastname);

    }

