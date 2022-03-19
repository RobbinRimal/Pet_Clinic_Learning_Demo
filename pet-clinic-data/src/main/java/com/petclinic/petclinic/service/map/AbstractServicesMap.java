package com.petclinic.petclinic.service.map;

import com.petclinic.petclinic.model.BaseEntity;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public abstract  class AbstractServicesMap<T extends BaseEntity,ID extends Long> {

    Map<Long,T> map = new HashMap<>();

    Set<T> findAll() {
        return  new HashSet<>(map.values());
    }
    T findById(ID ID){
        return map.get((Long) ID);
    }



    void deleet(T object){
        map.entrySet().removeIf(entry->entry.getValue().equals(object));
    }
    void deleetById(ID id){map.remove((Long) id);}

    T save( T object){
        if (object!=null){
         if (object.getId()==null){
             object.setId(genNextId());
         }
        }
        else {throw new RuntimeException("object cannot be null");}
        map.put(object.getId() ,object);

        return object;
    }

    private  Long genNextId(){
        Long nextID=null;
        try {
            nextID=Collections.max(map.keySet())+1;
        }catch (NoSuchElementException e){
            nextID=1l;
        }

        return nextID;
    }



}

