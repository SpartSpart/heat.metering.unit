package com.spart.heat.metering.unit.repository.model.hour;

import com.spart.heat.metering.unit.repository.model.primarykey.ArSpt942HEntityPK;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "AR_SPT942_H", schema = "", catalog = "")
@IdClass(ArSpt942HEntityPK.class)
public class ArSpt942HEntity {
    private Timestamp arDate;
    private Double t;
    private Double t2;
    private String nsTv1;
    private Integer regimTv1;
    private Double m1Tv1;
    private Double m2Tv1;
    private Double m3Tv1;
    private Double t1Tv1;
    private Double t2Tv1;
    private Double w1Tv1;
    private Double v1Tv1;
    private Double v2Tv1;
    private Double v3Tv1;
    private Double p1Tv1;
    private Double p2Tv1;
    private String nsTv2;
    private Integer regimTv2;
    private Double m1Tv2;
    private Double m2Tv2;
    private Double m3Tv2;
    private Double t1Tv2;
    private Double t2Tv2;
    private Double w1Tv2;
    private Double v1Tv2;
    private Double v2Tv2;
    private Double v3Tv2;
    private Double p1Tv2;
    private Double p2Tv2;
    private int adrN;
    private String responseTv1;
    private String responseTv2;

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
    @Column(name = "T_2")
    public Double getT2() {
        return t2;
    }

    public void setT2(Double t2) {
        this.t2 = t2;
    }

    @Basic
    @Column(name = "NS_TV1")
    public String getNsTv1() {
        return nsTv1;
    }

    public void setNsTv1(String nsTv1) {
        this.nsTv1 = nsTv1;
    }

    @Basic
    @Column(name = "REGIM_TV1")
    public Integer getRegimTv1() {
        return regimTv1;
    }

    public void setRegimTv1(Integer regimTv1) {
        this.regimTv1 = regimTv1;
    }

    @Basic
    @Column(name = "M1_TV1")
    public Double getM1Tv1() {
        return m1Tv1;
    }

    public void setM1Tv1(Double m1Tv1) {
        this.m1Tv1 = m1Tv1;
    }

    @Basic
    @Column(name = "M2_TV1")
    public Double getM2Tv1() {
        return m2Tv1;
    }

    public void setM2Tv1(Double m2Tv1) {
        this.m2Tv1 = m2Tv1;
    }

    @Basic
    @Column(name = "M3_TV1")
    public Double getM3Tv1() {
        return m3Tv1;
    }

    public void setM3Tv1(Double m3Tv1) {
        this.m3Tv1 = m3Tv1;
    }

    @Basic
    @Column(name = "T1_TV1")
    public Double getT1Tv1() {
        return t1Tv1;
    }

    public void setT1Tv1(Double t1Tv1) {
        this.t1Tv1 = t1Tv1;
    }

    @Basic
    @Column(name = "T2_TV1")
    public Double getT2Tv1() {
        return t2Tv1;
    }

    public void setT2Tv1(Double t2Tv1) {
        this.t2Tv1 = t2Tv1;
    }

    @Basic
    @Column(name = "W1_TV1")
    public Double getW1Tv1() {
        return w1Tv1;
    }

    public void setW1Tv1(Double w1Tv1) {
        this.w1Tv1 = w1Tv1;
    }

    @Basic
    @Column(name = "V1_TV1")
    public Double getV1Tv1() {
        return v1Tv1;
    }

    public void setV1Tv1(Double v1Tv1) {
        this.v1Tv1 = v1Tv1;
    }

    @Basic
    @Column(name = "V2_TV1")
    public Double getV2Tv1() {
        return v2Tv1;
    }

    public void setV2Tv1(Double v2Tv1) {
        this.v2Tv1 = v2Tv1;
    }

    @Basic
    @Column(name = "V3_TV1")
    public Double getV3Tv1() {
        return v3Tv1;
    }

    public void setV3Tv1(Double v3Tv1) {
        this.v3Tv1 = v3Tv1;
    }

    @Basic
    @Column(name = "P1_TV1")
    public Double getP1Tv1() {
        return p1Tv1;
    }

    public void setP1Tv1(Double p1Tv1) {
        this.p1Tv1 = p1Tv1;
    }

    @Basic
    @Column(name = "P2_TV1")
    public Double getP2Tv1() {
        return p2Tv1;
    }

    public void setP2Tv1(Double p2Tv1) {
        this.p2Tv1 = p2Tv1;
    }

    @Basic
    @Column(name = "NS_TV2")
    public String getNsTv2() {
        return nsTv2;
    }

    public void setNsTv2(String nsTv2) {
        this.nsTv2 = nsTv2;
    }

    @Basic
    @Column(name = "REGIM_TV2")
    public Integer getRegimTv2() {
        return regimTv2;
    }

    public void setRegimTv2(Integer regimTv2) {
        this.regimTv2 = regimTv2;
    }

    @Basic
    @Column(name = "M1_TV2")
    public Double getM1Tv2() {
        return m1Tv2;
    }

    public void setM1Tv2(Double m1Tv2) {
        this.m1Tv2 = m1Tv2;
    }

    @Basic
    @Column(name = "M2_TV2")
    public Double getM2Tv2() {
        return m2Tv2;
    }

    public void setM2Tv2(Double m2Tv2) {
        this.m2Tv2 = m2Tv2;
    }

    @Basic
    @Column(name = "M3_TV2")
    public Double getM3Tv2() {
        return m3Tv2;
    }

    public void setM3Tv2(Double m3Tv2) {
        this.m3Tv2 = m3Tv2;
    }

    @Basic
    @Column(name = "T1_TV2")
    public Double getT1Tv2() {
        return t1Tv2;
    }

    public void setT1Tv2(Double t1Tv2) {
        this.t1Tv2 = t1Tv2;
    }

    @Basic
    @Column(name = "T2_TV2")
    public Double getT2Tv2() {
        return t2Tv2;
    }

    public void setT2Tv2(Double t2Tv2) {
        this.t2Tv2 = t2Tv2;
    }

    @Basic
    @Column(name = "W1_TV2")
    public Double getW1Tv2() {
        return w1Tv2;
    }

    public void setW1Tv2(Double w1Tv2) {
        this.w1Tv2 = w1Tv2;
    }

    @Basic
    @Column(name = "V1_TV2")
    public Double getV1Tv2() {
        return v1Tv2;
    }

    public void setV1Tv2(Double v1Tv2) {
        this.v1Tv2 = v1Tv2;
    }

    @Basic
    @Column(name = "V2_TV2")
    public Double getV2Tv2() {
        return v2Tv2;
    }

    public void setV2Tv2(Double v2Tv2) {
        this.v2Tv2 = v2Tv2;
    }

    @Basic
    @Column(name = "V3_TV2")
    public Double getV3Tv2() {
        return v3Tv2;
    }

    public void setV3Tv2(Double v3Tv2) {
        this.v3Tv2 = v3Tv2;
    }

    @Basic
    @Column(name = "P1_TV2")
    public Double getP1Tv2() {
        return p1Tv2;
    }

    public void setP1Tv2(Double p1Tv2) {
        this.p1Tv2 = p1Tv2;
    }

    @Basic
    @Column(name = "P2_TV2")
    public Double getP2Tv2() {
        return p2Tv2;
    }

    public void setP2Tv2(Double p2Tv2) {
        this.p2Tv2 = p2Tv2;
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

    @Basic
    @Column(name = "RESPONSE_TV2")
    public String getResponseTv2() {
        return responseTv2;
    }

    public void setResponseTv2(String responseTv2) {
        this.responseTv2 = responseTv2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArSpt942HEntity that = (ArSpt942HEntity) o;
        return adrN == that.adrN &&
                Objects.equals(arDate, that.arDate) &&
                Objects.equals(t, that.t) &&
                Objects.equals(t2, that.t2) &&
                Objects.equals(nsTv1, that.nsTv1) &&
                Objects.equals(regimTv1, that.regimTv1) &&
                Objects.equals(m1Tv1, that.m1Tv1) &&
                Objects.equals(m2Tv1, that.m2Tv1) &&
                Objects.equals(m3Tv1, that.m3Tv1) &&
                Objects.equals(t1Tv1, that.t1Tv1) &&
                Objects.equals(t2Tv1, that.t2Tv1) &&
                Objects.equals(w1Tv1, that.w1Tv1) &&
                Objects.equals(v1Tv1, that.v1Tv1) &&
                Objects.equals(v2Tv1, that.v2Tv1) &&
                Objects.equals(v3Tv1, that.v3Tv1) &&
                Objects.equals(p1Tv1, that.p1Tv1) &&
                Objects.equals(p2Tv1, that.p2Tv1) &&
                Objects.equals(nsTv2, that.nsTv2) &&
                Objects.equals(regimTv2, that.regimTv2) &&
                Objects.equals(m1Tv2, that.m1Tv2) &&
                Objects.equals(m2Tv2, that.m2Tv2) &&
                Objects.equals(m3Tv2, that.m3Tv2) &&
                Objects.equals(t1Tv2, that.t1Tv2) &&
                Objects.equals(t2Tv2, that.t2Tv2) &&
                Objects.equals(w1Tv2, that.w1Tv2) &&
                Objects.equals(v1Tv2, that.v1Tv2) &&
                Objects.equals(v2Tv2, that.v2Tv2) &&
                Objects.equals(v3Tv2, that.v3Tv2) &&
                Objects.equals(p1Tv2, that.p1Tv2) &&
                Objects.equals(p2Tv2, that.p2Tv2) &&
                Objects.equals(responseTv1, that.responseTv1) &&
                Objects.equals(responseTv2, that.responseTv2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arDate, t, t2, nsTv1, regimTv1, m1Tv1, m2Tv1, m3Tv1, t1Tv1, t2Tv1, w1Tv1, v1Tv1, v2Tv1, v3Tv1, p1Tv1, p2Tv1, nsTv2, regimTv2, m1Tv2, m2Tv2, m3Tv2, t1Tv2, t2Tv2, w1Tv2, v1Tv2, v2Tv2, v3Tv2, p1Tv2, p2Tv2, adrN, responseTv1, responseTv2);
    }
}
