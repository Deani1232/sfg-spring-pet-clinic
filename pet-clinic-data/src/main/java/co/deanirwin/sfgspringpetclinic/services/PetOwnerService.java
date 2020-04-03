package co.deanirwin.sfgspringpetclinic.services;

import co.deanirwin.sfgspringpetclinic.models.PetOwner;

import java.util.Set;

public interface PetOwnerService {

    PetOwner findByLastName(String lastName);
    PetOwner findById(Long id);
    PetOwner save(PetOwner petOwner);
    Set<PetOwner> findAll();


}
