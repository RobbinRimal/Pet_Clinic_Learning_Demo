package com.petclinic.petclinic.reposotaries;

import com.petclinic.petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetReposataries  extends CrudRepository<Vet,Long> {
}
