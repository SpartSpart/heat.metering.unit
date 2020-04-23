package com.spart.heat.metering.unit.repository.model.hour;

import com.spart.heat.metering.unit.repository.model.primarykey.ArMagikaHEntityPK;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "AR_MAGIKA_H", schema = "", catalog = "")
@IdClass(ArMagikaHEntityPK.class)
public class ArMagikaHEntity {
    private Timestamp arDate;
    private Double t;
    private Double tNs;
    private String ns;
    private Double m1;
    private Double m2;
    private Double dm1;
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
    @Column(name = "NS")
    public String getNs() {
        return ns;
    }

    public void setNs(String ns) {
        this.ns = ns;
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
        ArMagikaHEntity that = (ArMagikaHEntity) o;
        return adrN == that.adrN &&
                Objects.equals(arDate, that.arDate) &&
                Objects.equals(t, that.t) &&
                Objects.equals(tNs, that.tNs) &&
                Objects.equals(ns, that.ns) &&
                Objects.equals(m1, that.m1) &&
                Objects.equals(m2, that.m2) &&
                Objects.equals(dm1, that.dm1) &&
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
                Objects.equals(responseTv1, that.responseTv1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arDate, t, tNs, ns, m1, m2, dm1, m3, t1, t2, dq1, p1, p2, tnorm, tmin, tmax, tdeltat, tnorm2, adrN, responseTv1);
    }
}
