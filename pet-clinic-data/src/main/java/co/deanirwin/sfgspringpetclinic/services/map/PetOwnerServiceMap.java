package co.deanirwin.sfgspringpetclinic.services.map;

import co.deanirwin.sfgspringpetclinic.models.PetOwner;
import co.deanirwin.sfgspringpetclinic.services.CrudService;

import java.util.Set;

public class PetOwnerServiceMap extends AbstractMapService<PetOwner, Long> implements CrudService<PetOwner, Long> {

    @Override
    public Set<PetOwner> findAll() {
        return super.findAll();
    }

    @Override
    public boolean delete(PetOwner object) {
        return super.delete(object);
    }

    @Override
    public PetOwner save(PetOwner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public boolean deleteById(Long id) {
        return super.deleteById(id);
    }

    @Override
    public PetOwner findById(Long id) {
        return super.findById(id);
    }
}
