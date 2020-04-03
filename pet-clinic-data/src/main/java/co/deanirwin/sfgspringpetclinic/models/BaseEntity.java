package co.deanirwin.sfgspringpetclinic.models;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

//It is best practice to keep ID generation in a common base class in case ID generation
//strategy ever changes. It is preferred by JPA that detached objects implement serializable.

public class BaseEntity implements Serializable {
    @Getter @Setter private Long id;
}
