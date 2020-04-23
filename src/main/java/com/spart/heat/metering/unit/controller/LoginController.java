package com.spart.heat.metering.unit.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/opros")
public class LoginController {


    @PreAuthorize("isAuthenticated()")
    @PostMapping(value = "/login")
    public ResponseEntity<Void> loginUSecretControllerser() {
        return ResponseEntity.ok().build();
    }

}
