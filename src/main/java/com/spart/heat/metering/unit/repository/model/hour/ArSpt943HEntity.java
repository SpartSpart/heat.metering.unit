package com.spart.heat.metering.unit.repository.model.hour;

import com.spart.heat.metering.unit.repository.model.primarykey.ArSpt943HEntityPK;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "AR_SPT943_H", schema = "", catalog = "")
@IdClass(ArSpt943HEntityPK.class)
public class ArSpt943HEntity {
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
    private Double t3Tv1;
    private Double w1Tv1;
    private Double w2Tv1;
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
    private Double t3Tv2;
    private Double w1Tv2;
    private Double w2Tv2;
    private Double v1Tv2;
    private Double v2Tv2;
    private Double v3Tv2;
    private Double p1Tv2;
    private Double p2Tv2;
    private Double txbTv1;
    private Double tbTv1;
    private Double txbTv2;
    private Double tbTv2;
    private int adrN;
    private String responseTv1;
    private String responseTv2;
    private Double dtTv1;
    private Double tMinTv1;
    private Double tMaxTv1;
    private Double tDtTv1;
    private Double tEpTv1;
    private Double tFTv1;
    private Double tNsTv1;
    private Double tShTv1;
    private String diagnosticsTv1;
    private Double dtTv2;
    private Double tMinTv2;
    private Double tMaxTv2;
    private Double tDtTv2;
    private Double tEpTv2;
    private Double tFTv2;
    private Double tNsTv2;
    private Double tShTv2;
    private String diagnosticsTv2;

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
    @Column(name = "T3_TV1")
    public Double getT3Tv1() {
        return t3Tv1;
    }

    public void setT3Tv1(Double t3Tv1) {
        this.t3Tv1 = t3Tv1;
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
    @Column(name = "W2_TV1")
    public Double getW2Tv1() {
        return w2Tv1;
    }

    public void setW2Tv1(Double w2Tv1) {
        this.w2Tv1 = w2Tv1;
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
    @Column(name = "T3_TV2")
    public Double getT3Tv2() {
        return t3Tv2;
    }

    public void setT3Tv2(Double t3Tv2) {
        this.t3Tv2 = t3Tv2;
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
    @Column(name = "W2_TV2")
    public Double getW2Tv2() {
        return w2Tv2;
    }

    public void setW2Tv2(Double w2Tv2) {
        this.w2Tv2 = w2Tv2;
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
    @Column(name = "TXB_TV1")
    public Double getTxbTv1() {
        return txbTv1;
    }

    public void setTxbTv1(Double txbTv1) {
        this.txbTv1 = txbTv1;
    }

    @Basic
    @Column(name = "TB_TV1")
    public Double getTbTv1() {
        return tbTv1;
    }

    public void setTbTv1(Double tbTv1) {
        this.tbTv1 = tbTv1;
    }

    @Basic
    @Column(name = "TXB_TV2")
    public Double getTxbTv2() {
        return txbTv2;
    }

    public void setTxbTv2(Double txbTv2) {
        this.txbTv2 = txbTv2;
    }

    @Basic
    @Column(name = "TB_TV2")
    public Double getTbTv2() {
        return tbTv2;
    }

    public void setTbTv2(Double tbTv2) {
        this.tbTv2 = tbTv2;
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

    @Basic
    @Column(name = "DT_TV1")
    public Double getDtTv1() {
        return dtTv1;
    }

    public void setDtTv1(Double dtTv1) {
        this.dtTv1 = dtTv1;
    }

    @Basic
    @Column(name = "T_MIN_TV1")
    public Double gettMinTv1() {
        return tMinTv1;
    }

    public void settMinTv1(Double tMinTv1) {
        this.tMinTv1 = tMinTv1;
    }

    @Basic
    @Column(name = "T_MAX_TV1")
    public Double gettMaxTv1() {
        return tMaxTv1;
    }

    public void settMaxTv1(Double tMaxTv1) {
        this.tMaxTv1 = tMaxTv1;
    }

    @Basic
    @Column(name = "T_DT_TV1")
    public Double gettDtTv1() {
        return tDtTv1;
    }

    public void settDtTv1(Double tDtTv1) {
        this.tDtTv1 = tDtTv1;
    }

    @Basic
    @Column(name = "T_EP_TV1")
    public Double gettEpTv1() {
        return tEpTv1;
    }

    public void settEpTv1(Double tEpTv1) {
        this.tEpTv1 = tEpTv1;
    }

    @Basic
    @Column(name = "T_F_TV1")
    public Double gettFTv1() {
        return tFTv1;
    }

    public void settFTv1(Double tFTv1) {
        this.tFTv1 = tFTv1;
    }

    @Basic
    @Column(name = "T_NS_TV1")
    public Double gettNsTv1() {
        return tNsTv1;
    }

    public void settNsTv1(Double tNsTv1) {
        this.tNsTv1 = tNsTv1;
    }

    @Basic
    @Column(name = "T_SH_TV1")
    public Double gettShTv1() {
        return tShTv1;
    }

    public void settShTv1(Double tShTv1) {
        this.tShTv1 = tShTv1;
    }

    @Basic
    @Column(name = "DIAGNOSTICS_TV1")
    public String getDiagnosticsTv1() {
        return diagnosticsTv1;
    }

    public void setDiagnosticsTv1(String diagnosticsTv1) {
        this.diagnosticsTv1 = diagnosticsTv1;
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
    @Column(name = "T_MIN_TV2")
    public Double gettMinTv2() {
        return tMinTv2;
    }

    public void settMinTv2(Double tMinTv2) {
        this.tMinTv2 = tMinTv2;
    }

    @Basic
    @Column(name = "T_MAX_TV2")
    public Double gettMaxTv2() {
        return tMaxTv2;
    }

    public void settMaxTv2(Double tMaxTv2) {
        this.tMaxTv2 = tMaxTv2;
    }

    @Basic
    @Column(name = "T_DT_TV2")
    public Double gettDtTv2() {
        return tDtTv2;
    }

    public void settDtTv2(Double tDtTv2) {
        this.tDtTv2 = tDtTv2;
    }

    @Basic
    @Column(name = "T_EP_TV2")
    public Double gettEpTv2() {
        return tEpTv2;
    }

    public void settEpTv2(Double tEpTv2) {
        this.tEpTv2 = tEpTv2;
    }

    @Basic
    @Column(name = "T_F_TV2")
    public Double gettFTv2() {
        return tFTv2;
    }

    public void settFTv2(Double tFTv2) {
        this.tFTv2 = tFTv2;
    }

    @Basic
    @Column(name = "T_NS_TV2")
    public Double gettNsTv2() {
        return tNsTv2;
    }

    public void settNsTv2(Double tNsTv2) {
        this.tNsTv2 = tNsTv2;
    }

    @Basic
    @Column(name = "T_SH_TV2")
    public Double gettShTv2() {
        return tShTv2;
    }

    public void settShTv2(Double tShTv2) {
        this.tShTv2 = tShTv2;
    }

    @Basic
    @Column(name = "DIAGNOSTICS_TV2")
    public String getDiagnosticsTv2() {
        return diagnosticsTv2;
    }

    public void setDiagnosticsTv2(String diagnosticsTv2) {
        this.diagnosticsTv2 = diagnosticsTv2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArSpt943HEntity that = (ArSpt943HEntity) o;
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
                Objects.equals(t3Tv1, that.t3Tv1) &&
                Objects.equals(w1Tv1, that.w1Tv1) &&
                Objects.equals(w2Tv1, that.w2Tv1) &&
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
                Objects.equals(t3Tv2, that.t3Tv2) &&
                Objects.equals(w1Tv2, that.w1Tv2) &&
                Objects.equals(w2Tv2, that.w2Tv2) &&
                Objects.equals(v1Tv2, that.v1Tv2) &&
                Objects.equals(v2Tv2, that.v2Tv2) &&
                Objects.equals(v3Tv2, that.v3Tv2) &&
                Objects.equals(p1Tv2, that.p1Tv2) &&
                Objects.equals(p2Tv2, that.p2Tv2) &&
                Objects.equals(txbTv1, that.txbTv1) &&
                Objects.equals(tbTv1, that.tbTv1) &&
                Objects.equals(txbTv2, that.txbTv2) &&
                Objects.equals(tbTv2, that.tbTv2) &&
                Objects.equals(responseTv1, that.responseTv1) &&
                Objects.equals(responseTv2, that.responseTv2) &&
                Objects.equals(dtTv1, that.dtTv1) &&
                Objects.equals(tMinTv1, that.tMinTv1) &&
                Objects.equals(tMaxTv1, that.tMaxTv1) &&
                Objects.equals(tDtTv1, that.tDtTv1) &&
                Objects.equals(tEpTv1, that.tEpTv1) &&
                Objects.equals(tFTv1, that.tFTv1) &&
                Objects.equals(tNsTv1, that.tNsTv1) &&
                Objects.equals(tShTv1, that.tShTv1) &&
                Objects.equals(diagnosticsTv1, that.diagnosticsTv1) &&
                Objects.equals(dtTv2, that.dtTv2) &&
                Objects.equals(tMinTv2, that.tMinTv2) &&
                Objects.equals(tMaxTv2, that.tMaxTv2) &&
                Objects.equals(tDtTv2, that.tDtTv2) &&
                Objects.equals(tEpTv2, that.tEpTv2) &&
                Objects.equals(tFTv2, that.tFTv2) &&
                Objects.equals(tNsTv2, that.tNsTv2) &&
                Objects.equals(tShTv2, that.tShTv2) &&
                Objects.equals(diagnosticsTv2, that.diagnosticsTv2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arDate, t, t2, nsTv1, regimTv1, m1Tv1, m2Tv1, m3Tv1, t1Tv1, t2Tv1, t3Tv1, w1Tv1, w2Tv1, v1Tv1, v2Tv1, v3Tv1, p1Tv1, p2Tv1, nsTv2, regimTv2, m1Tv2, m2Tv2, m3Tv2, t1Tv2, t2Tv2, t3Tv2, w1Tv2, w2Tv2, v1Tv2, v2Tv2, v3Tv2, p1Tv2, p2Tv2, txbTv1, tbTv1, txbTv2, tbTv2, adrN, responseTv1, responseTv2, dtTv1, tMinTv1, tMaxTv1, tDtTv1, tEpTv1, tFTv1, tNsTv1, tShTv1, diagnosticsTv1, dtTv2, tMinTv2, tMaxTv2, tDtTv2, tEpTv2, tFTv2, tNsTv2, tShTv2, diagnosticsTv2);
    }
}
