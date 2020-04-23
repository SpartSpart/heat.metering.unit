package com.spart.heat.metering.unit.repository.model.primarykey;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

public class ArSpt941DayEntityPK implements Serializable {
    private Timestamp arDate;
    private int adrN;

    @Column(name = "AR_DATE")
    @Id
    public Timestamp getArDate() {
        return arDate;
    }

    public void setArDate(Timestamp arDate) {
        this.arDate = arDate;
    }

    @Column(name = "ADR_N")
    @Id
    public int getAdrN() {
        return adrN;
    }

    public void setAdrN(int adrN) {
        this.adrN = adrN;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArSpt941DayEntityPK that = (ArSpt941DayEntityPK) o;
        return adrN == that.adrN &&
                Objects.equals(arDate, that.arDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arDate, adrN);
    }
}
