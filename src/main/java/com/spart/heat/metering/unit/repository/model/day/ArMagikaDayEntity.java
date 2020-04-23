package com.spart.heat.metering.unit.repository.model.day;

import com.spart.heat.metering.unit.repository.model.primarykey.ArMagikaDayEntityPK;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "AR_MAGIKA_DAY", schema = "", catalog = "")
@IdClass(ArMagikaDayEntityPK.class)
public class ArMagikaDayEntity {
    private Timestamp arDate;
    private Double t;
    private Double tNs;
    private Double m1;
    private Double m2;
    private Double dm1;
    private Double m5;
    private Double m3;
    private Double t1;
    private Double t2;
    private Double dq1;
    private Double p1;
    private Double p2;
    private Double tnorm;
    private Double tmin;
    private Double tmax;
    private Double tdeltat;
    private Double tnorm2;
    private Double m1T;
    private Double m2T;
    private Double m3T;
    private Double xxx1;
    private Double xxx2;
    private Double dq1T;
    private Double tT;
    private Double tnorm2T;
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
    @Column(name = "T_NS")
    public Double gettNs() {
        return tNs;
    }

    public void settNs(Double tNs) {
        this.tNs = tNs;
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
    @Column(name = "DM1")
    public Double getDm1() {
        return dm1;
    }

    public void setDm1(Double dm1) {
        this.dm1 = dm1;
    }

    @Basic
    @Column(name = "M5")
    public Double getM5() {
        return m5;
    }

    public void setM5(Double m5) {
        this.m5 = m5;
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
    @Column(name = "DQ1")
    public Double getDq1() {
        return dq1;
    }

    public void setDq1(Double dq1) {
        this.dq1 = dq1;
    }

    @Basic
    @Column(name = "P1")
    public Double getP1() {
        return p1;
    }

    public void setP1(Double p1) {
        this.p1 = p1;
    }

    @Basic
    @Column(name = "P2")
    public Double getP2() {
        return p2;
    }

    public void setP2(Double p2) {
        this.p2 = p2;
    }

    @Basic
    @Column(name = "TNORM")
    public Double getTnorm() {
        return tnorm;
    }

    public void setTnorm(Double tnorm) {
        this.tnorm = tnorm;
    }

    @Basic
    @Column(name = "TMIN")
    public Double getTmin() {
        return tmin;
    }

    public void setTmin(Double tmin) {
        this.tmin = tmin;
    }

    @Basic
    @Column(name = "TMAX")
    public Double getTmax() {
        return tmax;
    }

    public void setTmax(Double tmax) {
        this.tmax = tmax;
    }

    @Basic
    @Column(name = "TDELTAT")
    public Double getTdeltat() {
        return tdeltat;
    }

    public void setTdeltat(Double tdeltat) {
        this.tdeltat = tdeltat;
    }

    @Basic
    @Column(name = "TNORM2")
    public Double getTnorm2() {
        return tnorm2;
    }

    public void setTnorm2(Double tnorm2) {
        this.tnorm2 = tnorm2;
    }

    @Basic
    @Column(name = "M1_T")
    public Double getM1T() {
        return m1T;
    }

    public void setM1T(Double m1T) {
        this.m1T = m1T;
    }

    @Basic
    @Column(name = "M2_T")
    public Double getM2T() {
        return m2T;
    }

    public void setM2T(Double m2T) {
        this.m2T = m2T;
    }

    @Basic
    @Column(name = "M3_T")
    public Double getM3T() {
        return m3T;
    }

    public void setM3T(Double m3T) {
        this.m3T = m3T;
    }

    @Basic
    @Column(name = "XXX1")
    public Double getXxx1() {
        return xxx1;
    }

    public void setXxx1(Double xxx1) {
        this.xxx1 = xxx1;
    }

    @Basic
    @Column(name = "XXX2")
    public Double getXxx2() {
        return xxx2;
    }

    public void setXxx2(Double xxx2) {
        this.xxx2 = xxx2;
    }

    @Basic
    @Column(name = "DQ1_T")
    public Double getDq1T() {
        return dq1T;
    }

    public void setDq1T(Double dq1T) {
        this.dq1T = dq1T;
    }

    @Basic
    @Column(name = "T_T")
    public Double gettT() {
        return tT;
    }

    public void settT(Double tT) {
        this.tT = tT;
    }

    @Basic
    @Column(name = "TNORM2_T")
    public Double getTnorm2T() {
        return tnorm2T;
    }

    public void setTnorm2T(Double tnorm2T) {
        this.tnorm2T = tnorm2T;
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
        ArMagikaDayEntity that = (ArMagikaDayEntity) o;
        return adrN == that.adrN &&
                Objects.equals(arDate, that.arDate) &&
                Objects.equals(t, that.t) &&
                Objects.equals(tNs, that.tNs) &&
                Objects.equals(m1, that.m1) &&
                Objects.equals(m2, that.m2) &&
                Objects.equals(dm1, that.dm1) &&
                Objects.equals(m5, that.m5) &&
                Objects.equals(m3, that.m3) &&
                Objects.equals(t1, that.t1) &&
                Objects.equals(t2, that.t2) &&
                Objects.equals(dq1, that.dq1) &&
                Objects.equals(p1, that.p1) &&
                Objects.equals(p2, that.p2) &&
                Objects.equals(tnorm, that.tnorm) &&
                Objects.equals(tmin, that.tmin) &&
                Objects.equals(tmax, that.tmax) &&
                Objects.equals(tdeltat, that.tdeltat) &&
                Objects.equals(tnorm2, that.tnorm2) &&
                Objects.equals(m1T, that.m1T) &&
                Objects.equals(m2T, that.m2T) &&
                Objects.equals(m3T, that.m3T) &&
                Objects.equals(xxx1, that.xxx1) &&
                Objects.equals(xxx2, that.xxx2) &&
                Objects.equals(dq1T, that.dq1T) &&
                Objects.equals(tT, that.tT) &&
                Objects.equals(tnorm2T, that.tnorm2T) &&
                Objects.equals(responseTv1, that.responseTv1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arDate, t, tNs, m1, m2, dm1, m5, m3, t1, t2, dq1, p1, p2, tnorm, tmin, tmax, tdeltat, tnorm2, m1T, m2T, m3T, xxx1, xxx2, dq1T, tT, tnorm2T, adrN, responseTv1);
    }
}
