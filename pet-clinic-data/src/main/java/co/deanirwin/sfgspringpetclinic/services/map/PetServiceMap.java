package co.deanirwin.sfgspringpetclinic.services.map;

import co.deanirwin.sfgspringpetclinic.models.Pet;
import co.deanirwin.sfgspringpetclinic.services.PetService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public boolean deleteById(Long id) {
        return super.deleteById(id);
    }

    @Override
    public boolean delete(Pet pet) {
        return super.delete(pet);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(), pet);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet findByName(String Name) {
        return null;
    }
}
