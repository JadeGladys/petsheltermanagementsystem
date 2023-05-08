package com.petshelter.controller;

import com.petshelter.model.Pet;
import com.petshelter.model.Volunteer;
import com.petshelter.service.PetService;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PetController {

    private PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    //display list of pets
    @GetMapping("/pets")
    public String viewPet(Model model){
        model.addAttribute("listPets", petService.getAllPets());
        return "shelter";
    }

    @GetMapping("/petinfo/view/{id}")
    public String viewPetInfo(@PathVariable int id, Model model){
        model.addAttribute("pet", petService.getPetById(id));
        return "viewpets";
    }

}
