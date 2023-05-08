package com.petshelter.service;

import com.petshelter.model.Volunteer;
import com.petshelter.repository.VolunteerRepo;
import org.springframework.stereotype.Service;

@Service
public class VolunteerServiceImp implements VolunteerService{

    private final VolunteerRepo volunteerRepo;

    public VolunteerServiceImp(VolunteerRepo volunteerRepo) {
        this.volunteerRepo = volunteerRepo;
    }
    @Override
    public void saveVolunteer(Volunteer volunteer) {
        this.volunteerRepo.save(volunteer);
    }
}
