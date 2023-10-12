package com.icesi.bookmanager.services;

import org.springframework.security.core.userdetails.UserDetails;

public interface IJwtService {
    String extractUserName(String token);
    String generateToken(UserDetails userDetails);
    boolean isTokenValid(String token,UserDetails userDetails);
}
