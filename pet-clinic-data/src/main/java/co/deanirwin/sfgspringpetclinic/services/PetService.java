package co.deanirwin.sfgspringpetclinic.services;

import co.deanirwin.sfgspringpetclinic.models.Pet;

import java.util.Set;

public interface PetService {
    Pet findByName(String Name);
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
