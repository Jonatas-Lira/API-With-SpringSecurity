package com.example.auth.services;

import com.example.auth.dtos.AuthenticationDTO;
import com.example.auth.dtos.RegisterDTO;
import com.example.auth.entities.User;

public interface AuthService {

    User register(RegisterDTO data);

    User login(AuthenticationDTO data);
}
