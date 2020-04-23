package com.spart.heat.metering.unit.repository.repohour;

import com.spart.heat.metering.unit.repository.model.day.ArKm5DayEntity;
import com.spart.heat.metering.unit.repository.model.hour.ArKm5HEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ArKm5HourRepository extends JpaRepository<ArKm5HEntity,Date> {
    @Query(value = "select data from ArKm5HEntity data where data.adrN = :unitId")
    List<ArKm5HEntity> findDataByUnitId(@Param("unitId") int unitId);

}
