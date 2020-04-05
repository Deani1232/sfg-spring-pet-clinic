package co.deanirwin.sfgspringpetclinic.services.map;

import co.deanirwin.sfgspringpetclinic.models.Vet;
import co.deanirwin.sfgspringpetclinic.services.VetService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService  {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public boolean deleteById(Long id) {
        return super.deleteById(id);
    }

    @Override
    public boolean delete(Vet vet) {
        return super.delete(vet);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet.getId(), vet);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet findByLastName(String lastName) {
        return null;
    }
}
