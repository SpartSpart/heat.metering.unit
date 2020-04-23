package com.spart.heat.metering.unit.repository.repoday;

import com.spart.heat.metering.unit.repository.model.day.ArMagikaDayEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ArMagikaDayRepository extends JpaRepository<ArMagikaDayEntity,Date> {
    @Query(value = "select data from ArMagikaDayEntity data where data.adrN = :unitId")
    List<ArMagikaDayEntity> findDataByUnitId(@Param("unitId") int unitId);

}
