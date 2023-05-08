package com.petshelter.service;

import com.petshelter.model.User;

public interface UserService {
    User getUserById(int id);
    User findByEmail(String email);
}
