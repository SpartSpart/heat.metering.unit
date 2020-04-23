package com.spart.heat.metering.unit.repository.repohour;

import com.spart.heat.metering.unit.repository.model.day.ArSpt943DayEntity;
import com.spart.heat.metering.unit.repository.model.hour.ArSpt943HEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ArSpt943HourRepository extends JpaRepository<ArSpt943HEntity,Date> {
    @Query(value = "select data from ArSpt943HEntity data where data.adrN = :unitId")
    List<ArSpt943HEntity> findDataByUnitId(@Param("unitId") int unitId);

}
