package co.deanirwin.sfgspringpetclinic.services;
import co.deanirwin.sfgspringpetclinic.models.Vet;

import java.util.Set;

public interface VetService {

    Vet findByLastName(String lastName);
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();

}
