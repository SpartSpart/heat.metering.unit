package com.spart.heat.metering.unit.repository.model.hour;

import com.spart.heat.metering.unit.repository.model.primarykey.ArVkt7HEntityPK;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "AR_VKT7_H", schema = "", catalog = "")
@IdClass(ArVkt7HEntityPK.class)
public class ArVkt7HEntity {
    private Timestamp arDate;
    private Double t;
    private Double t2;
    private Double m1Tv1;
    private Double m2Tv1;
    private Double m3Tv1;
    private Double mgTv1;
    private Double t1Tv1;
    private Double t2Tv1;
    private Double t3Tv1;
    private Double q0Tv1;
    private Double qgTv1;
    private Double dtTv1;
    private Double v1Tv1;
    private Double v2Tv1;
    private Double v3Tv1;
    private Double p1Tv1;
    private Double p2Tv1;
    private Integer nsTv1;
    private Double m1Tv2;
    private Double m2Tv2;
    private Double m3Tv2;
    private Double mgTv2;
    private Double t1Tv2;
    private Double t2Tv2;
    private Double t3Tv2;
    private Double q0Tv2;
    private Double qgTv2;
    private Double dtTv2;
    private Double v1Tv2;
    private Double v2Tv2;
    private Double v3Tv2;
    private Double p1Tv2;
    private Double p2Tv2;
    private Integer nsTv2;
    private Double tA;
    private Double tX;
    private int adrN;
    private Integer nsT1Tv1;
    private Integer nsT2Tv1;
    private Integer nsT3Tv1;
    private Integer nsDtTv1;
    private Integer nsM1Tv1;
    private Integer nsM2Tv1;
    private Integer nsM3Tv1;
    private Integer nsMgTv1;
    private Integer nsV1Tv1;
    private Integer nsV2Tv1;
    private Integer nsV3Tv1;
    private Integer nsP1Tv1;
    private Integer nsP2Tv1;
    private Integer nsQ0Tv1;
    private Integer nsQgTv1;
    private Integer nsT1Tv2;
    private Integer nsT2Tv2;
    private Integer nsT3Tv2;
    private Integer nsDtTv2;
    private Integer nsM1Tv2;
    private Integer nsM2Tv2;
    private Integer nsM3Tv2;
    private Integer nsMgTv2;
    private Integer nsV1Tv2;
    private Integer nsV2Tv2;
    private Integer nsV3Tv2;
    private Integer nsP1Tv2;
    private Integer nsP2Tv2;
    private Integer nsQ0Tv2;
    private Integer nsQgTv2;
    private String responseTv1;
    private Integer di;

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
    @Column(name = "MG_TV1")
    public Double getMgTv1() {
        return mgTv1;
    }

    public void setMgTv1(Double mgTv1) {
        this.mgTv1 = mgTv1;
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
    @Column(name = "T3_TV1")
    public Double getT3Tv1() {
        return t3Tv1;
    }

    public void setT3Tv1(Double t3Tv1) {
        this.t3Tv1 = t3Tv1;
    }

    @Basic
    @Column(name = "Q0_TV1")
    public Double getQ0Tv1() {
        return q0Tv1;
    }

    public void setQ0Tv1(Double q0Tv1) {
        this.q0Tv1 = q0Tv1;
    }

    @Basic
    @Column(name = "QG_TV1")
    public Double getQgTv1() {
        return qgTv1;
    }

    public void setQgTv1(Double qgTv1) {
        this.qgTv1 = qgTv1;
    }

    @Basic
    @Column(name = "DT_TV1")
    public Double getDtTv1() {
        return dtTv1;
    }

    public void setDtTv1(Double dtTv1) {
        this.dtTv1 = dtTv1;
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
    @Column(name = "NS_TV1")
    public Integer getNsTv1() {
        return nsTv1;
    }

    public void setNsTv1(Integer nsTv1) {
        this.nsTv1 = nsTv1;
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
    @Column(name = "MG_TV2")
    public Double getMgTv2() {
        return mgTv2;
    }

    public void setMgTv2(Double mgTv2) {
        this.mgTv2 = mgTv2;
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
    @Column(name = "T3_TV2")
    public Double getT3Tv2() {
        return t3Tv2;
    }

    public void setT3Tv2(Double t3Tv2) {
        this.t3Tv2 = t3Tv2;
    }

    @Basic
    @Column(name = "Q0_TV2")
    public Double getQ0Tv2() {
        return q0Tv2;
    }

    public void setQ0Tv2(Double q0Tv2) {
        this.q0Tv2 = q0Tv2;
    }

    @Basic
    @Column(name = "QG_TV2")
    public Double getQgTv2() {
        return qgTv2;
    }

    public void setQgTv2(Double qgTv2) {
        this.qgTv2 = qgTv2;
    }

    @Basic
    @Column(name = "DT_TV2")
    public Double getDtTv2() {
        return dtTv2;
    }

    public void setDtTv2(Double dtTv2) {
        this.dtTv2 = dtTv2;
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

    @Basic
    @Column(name = "NS_TV2")
    public Integer getNsTv2() {
        return nsTv2;
    }

    public void setNsTv2(Integer nsTv2) {
        this.nsTv2 = nsTv2;
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
    @Column(name = "T_X")
    public Double gettX() {
        return tX;
    }

    public void settX(Double tX) {
        this.tX = tX;
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
    @Column(name = "NS_T1_TV1")
    public Integer getNsT1Tv1() {
        return nsT1Tv1;
    }

    public void setNsT1Tv1(Integer nsT1Tv1) {
        this.nsT1Tv1 = nsT1Tv1;
    }

    @Basic
    @Column(name = "NS_T2_TV1")
    public Integer getNsT2Tv1() {
        return nsT2Tv1;
    }

    public void setNsT2Tv1(Integer nsT2Tv1) {
        this.nsT2Tv1 = nsT2Tv1;
    }

    @Basic
    @Column(name = "NS_T3_TV1")
    public Integer getNsT3Tv1() {
        return nsT3Tv1;
    }

    public void setNsT3Tv1(Integer nsT3Tv1) {
        this.nsT3Tv1 = nsT3Tv1;
    }

    @Basic
    @Column(name = "NS_DT_TV1")
    public Integer getNsDtTv1() {
        return nsDtTv1;
    }

    public void setNsDtTv1(Integer nsDtTv1) {
        this.nsDtTv1 = nsDtTv1;
    }

    @Basic
    @Column(name = "NS_M1_TV1")
    public Integer getNsM1Tv1() {
        return nsM1Tv1;
    }

    public void setNsM1Tv1(Integer nsM1Tv1) {
        this.nsM1Tv1 = nsM1Tv1;
    }

    @Basic
    @Column(name = "NS_M2_TV1")
    public Integer getNsM2Tv1() {
        return nsM2Tv1;
    }

    public void setNsM2Tv1(Integer nsM2Tv1) {
        this.nsM2Tv1 = nsM2Tv1;
    }

    @Basic
    @Column(name = "NS_M3_TV1")
    public Integer getNsM3Tv1() {
        return nsM3Tv1;
    }

    public void setNsM3Tv1(Integer nsM3Tv1) {
        this.nsM3Tv1 = nsM3Tv1;
    }

    @Basic
    @Column(name = "NS_MG_TV1")
    public Integer getNsMgTv1() {
        return nsMgTv1;
    }

    public void setNsMgTv1(Integer nsMgTv1) {
        this.nsMgTv1 = nsMgTv1;
    }

    @Basic
    @Column(name = "NS_V1_TV1")
    public Integer getNsV1Tv1() {
        return nsV1Tv1;
    }

    public void setNsV1Tv1(Integer nsV1Tv1) {
        this.nsV1Tv1 = nsV1Tv1;
    }

    @Basic
    @Column(name = "NS_V2_TV1")
    public Integer getNsV2Tv1() {
        return nsV2Tv1;
    }

    public void setNsV2Tv1(Integer nsV2Tv1) {
        this.nsV2Tv1 = nsV2Tv1;
    }

    @Basic
    @Column(name = "NS_V3_TV1")
    public Integer getNsV3Tv1() {
        return nsV3Tv1;
    }

    public void setNsV3Tv1(Integer nsV3Tv1) {
        this.nsV3Tv1 = nsV3Tv1;
    }

    @Basic
    @Column(name = "NS_P1_TV1")
    public Integer getNsP1Tv1() {
        return nsP1Tv1;
    }

    public void setNsP1Tv1(Integer nsP1Tv1) {
        this.nsP1Tv1 = nsP1Tv1;
    }

    @Basic
    @Column(name = "NS_P2_TV1")
    public Integer getNsP2Tv1() {
        return nsP2Tv1;
    }

    public void setNsP2Tv1(Integer nsP2Tv1) {
        this.nsP2Tv1 = nsP2Tv1;
    }

    @Basic
    @Column(name = "NS_Q0_TV1")
    public Integer getNsQ0Tv1() {
        return nsQ0Tv1;
    }

    public void setNsQ0Tv1(Integer nsQ0Tv1) {
        this.nsQ0Tv1 = nsQ0Tv1;
    }

    @Basic
    @Column(name = "NS_QG_TV1")
    public Integer getNsQgTv1() {
        return nsQgTv1;
    }

    public void setNsQgTv1(Integer nsQgTv1) {
        this.nsQgTv1 = nsQgTv1;
    }

    @Basic
    @Column(name = "NS_T1_TV2")
    public Integer getNsT1Tv2() {
        return nsT1Tv2;
    }

    public void setNsT1Tv2(Integer nsT1Tv2) {
        this.nsT1Tv2 = nsT1Tv2;
    }

    @Basic
    @Column(name = "NS_T2_TV2")
    public Integer getNsT2Tv2() {
        return nsT2Tv2;
    }

    public void setNsT2Tv2(Integer nsT2Tv2) {
        this.nsT2Tv2 = nsT2Tv2;
    }

    @Basic
    @Column(name = "NS_T3_TV2")
    public Integer getNsT3Tv2() {
        return nsT3Tv2;
    }

    public void setNsT3Tv2(Integer nsT3Tv2) {
        this.nsT3Tv2 = nsT3Tv2;
    }

    @Basic
    @Column(name = "NS_DT_TV2")
    public Integer getNsDtTv2() {
        return nsDtTv2;
    }

    public void setNsDtTv2(Integer nsDtTv2) {
        this.nsDtTv2 = nsDtTv2;
    }

    @Basic
    @Column(name = "NS_M1_TV2")
    public Integer getNsM1Tv2() {
        return nsM1Tv2;
    }

    public void setNsM1Tv2(Integer nsM1Tv2) {
        this.nsM1Tv2 = nsM1Tv2;
    }

    @Basic
    @Column(name = "NS_M2_TV2")
    public Integer getNsM2Tv2() {
        return nsM2Tv2;
    }

    public void setNsM2Tv2(Integer nsM2Tv2) {
        this.nsM2Tv2 = nsM2Tv2;
    }

    @Basic
    @Column(name = "NS_M3_TV2")
    public Integer getNsM3Tv2() {
        return nsM3Tv2;
    }

    public void setNsM3Tv2(Integer nsM3Tv2) {
        this.nsM3Tv2 = nsM3Tv2;
    }

    @Basic
    @Column(name = "NS_MG_TV2")
    public Integer getNsMgTv2() {
        return nsMgTv2;
    }

    public void setNsMgTv2(Integer nsMgTv2) {
        this.nsMgTv2 = nsMgTv2;
    }

    @Basic
    @Column(name = "NS_V1_TV2")
    public Integer getNsV1Tv2() {
        return nsV1Tv2;
    }

    public void setNsV1Tv2(Integer nsV1Tv2) {
        this.nsV1Tv2 = nsV1Tv2;
    }

    @Basic
    @Column(name = "NS_V2_TV2")
    public Integer getNsV2Tv2() {
        return nsV2Tv2;
    }

    public void setNsV2Tv2(Integer nsV2Tv2) {
        this.nsV2Tv2 = nsV2Tv2;
    }

    @Basic
    @Column(name = "NS_V3_TV2")
    public Integer getNsV3Tv2() {
        return nsV3Tv2;
    }

    public void setNsV3Tv2(Integer nsV3Tv2) {
        this.nsV3Tv2 = nsV3Tv2;
    }

    @Basic
    @Column(name = "NS_P1_TV2")
    public Integer getNsP1Tv2() {
        return nsP1Tv2;
    }

    public void setNsP1Tv2(Integer nsP1Tv2) {
        this.nsP1Tv2 = nsP1Tv2;
    }

    @Basic
    @Column(name = "NS_P2_TV2")
    public Integer getNsP2Tv2() {
        return nsP2Tv2;
    }

    public void setNsP2Tv2(Integer nsP2Tv2) {
        this.nsP2Tv2 = nsP2Tv2;
    }

    @Basic
    @Column(name = "NS_Q0_TV2")
    public Integer getNsQ0Tv2() {
        return nsQ0Tv2;
    }

    public void setNsQ0Tv2(Integer nsQ0Tv2) {
        this.nsQ0Tv2 = nsQ0Tv2;
    }

    @Basic
    @Column(name = "NS_QG_TV2")
    public Integer getNsQgTv2() {
        return nsQgTv2;
    }

    public void setNsQgTv2(Integer nsQgTv2) {
        this.nsQgTv2 = nsQgTv2;
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
    @Column(name = "DI")
    public Integer getDi() {
        return di;
    }

    public void setDi(Integer di) {
        this.di = di;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArVkt7HEntity that = (ArVkt7HEntity) o;
        return adrN == that.adrN &&
                Objects.equals(arDate, that.arDate) &&
                Objects.equals(t, that.t) &&
                Objects.equals(t2, that.t2) &&
                Objects.equals(m1Tv1, that.m1Tv1) &&
                Objects.equals(m2Tv1, that.m2Tv1) &&
                Objects.equals(m3Tv1, that.m3Tv1) &&
                Objects.equals(mgTv1, that.mgTv1) &&
                Objects.equals(t1Tv1, that.t1Tv1) &&
                Objects.equals(t2Tv1, that.t2Tv1) &&
                Objects.equals(t3Tv1, that.t3Tv1) &&
                Objects.equals(q0Tv1, that.q0Tv1) &&
                Objects.equals(qgTv1, that.qgTv1) &&
                Objects.equals(dtTv1, that.dtTv1) &&
                Objects.equals(v1Tv1, that.v1Tv1) &&
                Objects.equals(v2Tv1, that.v2Tv1) &&
                Objects.equals(v3Tv1, that.v3Tv1) &&
                Objects.equals(p1Tv1, that.p1Tv1) &&
                Objects.equals(p2Tv1, that.p2Tv1) &&
                Objects.equals(nsTv1, that.nsTv1) &&
                Objects.equals(m1Tv2, that.m1Tv2) &&
                Objects.equals(m2Tv2, that.m2Tv2) &&
                Objects.equals(m3Tv2, that.m3Tv2) &&
                Objects.equals(mgTv2, that.mgTv2) &&
                Objects.equals(t1Tv2, that.t1Tv2) &&
                Objects.equals(t2Tv2, that.t2Tv2) &&
                Objects.equals(t3Tv2, that.t3Tv2) &&
                Objects.equals(q0Tv2, that.q0Tv2) &&
                Objects.equals(qgTv2, that.qgTv2) &&
                Objects.equals(dtTv2, that.dtTv2) &&
                Objects.equals(v1Tv2, that.v1Tv2) &&
                Objects.equals(v2Tv2, that.v2Tv2) &&
                Objects.equals(v3Tv2, that.v3Tv2) &&
                Objects.equals(p1Tv2, that.p1Tv2) &&
                Objects.equals(p2Tv2, that.p2Tv2) &&
                Objects.equals(nsTv2, that.nsTv2) &&
                Objects.equals(tA, that.tA) &&
                Objects.equals(tX, that.tX) &&
                Objects.equals(nsT1Tv1, that.nsT1Tv1) &&
                Objects.equals(nsT2Tv1, that.nsT2Tv1) &&
                Objects.equals(nsT3Tv1, that.nsT3Tv1) &&
                Objects.equals(nsDtTv1, that.nsDtTv1) &&
                Objects.equals(nsM1Tv1, that.nsM1Tv1) &&
                Objects.equals(nsM2Tv1, that.nsM2Tv1) &&
                Objects.equals(nsM3Tv1, that.nsM3Tv1) &&
                Objects.equals(nsMgTv1, that.nsMgTv1) &&
                Objects.equals(nsV1Tv1, that.nsV1Tv1) &&
                Objects.equals(nsV2Tv1, that.nsV2Tv1) &&
                Objects.equals(nsV3Tv1, that.nsV3Tv1) &&
                Objects.equals(nsP1Tv1, that.nsP1Tv1) &&
                Objects.equals(nsP2Tv1, that.nsP2Tv1) &&
                Objects.equals(nsQ0Tv1, that.nsQ0Tv1) &&
                Objects.equals(nsQgTv1, that.nsQgTv1) &&
                Objects.equals(nsT1Tv2, that.nsT1Tv2) &&
                Objects.equals(nsT2Tv2, that.nsT2Tv2) &&
                Objects.equals(nsT3Tv2, that.nsT3Tv2) &&
                Objects.equals(nsDtTv2, that.nsDtTv2) &&
                Objects.equals(nsM1Tv2, that.nsM1Tv2) &&
                Objects.equals(nsM2Tv2, that.nsM2Tv2) &&
                Objects.equals(nsM3Tv2, that.nsM3Tv2) &&
                Objects.equals(nsMgTv2, that.nsMgTv2) &&
                Objects.equals(nsV1Tv2, that.nsV1Tv2) &&
                Objects.equals(nsV2Tv2, that.nsV2Tv2) &&
                Objects.equals(nsV3Tv2, that.nsV3Tv2) &&
                Objects.equals(nsP1Tv2, that.nsP1Tv2) &&
                Objects.equals(nsP2Tv2, that.nsP2Tv2) &&
                Objects.equals(nsQ0Tv2, that.nsQ0Tv2) &&
                Objects.equals(nsQgTv2, that.nsQgTv2) &&
                Objects.equals(responseTv1, that.responseTv1) &&
                Objects.equals(di, that.di);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arDate, t, t2, m1Tv1, m2Tv1, m3Tv1, mgTv1, t1Tv1, t2Tv1, t3Tv1, q0Tv1, qgTv1, dtTv1, v1Tv1, v2Tv1, v3Tv1, p1Tv1, p2Tv1, nsTv1, m1Tv2, m2Tv2, m3Tv2, mgTv2, t1Tv2, t2Tv2, t3Tv2, q0Tv2, qgTv2, dtTv2, v1Tv2, v2Tv2, v3Tv2, p1Tv2, p2Tv2, nsTv2, tA, tX, adrN, nsT1Tv1, nsT2Tv1, nsT3Tv1, nsDtTv1, nsM1Tv1, nsM2Tv1, nsM3Tv1, nsMgTv1, nsV1Tv1, nsV2Tv1, nsV3Tv1, nsP1Tv1, nsP2Tv1, nsQ0Tv1, nsQgTv1, nsT1Tv2, nsT2Tv2, nsT3Tv2, nsDtTv2, nsM1Tv2, nsM2Tv2, nsM3Tv2, nsMgTv2, nsV1Tv2, nsV2Tv2, nsV3Tv2, nsP1Tv2, nsP2Tv2, nsQ0Tv2, nsQgTv2, responseTv1, di);
    }
}
