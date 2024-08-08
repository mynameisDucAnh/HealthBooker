package com.example.backend.services;

import com.example.backend.dtos.UserDTO;
import com.example.backend.exceptions.DataNotFoundException;
import com.example.backend.models.User;

public interface IUserService {
    User createUser(UserDTO userDTO) throws Exception;
    String login(String phoneNumber, String password) throws Exception;
}

