package com.petclinic.petclinic.service.springdatajpa;

import com.petclinic.petclinic.model.Visit;
import com.petclinic.petclinic.reposotaries.VisitReposataries;
import com.petclinic.petclinic.service.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("jpa")

public class VisitSDjpaService  implements VisitService {
   private final VisitReposataries visitReposataries;

    public VisitSDjpaService(VisitReposataries visitReposataries) {
        this.visitReposataries = visitReposataries;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visitSet= new HashSet<>();
        visitReposataries.findAll().forEach(visitSet::add);
        return visitSet;
    }

    @Override
    public Visit save(Visit object) {
        return visitReposataries.save(object);
    }

    @Override
    public Visit findById(long ID) {
        return findById(ID);
    }

    @Override
    public void deleet(Visit object) {
        visitReposataries.delete(object);

    }

    @Override
    public void deleetById(Long aLong) {
visitReposataries.deleteById(aLong );
    }
}
