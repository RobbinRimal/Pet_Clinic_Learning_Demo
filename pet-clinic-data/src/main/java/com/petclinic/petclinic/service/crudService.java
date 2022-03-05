package com.petclinic.petclinic.service;

import com.petclinic.petclinic.model.Vet;

import java.util.Set;

public interface crudService<T, ID>{
Set<T> findAll();
    Vet save(T t);


    T findById(long ID);
    void deleet(T object);
    void deleetById(ID id);

}
