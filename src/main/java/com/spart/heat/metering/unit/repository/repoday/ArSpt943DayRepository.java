package com.spart.heat.metering.unit.repository.repoday;

import com.spart.heat.metering.unit.repository.model.day.ArSpt943DayEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ArSpt943DayRepository extends JpaRepository<ArSpt943DayEntity,Date> {
    @Query(value = "select data from ArSpt943DayEntity data where data.adrN = :unitId")
    List<ArSpt943DayEntity> findDataByUnitId(@Param("unitId") int unitId);

}
