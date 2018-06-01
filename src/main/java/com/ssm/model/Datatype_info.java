package com.ssm.model;

import java.io.Serializable;

public class Datatype_info implements Serializable {
    private Integer dtId;

    private String dtName;

    private String dtUnit;

    private static final long serialVersionUID = 1L;

    public Integer getDtId() {
        return dtId;
    }

    public void setDtId(Integer dtId) {
        this.dtId = dtId;
    }

    public String getDtName() {
        return dtName;
    }

    public void setDtName(String dtName) {
        this.dtName = dtName == null ? null : dtName.trim();
    }

    public String getDtUnit() {
        return dtUnit;
    }

    public void setDtUnit(String dtUnit) {
        this.dtUnit = dtUnit == null ? null : dtUnit.trim();
    }
}