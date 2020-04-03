package co.deanirwin.sfgspringpetclinic.services;

import co.deanirwin.sfgspringpetclinic.models.Vet;

public interface VetService extends CrudService<Vet, Long> {

    Vet findByLastName(String lastName);

}
