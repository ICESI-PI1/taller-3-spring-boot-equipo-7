package com.icesi.bookmanager.services;

import com.icesi.bookmanager.dao.request.LoginRequest;
import com.icesi.bookmanager.dao.request.SignUpRequest;
import com.icesi.bookmanager.dao.response.JwtAuthenticationResponse;

public interface IAuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);
    JwtAuthenticationResponse login(LoginRequest request);
}
