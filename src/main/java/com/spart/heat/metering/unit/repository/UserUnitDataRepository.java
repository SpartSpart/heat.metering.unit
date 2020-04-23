package com.spart.heat.metering.unit.repository;

import com.spart.heat.metering.unit.repository.model.UserUnitData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserUnitDataRepository extends JpaRepository<UserUnitData,Integer> {
    Optional<UserUnitData> findByUserId(Integer userId);
}
