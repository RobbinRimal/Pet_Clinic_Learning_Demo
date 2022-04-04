package com.petclinic.petclinic.service.map;

import com.petclinic.petclinic.model.Owner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerServiceMapTest {
    OwnerServiceMap ownerServiceMap;
    long id = 1L;
    String lastname = "robbin";
    @BeforeEach
    void setUp() {
        ownerServiceMap=new OwnerServiceMap(new PetServiceMap(),new PetTypeServiceMap());


        ownerServiceMap.save(Owner.builder().Id(id).lastname(lastname).build());
    }

    @AfterEach
    void tearDown() {
        System.out.println("test is done");
    }

    @Test
    void findAll() {
      Set<Owner> owners= ownerServiceMap.findAll();
      assertEquals(1,owners.size());
    }

    @Test
    void findById() {

        Owner Owner =ownerServiceMap.findById(id);
        assertEquals("robbin",Owner.getLastname());
    }

    @Test
    void deleet() {
        Owner id = ownerServiceMap.findById(1L);
        ownerServiceMap.deleet(id);
        assertEquals(0,ownerServiceMap.findAll().size());
    }

    @Test
    void save() {
        Owner owner=Owner.builder().Id(3L).lastname("rimal").build();
        ownerServiceMap.save(owner);
        assertEquals(3L,ownerServiceMap.findById(3l).getId());
        System.out.println("testing with id done!!");
    }

    @Test
    void testSave() {
        Owner owner=Owner.builder().build();
        ownerServiceMap.save(owner);
        assertNotNull(owner);
        assertNotNull(owner.getId());
        System.out.println("testing without id done!!");
    }

    @Test
    void testFindById() {
        Owner byId = ownerServiceMap.findById(id);
        assertEquals(byId,ownerServiceMap.findById(id));
        System.out.println("find by id test done!!");
    }

    @Test
    void deleetById() {
        ownerServiceMap.deleetById(id);
        assertEquals(0,ownerServiceMap.findAll().size());
    }

    @Test
    void testDeleet() {
        System.out.println("i am not testing this again");
    }

    @Test
    void findByLastname() {
       Owner hero=ownerServiceMap.findByLastname(lastname);
       assertEquals(lastname,hero.getLastname());
        System.out.println("finally done!!");
    }
}