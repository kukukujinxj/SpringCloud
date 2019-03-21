package common.pojo.common_account;

import java.io.Serializable;

public class PrAccountGroup implements Serializable {
    private Integer agId;

    private Integer agAdminAccountId;

    private String agName;

    private Integer agState;

    private Integer agIncludeType;

    private Integer agDefaultType;

    private Integer agLevel;

    private Integer agOnlyGp;

    private String agDesp;

    private static final long serialVersionUID = 1L;

    public Integer getAgId() {
        return agId;
    }

    public void setAgId(Integer agId) {
        this.agId = agId;
    }

    public Integer getAgAdminAccountId() {
        return agAdminAccountId;
    }

    public void setAgAdminAccountId(Integer agAdminAccountId) {
        this.agAdminAccountId = agAdminAccountId;
    }

    public String getAgName() {
        return agName;
    }

    public void setAgName(String agName) {
        this.agName = agName == null ? null : agName.trim();
    }

    public Integer getAgState() {
        return agState;
    }

    public void setAgState(Integer agState) {
        this.agState = agState;
    }

    public Integer getAgIncludeType() {
        return agIncludeType;
    }

    public void setAgIncludeType(Integer agIncludeType) {
        this.agIncludeType = agIncludeType;
    }

    public Integer getAgDefaultType() {
        return agDefaultType;
    }

    public void setAgDefaultType(Integer agDefaultType) {
        this.agDefaultType = agDefaultType;
    }

    public Integer getAgLevel() {
        return agLevel;
    }

    public void setAgLevel(Integer agLevel) {
        this.agLevel = agLevel;
    }

    public Integer getAgOnlyGp() {
        return agOnlyGp;
    }

    public void setAgOnlyGp(Integer agOnlyGp) {
        this.agOnlyGp = agOnlyGp;
    }

    public String getAgDesp() {
        return agDesp;
    }

    public void setAgDesp(String agDesp) {
        this.agDesp = agDesp == null ? null : agDesp.trim();
    }
}