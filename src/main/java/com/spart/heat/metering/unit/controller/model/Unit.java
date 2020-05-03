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

    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof Unit)) {
            return false;
        }

        Unit unit = (Unit) o;

        return unit.unitNumber == unitNumber &&
                unit.organization.equals(organization);
    }

    @Override
    public String toString() {
        return String.valueOf(unitNumber)+
                " ("+adress+")";
    }
}
