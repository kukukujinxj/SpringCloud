package common.pojo.ad_guider;

import java.io.Serializable;

public class PrGroupFuncRelation implements Serializable {
    private Integer pfrId;

    private Integer pfrFgId;

    private Integer pfrAgId;

    private Integer pfrType;

    private static final long serialVersionUID = 1L;

    public Integer getPfrId() {
        return pfrId;
    }

    public void setPfrId(Integer pfrId) {
        this.pfrId = pfrId;
    }

    public Integer getPfrFgId() {
        return pfrFgId;
    }

    public void setPfrFgId(Integer pfrFgId) {
        this.pfrFgId = pfrFgId;
    }

    public Integer getPfrAgId() {
        return pfrAgId;
    }

    public void setPfrAgId(Integer pfrAgId) {
        this.pfrAgId = pfrAgId;
    }

    public Integer getPfrType() {
        return pfrType;
    }

    public void setPfrType(Integer pfrType) {
        this.pfrType = pfrType;
    }
}