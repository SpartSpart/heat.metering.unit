package com.spart.heat.metering.unit.controller.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Unit {

    private int unitNumber;
    private String organization;
    private String adress;
    private String teplovichislitel;

    public String getTeplovichislitel() {
        return teplovichislitel;
    }

    public void setTeplovichislitel(String teplovichislitel) {
        this.teplovichislitel = teplovichislitel;
    }

    public int getUnitNumber() {
        return unitNumber;
    }

    public String getOrganization() {
        return organization;
    }

    public String getAdress() {
        return adress;
    }

    public void setUnitNumber(int unitNumber) {
        this.unitNumber = unitNumber;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
