package com.spart.heat.metering.unit.repository.repohour;

import com.spart.heat.metering.unit.repository.model.day.ArMagikaDayEntity;
import com.spart.heat.metering.unit.repository.model.hour.ArMagikaHEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ArMagikaHourRepository extends JpaRepository<ArMagikaHEntity,Date> {
    @Query(value = "select data from ArMagikaHEntity data where data.adrN = :unitId")
    List<ArMagikaHEntity> findDataByUnitId(@Param("unitId") int unitId);

}
