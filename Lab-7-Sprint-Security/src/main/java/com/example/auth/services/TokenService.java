package com.example.auth.services;

import com.example.auth.entities.User;

import java.time.Instant;

public interface TokenService {

    String generateToken(User user);

    boolean validateToken(String token);

    String getLoginFromToken(String token);

    Instant genExpirationDate();

}
