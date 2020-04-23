package com.spart.heat.metering.unit.repository.model.hour;

import com.spart.heat.metering.unit.repository.model.primarykey.ArTv7HEntityPK;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "AR_TV7_H", schema = "", catalog = "")
@IdClass(ArTv7HEntityPK.class)
public class ArTv7HEntity {
    private Timestamp arDate;
    private Double tTv1;
    private Double tTv2;
    private Integer regimTv1;
    private Double m1Tv1;
    private Double m2Tv1;
    private Double m3Tv1;
    private Double t1Tv1;
    private Double t2Tv1;
    private Double t3Tv1;
    private Double qTv1;
    private Double q12Tv1;
    private Double qgTv1;
    private Double v1Tv1;
    private Double v2Tv1;
    private Double v3Tv1;
    private Double p1Tv1;
    private Double p2Tv1;
    private Integer regimTv2;
    private Double m1Tv2;
    private Double m2Tv2;
    private Double m3Tv2;
    private Double t1Tv2;
    private Double t2Tv2;
    private Double t3Tv2;
    private Double qTv2;
    private Double q12Tv2;
    private Double qgTv2;
    private Double v1Tv2;
    private Double v2Tv2;
    private Double v3Tv2;
    private Double p1Tv2;
    private Double p2Tv2;
    private int adrN;
    private Double tnvTv1;
    private Double txbTv1;
    private Double pxbTv1;
    private Double dtTv1;
    private Double dmTv1;
    private Double tVosTv1;
    private Double tnvTv2;
    private Double txbTv2;
    private Double pxbTv2;
    private Double dtTv2;
    private Double dmTv2;
    private Double tVosTv2;
    private Double p3Tv1;
    private Double p3Tv2;
    private Double p1MpaTv1;
    private Double p2MpaTv1;
    private Double p3MpaTv1;
    private Double p1MpaTv2;
    private Double p2MpaTv2;
    private Double p3MpaTv2;
    private Double pxbMpaTv1;
    private Double pxbMpaTv2;
    private Double qGdjTv1;
    private Double q12GdjTv1;
    private Double qgGdjTv1;
    private Double qGdjTv2;
    private Double q12GdjTv2;
    private Double qgGdjTv2;

    @Id
    @Column(name = "AR_DATE")
    public Timestamp getArDate() {
        return arDate;
    }

    public void setArDate(Timestamp arDate) {
        this.arDate = arDate;
    }

    @Basic
    @Column(name = "T_TV1")
    public Double gettTv1() {
        return tTv1;
    }

    public void settTv1(Double tTv1) {
        this.tTv1 = tTv1;
    }

    @Basic
    @Column(name = "T_TV2")
    public Double gettTv2() {
        return tTv2;
    }

    public void settTv2(Double tTv2) {
        this.tTv2 = tTv2;
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
    @Column(name = "Q_TV1")
    public Double getqTv1() {
        return qTv1;
    }

    public void setqTv1(Double qTv1) {
        this.qTv1 = qTv1;
    }

    @Basic
    @Column(name = "Q12_TV1")
    public Double getQ12Tv1() {
        return q12Tv1;
    }

    public void setQ12Tv1(Double q12Tv1) {
        this.q12Tv1 = q12Tv1;
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
    @Column(name = "Q_TV2")
    public Double getqTv2() {
        return qTv2;
    }

    public void setqTv2(Double qTv2) {
        this.qTv2 = qTv2;
    }

    @Basic
    @Column(name = "Q12_TV2")
    public Double getQ12Tv2() {
        return q12Tv2;
    }

    public void setQ12Tv2(Double q12Tv2) {
        this.q12Tv2 = q12Tv2;
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
    @Column(name = "TNV_TV1")
    public Double getTnvTv1() {
        return tnvTv1;
    }

    public void setTnvTv1(Double tnvTv1) {
        this.tnvTv1 = tnvTv1;
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
    @Column(name = "PXB_TV1")
    public Double getPxbTv1() {
        return pxbTv1;
    }

    public void setPxbTv1(Double pxbTv1) {
        this.pxbTv1 = pxbTv1;
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
    @Column(name = "DM_TV1")
    public Double getDmTv1() {
        return dmTv1;
    }

    public void setDmTv1(Double dmTv1) {
        this.dmTv1 = dmTv1;
    }

    @Basic
    @Column(name = "T_VOS_TV1")
    public Double gettVosTv1() {
        return tVosTv1;
    }

    public void settVosTv1(Double tVosTv1) {
        this.tVosTv1 = tVosTv1;
    }

    @Basic
    @Column(name = "TNV_TV2")
    public Double getTnvTv2() {
        return tnvTv2;
    }

    public void setTnvTv2(Double tnvTv2) {
        this.tnvTv2 = tnvTv2;
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
    @Column(name = "PXB_TV2")
    public Double getPxbTv2() {
        return pxbTv2;
    }

    public void setPxbTv2(Double pxbTv2) {
        this.pxbTv2 = pxbTv2;
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
    @Column(name = "DM_TV2")
    public Double getDmTv2() {
        return dmTv2;
    }

    public void setDmTv2(Double dmTv2) {
        this.dmTv2 = dmTv2;
    }

    @Basic
    @Column(name = "T_VOS_TV2")
    public Double gettVosTv2() {
        return tVosTv2;
    }

    public void settVosTv2(Double tVosTv2) {
        this.tVosTv2 = tVosTv2;
    }

    @Basic
    @Column(name = "P3_TV1")
    public Double getP3Tv1() {
        return p3Tv1;
    }

    public void setP3Tv1(Double p3Tv1) {
        this.p3Tv1 = p3Tv1;
    }

    @Basic
    @Column(name = "P3_TV2")
    public Double getP3Tv2() {
        return p3Tv2;
    }

    public void setP3Tv2(Double p3Tv2) {
        this.p3Tv2 = p3Tv2;
    }

    @Basic
    @Column(name = "P1_MPA_TV1")
    public Double getP1MpaTv1() {
        return p1MpaTv1;
    }

    public void setP1MpaTv1(Double p1MpaTv1) {
        this.p1MpaTv1 = p1MpaTv1;
    }

    @Basic
    @Column(name = "P2_MPA_TV1")
    public Double getP2MpaTv1() {
        return p2MpaTv1;
    }

    public void setP2MpaTv1(Double p2MpaTv1) {
        this.p2MpaTv1 = p2MpaTv1;
    }

    @Basic
    @Column(name = "P3_MPA_TV1")
    public Double getP3MpaTv1() {
        return p3MpaTv1;
    }

    public void setP3MpaTv1(Double p3MpaTv1) {
        this.p3MpaTv1 = p3MpaTv1;
    }

    @Basic
    @Column(name = "P1_MPA_TV2")
    public Double getP1MpaTv2() {
        return p1MpaTv2;
    }

    public void setP1MpaTv2(Double p1MpaTv2) {
        this.p1MpaTv2 = p1MpaTv2;
    }

    @Basic
    @Column(name = "P2_MPA_TV2")
    public Double getP2MpaTv2() {
        return p2MpaTv2;
    }

    public void setP2MpaTv2(Double p2MpaTv2) {
        this.p2MpaTv2 = p2MpaTv2;
    }

    @Basic
    @Column(name = "P3_MPA_TV2")
    public Double getP3MpaTv2() {
        return p3MpaTv2;
    }

    public void setP3MpaTv2(Double p3MpaTv2) {
        this.p3MpaTv2 = p3MpaTv2;
    }

    @Basic
    @Column(name = "PXB_MPA_TV1")
    public Double getPxbMpaTv1() {
        return pxbMpaTv1;
    }

    public void setPxbMpaTv1(Double pxbMpaTv1) {
        this.pxbMpaTv1 = pxbMpaTv1;
    }

    @Basic
    @Column(name = "PXB_MPA_TV2")
    public Double getPxbMpaTv2() {
        return pxbMpaTv2;
    }

    public void setPxbMpaTv2(Double pxbMpaTv2) {
        this.pxbMpaTv2 = pxbMpaTv2;
    }

    @Basic
    @Column(name = "Q_GDJ_TV1")
    public Double getqGdjTv1() {
        return qGdjTv1;
    }

    public void setqGdjTv1(Double qGdjTv1) {
        this.qGdjTv1 = qGdjTv1;
    }

    @Basic
    @Column(name = "Q12_GDJ_TV1")
    public Double getQ12GdjTv1() {
        return q12GdjTv1;
    }

    public void setQ12GdjTv1(Double q12GdjTv1) {
        this.q12GdjTv1 = q12GdjTv1;
    }

    @Basic
    @Column(name = "QG_GDJ_TV1")
    public Double getQgGdjTv1() {
        return qgGdjTv1;
    }

    public void setQgGdjTv1(Double qgGdjTv1) {
        this.qgGdjTv1 = qgGdjTv1;
    }

    @Basic
    @Column(name = "Q_GDJ_TV2")
    public Double getqGdjTv2() {
        return qGdjTv2;
    }

    public void setqGdjTv2(Double qGdjTv2) {
        this.qGdjTv2 = qGdjTv2;
    }

    @Basic
    @Column(name = "Q12_GDJ_TV2")
    public Double getQ12GdjTv2() {
        return q12GdjTv2;
    }

    public void setQ12GdjTv2(Double q12GdjTv2) {
        this.q12GdjTv2 = q12GdjTv2;
    }

    @Basic
    @Column(name = "QG_GDJ_TV2")
    public Double getQgGdjTv2() {
        return qgGdjTv2;
    }

    public void setQgGdjTv2(Double qgGdjTv2) {
        this.qgGdjTv2 = qgGdjTv2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArTv7HEntity that = (ArTv7HEntity) o;
        return adrN == that.adrN &&
                Objects.equals(arDate, that.arDate) &&
                Objects.equals(tTv1, that.tTv1) &&
                Objects.equals(tTv2, that.tTv2) &&
                Objects.equals(regimTv1, that.regimTv1) &&
                Objects.equals(m1Tv1, that.m1Tv1) &&
                Objects.equals(m2Tv1, that.m2Tv1) &&
                Objects.equals(m3Tv1, that.m3Tv1) &&
                Objects.equals(t1Tv1, that.t1Tv1) &&
                Objects.equals(t2Tv1, that.t2Tv1) &&
                Objects.equals(t3Tv1, that.t3Tv1) &&
                Objects.equals(qTv1, that.qTv1) &&
                Objects.equals(q12Tv1, that.q12Tv1) &&
                Objects.equals(qgTv1, that.qgTv1) &&
                Objects.equals(v1Tv1, that.v1Tv1) &&
                Objects.equals(v2Tv1, that.v2Tv1) &&
                Objects.equals(v3Tv1, that.v3Tv1) &&
                Objects.equals(p1Tv1, that.p1Tv1) &&
                Objects.equals(p2Tv1, that.p2Tv1) &&
                Objects.equals(regimTv2, that.regimTv2) &&
                Objects.equals(m1Tv2, that.m1Tv2) &&
                Objects.equals(m2Tv2, that.m2Tv2) &&
                Objects.equals(m3Tv2, that.m3Tv2) &&
                Objects.equals(t1Tv2, that.t1Tv2) &&
                Objects.equals(t2Tv2, that.t2Tv2) &&
                Objects.equals(t3Tv2, that.t3Tv2) &&
                Objects.equals(qTv2, that.qTv2) &&
                Objects.equals(q12Tv2, that.q12Tv2) &&
                Objects.equals(qgTv2, that.qgTv2) &&
                Objects.equals(v1Tv2, that.v1Tv2) &&
                Objects.equals(v2Tv2, that.v2Tv2) &&
                Objects.equals(v3Tv2, that.v3Tv2) &&
                Objects.equals(p1Tv2, that.p1Tv2) &&
                Objects.equals(p2Tv2, that.p2Tv2) &&
                Objects.equals(tnvTv1, that.tnvTv1) &&
                Objects.equals(txbTv1, that.txbTv1) &&
                Objects.equals(pxbTv1, that.pxbTv1) &&
                Objects.equals(dtTv1, that.dtTv1) &&
                Objects.equals(dmTv1, that.dmTv1) &&
                Objects.equals(tVosTv1, that.tVosTv1) &&
                Objects.equals(tnvTv2, that.tnvTv2) &&
                Objects.equals(txbTv2, that.txbTv2) &&
                Objects.equals(pxbTv2, that.pxbTv2) &&
                Objects.equals(dtTv2, that.dtTv2) &&
                Objects.equals(dmTv2, that.dmTv2) &&
                Objects.equals(tVosTv2, that.tVosTv2) &&
                Objects.equals(p3Tv1, that.p3Tv1) &&
                Objects.equals(p3Tv2, that.p3Tv2) &&
                Objects.equals(p1MpaTv1, that.p1MpaTv1) &&
                Objects.equals(p2MpaTv1, that.p2MpaTv1) &&
                Objects.equals(p3MpaTv1, that.p3MpaTv1) &&
                Objects.equals(p1MpaTv2, that.p1MpaTv2) &&
                Objects.equals(p2MpaTv2, that.p2MpaTv2) &&
                Objects.equals(p3MpaTv2, that.p3MpaTv2) &&
                Objects.equals(pxbMpaTv1, that.pxbMpaTv1) &&
                Objects.equals(pxbMpaTv2, that.pxbMpaTv2) &&
                Objects.equals(qGdjTv1, that.qGdjTv1) &&
                Objects.equals(q12GdjTv1, that.q12GdjTv1) &&
                Objects.equals(qgGdjTv1, that.qgGdjTv1) &&
                Objects.equals(qGdjTv2, that.qGdjTv2) &&
                Objects.equals(q12GdjTv2, that.q12GdjTv2) &&
                Objects.equals(qgGdjTv2, that.qgGdjTv2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arDate, tTv1, tTv2, regimTv1, m1Tv1, m2Tv1, m3Tv1, t1Tv1, t2Tv1, t3Tv1, qTv1, q12Tv1, qgTv1, v1Tv1, v2Tv1, v3Tv1, p1Tv1, p2Tv1, regimTv2, m1Tv2, m2Tv2, m3Tv2, t1Tv2, t2Tv2, t3Tv2, qTv2, q12Tv2, qgTv2, v1Tv2, v2Tv2, v3Tv2, p1Tv2, p2Tv2, adrN, tnvTv1, txbTv1, pxbTv1, dtTv1, dmTv1, tVosTv1, tnvTv2, txbTv2, pxbTv2, dtTv2, dmTv2, tVosTv2, p3Tv1, p3Tv2, p1MpaTv1, p2MpaTv1, p3MpaTv1, p1MpaTv2, p2MpaTv2, p3MpaTv2, pxbMpaTv1, pxbMpaTv2, qGdjTv1, q12GdjTv1, qgGdjTv1, qGdjTv2, q12GdjTv2, qgGdjTv2);
    }
}
