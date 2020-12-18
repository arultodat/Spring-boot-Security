package com.security.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.security.dao.UserRegistrationDto;
import com.security.entity.User;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
