package com.ssm.model;

import java.io.Serializable;
import java.sql.Date;

public class Order_info implements Serializable {
    private Integer oId;

    private Integer dId;

    private Integer uId;

    private Integer oPaytype;

    private Float oPaymoney;

    private String oOrderno;

    private String oTrxno;

    private Date oAddtime;

    private Date oPaytime;

    private Integer oStat;

    private Integer oDel;

    private static final long serialVersionUID = 1L;

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getoPaytype() {
        return oPaytype;
    }

    public void setoPaytype(Integer oPaytype) {
        this.oPaytype = oPaytype;
    }

    public Float getoPaymoney() {
        return oPaymoney;
    }

    public void setoPaymoney(Float oPaymoney) {
        this.oPaymoney = oPaymoney;
    }

    public String getoOrderno() {
        return oOrderno;
    }

    public void setoOrderno(String oOrderno) {
        this.oOrderno = oOrderno == null ? null : oOrderno.trim();
    }

    public String getoTrxno() {
        return oTrxno;
    }

    public void setoTrxno(String oTrxno) {
        this.oTrxno = oTrxno == null ? null : oTrxno.trim();
    }

    public Date getoAddtime() {
        return oAddtime;
    }

    public void setoAddtime(Date oAddtime) {
        this.oAddtime = oAddtime;
    }

    public Date getoPaytime() {
        return oPaytime;
    }

    public void setoPaytime(Date oPaytime) {
        this.oPaytime = oPaytime;
    }

    public Integer getoStat() {
        return oStat;
    }

    public void setoStat(Integer oStat) {
        this.oStat = oStat;
    }

    public Integer getoDel() {
        return oDel;
    }

    public void setoDel(Integer oDel) {
        this.oDel = oDel;
    }
}