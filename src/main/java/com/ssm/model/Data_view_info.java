package com.ssm.model;

import java.io.Serializable;
import java.sql.Date;

public class Data_view_info implements Serializable {
    private Integer dvId;

    private Integer dtId;

    private Integer dId;

    private Float dvData;

    private Date dvDate;
    
    private Datatype_info datatype_info;

	public Datatype_info getDatatype_info() {
		return datatype_info;
	}

	public void setDatatype_info(Datatype_info datatype_info) {
		this.datatype_info = datatype_info;
	}

	private static final long serialVersionUID = 1L;

    public Integer getDvId() {
        return dvId;
    }

    public void setDvId(Integer dvId) {
        this.dvId = dvId;
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

    public Float getDvData() {
        return dvData;
    }

    public void setDvData(Float dvData) {
        this.dvData = dvData;
    }

    public Date getDvDate() {
        return dvDate;
    }

    public void setDvDate(Date dvDate) {
        this.dvDate = dvDate;
    }
}