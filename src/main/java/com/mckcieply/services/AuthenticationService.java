package com.mckcieply.services;


import com.mckcieply.auth.AuthenticationResponse;
import com.mckcieply.auth.LoginRequest;
import com.mckcieply.auth.RegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {


    public AuthenticationResponse register(RegisterRequest request) {
        return null;
    }

    public AuthenticationResponse login(LoginRequest request) {
        return null;
    }
}
