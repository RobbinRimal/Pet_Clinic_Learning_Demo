package com.petclinic.petclinic.reposotaries;

import com.petclinic.petclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface specialityRepositaries extends CrudRepository<Speciality,Long> {
}
