package com.petclinic.petclinic.service.map;
import com.petclinic.petclinic.service.OwnerService;
import  com.petclinic.petclinic.model.pet;
import com.petclinic.petclinic.model.Owner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import java.util.Set;
@Service
@Profile({"default","map"})
public class OwnerServiceMap extends AbstractServicesMap<Owner,Long> implements OwnerService {
    private final PetServiceMap petService;
    private final PetTypeServiceMap petTypeService;
    public OwnerServiceMap(PetServiceMap petService, PetTypeServiceMap petTypeService) {
        this.petService = petService;
        this.petTypeService = petTypeService;
    }
    @Override
    public Owner save(Owner object) {
        if(object != null){
            if (object.getPets() != null) {
                object.getPets().forEach(pet -> {
                    if (pet.getPetType() != null){
                        if(pet.getPetType().getId() == null){
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    } else {
                        throw new RuntimeException("Pet Type is required");
                    }

                    if(pet.getId() == null){
                        pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }
            return super.save(object);

        } else {
            return null;
        }
    }


    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(long id) {
        return super.findById(id);
    }

    @Override
    public void deleetById(Long id) {
        super.deleetById(id);

    }

    @Override
    public void deleet(Owner object) {
    super.deleet(object);
    }

    @Override
    public Owner findByLastname(String lastname) {
        return null;
    }
}
