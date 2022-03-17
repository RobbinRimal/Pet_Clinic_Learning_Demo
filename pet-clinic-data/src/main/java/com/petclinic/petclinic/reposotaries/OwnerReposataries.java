package com.petclinic.petclinic.reposotaries;

import com.petclinic.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerReposataries extends CrudRepository<Owner, Long> {
    public Owner findByLastname(String lastname);


}
