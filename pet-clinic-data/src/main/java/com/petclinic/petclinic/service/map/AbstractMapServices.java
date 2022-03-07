package com.petclinic.petclinic.service.map;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/*Set<T> findAll();
    Vet save(T t);


    T findById(long ID);
    void deleet(T object);
    void deleetById(ID id);
*/
@Service
public abstract  class AbstractMapServices<T ,ID> {

    Map<Long,T> map = new HashMap<>();

    Set<T> findAll() {
        return  new HashSet<>(map.values());
    }
    T findById(ID id){
        return map.get(id);
    }

    void deleet(T object){
        map.entrySet().removeIf(entry->entry.getValue().equals(object));
    }
    void deleetById(ID id){map.remove((Long) id);}

    T save( ID id ,T object){
        map.put((Long) id,object);

        return object;
    }



}

