package com.spart.heat.metering.unit.service;

import com.spart.heat.metering.unit.controller.model.Unit;
import com.spart.heat.metering.unit.controller.model.UnitInfo;
import com.spart.heat.metering.unit.repository.*;
import com.spart.heat.metering.unit.repository.model.UserData;
import com.spart.heat.metering.unit.repository.model.day.*;
import com.spart.heat.metering.unit.repository.model.hour.*;
import com.spart.heat.metering.unit.repository.repohour.*;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class UnitInfoHourService {

    private final UnitInfoDataRepository unitInfoRepository;
    private final UserDataRepository userDataRepository;
    private final UserDetailsServiceImpl userDetailsServiceImpl;
    private final UnitService unitService;

    private final ArKm5HourRepository arKm5HourRepository;
    private final ArMagikaHourRepository arMagikaHourRepository;
    private final ArSpt941HourRepository arSpt941HourRepository;
    private final ArSpt942HourRepository arSpt942HourRepository;
    private final ArSpt943HourRepository arSpt943HourRepository;
    private final ArTv7HourRepository arTv7HourRepository;
    private final ArVkt7HourRepository arVkt7HourRepository;


    public UnitInfoHourService(UnitInfoDataRepository unitInfoRepository,
                               UserDataRepository userDataRepository,
                               UserDetailsServiceImpl userDetailsServiceImpl,
                               UnitService unitService,
                               ArKm5HourRepository arKm5HourRepository,
                               ArMagikaHourRepository arMagikaHourRepository,
                               ArSpt941HourRepository arSpt941HourRepository,
                               ArSpt942HourRepository arSpt942HourRepository,
                               ArSpt943HourRepository arSpt943HourRepository,
                               ArTv7HourRepository arTv7HourRepository,
                               ArVkt7HourRepository arVkt7HourRepository) {
        this.unitInfoRepository = unitInfoRepository;
        this.userDataRepository = userDataRepository;
        this.userDetailsServiceImpl = userDetailsServiceImpl;
        this.unitService = unitService;
        this.arKm5HourRepository = arKm5HourRepository;
        this.arMagikaHourRepository = arMagikaHourRepository;
        this.arSpt941HourRepository = arSpt941HourRepository;
        this.arSpt942HourRepository = arSpt942HourRepository;
        this.arSpt943HourRepository = arSpt943HourRepository;
        this.arTv7HourRepository = arTv7HourRepository;

        this.arVkt7HourRepository = arVkt7HourRepository;
    }

    @Transactional
    public List<UnitInfo> getUnitsInfoHour(int unitId) {
        Unit curentUnit = unitService.getUnit(unitId);
        String teplovichislitel = curentUnit.getTeplovichislitel();
        List<UnitInfo> allUnitInfo = new ArrayList<>();

        switch (teplovichislitel) {
            case "СПТ-941.10": {
                List<ArSpt941HEntity> allUnitInfoData = arSpt941HourRepository.findDataByUnitId(unitId);
                System.out.println("RowCount = " + allUnitInfoData.size());
                return getSpt941HourInfo(allUnitInfoData);
            }
            case "СПТ-942": {
                List<ArSpt942HEntity> allUnitInfoData = arSpt942HourRepository.findDataByUnitId(unitId);
                System.out.println("RowCount = " + allUnitInfoData.size());
                return getSpt942HourInfo(allUnitInfoData);
            }
            case "СПТ-943": {
                List<ArSpt943HEntity> allUnitInfoData = arSpt943HourRepository.findDataByUnitId(unitId);
                System.out.println("RowCount = " + allUnitInfoData.size());
                return getSpt943HourInfo(allUnitInfoData);
            }
            case "ТВ7": {
                List<ArTv7HEntity> allUnitInfoData = arTv7HourRepository.findDataByUnitId(unitId);
                System.out.println("RowCount = " + allUnitInfoData.size());
                return getTv7HourInfo(allUnitInfoData);
            }
            case "ВКТ-7": {
                List<ArVkt7HEntity> allUnitInfoData = arVkt7HourRepository.findDataByUnitId(unitId);
                System.out.println("RowCount = " + allUnitInfoData.size());
                return getVkt7HourInfo(allUnitInfoData);
            }
            case "МАГИКА": {
                List<ArMagikaHEntity> allUnitInfoData = arMagikaHourRepository.findDataByUnitId(unitId);
                System.out.println("RowCount = " + allUnitInfoData.size());
                return getMagikaHourInfo(allUnitInfoData);
            }
            case "КМ-5": {
                List<ArKm5HEntity> allUnitInfoData = arKm5HourRepository.findDataByUnitId(unitId);
                System.out.println("RowCount = " + allUnitInfoData.size());
                return getKm5HourInfo(allUnitInfoData);
            }

        }
        return null;
    }

    private List<UnitInfo> getSpt941HourInfo(List<ArSpt941HEntity> allUnitInfoData) {
        List<UnitInfo> allUnitInfo = new ArrayList<>();

        for (ArSpt941HEntity unitInfoData : allUnitInfoData) {
            UnitInfo unitInfo = new UnitInfo();
            unitInfo.setAr_date(unitInfoData.getArDate());
            unitInfo.setAdr_n(unitInfoData.getAdrN());
            unitInfo.setM1(unitInfoData.getM1() == null ? 0 : unitInfoData.getM1());
            unitInfo.setM2(unitInfoData.getM2() == null ? 0 : unitInfoData.getM2());
            unitInfo.setM3(unitInfoData.getM3() == null ? 0 : unitInfoData.getM3());
            unitInfo.setT1(unitInfoData.getT1() == null ? 0 : unitInfoData.getT1());
            unitInfo.setT2(unitInfoData.getT2() == null ? 0 : unitInfoData.getT2());
            unitInfo.setW1(unitInfoData.getW1() == null ? 0 : unitInfoData.getW1());

            allUnitInfo.add(unitInfo);
        }
        return allUnitInfo;
    }

    private List<UnitInfo> getSpt942HourInfo(List<ArSpt942HEntity> allUnitInfoData) {

        List<UnitInfo> allUnitInfo = new ArrayList<>();

        for (ArSpt942HEntity unitInfoData : allUnitInfoData) {
            UnitInfo unitInfo = new UnitInfo();
            unitInfo.setAdr_n(unitInfoData.getAdrN());
            unitInfo.setAr_date(unitInfoData.getArDate());
            unitInfo.setM1_tv1(unitInfoData.getM1Tv1() == null ? 0 : unitInfoData.getM1Tv1());
            unitInfo.setM2_tv1(unitInfoData.getM2Tv1() == null ? 0 : unitInfoData.getM2Tv1());
            unitInfo.setM3_tv1(unitInfoData.getM3Tv1() == null ? 0 : unitInfoData.getM3Tv1());
            unitInfo.setT1_tv1(unitInfoData.getT1Tv1() == null ? 0 : unitInfoData.getT1Tv1());
            unitInfo.setT2_tv1(unitInfoData.getT2Tv1() == null ? 0 : unitInfoData.getT2Tv1());
            unitInfo.setW1_tv1(unitInfoData.getW1Tv1() == null ? 0 : unitInfoData.getW1Tv1());
            unitInfo.setP1_tv1(unitInfoData.getP1Tv1() == null ? 0 : unitInfoData.getP1Tv1());
            unitInfo.setP2_tv1(unitInfoData.getP2Tv1() == null ? 0 : unitInfoData.getP2Tv1());
            unitInfo.setM1_tv2(unitInfoData.getM1Tv2() == null ? 0 : unitInfoData.getM1Tv2());
            unitInfo.setM2_tv2(unitInfoData.getM2Tv2() == null ? 0 : unitInfoData.getM2Tv2());
            unitInfo.setM3_tv2(unitInfoData.getM3Tv2() == null ? 0 : unitInfoData.getM3Tv2());
            unitInfo.setT1_tv2(unitInfoData.getT1Tv2() == null ? 0 : unitInfoData.getT1Tv2());
            unitInfo.setT2_tv2(unitInfoData.getT2Tv2() == null ? 0 : unitInfoData.getT2Tv2());
            unitInfo.setW1_tv2(unitInfoData.getW1Tv2() == null ? 0 : unitInfoData.getW1Tv2());
            unitInfo.setP1_tv2(unitInfoData.getP1Tv2() == null ? 0 : unitInfoData.getP1Tv2());
            unitInfo.setP2_tv2(unitInfoData.getP2Tv2() == null ? 0 : unitInfoData.getP2Tv2());

            allUnitInfo.add(unitInfo);
        }
        return allUnitInfo;
    }

    private List<UnitInfo> getSpt943HourInfo(List<ArSpt943HEntity> allUnitInfoData) {
        List<UnitInfo> allUnitInfo = new ArrayList<>();

        for (ArSpt943HEntity unitInfoData : allUnitInfoData) {
            UnitInfo unitInfo = new UnitInfo();
            unitInfo.setAdr_n(unitInfoData.getAdrN());
            unitInfo.setAr_date(unitInfoData.getArDate());
            unitInfo.setM1_tv1(unitInfoData.getM1Tv1() == null ? 0 : unitInfoData.getM1Tv1());
            unitInfo.setM2_tv1(unitInfoData.getM2Tv1() == null ? 0 : unitInfoData.getM2Tv1());
            unitInfo.setM3_tv1(unitInfoData.getM3Tv1() == null ? 0 : unitInfoData.getM3Tv1());
            unitInfo.setT1_tv1(unitInfoData.getT1Tv1() == null ? 0 : unitInfoData.getT1Tv1());
            unitInfo.setT2_tv1(unitInfoData.getT2Tv1() == null ? 0 : unitInfoData.getT2Tv1());
            unitInfo.setT3_tv1(unitInfoData.getT3Tv1() == null ? 0 : unitInfoData.getT3Tv1());
            unitInfo.setW1_tv1(unitInfoData.getW1Tv1() == null ? 0 : unitInfoData.getW1Tv1());
            unitInfo.setW2_tv1(unitInfoData.getW2Tv1() == null ? 0 : unitInfoData.getW2Tv1());
            unitInfo.setP1_tv1(unitInfoData.getP1Tv1() == null ? 0 : unitInfoData.getP1Tv1());
            unitInfo.setP2_tv1(unitInfoData.getP2Tv1() == null ? 0 : unitInfoData.getP2Tv1());
            unitInfo.setM1_tv2(unitInfoData.getM1Tv2() == null ? 0 : unitInfoData.getM1Tv2());
            unitInfo.setM2_tv2(unitInfoData.getM2Tv2() == null ? 0 : unitInfoData.getM2Tv2());
            unitInfo.setM3_tv2(unitInfoData.getM3Tv2() == null ? 0 : unitInfoData.getM3Tv2());
            unitInfo.setT1_tv2(unitInfoData.getT1Tv2() == null ? 0 : unitInfoData.getT1Tv2());
            unitInfo.setT2_tv2(unitInfoData.getT2Tv2() == null ? 0 : unitInfoData.getT2Tv2());
            unitInfo.setT3_tv2(unitInfoData.getT3Tv2() == null ? 0 : unitInfoData.getT3Tv2());
            unitInfo.setW1_tv2(unitInfoData.getW1Tv2() == null ? 0 : unitInfoData.getW1Tv2());
            unitInfo.setW2_tv2(unitInfoData.getW2Tv2() == null ? 0 : unitInfoData.getW2Tv2());
            unitInfo.setP1_tv2(unitInfoData.getP1Tv2() == null ? 0 : unitInfoData.getP1Tv2());
            unitInfo.setP2_tv2(unitInfoData.getP2Tv2() == null ? 0 : unitInfoData.getP2Tv2());

            allUnitInfo.add(unitInfo);
        }
        return allUnitInfo;
    }

    private List<UnitInfo> getTv7HourInfo(List<ArTv7HEntity> allUnitInfoData) {
        List<UnitInfo> allUnitInfo = new ArrayList<>();

        for (ArTv7HEntity unitInfoData : allUnitInfoData) {
            UnitInfo unitInfo = new UnitInfo();
            unitInfo.setAr_date(unitInfoData.getArDate());
            unitInfo.setAdr_n(unitInfoData.getAdrN());
            unitInfo.setM1_tv1(unitInfoData.getM1Tv1() == null ? 0 : unitInfoData.getM1Tv1());
            unitInfo.setM2_tv1(unitInfoData.getM2Tv1() == null ? 0 : unitInfoData.getM2Tv1());
            unitInfo.setM3_tv1(unitInfoData.getM3Tv1() == null ? 0 : unitInfoData.getM3Tv1());
            unitInfo.setT1_tv1(unitInfoData.getT1Tv1() == null ? 0 : unitInfoData.getT1Tv1());
            unitInfo.setT2_tv1(unitInfoData.getT2Tv1() == null ? 0 : unitInfoData.getT2Tv1());
            unitInfo.setT3_tv1(unitInfoData.getT3Tv1() == null ? 0 : unitInfoData.getT3Tv1());
            unitInfo.setQ_tv1(unitInfoData.getqTv1() == null ? 0 : unitInfoData.getqTv1());
            unitInfo.setQ12_tv1(unitInfoData.getQ12Tv1() == null ? 0 : unitInfoData.getQ12Tv1());
            unitInfo.setQg_tv1(unitInfoData.getQgTv1() == null ? 0 : unitInfoData.getQgTv1());
            unitInfo.setP1_tv1(unitInfoData.getP1Tv1() == null ? 0 : unitInfoData.getP1Tv1());
            unitInfo.setP2_tv1(unitInfoData.getP2Tv1() == null ? 0 : unitInfoData.getP2Tv1());
            unitInfo.setM1_tv2(unitInfoData.getM1Tv2() == null ? 0 : unitInfoData.getM1Tv2());
            unitInfo.setM2_tv2(unitInfoData.getM2Tv2() == null ? 0 : unitInfoData.getM2Tv2());
            unitInfo.setM3_tv2(unitInfoData.getM3Tv2() == null ? 0 : unitInfoData.getM3Tv2());
            unitInfo.setT1_tv2(unitInfo.getT1_tv2() == null ? 0 : unitInfoData.getT1Tv2());
            unitInfo.setT2_tv2(unitInfo.getT2_tv2() == null ? 0 : unitInfoData.getT2Tv2());
            unitInfo.setT3_tv2(unitInfo.getT3_tv2() == null ? 0 : unitInfoData.getT3Tv2());
            unitInfo.setQ_tv2(unitInfoData.getqTv2() == null ? 0 : unitInfoData.getqTv2());
            unitInfo.setQg_tv2(unitInfoData.getQgTv2() == null ? 0 : unitInfoData.getQgTv2());
            unitInfo.setP1_tv2(unitInfoData.getP1Tv2() == null ? 0 : unitInfoData.getP1Tv2());
            unitInfo.setP2_tv2(unitInfoData.getP2Tv2() == null ? 0 : unitInfoData.getP2Tv2());

            allUnitInfo.add(unitInfo);
        }
        return allUnitInfo;
    }

    private List<UnitInfo> getVkt7HourInfo(List<ArVkt7HEntity> allUnitInfoData) {
        List<UnitInfo> allUnitInfo = new ArrayList<>();

        for (ArVkt7HEntity unitInfoData : allUnitInfoData) {
            UnitInfo unitInfo = new UnitInfo();
            unitInfo.setAr_date(unitInfoData.getArDate());
            unitInfo.setAdr_n(unitInfoData.getAdrN());
            unitInfo.setM1_tv1(unitInfoData.getM1Tv1() == null ? 0 : unitInfoData.getM1Tv1());
            unitInfo.setM2_tv1(unitInfoData.getM2Tv1() == null ? 0 : unitInfoData.getM2Tv1());
            unitInfo.setM3_tv1(unitInfoData.getM3Tv1() == null ? 0 : unitInfoData.getM3Tv1());
            unitInfo.setT1_tv1(unitInfoData.getT1Tv1() == null ? 0 : unitInfoData.getT1Tv1());
            unitInfo.setT2_tv1(unitInfoData.getT2Tv1() == null ? 0 : unitInfoData.getT2Tv1());
            unitInfo.setT3_tv1(unitInfoData.getT3Tv1() == null ? 0 : unitInfoData.getT3Tv1());
            unitInfo.setQ0_tv1(unitInfoData.getQ0Tv1() == null ? 0 : unitInfoData.getQ0Tv1());
            unitInfo.setQg_tv1(unitInfoData.getQgTv1() == null ? 0 : unitInfoData.getQgTv1());
            unitInfo.setP1_tv1(unitInfoData.getP1Tv1() == null ? 0 : unitInfoData.getP1Tv1());
            unitInfo.setP2_tv1(unitInfoData.getP2Tv1() == null ? 0 : unitInfoData.getP2Tv1());
            unitInfo.setM1_tv2(unitInfoData.getM1Tv2() == null ? 0 : unitInfoData.getM1Tv2());
            unitInfo.setM2_tv2(unitInfoData.getM2Tv2() == null ? 0 : unitInfoData.getM2Tv2());
            unitInfo.setM3_tv2(unitInfoData.getM3Tv2() == null ? 0 : unitInfoData.getM3Tv2());
            unitInfo.setT1_tv2(unitInfoData.getT1Tv2() == null ? 0 : unitInfoData.getT1Tv2());
            unitInfo.setT2_tv2(unitInfoData.getT2Tv2() == null ? 0 : unitInfoData.getT2Tv2());
            unitInfo.setT3_tv2(unitInfoData.getT3Tv2() == null ? 0 : unitInfoData.getT3Tv2());
            unitInfo.setQ0_tv2(unitInfoData.getQ0Tv2() == null ? 0 : unitInfoData.getQ0Tv2());
            unitInfo.setQg_tv2(unitInfoData.getQgTv2() == null ? 0 : unitInfoData.getQgTv2());
            unitInfo.setP1_tv2(unitInfoData.getP1Tv2() == null ? 0 : unitInfoData.getP1Tv2());
            unitInfo.setP2_tv2(unitInfoData.getP2Tv2() == null ? 0 : unitInfoData.getP2Tv2());

            allUnitInfo.add(unitInfo);
        }
        return allUnitInfo;
    }

    private List<UnitInfo> getMagikaHourInfo(List<ArMagikaHEntity> allUnitInfoData) {
        List<UnitInfo> allUnitInfo = new ArrayList<>();

        for (ArMagikaHEntity unitInfoData : allUnitInfoData) {
            UnitInfo unitInfo = new UnitInfo();
            unitInfo.setAr_date(unitInfoData.getArDate());
            unitInfo.setAdr_n(unitInfoData.getAdrN());
            unitInfo.setM1(unitInfoData.getM1() == null ? 0 : unitInfoData.getM1());
            unitInfo.setM2(unitInfoData.getM2() == null ? 0 : unitInfoData.getM2());
            unitInfo.setDm1(unitInfoData.getDm1() == null ? 0 : unitInfoData.getDm1());
            unitInfo.setT1(unitInfo.getT1() == null ? 0 : unitInfoData.getT1());
            unitInfo.setT2(unitInfo.getT2() == null ? 0 : unitInfoData.getT2());
            unitInfo.setDq1(unitInfoData.getDq1() == null ? 0 : unitInfoData.getDq1());
            unitInfo.setP1(unitInfoData.getP1() == null ? 0 : unitInfoData.getP1());
            unitInfo.setP2(unitInfoData.getP2() == null ? 0 : unitInfoData.getP2());

            allUnitInfo.add(unitInfo);
        }
        return allUnitInfo;
    }

    private List<UnitInfo> getKm5HourInfo(List<ArKm5HEntity> allUnitInfoData) {
        List<UnitInfo> allUnitInfo = new ArrayList<>();

        for (ArKm5HEntity unitInfoData : allUnitInfoData) {
            UnitInfo unitInfo = new UnitInfo();
            unitInfo.setAr_date(unitInfoData.getArDate());
            unitInfo.setAdr_n(unitInfoData.getAdrN());
            unitInfo.setM1(unitInfoData.getM1() == null ? 0 : unitInfoData.getM1());
            unitInfo.setM2(unitInfoData.getM2() == null ? 0 : unitInfoData.getM2());
            unitInfo.setDm12(unitInfoData.getDm12() == null ? 0 : unitInfoData.getDm12());
            unitInfo.setT1(unitInfo.getT1() == null ? 0 : unitInfoData.getT1());
            unitInfo.setT2(unitInfo.getT2() == null ? 0 : unitInfoData.getT2());
            unitInfo.setW1(unitInfo.getW1() == null ? 0 : unitInfoData.getW1());

            allUnitInfo.add(unitInfo);
        }
        return allUnitInfo;
    }


    private UserData getUserData() {
        UserDetails userDetails = userDetailsServiceImpl.getCurrent();
        return userDataRepository.findByLogin(userDetails.getUsername())
                .orElseThrow(RuntimeException::new);
    }

    @Transactional
    public Object getInfo(int unitId) {

        return null;
    }
}
