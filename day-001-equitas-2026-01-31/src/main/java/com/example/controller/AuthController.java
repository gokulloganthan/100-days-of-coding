package com.example.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.security.JwtUtil;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final AuthenticationManager authManager;
    private final UserDetailsService uds;
    private final JwtUtil jwtUtil;

    public AuthController(AuthenticationManager authManager, UserDetailsService uds, JwtUtil jwtUtil) {
        this.authManager = authManager;
        this.uds = uds;
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody AuthRequest request) {
        authManager.authenticate(new UsernamePasswordAuthenticationToken(request.username(), request.password()));
        UserDetails ud = uds.loadUserByUsername(request.username());
        String token = jwtUtil.generateToken(ud.getUsername(), Map.of("roles", ud.getAuthorities()));
        return Map.of("token", token);
    }

    public static record AuthRequest(String username, String password) {}
}