package com.spart.heat.metering.unit.repository;

import com.spart.heat.metering.unit.repository.model.UnitData;
import com.spart.heat.metering.unit.repository.model.UnitInfoData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface UnitInfoDataRepository extends JpaRepository<UnitInfoData,Date> {

}
