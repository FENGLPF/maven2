package com.ssm.model;

import java.io.Serializable;
import java.sql.Date;

public class Device_info implements Serializable {
    private Integer dId;

    private Integer mId;

    private Integer dRid;

    private String dName;

    private String dSn;

    private String dCcidNo;

    private Date dMadeDate;

    private Date dActiveDate;

    private String dVer;

    private Integer dBoxno;

    private Integer dState;

    private static final long serialVersionUID = 1L;

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public Integer getdRid() {
        return dRid;
    }

    public void setdRid(Integer dRid) {
        this.dRid = dRid;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName == null ? null : dName.trim();
    }

    public String getdSn() {
        return dSn;
    }

    public void setdSn(String dSn) {
        this.dSn = dSn == null ? null : dSn.trim();
    }

    public String getdCcidNo() {
        return dCcidNo;
    }

    public void setdCcidNo(String dCcidNo) {
        this.dCcidNo = dCcidNo == null ? null : dCcidNo.trim();
    }

    public Date getdMadeDate() {
        return dMadeDate;
    }

    public void setdMadeDate(Date dMadeDate) {
        this.dMadeDate = dMadeDate;
    }

    public Date getdActiveDate() {
        return dActiveDate;
    }

    public void setdActiveDate(Date dActiveDate) {
        this.dActiveDate = dActiveDate;
    }

    public String getdVer() {
        return dVer;
    }

    public void setdVer(String dVer) {
        this.dVer = dVer == null ? null : dVer.trim();
    }

    public Integer getdBoxno() {
        return dBoxno;
    }

    public void setdBoxno(Integer dBoxno) {
        this.dBoxno = dBoxno;
    }

    public Integer getdState() {
        return dState;
    }

    public void setdState(Integer dState) {
        this.dState = dState;
    }
}