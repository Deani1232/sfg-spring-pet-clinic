package co.deanirwin.sfgspringpetclinic.controllers;

import co.deanirwin.sfgspringpetclinic.services.PetOwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PetOwnerController {

    private final PetOwnerService petOwnerService;

    //Autowired
    public PetOwnerController(PetOwnerService petOwnerService) {
        this.petOwnerService = petOwnerService;
    }

    @RequestMapping("/pet-owners")
    public String index(Model model) {

        model.addAttribute("petOwners", petOwnerService.findAll());

        return "pet_owners/index";
    }


}
