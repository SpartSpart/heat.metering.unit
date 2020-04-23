package com.spart.heat.metering.unit.controller;

import com.spart.heat.metering.unit.controller.model.UnitInfo;
import com.spart.heat.metering.unit.service.UnitInfoDayService;
import com.spart.heat.metering.unit.service.UnitInfoHourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/opros/unit")
public class UnitInfoController {

    private final UnitInfoDayService unitInfoDayService;
    private final UnitInfoHourService unitInfoHourService;


    @Autowired
    public UnitInfoController(UnitInfoDayService unitInfoDayService, UnitInfoHourService unitInfoHourService) {
        this.unitInfoDayService = unitInfoDayService;
        this.unitInfoHourService = unitInfoHourService;
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping(value = "/day/info/{id}")
    public ResponseEntity<List<UnitInfo>> getUnitInfoDay(@PathVariable("id") int unitId) {

        return ResponseEntity
                .ok()
                .body(unitInfoDayService.getUnitsInfoDay(unitId));
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping(value = "/hour/info/{id}")
    public ResponseEntity<List<UnitInfo>> getUnitInfoHour(@PathVariable("id") int unitId) {

        return ResponseEntity
                .ok()
                .body(unitInfoHourService.getUnitsInfoHour(unitId));
    }

}
