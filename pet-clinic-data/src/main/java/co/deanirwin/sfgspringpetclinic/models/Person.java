package co.deanirwin.sfgspringpetclinic.models;

import lombok.Getter;
import lombok.Setter;

public class Person extends BaseEntity {
    @Getter @Setter String firstName;
    @Getter @Setter String lastName;
}
