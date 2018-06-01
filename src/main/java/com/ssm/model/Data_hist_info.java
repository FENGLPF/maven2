package com.ssm.model;

import java.io.Serializable;
import java.sql.Date;

public class Data_hist_info implements Serializable {
    private Integer dhId;

    private Integer dtId;

    private Integer dId;

    private Float dhData;

    private Date dhDate;

    private static final long serialVersionUID = 1L;

    public Integer getDhId() {
        return dhId;
    }

    public void setDhId(Integer dhId) {
        this.dhId = dhId;
    }

    public Integer getDtId() {
        return dtId;
    }

    public void setDtId(Integer dtId) {
        this.dtId = dtId;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public Float getDhData() {
        return dhData;
    }

    public void setDhData(Float dhData) {
        this.dhData = dhData;
    }

    public Date getDhDate() {
        return dhDate;
    }

    public void setDhDate(Date dhDate) {
        this.dhDate = dhDate;
    }
}