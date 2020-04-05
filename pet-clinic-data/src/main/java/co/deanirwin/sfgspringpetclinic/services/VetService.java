package co.deanirwin.sfgspringpetclinic.services;

import co.deanirwin.sfgspringpetclinic.models.Vet;
import org.springframework.stereotype.Service;

@Service
public interface VetService extends CrudService<Vet, Long> {

    Vet findByLastName(String lastName);

}
