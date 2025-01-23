package com.namangarg.project.quickCab.controllers;

import com.namangarg.project.quickCab.advices.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("/")
    public ResponseEntity<ApiResponse<String>> healthCheckController() {
        ApiResponse<String> response = new ApiResponse<>("OK");
        return ResponseEntity.ok(response);
    }
}
