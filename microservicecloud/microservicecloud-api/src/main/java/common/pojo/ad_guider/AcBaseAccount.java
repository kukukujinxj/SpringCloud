package common.pojo.ad_guider;

import java.io.Serializable;
import java.util.Date;

public class AcBaseAccount implements Serializable {
    private Integer uid;

    private String uLoginName;

    private String uPwd;

    private Integer uState;

    private Date uModifiedTime;

    private Date uCreateTime;

    private String uLoginIp;

    private Integer uLoginTimes;

    private static final long serialVersionUID = 1L;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getuLoginName() {
        return uLoginName;
    }

    public void setuLoginName(String uLoginName) {
        this.uLoginName = uLoginName == null ? null : uLoginName.trim();
    }

    public String getuPwd() {
        return uPwd;
    }

    public void setuPwd(String uPwd) {
        this.uPwd = uPwd == null ? null : uPwd.trim();
    }

    public Integer getuState() {
        return uState;
    }

    public void setuState(Integer uState) {
        this.uState = uState;
    }

    public Date getuModifiedTime() {
        return uModifiedTime;
    }

    public void setuModifiedTime(Date uModifiedTime) {
        this.uModifiedTime = uModifiedTime;
    }

    public Date getuCreateTime() {
        return uCreateTime;
    }

    public void setuCreateTime(Date uCreateTime) {
        this.uCreateTime = uCreateTime;
    }

    public String getuLoginIp() {
        return uLoginIp;
    }

    public void setuLoginIp(String uLoginIp) {
        this.uLoginIp = uLoginIp == null ? null : uLoginIp.trim();
    }

    public Integer getuLoginTimes() {
        return uLoginTimes;
    }

    public void setuLoginTimes(Integer uLoginTimes) {
        this.uLoginTimes = uLoginTimes;
    }
}