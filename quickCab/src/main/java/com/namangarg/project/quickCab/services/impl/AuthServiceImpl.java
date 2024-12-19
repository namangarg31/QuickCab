package com.namangarg.project.quickCab.services.impl;

import com.namangarg.project.quickCab.dto.DriverDto;
import com.namangarg.project.quickCab.dto.SignUpDto;
import com.namangarg.project.quickCab.dto.UserDto;
import com.namangarg.project.quickCab.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public String login(String email, String password) {
        return null;
    }

    @Override
    public UserDto signUp(SignUpDto signUpDto) {
        return null;
    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }
}
