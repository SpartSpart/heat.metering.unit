package com.spart.heat.metering.unit.repository;

import com.spart.heat.metering.unit.repository.model.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface UserDataRepository extends JpaRepository<UserData,Integer> {

    Optional<UserData> findByLogin(String login);
}
