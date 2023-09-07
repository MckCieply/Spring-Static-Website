package com.mckcieply.controllers;

import com.mckcieply.auth.AuthenticationResponse;
import com.mckcieply.auth.LoginRequest;
import com.mckcieply.auth.RegisterRequest;
import com.mckcieply.services.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;
    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request){
        return ResponseEntity.ok(authenticationService.register(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse> login( @RequestBody LoginRequest request){
        return ResponseEntity.ok(authenticationService.login(request));
    }
    @RequestMapping("/demo")
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello from secured place");
    }

}
