package com.spart.heat.metering.unit.controller;

import com.spart.heat.metering.unit.controller.model.Unit;
import com.spart.heat.metering.unit.controller.model.User;
import com.spart.heat.metering.unit.controller.model.UserUnit;
import com.spart.heat.metering.unit.service.UserUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/opros/unit/user")
public class UserUnitController {

    private final UserUnitService userUnitService;


    @Autowired
    public UserUnitController(UserUnitService userUnitService) {
        this.userUnitService = userUnitService;
    }

    @PreAuthorize("isAuthenticated()")
    @PostMapping(value = "/add")
    public ResponseEntity<Void> addUserUnit(@RequestBody UserUnit userUnit) {
        userUnitService.addUnitForUser(userUnit);
        return ResponseEntity
                .ok().build();
    }

    @PreAuthorize("isAuthenticated()")
    @PostMapping(value = "/delete")
    public ResponseEntity<Void> deleteUserUnit(@RequestBody UserUnit userUnit) {
        userUnitService.deleteUnitForUser(userUnit);
        return ResponseEntity
                .ok().build();

    }
}
