package com.petclinic.petclinic.service.map;

import com.petclinic.petclinic.model.Vet;
import com.petclinic.petclinic.service.crudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapServices<Vet,Long> implements crudService<Vet, Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Vet findById(long ID) {
        return super.findById(ID);
    }

    //@Override
  //  public Vet findById(Long id) {
      //  return super.findById(id);
    //}



    @Override
    public void deleetById(Long id) {
    super.deleetById(id);
    }

    @Override
    public void deleet(Vet object) {
    super.deleet(object);
    }



}
