package com.spart.heat.metering.unit.service;

import com.spart.heat.metering.unit.controller.model.Unit;
import com.spart.heat.metering.unit.repository.UnitDataRepository;
import com.spart.heat.metering.unit.repository.UserDataRepository;
import com.spart.heat.metering.unit.repository.UserUnitDataRepository;
import com.spart.heat.metering.unit.repository.model.UnitData;
import com.spart.heat.metering.unit.repository.model.UserData;
import com.spart.heat.metering.unit.repository.model.UserUnitData;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.ArrayList;
import java.util.List;

@Service
public class UnitService {

    private final UnitDataRepository unitRepository;
    private final UserDataRepository userDataRepository;
    private final UserDetailsServiceImpl userDetailsServiceImpl;
    private final UserUnitDataRepository userUnitDataRepository;

    public UnitService(UnitDataRepository unitRepository, UserDataRepository userDataRepository, UserDetailsServiceImpl userDetailsServiceImpl, UserUnitDataRepository userUnitDataRepository) {
        this.unitRepository = unitRepository;
        this.userDataRepository = userDataRepository;
        this.userDetailsServiceImpl = userDetailsServiceImpl;
        this.userUnitDataRepository = userUnitDataRepository;
    }

    @Transactional
    public List<Unit> getAllUnitsByUserId(int userId) {
        List<Unit> units = new ArrayList<>();
        List<UnitData> allUnitData = unitRepository.findAll();

        List<UserUnitData> allUserUnits = userUnitDataRepository.findAll();
        List<UserUnitData> availibleUnits = new ArrayList<>();

        for (UserUnitData userUnitData : allUserUnits){
            if (userUnitData.getUserId() == userId)
                availibleUnits.add(userUnitData);
        }

        if (!availibleUnits.isEmpty())
            for (UnitData unitData : allUnitData)
                for (UserUnitData userUnitData : availibleUnits)
                    if (unitData.getUnitNumber() == userUnitData.getUnitId()){
                        Unit unit = new Unit();
                        unit.setOrganization(unitData.getOrganization());
                        unit.setAdress(unitData.getAdress());
                        unit.setUnitNumber(unitData.getUnitNumber());
                        unit.setTeplovichislitel(unitData.getTeplovichislitel());
                        units.add(unit);
                    }
        return units;
    }


    @Transactional
    public List<Unit> getAllUnits(){
        List<Unit> allUnits = new ArrayList<>();
        List<UnitData> allUnitData = unitRepository.findAll();

        for (UnitData unitData : allUnitData){
            Unit unit = new Unit();
            unit.setUnitNumber(unitData.getUnitNumber());
            unit.setAdress(unitData.getAdress());
            unit.setOrganization(unitData.getOrganization());
            unit.setTeplovichislitel(unitData.getTeplovichislitel());
            allUnits.add(unit);
        }
        return allUnits;
    }

    @Transactional
    public Unit getUnit(int unitId){
        List<UnitData> allUnitData = unitRepository.findAll();
        Unit unit = new Unit();
        for (UnitData unitData : allUnitData){
            if (unitData.getUnitNumber() == unitId) {
                unit.setUnitNumber(unitData.getUnitNumber());
                unit.setAdress(unitData.getAdress());
                unit.setOrganization(unitData.getOrganization());
                unit.setTeplovichislitel(unitData.getTeplovichislitel());
                break;
            }
        }
        return unit;
    }



    private UserData getUserData() {
        UserDetails userDetails = userDetailsServiceImpl.getCurrent();
        return userDataRepository.findByLogin(userDetails.getUsername())
                .orElseThrow(RuntimeException::new);
    }

}
