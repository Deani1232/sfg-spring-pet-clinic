package co.deanirwin.sfgspringpetclinic.bootstrap;

import co.deanirwin.sfgspringpetclinic.models.PetOwner;
import co.deanirwin.sfgspringpetclinic.models.Vet;
import co.deanirwin.sfgspringpetclinic.services.PetOwnerService;
import co.deanirwin.sfgspringpetclinic.services.PetService;
import co.deanirwin.sfgspringpetclinic.services.VetService;
import co.deanirwin.sfgspringpetclinic.services.map.PetOwnerServiceMap;
import co.deanirwin.sfgspringpetclinic.services.map.PetServiceMap;
import co.deanirwin.sfgspringpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


//Becomes a Spring Bean with annotation. Is active after the program starts.
@Component
public class DataLoader implements CommandLineRunner {

    private final PetOwnerService petOwnerService;
    private final VetService vetService;
    private final PetService petService;


    public DataLoader() {
        petOwnerService = new PetOwnerServiceMap();
        vetService = new VetServiceMap();
        petService = new PetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        PetOwner owner1 = new PetOwner();
        owner1.setId(1L);
        owner1.setFirstName("Micheal");
        owner1.setLastName("Weston");

        petOwnerService.save(owner1);



        PetOwner owner2 = new PetOwner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        petOwnerService.save(owner2);


        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);


        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2); //John actually put vet1 here but I am sure that was a mistake he didnt catch

        System.out.println("Loaded Vets....");
    }


}
