package co.deanirwin.sfgspringpetclinic.services;

import co.deanirwin.sfgspringpetclinic.models.PetOwner;

public interface PetOwnerService extends CrudService<PetOwner, Long> {

    PetOwner findByLastName(String lastName);


}
