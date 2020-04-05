package co.deanirwin.sfgspringpetclinic.bootstrap;

import co.deanirwin.sfgspringpetclinic.models.PetOwner;
import co.deanirwin.sfgspringpetclinic.models.Vet;
import co.deanirwin.sfgspringpetclinic.services.PetOwnerService;
import co.deanirwin.sfgspringpetclinic.services.PetService;
import co.deanirwin.sfgspringpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


//Becomes a Spring Bean with annotation. Is active after the program starts.
@Component
public class DataLoader implements CommandLineRunner {

    private final PetOwnerService petOwnerService;
    private final VetService vetService;
    private final PetService petService;

    //Autowired singleton bean services.
    public DataLoader(PetOwnerService petOwnerService, VetService vetService, PetService petService) {
        this.petOwnerService = petOwnerService;
        this.vetService = vetService;
        this.petService = petService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetOwner owner1 = new PetOwner();
        owner1.setFirstName("Micheal");
        owner1.setLastName("Weston");

        petOwnerService.save(owner1);



        PetOwner owner2 = new PetOwner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        petOwnerService.save(owner2);


        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);


        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2); //John actually put vet1 here but I am sure that was a mistake he didnt catch

        System.out.println("Loaded Vets....");
    }


}
