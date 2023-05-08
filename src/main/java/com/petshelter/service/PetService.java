package com.petshelter.service;

import com.petshelter.model.Pet;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PetService {
    List<Pet> getAllPets();

    Pet getPetById(int id);
}
