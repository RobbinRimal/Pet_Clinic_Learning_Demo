package com.petclinic.petclinic.service.map;
import com.petclinic.petclinic.model.Visit;
import com.petclinic.petclinic.service.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service

public class VisitMapService extends AbstractServicesMap<Visit,Long> implements VisitService {
    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findById(long ID) {
        return super.findById(ID);
    }

    @Override
    public void deleetById(Long id) {
    super.deleetById(id);
    }

    @Override
    public void deleet(Visit object) {
    super.deleet(object);
    }

    @Override
    public Visit save(Visit object) {
        if (object.getPet()==null|| object.getPet().getOwner()==null||object.getPet().getId()==null||object.getPet().getId()==null){
            throw  new RuntimeException("invalid visit ");

        }
return super.save(object);
    }
}
