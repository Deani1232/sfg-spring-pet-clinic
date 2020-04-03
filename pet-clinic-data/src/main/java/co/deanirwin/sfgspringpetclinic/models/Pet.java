package co.deanirwin.sfgspringpetclinic.models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

public class Pet extends BaseEntity {

    @Getter @Setter private LocalDate birthDate;
    @Getter @Setter private PetType petType;
    @Getter @Setter private PetOwner petOwner;

}
