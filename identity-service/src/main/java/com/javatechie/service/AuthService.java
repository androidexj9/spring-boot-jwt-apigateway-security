package com.javatechie.service;

import com.javatechie.entity.UserCredential;
import com.javatechie.repository.UserCredentialRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserCredentialRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtService jwtService;

    private static final Logger logger = LoggerFactory.getLogger(AuthService.class);

    public String saveUser(UserCredential credential) {
        credential.setPassword(passwordEncoder.encode(credential.getPassword()));
        repository.save(credential);

        logger.info("m=saveUser, User was saved successfully");
        return "user added to the system";
    }

    public String generateToken(String username) {
        logger.info("m=generateToken, Token generation request, username:{}", username);
        return jwtService.generateToken(username);
    }

    public void validateToken(String token) {
        logger.info("m=validateToken, Token validation request, token:{}", token);
        jwtService.validateToken(token);
    }
}
