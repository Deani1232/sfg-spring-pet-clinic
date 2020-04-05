package co.deanirwin.sfgspringpetclinic.services.map;

import co.deanirwin.sfgspringpetclinic.models.PetOwner;
import co.deanirwin.sfgspringpetclinic.services.PetOwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetOwnerServiceMap extends AbstractMapService<PetOwner, Long> implements PetOwnerService {

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
        return super.save(object);
    }

    @Override
    public boolean deleteById(Long id) {
        return super.deleteById(id);
    }

    @Override
    public PetOwner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetOwner findByLastName(String lastName) {
        return null;
    }
}
