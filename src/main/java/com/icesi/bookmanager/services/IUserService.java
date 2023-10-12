package com.icesi.bookmanager.services;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUserService {
    UserDetailsService userDetailsServices();
}
