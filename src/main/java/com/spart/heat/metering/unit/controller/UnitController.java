package com.spart.heat.metering.unit.controller;

import com.spart.heat.metering.unit.controller.model.Unit;
import com.spart.heat.metering.unit.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/opros/unit/units")
public class UnitController {

    private final UnitService unitService;


    @Autowired
    public UnitController(UnitService unitService) {
        this.unitService = unitService;
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping(value = "/byuserid/{id}")

    public ResponseEntity<List<Unit>> getAllUnitsByUserId(@PathVariable("id") int userId) {

        return ResponseEntity
                .ok()
                .body(unitService.getAllUnitsByUserId(userId));
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping(value = "/all")
    public ResponseEntity<List<Unit>> getAllUnits() {

        return ResponseEntity
                .ok()
                .body(unitService.getAllUnits());
    }
}
