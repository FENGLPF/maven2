package com.ssm.model;

import java.io.Serializable;
import java.sql.Date;

public class Command_hist_info implements Serializable {
    private Integer chId;

    private Integer dId;

    private String chStr;

    private Date chDate;

    private static final long serialVersionUID = 1L;

    public Integer getChId() {
        return chId;
    }

    public void setChId(Integer chId) {
        this.chId = chId;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getChStr() {
        return chStr;
    }

    public void setChStr(String chStr) {
        this.chStr = chStr == null ? null : chStr.trim();
    }

    public Date getChDate() {
        return chDate;
    }

    public void setChDate(Date chDate) {
        this.chDate = chDate;
    }
}