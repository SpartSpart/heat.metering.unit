package com.spart.heat.metering.unit.repository.repohour;

import com.spart.heat.metering.unit.repository.model.day.ArSpt942DayEntity;
import com.spart.heat.metering.unit.repository.model.hour.ArSpt942HEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ArSpt942HourRepository extends JpaRepository<ArSpt942HEntity,Date> {
    @Query(value = "select data from ArSpt942HEntity data where data.adrN = :unitId")
    List<ArSpt942HEntity> findDataByUnitId(@Param("unitId") int unitId);

}
