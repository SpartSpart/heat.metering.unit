package com.spart.heat.metering.unit.repository.repohour;

import com.spart.heat.metering.unit.repository.model.day.ArSpt941DayEntity;
import com.spart.heat.metering.unit.repository.model.hour.ArSpt941HEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ArSpt941HourRepository extends JpaRepository<ArSpt941HEntity,Date> {
    @Query(value = "select data from ArSpt941HEntity data where data.adrN = :unitId")
    List<ArSpt941HEntity> findDataByUnitId(@Param("unitId") int unitId);

}
