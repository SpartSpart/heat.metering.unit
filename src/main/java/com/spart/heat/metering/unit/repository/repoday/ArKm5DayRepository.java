package com.spart.heat.metering.unit.repository.repoday;

import com.spart.heat.metering.unit.repository.model.day.ArKm5DayEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ArKm5DayRepository extends JpaRepository<ArKm5DayEntity,Date> {
    @Query(value = "select data from ArKm5DayEntity data where data.adrN = :unitId")
    List<ArKm5DayEntity> findDataByUnitId(@Param("unitId") int unitId);

}
