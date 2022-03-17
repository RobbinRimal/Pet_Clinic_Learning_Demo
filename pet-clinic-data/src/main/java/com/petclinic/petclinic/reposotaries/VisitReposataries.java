package com.petclinic.petclinic.reposotaries;

import com.petclinic.petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitReposataries extends CrudRepository<Visit,Long > {
}
