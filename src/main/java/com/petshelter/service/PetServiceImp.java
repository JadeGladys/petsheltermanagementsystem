package com.petshelter.service;

import com.petshelter.model.Pet;
import com.petshelter.repository.PetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetServiceImp implements PetService{

    private final PetRepository petRepository;

    public PetServiceImp(PetRepository petRepository) {
        this.petRepository = petRepository;
    }
    @Override
    public List<Pet> getAllPets() {
        return petRepository.findAll();
    }

    @Override
    public Pet getPetById(int id) {
        return petRepository.findById(id).get();
    }
}
