package com.spart.heat.metering.unit.service;

import com.spart.heat.metering.unit.controller.model.Unit;
import com.spart.heat.metering.unit.controller.model.UnitInfo;
import com.spart.heat.metering.unit.repository.*;
import com.spart.heat.metering.unit.repository.model.*;
import com.spart.heat.metering.unit.repository.model.day.*;
import com.spart.heat.metering.unit.repository.repoday.*;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class UnitInfoDayService {

    private final UnitInfoDataRepository unitInfoRepository;
    private final UserDataRepository userDataRepository;
    private final UserDetailsServiceImpl userDetailsServiceImpl;
    private final UnitService unitService;

    private final ArSpt941DayRepository arSpt941DayRepository;
    private final ArSpt942DayRepository arSpt942DayRepository;
    private final ArSpt943DayRepository arSpt943DayRepository;
    private final ArTv7DayRepository arTv7DayRepository;
    private final ArVkt7DayRepository arVkt7DayRepository;
    private final ArMagikaDayRepository arMagikaDayRepository;
    private final ArKm5DayRepository arKm5DayRepository;

    public UnitInfoDayService(UnitInfoDataRepository unitInfoRepository, UserDataRepository userDataRepository, UserDetailsServiceImpl userDetailsServiceImpl, UnitService unitService, ArSpt941DayRepository arSpt941DayRepository, ArSpt942DayRepository arSpt942DayRepository, ArSpt943DayRepository arSpt943DayRepository, ArTv7DayRepository arTv7DayRepository, ArVkt7DayRepository arVkt7DayRepository, ArMagikaDayRepository arMagikaDayRepository, ArKm5DayRepository arKm5DayRepository) {
        this.unitInfoRepository = unitInfoRepository;
        this.userDataRepository = userDataRepository;
        this.userDetailsServiceImpl = userDetailsServiceImpl;
        this.unitService = unitService;
        this.arSpt941DayRepository = arSpt941DayRepository;
        this.arSpt942DayRepository = arSpt942DayRepository;
        this.arSpt943DayRepository = arSpt943DayRepository;
        this.arTv7DayRepository = arTv7DayRepository;
        this.arVkt7DayRepository = arVkt7DayRepository;
        this.arMagikaDayRepository = arMagikaDayRepository;
        this.arKm5DayRepository = arKm5DayRepository;
    }

    @Transactional
    public List<UnitInfo> getUnitsInfoDay(int unitId) {
        Unit curentUnit = unitService.getUnit(unitId);
        String teplovichislitel = curentUnit.getTeplovichislitel();
        List<UnitInfo> allUnitInfo = new ArrayList<>();

        switch (teplovichislitel) {
            case "СПТ-941.10": {
                List<ArSpt941DayEntity> allUnitInfoData = arSpt941DayRepository.findDataByUnitId(unitId);
                System.out.println("RowCount = " + allUnitInfoData.size());
                return getSpt941DayInfo(allUnitInfoData);
            }
            case "СПТ-942": {
                List<ArSpt942DayEntity> allUnitInfoData = arSpt942DayRepository.findDataByUnitId(unitId);
                System.out.println("RowCount = " + allUnitInfoData.size());
                return getSpt942DayInfo(allUnitInfoData);
            }
            case "СПТ-943": {
                List<ArSpt943DayEntity> allUnitInfoData = arSpt943DayRepository.findDataByUnitId(unitId);
                System.out.println("RowCount = " + allUnitInfoData.size());
                return getSpt943DayInfo(allUnitInfoData);
            }
            case "ТВ7": {
                List<ArTv7DayEntity> allUnitInfoData = arTv7DayRepository.findDataByUnitId(unitId);
                System.out.println("RowCount = " + allUnitInfoData.size());
                return getTv7DayInfo(allUnitInfoData);
            }
            case "ВКТ-7": {
                List<ArVkt7DayEntity> allUnitInfoData = arVkt7DayRepository.findDataByUnitId(unitId);
                System.out.println("RowCount = " + allUnitInfoData.size());
                return getVkt7DayInfo(allUnitInfoData);
            }
            case "МАГИКА": {
                List<ArMagikaDayEntity> allUnitInfoData = arMagikaDayRepository.findDataByUnitId(unitId);
                System.out.println("RowCount = " + allUnitInfoData.size());
                return getMagikaDayInfo(allUnitInfoData);
            }
            case "КМ-5": {
                List<ArKm5DayEntity> allUnitInfoData = arKm5DayRepository.findDataByUnitId(unitId);
                System.out.println("RowCount = " + allUnitInfoData.size());
                return getKm5DayInfo(allUnitInfoData);
            }

        }
        return null;
    }

    private List<UnitInfo> getSpt941DayInfo(List<ArSpt941DayEntity> allUnitInfoData) {
        List<UnitInfo> allUnitInfo = new ArrayList<>();

        for (ArSpt941DayEntity unitInfoData : allUnitInfoData) {
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

    private List<UnitInfo> getSpt942DayInfo(List<ArSpt942DayEntity> allUnitInfoData) {

        List<UnitInfo> allUnitInfo = new ArrayList<>();

        for (ArSpt942DayEntity unitInfoData : allUnitInfoData) {
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

    private List<UnitInfo> getSpt943DayInfo(List<ArSpt943DayEntity> allUnitInfoData) {
        List<UnitInfo> allUnitInfo = new ArrayList<>();

        for (ArSpt943DayEntity unitInfoData : allUnitInfoData) {
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

    private List<UnitInfo> getTv7DayInfo(List<ArTv7DayEntity> allUnitInfoData) {
        List<UnitInfo> allUnitInfo = new ArrayList<>();

        for (ArTv7DayEntity unitInfoData : allUnitInfoData) {
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

    private List<UnitInfo> getVkt7DayInfo(List<ArVkt7DayEntity> allUnitInfoData) {
        List<UnitInfo> allUnitInfo = new ArrayList<>();

        for (ArVkt7DayEntity unitInfoData : allUnitInfoData) {
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

    private List<UnitInfo> getMagikaDayInfo(List<ArMagikaDayEntity> allUnitInfoData) {
        List<UnitInfo> allUnitInfo = new ArrayList<>();

        for (ArMagikaDayEntity unitInfoData : allUnitInfoData) {
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

    private List<UnitInfo> getKm5DayInfo(List<ArKm5DayEntity> allUnitInfoData) {
        List<UnitInfo> allUnitInfo = new ArrayList<>();

        for (ArKm5DayEntity unitInfoData : allUnitInfoData) {
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
