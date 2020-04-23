package com.spart.heat.metering.unit.repository.model.day;

import com.spart.heat.metering.unit.repository.model.primarykey.ArSpt941DayEntityPK;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "AR_SPT941_DAY", schema = "", catalog = "")
@IdClass(ArSpt941DayEntityPK.class)
public class ArSpt941DayEntity {
    private Timestamp arDate;
    private Double t;
    private String ns;
    private Integer regim;
    private Double m1;
    private Double m2;
    private Double m3;
    private Double t1;
    private Double t2;
    private Double w1;
    private Double v1;
    private Double v2;
    private Double v3;
    private int adrN;
    private String responseTv1;

    @Id
    @Column(name = "AR_DATE")
    public Timestamp getArDate() {
        return arDate;
    }

    public void setArDate(Timestamp arDate) {
        this.arDate = arDate;
    }

    @Basic
    @Column(name = "T")
    public Double getT() {
        return t;
    }

    public void setT(Double t) {
        this.t = t;
    }

    @Basic
    @Column(name = "NS")
    public String getNs() {
        return ns;
    }

    public void setNs(String ns) {
        this.ns = ns;
    }

    @Basic
    @Column(name = "REGIM")
    public Integer getRegim() {
        return regim;
    }

    public void setRegim(Integer regim) {
        this.regim = regim;
    }

    @Basic
    @Column(name = "M1")
    public Double getM1() {
        return m1;
    }

    public void setM1(Double m1) {
        this.m1 = m1;
    }

    @Basic
    @Column(name = "M2")
    public Double getM2() {
        return m2;
    }

    public void setM2(Double m2) {
        this.m2 = m2;
    }

    @Basic
    @Column(name = "M3")
    public Double getM3() {
        return m3;
    }

    public void setM3(Double m3) {
        this.m3 = m3;
    }

    @Basic
    @Column(name = "T1")
    public Double getT1() {
        return t1;
    }

    public void setT1(Double t1) {
        this.t1 = t1;
    }

    @Basic
    @Column(name = "T2")
    public Double getT2() {
        return t2;
    }

    public void setT2(Double t2) {
        this.t2 = t2;
    }

    @Basic
    @Column(name = "W1")
    public Double getW1() {
        return w1;
    }

    public void setW1(Double w1) {
        this.w1 = w1;
    }

    @Basic
    @Column(name = "V1")
    public Double getV1() {
        return v1;
    }

    public void setV1(Double v1) {
        this.v1 = v1;
    }

    @Basic
    @Column(name = "V2")
    public Double getV2() {
        return v2;
    }

    public void setV2(Double v2) {
        this.v2 = v2;
    }

    @Basic
    @Column(name = "V3")
    public Double getV3() {
        return v3;
    }

    public void setV3(Double v3) {
        this.v3 = v3;
    }

    @Id
    @Column(name = "ADR_N")
    public int getAdrN() {
        return adrN;
    }

    public void setAdrN(int adrN) {
        this.adrN = adrN;
    }

    @Basic
    @Column(name = "RESPONSE_TV1")
    public String getResponseTv1() {
        return responseTv1;
    }

    public void setResponseTv1(String responseTv1) {
        this.responseTv1 = responseTv1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArSpt941DayEntity that = (ArSpt941DayEntity) o;
        return adrN == that.adrN &&
                Objects.equals(arDate, that.arDate) &&
                Objects.equals(t, that.t) &&
                Objects.equals(ns, that.ns) &&
                Objects.equals(regim, that.regim) &&
                Objects.equals(m1, that.m1) &&
                Objects.equals(m2, that.m2) &&
                Objects.equals(m3, that.m3) &&
                Objects.equals(t1, that.t1) &&
                Objects.equals(t2, that.t2) &&
                Objects.equals(w1, that.w1) &&
                Objects.equals(v1, that.v1) &&
                Objects.equals(v2, that.v2) &&
                Objects.equals(v3, that.v3) &&
                Objects.equals(responseTv1, that.responseTv1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arDate, t, ns, regim, m1, m2, m3, t1, t2, w1, v1, v2, v3, adrN, responseTv1);
    }
}
