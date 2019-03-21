package common.pojo.common_account;

import java.io.Serializable;

public class PrAccountGroupMember implements Serializable {
    private Integer agmId;

    private Integer agmAccountId;

    private Integer agmGroupId;

    private Integer agmState;

    private static final long serialVersionUID = 1L;

    public Integer getAgmId() {
        return agmId;
    }

    public void setAgmId(Integer agmId) {
        this.agmId = agmId;
    }

    public Integer getAgmAccountId() {
        return agmAccountId;
    }

    public void setAgmAccountId(Integer agmAccountId) {
        this.agmAccountId = agmAccountId;
    }

    public Integer getAgmGroupId() {
        return agmGroupId;
    }

    public void setAgmGroupId(Integer agmGroupId) {
        this.agmGroupId = agmGroupId;
    }

    public Integer getAgmState() {
        return agmState;
    }

    public void setAgmState(Integer agmState) {
        this.agmState = agmState;
    }
}