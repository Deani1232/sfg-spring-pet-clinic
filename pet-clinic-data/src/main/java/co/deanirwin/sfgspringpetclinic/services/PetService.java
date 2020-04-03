package co.deanirwin.sfgspringpetclinic.services;

import co.deanirwin.sfgspringpetclinic.models.Pet;

public interface PetService extends CrudService<Pet, Long> {
    Pet findByName(String Name);
}
