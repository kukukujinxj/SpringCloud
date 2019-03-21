package common.pojo.common_account;

import java.io.Serializable;

public class SysInfos implements Serializable {
    private Integer sysInfoId;

    private String sysName;

    private Integer sysState;

    private String sysDataType;

    private String sysInstruction;

    private String sysValue;

    private static final long serialVersionUID = 1L;

    public Integer getSysInfoId() {
        return sysInfoId;
    }

    public void setSysInfoId(Integer sysInfoId) {
        this.sysInfoId = sysInfoId;
    }

    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName == null ? null : sysName.trim();
    }

    public Integer getSysState() {
        return sysState;
    }

    public void setSysState(Integer sysState) {
        this.sysState = sysState;
    }

    public String getSysDataType() {
        return sysDataType;
    }

    public void setSysDataType(String sysDataType) {
        this.sysDataType = sysDataType == null ? null : sysDataType.trim();
    }

    public String getSysInstruction() {
        return sysInstruction;
    }

    public void setSysInstruction(String sysInstruction) {
        this.sysInstruction = sysInstruction == null ? null : sysInstruction.trim();
    }

    public String getSysValue() {
        return sysValue;
    }

    public void setSysValue(String sysValue) {
        this.sysValue = sysValue == null ? null : sysValue.trim();
    }
}