package com.spart.heat.metering.unit.repository.model.hour;

import com.spart.heat.metering.unit.repository.model.primarykey.ArKm5HEntityPK;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "AR_KM5_H", schema = "", catalog = "")
@IdClass(ArKm5HEntityPK.class)
public class ArKm5HEntity {
    private Timestamp arDate;
    private Double t;
    private Double m1;
    private Double m2;
    private Double m3;
    private Double m4;
    private Double t1;
    private Double t2;
    private Double t3;
    private Double t4;
    private Double w1;
    private Double w2;
    private Double dm12;
    private Double dm34;
    private Double v1;
    private Double v2;
    private Double v3;
    private Double v4;
    private Double p1;
    private Double p2;
    private Double p3;
    private Double tT;
    private Double m1T;
    private Double m2T;
    private Double m3T;
    private Double m4T;
    private Double v1T;
    private Double v2T;
    private Double v3T;
    private Double v4T;
    private Double w1T;
    private Double w2T;
    private Double tA;
    private Double tXb;
    private int adrN;
    private String ns;
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
    @Column(name = "M4")
    public Double getM4() {
        return m4;
    }

    public void setM4(Double m4) {
        this.m4 = m4;
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
    @Column(name = "T3")
    public Double getT3() {
        return t3;
    }

    public void setT3(Double t3) {
        this.t3 = t3;
    }

    @Basic
    @Column(name = "T4")
    public Double getT4() {
        return t4;
    }

    public void setT4(Double t4) {
        this.t4 = t4;
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
    @Column(name = "W2")
    public Double getW2() {
        return w2;
    }

    public void setW2(Double w2) {
        this.w2 = w2;
    }

    @Basic
    @Column(name = "DM12")
    public Double getDm12() {
        return dm12;
    }

    public void setDm12(Double dm12) {
        this.dm12 = dm12;
    }

    @Basic
    @Column(name = "DM34")
    public Double getDm34() {
        return dm34;
    }

    public void setDm34(Double dm34) {
        this.dm34 = dm34;
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

    @Basic
    @Column(name = "V4")
    public Double getV4() {
        return v4;
    }

    public void setV4(Double v4) {
        this.v4 = v4;
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
    @Column(name = "P3")
    public Double getP3() {
        return p3;
    }

    public void setP3(Double p3) {
        this.p3 = p3;
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
    @Column(name = "M4_T")
    public Double getM4T() {
        return m4T;
    }

    public void setM4T(Double m4T) {
        this.m4T = m4T;
    }

    @Basic
    @Column(name = "V1_T")
    public Double getV1T() {
        return v1T;
    }

    public void setV1T(Double v1T) {
        this.v1T = v1T;
    }

    @Basic
    @Column(name = "V2_T")
    public Double getV2T() {
        return v2T;
    }

    public void setV2T(Double v2T) {
        this.v2T = v2T;
    }

    @Basic
    @Column(name = "V3_T")
    public Double getV3T() {
        return v3T;
    }

    public void setV3T(Double v3T) {
        this.v3T = v3T;
    }

    @Basic
    @Column(name = "V4_T")
    public Double getV4T() {
        return v4T;
    }

    public void setV4T(Double v4T) {
        this.v4T = v4T;
    }

    @Basic
    @Column(name = "W1_T")
    public Double getW1T() {
        return w1T;
    }

    public void setW1T(Double w1T) {
        this.w1T = w1T;
    }

    @Basic
    @Column(name = "W2_T")
    public Double getW2T() {
        return w2T;
    }

    public void setW2T(Double w2T) {
        this.w2T = w2T;
    }

    @Basic
    @Column(name = "T_A")
    public Double gettA() {
        return tA;
    }

    public void settA(Double tA) {
        this.tA = tA;
    }

    @Basic
    @Column(name = "T_XB")
    public Double gettXb() {
        return tXb;
    }

    public void settXb(Double tXb) {
        this.tXb = tXb;
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
    @Column(name = "NS")
    public String getNs() {
        return ns;
    }

    public void setNs(String ns) {
        this.ns = ns;
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
        ArKm5HEntity that = (ArKm5HEntity) o;
        return adrN == that.adrN &&
                Objects.equals(arDate, that.arDate) &&
                Objects.equals(t, that.t) &&
                Objects.equals(m1, that.m1) &&
                Objects.equals(m2, that.m2) &&
                Objects.equals(m3, that.m3) &&
                Objects.equals(m4, that.m4) &&
                Objects.equals(t1, that.t1) &&
                Objects.equals(t2, that.t2) &&
                Objects.equals(t3, that.t3) &&
                Objects.equals(t4, that.t4) &&
                Objects.equals(w1, that.w1) &&
                Objects.equals(w2, that.w2) &&
                Objects.equals(dm12, that.dm12) &&
                Objects.equals(dm34, that.dm34) &&
                Objects.equals(v1, that.v1) &&
                Objects.equals(v2, that.v2) &&
                Objects.equals(v3, that.v3) &&
                Objects.equals(v4, that.v4) &&
                Objects.equals(p1, that.p1) &&
                Objects.equals(p2, that.p2) &&
                Objects.equals(p3, that.p3) &&
                Objects.equals(tT, that.tT) &&
                Objects.equals(m1T, that.m1T) &&
                Objects.equals(m2T, that.m2T) &&
                Objects.equals(m3T, that.m3T) &&
                Objects.equals(m4T, that.m4T) &&
                Objects.equals(v1T, that.v1T) &&
                Objects.equals(v2T, that.v2T) &&
                Objects.equals(v3T, that.v3T) &&
                Objects.equals(v4T, that.v4T) &&
                Objects.equals(w1T, that.w1T) &&
                Objects.equals(w2T, that.w2T) &&
                Objects.equals(tA, that.tA) &&
                Objects.equals(tXb, that.tXb) &&
                Objects.equals(ns, that.ns) &&
                Objects.equals(responseTv1, that.responseTv1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arDate, t, m1, m2, m3, m4, t1, t2, t3, t4, w1, w2, dm12, dm34, v1, v2, v3, v4, p1, p2, p3, tT, m1T, m2T, m3T, m4T, v1T, v2T, v3T, v4T, w1T, w2T, tA, tXb, adrN, ns, responseTv1);
    }
}
