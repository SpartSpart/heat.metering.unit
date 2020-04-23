package com.spart.heat.metering.unit.repository.repoday;

import com.spart.heat.metering.unit.repository.model.day.ArVkt7DayEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ArVkt7DayRepository extends JpaRepository<ArVkt7DayEntity,Date> {
    @Query(value = "select data from ArVkt7DayEntity data where data.adrN = :unitId")
    List<ArVkt7DayEntity> findDataByUnitId(@Param("unitId") int unitId);

}
