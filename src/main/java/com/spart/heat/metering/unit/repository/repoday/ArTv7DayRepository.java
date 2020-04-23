package com.spart.heat.metering.unit.repository.repoday;

import com.spart.heat.metering.unit.repository.model.day.ArTv7DayEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ArTv7DayRepository extends JpaRepository<ArTv7DayEntity,Date> {
    @Query(value = "select data from ArTv7DayEntity data where data.adrN = :unitId")
    List<ArTv7DayEntity> findDataByUnitId(@Param("unitId") int unitId);

}
