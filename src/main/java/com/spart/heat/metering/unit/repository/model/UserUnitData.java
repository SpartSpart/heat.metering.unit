package com.spart.heat.metering.unit.repository.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REMOTE_USER_UNIT")

public class UserUnitData {

    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "REMOTE_USER_ID")
    private int userId;

    @Column(name = "UNIT_ID")
    private int unitId;

    public UserUnitData() {
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public int getUnitId() {
        return unitId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }
}
