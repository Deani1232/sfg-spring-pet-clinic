package co.deanirwin.sfgspringpetclinic.controllers;

import co.deanirwin.sfgspringpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private final VetService vetService;

    //Autowired
    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping("/vets")
    public String index(Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
