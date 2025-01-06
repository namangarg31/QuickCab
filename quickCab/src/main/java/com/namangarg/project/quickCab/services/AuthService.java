package com.namangarg.project.quickCab.services;

import com.namangarg.project.quickCab.dto.DriverDto;
import com.namangarg.project.quickCab.dto.SignupDto;
import com.namangarg.project.quickCab.dto.UserDto;

public interface AuthService {

    String login(String email, String password);
    UserDto signup(SignupDto signUpDto);
    DriverDto onboardNewDriver(Long userId, String vehicleId);

}
