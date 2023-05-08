package com.petshelter.repository;

import com.petshelter.model.Volunteer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VolunteerRepo extends JpaRepository<Volunteer, String> {
}
