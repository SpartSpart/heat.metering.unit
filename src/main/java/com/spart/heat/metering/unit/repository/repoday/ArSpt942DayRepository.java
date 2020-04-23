package com.spart.heat.metering.unit.repository.repoday;

import com.spart.heat.metering.unit.repository.model.day.ArSpt942DayEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ArSpt942DayRepository extends JpaRepository<ArSpt942DayEntity,Date> {
    @Query(value = "select data from ArSpt942DayEntity data where data.adrN = :unitId")
    List<ArSpt942DayEntity> findDataByUnitId(@Param("unitId") int unitId);

}
