package com.spart.heat.metering.unit.repository.model;

import javax.persistence.*;

@Entity
@Table(name = "ADRES")

public class UnitData {

    @Id
    @Column(name = "N")
    private int unitNumber;

    @Column(name = "NAZV")
    private String organization;

    @Column(name = "ADRES")
    private String adress;

    @Column(name = "TEPLOV")
    private String teplovichislitel;



    public UnitData() {
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

    public String getTeplovichislitel() {
        return teplovichislitel;
    }
}
