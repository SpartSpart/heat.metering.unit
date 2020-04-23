package com.spart.heat.metering.unit.repository.repohour;

import com.spart.heat.metering.unit.repository.model.day.ArVkt7DayEntity;
import com.spart.heat.metering.unit.repository.model.hour.ArVkt7HEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ArVkt7HourRepository extends JpaRepository<ArVkt7HEntity,Date> {
    @Query(value = "select data from ArVkt7HEntity data where data.adrN = :unitId")
    List<ArVkt7HEntity> findDataByUnitId(@Param("unitId") int unitId);

}
