package com.petclinic.petclinic.service.springdatajpa;

import com.petclinic.petclinic.model.Owner;
import com.petclinic.petclinic.reposotaries.OwnerReposataries;
import com.petclinic.petclinic.reposotaries.PetReposataries;
import com.petclinic.petclinic.reposotaries.PetTypeRepositaries;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OwnerSDjpaServiceTest {
    @Mock
    OwnerReposataries ownerReposataries;
    @Mock
    PetReposataries petReposataries;
    @Mock
    PetTypeRepositaries petTypeRepositaries;
    @InjectMocks
    OwnerSDjpaService service_SD_JPA;

    String last_name="Rimal";
    Long id=1L;
    Owner return_Owner;
    @BeforeEach
    void setUp() {
        return_Owner=Owner.builder().Id(id).lastname(last_name).build();
        System.out.println("mocks got injected successfully!!");

    }

    @AfterEach
    void tearDown() {
        System.out.println();
    }

    @Test
    void findByLastname() {
        when(ownerReposataries.findByLastname(any())).thenReturn(return_Owner);
        Owner owner=service_SD_JPA.findByLastname(last_name);
        assertEquals("rimal",owner.getLastname().toLowerCase(Locale.ROOT));


    }

    @Test
    void findAll() {
        Set<Owner> return_Owner=new HashSet<>();
        return_Owner.add(Owner.builder().Id(id).lastname(last_name).build());
        return_Owner.add(Owner.builder().Id(id+1).lastname(last_name+" mahendra").build());
        when(ownerReposataries.findAll()).thenReturn(return_Owner);
        Set<Owner> owners= service_SD_JPA.findAll();
        assertEquals(2,owners.size());
        assertNotNull(owners);
        System.out.println("find all is working");

    }

    @Test
    void save() {
        service_SD_JPA.save(return_Owner);
        System.out.println("save is working");

    }

    @Test
    void deleet() {
        service_SD_JPA.deleet(return_Owner);
        verify(ownerReposataries).delete(any());
        System.out.println("deleet is workin fine!");

    }

    @Test
    void deleetById() {
        service_SD_JPA.deleetById(id);
        verify(ownerReposataries).deleteById(id);
        System.out.println("deleet by id is workin fine!");
    }

    @Test
    void testFindByLastname() {
        when(ownerReposataries.findByLastname(any())).thenReturn(return_Owner);
        Owner newowner =service_SD_JPA.findByLastname(last_name);
        assertEquals(last_name.toLowerCase(Locale.ROOT),newowner.getLastname().toLowerCase(Locale.ROOT));

    }

    @Test
    void testFindById() {
    when(ownerReposataries.findById(any())).thenReturn(Optional.of(return_Owner));
    Owner newowner=service_SD_JPA.findById(id);
    assertEquals(last_name.toLowerCase(Locale.ROOT),newowner.getLastname().toLowerCase(Locale.ROOT));
    }
}