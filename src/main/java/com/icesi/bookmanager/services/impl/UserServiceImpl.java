package com.icesi.bookmanager.services.impl;

import com.icesi.bookmanager.persistence.repositories.IUserRepository;
import com.icesi.bookmanager.services.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService {
    private final IUserRepository userRepository;

    @Override
    public UserDetailsService userDetailsServices() {
        return new UserDetailsService() {
            @Override
            public UserDetails loadUserByUsername(String username)  {
                return userRepository.findByEmail(username)
                        .orElseThrow(() -> new UsernameNotFoundException("User not found"));
            }
        };
    }
}
