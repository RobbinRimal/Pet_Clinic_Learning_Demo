package com.petclinic.petclinic.reposotaries;
import com.petclinic.petclinic.model.petType;
import org.springframework.data.repository.CrudRepository;

public interface pettypeRepositaries extends CrudRepository<petType,Long> {
}
