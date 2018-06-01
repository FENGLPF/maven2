package com.ssm.model;

import java.io.Serializable;

public class Function_info implements Serializable {
    private Integer fId;

    private String fName;

    private String fCommand;

    private String fComKey;

    private static final long serialVersionUID = 1L;

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
        this.fId = fId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName == null ? null : fName.trim();
    }

    public String getfCommand() {
        return fCommand;
    }

    public void setfCommand(String fCommand) {
        this.fCommand = fCommand == null ? null : fCommand.trim();
    }

    public String getfComKey() {
        return fComKey;
    }

    public void setfComKey(String fComKey) {
        this.fComKey = fComKey == null ? null : fComKey.trim();
    }
}