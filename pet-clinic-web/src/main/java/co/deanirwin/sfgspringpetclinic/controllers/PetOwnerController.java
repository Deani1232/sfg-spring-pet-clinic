package co.deanirwin.sfgspringpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PetOwnerController {

    @RequestMapping("/pet-owners")
    public String index() {
        return "pet_owners/index";
    }
}
