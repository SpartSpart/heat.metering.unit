package com.spart.heat.metering.unit.service;

import com.spart.heat.metering.unit.controller.model.UserUnit;
import com.spart.heat.metering.unit.repository.UserUnitDataRepository;
import com.spart.heat.metering.unit.repository.model.UserUnitData;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Arrays;
import java.util.List;

@Service
public class UserUnitService {

    private final UserUnitDataRepository userUnitDataRepository;
    private final UserDetailsServiceImpl userDetailsServiceImpl;

    public UserUnitService(UserUnitDataRepository userUnitDataRepository, UserDetailsServiceImpl userDetailsServiceImpl) {
        this.userUnitDataRepository = userUnitDataRepository;
        this.userDetailsServiceImpl = userDetailsServiceImpl;
    }


    @Transactional
    public void addUnitForUser(UserUnit userUnit) {

        int idIncrement = getIncrement();
        UserUnitData userUnitData = new UserUnitData();
        userUnitData.setId(idIncrement);
        userUnitData.setUserId(userUnit.getUserId());
        userUnitData.setUnitId(userUnit.getUnitId());
        userUnitDataRepository.saveAndFlush(userUnitData);
    }

    @Transactional
    public void deleteUnitForUser(UserUnit userUnit) {
        List<UserUnitData> allUserUnitData = userUnitDataRepository.findAll();
        for(UserUnitData userUnitData : allUserUnitData)
            if (userUnitData.getUserId() == userUnit.getUserId() &&
                    userUnitData.getUnitId() == userUnit.getUnitId())
                userUnitDataRepository.deleteById(userUnitData.getId());
    }


    private int getIncrement(){
        List<UserUnitData> allUserUnitData = userUnitDataRepository.findAll();
        int[] allUserId = new int[allUserUnitData.size()];
        if (allUserUnitData.isEmpty())
            return 1;
        else {
            for (int i = 0;i<allUserUnitData.size(); i++){
                allUserId[i] = allUserUnitData.get(i).getId();
            }
            return Arrays.stream(allUserId).max().getAsInt()+1;
        }
    }

//        for (UnitData secret : allUnitData) {
//            Unit newSecret = new Unit();
//            newSecret.setId(secret.getId());
//

//    @Transactional
//    public List<Unit> getAllUnitsByUserId(int userId) {
//        List<Unit> allUnits = new ArrayList<>();
//        List<UnitData> allUnitData = userUnitDataRepository.findAll();
//
//
//        return allUnits;
//    }

//    private UserData getUserData() {
//        UserDetails userDetails = userDetailsServiceImpl.getCurrent();
//        return userDataRepository.findByLogin(userDetails.getUsername())
//                .orElseThrow(RuntimeException::new);
//    }





}
