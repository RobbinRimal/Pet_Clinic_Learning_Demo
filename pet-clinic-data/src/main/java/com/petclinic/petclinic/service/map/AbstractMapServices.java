package com.petclinic.petclinic.service.map;

import com.petclinic.petclinic.model.BaseEntity;
import org.springframework.stereotype.Service;

import java.util.*;

/*Set<T> findAll();
    Vet save(T t);


    T findById(long ID);
    void deleet(T object);
    void deleetById(ID id);
*/
@Service
public abstract  class AbstractMapServices<T extends BaseEntity,ID extends Long> {

    Map<Long,T> map = new HashMap<>();

    Set<T> findAll() {
        return  new HashSet<>(map.values());
    }
    T findById(ID id){
        return map.get(id);
    }

    public abstract void deleetById(ID id);

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

    private  long genNextId(){
        Long nextID=null;
        try {
            nextID=Collections.max(map.keySet())+1;
        }catch (NoSuchElementException e){
            nextID=1l;
        }

        return nextID;
    }



}

