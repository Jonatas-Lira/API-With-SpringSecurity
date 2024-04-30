package com.example.auth.dtos;

import com.example.auth.Enum.Roles;

public record RegisterDTO(String login, String password, Roles role) {
}
