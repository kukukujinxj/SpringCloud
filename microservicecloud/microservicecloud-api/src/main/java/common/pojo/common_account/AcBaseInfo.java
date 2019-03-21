package common.pojo.common_account;

import java.io.Serializable;
import java.util.Date;

public class AcBaseInfo implements Serializable {
    private Integer ubInfoId;

    private String uName;

    private String uEmail;

    private String uTel;

    private String uIdcard;

    private Integer uIdcardType;

    private String uTrueName;

    private Integer uGender;

    private Date uBirthday;

    private String uDegree;

    private String uLocation;

    private String uCompany;

    private String uPosition;

    private Double uLatitude;

    private Double uLongtitude;

    private String uImage;

    private String uSource;

    private Integer uAccountId;

    private Integer uHeight;

    private Integer uWeight;

    private Integer uAreaId;

    private String uCharacter;

    private Date uUpdateTime;

    private Date uCreateTime;

    private String uSignature;

    private String uLabel;

    private static final long serialVersionUID = 1L;

    public Integer getUbInfoId() {
        return ubInfoId;
    }

    public void setUbInfoId(Integer ubInfoId) {
        this.ubInfoId = ubInfoId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail == null ? null : uEmail.trim();
    }

    public String getuTel() {
        return uTel;
    }

    public void setuTel(String uTel) {
        this.uTel = uTel == null ? null : uTel.trim();
    }

    public String getuIdcard() {
        return uIdcard;
    }

    public void setuIdcard(String uIdcard) {
        this.uIdcard = uIdcard == null ? null : uIdcard.trim();
    }

    public Integer getuIdcardType() {
        return uIdcardType;
    }

    public void setuIdcardType(Integer uIdcardType) {
        this.uIdcardType = uIdcardType;
    }

    public String getuTrueName() {
        return uTrueName;
    }

    public void setuTrueName(String uTrueName) {
        this.uTrueName = uTrueName == null ? null : uTrueName.trim();
    }

    public Integer getuGender() {
        return uGender;
    }

    public void setuGender(Integer uGender) {
        this.uGender = uGender;
    }

    public Date getuBirthday() {
        return uBirthday;
    }

    public void setuBirthday(Date uBirthday) {
        this.uBirthday = uBirthday;
    }

    public String getuDegree() {
        return uDegree;
    }

    public void setuDegree(String uDegree) {
        this.uDegree = uDegree == null ? null : uDegree.trim();
    }

    public String getuLocation() {
        return uLocation;
    }

    public void setuLocation(String uLocation) {
        this.uLocation = uLocation == null ? null : uLocation.trim();
    }

    public String getuCompany() {
        return uCompany;
    }

    public void setuCompany(String uCompany) {
        this.uCompany = uCompany == null ? null : uCompany.trim();
    }

    public String getuPosition() {
        return uPosition;
    }

    public void setuPosition(String uPosition) {
        this.uPosition = uPosition == null ? null : uPosition.trim();
    }

    public Double getuLatitude() {
        return uLatitude;
    }

    public void setuLatitude(Double uLatitude) {
        this.uLatitude = uLatitude;
    }

    public Double getuLongtitude() {
        return uLongtitude;
    }

    public void setuLongtitude(Double uLongtitude) {
        this.uLongtitude = uLongtitude;
    }

    public String getuImage() {
        return uImage;
    }

    public void setuImage(String uImage) {
        this.uImage = uImage == null ? null : uImage.trim();
    }

    public String getuSource() {
        return uSource;
    }

    public void setuSource(String uSource) {
        this.uSource = uSource == null ? null : uSource.trim();
    }

    public Integer getuAccountId() {
        return uAccountId;
    }

    public void setuAccountId(Integer uAccountId) {
        this.uAccountId = uAccountId;
    }

    public Integer getuHeight() {
        return uHeight;
    }

    public void setuHeight(Integer uHeight) {
        this.uHeight = uHeight;
    }

    public Integer getuWeight() {
        return uWeight;
    }

    public void setuWeight(Integer uWeight) {
        this.uWeight = uWeight;
    }

    public Integer getuAreaId() {
        return uAreaId;
    }

    public void setuAreaId(Integer uAreaId) {
        this.uAreaId = uAreaId;
    }

    public String getuCharacter() {
        return uCharacter;
    }

    public void setuCharacter(String uCharacter) {
        this.uCharacter = uCharacter == null ? null : uCharacter.trim();
    }

    public Date getuUpdateTime() {
        return uUpdateTime;
    }

    public void setuUpdateTime(Date uUpdateTime) {
        this.uUpdateTime = uUpdateTime;
    }

    public Date getuCreateTime() {
        return uCreateTime;
    }

    public void setuCreateTime(Date uCreateTime) {
        this.uCreateTime = uCreateTime;
    }

    public String getuSignature() {
        return uSignature;
    }

    public void setuSignature(String uSignature) {
        this.uSignature = uSignature == null ? null : uSignature.trim();
    }

    public String getuLabel() {
        return uLabel;
    }

    public void setuLabel(String uLabel) {
        this.uLabel = uLabel == null ? null : uLabel.trim();
    }
}