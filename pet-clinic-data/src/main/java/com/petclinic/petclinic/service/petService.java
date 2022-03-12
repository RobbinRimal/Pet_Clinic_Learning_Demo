package com.petclinic.petclinic.service;
import com.petclinic.petclinic.model.*;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public interface petService extends crudService<pet ,Long> {
}
