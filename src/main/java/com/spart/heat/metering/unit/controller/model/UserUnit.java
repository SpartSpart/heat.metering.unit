package com.spart.heat.metering.unit.controller.model;

public class UserUnit {

    private int id;
    private int userId;
    private int unitId;

    public UserUnit(int userId, int unitId) {
        this.userId = userId;
        this.unitId = unitId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUnitId() {
        return unitId;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }
}
