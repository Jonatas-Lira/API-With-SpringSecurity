package com.example.auth.Enum;

public enum Roles {
    ADMIN("admin"),
    USER("user");

    private final String role;

    Roles(String role){
        this.role = role;
    }

    public String getRole(){
        return role;
    }
}
