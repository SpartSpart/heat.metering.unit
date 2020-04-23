package com.spart.heat.metering.unit.repository.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "AR_SPT941_DAY")
@IdClass(UnitInfoPrimaryKey.class)
public class UnitInfoData {

    @Id
    @Column(name = "AR_DATE")
    private Date ar_date;

    @Column(name = "T")
    private long t;

    @Column(name = "NS")
    private String ns;

    @Column(name = "REGIM")
    private int regim;

    @Column(name = "m1")
    private double m1;

    @Column(name = "m2")
    private double m2;

    @Column(name = "m3")
    private double m3;

    @Column(name = "t1")
    private double t1;

    @Column(name = "t2")
    private double t2;

    @Column(name = "w1")
    private double w1;

    @Column(name = "v1")
    private double v1;

    @Column(name = "v2")
    private double v2;

    @Column(name = "v3")
    private double v3;

    @Id
    @Column(name = "ADR_N")
    private int adr_n;

    public UnitInfoData() {
    }

    public Date getAr_date() {
        return ar_date;
    }

    public long getT() {
        return t;
    }

    public String getNs() {
        return ns;
    }

    public int getRegim() {
        return regim;
    }

    public double getM1() {
        return m1;
    }

    public double getM2() {
        return m2;
    }

    public double getM3() {
        return m3;
    }

    public double getT1() {
        return t1;
    }

    public double getT2() {
        return t2;
    }

    public double getW1() {
        return w1;
    }

    public double getV1() {
        return v1;
    }

    public double getV2() {
        return v2;
    }

    public double getV3() {
        return v3;
    }

    public int getAdr_n() {
        return adr_n;
    }
}
