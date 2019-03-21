package common.pojo.ad_guider;

import java.io.Serializable;

public class AcForeignerAccount implements Serializable {
    private Integer fAid;

    private String faShowName;

    private String faLoginName;

    private String faToken;

    private String faImage;

    private Integer faBelongToAccount;

    private Integer faType;

    private Integer faState;

    private String faInfoJson;

    private static final long serialVersionUID = 1L;

    public Integer getfAid() {
        return fAid;
    }

    public void setfAid(Integer fAid) {
        this.fAid = fAid;
    }

    public String getFaShowName() {
        return faShowName;
    }

    public void setFaShowName(String faShowName) {
        this.faShowName = faShowName == null ? null : faShowName.trim();
    }

    public String getFaLoginName() {
        return faLoginName;
    }

    public void setFaLoginName(String faLoginName) {
        this.faLoginName = faLoginName == null ? null : faLoginName.trim();
    }

    public String getFaToken() {
        return faToken;
    }

    public void setFaToken(String faToken) {
        this.faToken = faToken == null ? null : faToken.trim();
    }

    public String getFaImage() {
        return faImage;
    }

    public void setFaImage(String faImage) {
        this.faImage = faImage == null ? null : faImage.trim();
    }

    public Integer getFaBelongToAccount() {
        return faBelongToAccount;
    }

    public void setFaBelongToAccount(Integer faBelongToAccount) {
        this.faBelongToAccount = faBelongToAccount;
    }

    public Integer getFaType() {
        return faType;
    }

    public void setFaType(Integer faType) {
        this.faType = faType;
    }

    public Integer getFaState() {
        return faState;
    }

    public void setFaState(Integer faState) {
        this.faState = faState;
    }

    public String getFaInfoJson() {
        return faInfoJson;
    }

    public void setFaInfoJson(String faInfoJson) {
        this.faInfoJson = faInfoJson == null ? null : faInfoJson.trim();
    }
}