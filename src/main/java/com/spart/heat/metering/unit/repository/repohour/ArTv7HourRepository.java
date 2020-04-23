package com.spart.heat.metering.unit.repository.repohour;

import com.spart.heat.metering.unit.repository.model.day.ArTv7DayEntity;
import com.spart.heat.metering.unit.repository.model.hour.ArTv7HEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ArTv7HourRepository extends JpaRepository<ArTv7HEntity,Date> {
    @Query(value = "select data from ArTv7HEntity data where data.adrN = :unitId")
    List<ArTv7HEntity> findDataByUnitId(@Param("unitId") int unitId);

}
