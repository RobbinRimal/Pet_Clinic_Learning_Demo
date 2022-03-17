package com.petclinic.petclinic.reposotaries;

import com.petclinic.petclinic.model.pet;
import org.springframework.data.repository.CrudRepository;

public interface PetReposataries extends CrudRepository<pet,Long> {

}
