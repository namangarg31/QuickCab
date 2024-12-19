package com.namangarg.project.quickCab.services;

import com.namangarg.project.quickCab.dto.DriverDto;
import com.namangarg.project.quickCab.dto.SignUpDto;
import com.namangarg.project.quickCab.dto.UserDto;

public interface AuthService {

    String login(String email, String password);
    UserDto signUp(SignUpDto signUpDto);
    DriverDto onboardNewDriver(Long userId);

}
