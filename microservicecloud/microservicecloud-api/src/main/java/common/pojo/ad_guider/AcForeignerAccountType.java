package common.pojo.ad_guider;

import java.io.Serializable;

public class AcForeignerAccountType implements Serializable {
    private Integer fAccountId;

    private String fAccountName;

    private String fAccountKey;

    private String fAccountSecret;

    private String fAccountLoginUrl;

    private String fAccountRegisterUrl;

    private String fAccountLoginSuccessUrl;

    private String fAccountLoginFailUrl;

    private String fAccountDomainName;

    private String faOpenAccountKey;

    private String faOpenAccountSecret;

    private String faAccountLoginPcSuccessUrl;

    private String faAccountLoginPcFailUrl;

    private Integer faAccountTypeState;

    private String faAccountCallbackUrl;

    private Integer faAccountBindStategy;

    private Integer faAccountAsync;

    private String faAccountEndPoint;

    private static final long serialVersionUID = 1L;

    public Integer getfAccountId() {
        return fAccountId;
    }

    public void setfAccountId(Integer fAccountId) {
        this.fAccountId = fAccountId;
    }

    public String getfAccountName() {
        return fAccountName;
    }

    public void setfAccountName(String fAccountName) {
        this.fAccountName = fAccountName == null ? null : fAccountName.trim();
    }

    public String getfAccountKey() {
        return fAccountKey;
    }

    public void setfAccountKey(String fAccountKey) {
        this.fAccountKey = fAccountKey == null ? null : fAccountKey.trim();
    }

    public String getfAccountSecret() {
        return fAccountSecret;
    }

    public void setfAccountSecret(String fAccountSecret) {
        this.fAccountSecret = fAccountSecret == null ? null : fAccountSecret.trim();
    }

    public String getfAccountLoginUrl() {
        return fAccountLoginUrl;
    }

    public void setfAccountLoginUrl(String fAccountLoginUrl) {
        this.fAccountLoginUrl = fAccountLoginUrl == null ? null : fAccountLoginUrl.trim();
    }

    public String getfAccountRegisterUrl() {
        return fAccountRegisterUrl;
    }

    public void setfAccountRegisterUrl(String fAccountRegisterUrl) {
        this.fAccountRegisterUrl = fAccountRegisterUrl == null ? null : fAccountRegisterUrl.trim();
    }

    public String getfAccountLoginSuccessUrl() {
        return fAccountLoginSuccessUrl;
    }

    public void setfAccountLoginSuccessUrl(String fAccountLoginSuccessUrl) {
        this.fAccountLoginSuccessUrl = fAccountLoginSuccessUrl == null ? null : fAccountLoginSuccessUrl.trim();
    }

    public String getfAccountLoginFailUrl() {
        return fAccountLoginFailUrl;
    }

    public void setfAccountLoginFailUrl(String fAccountLoginFailUrl) {
        this.fAccountLoginFailUrl = fAccountLoginFailUrl == null ? null : fAccountLoginFailUrl.trim();
    }

    public String getfAccountDomainName() {
        return fAccountDomainName;
    }

    public void setfAccountDomainName(String fAccountDomainName) {
        this.fAccountDomainName = fAccountDomainName == null ? null : fAccountDomainName.trim();
    }

    public String getFaOpenAccountKey() {
        return faOpenAccountKey;
    }

    public void setFaOpenAccountKey(String faOpenAccountKey) {
        this.faOpenAccountKey = faOpenAccountKey == null ? null : faOpenAccountKey.trim();
    }

    public String getFaOpenAccountSecret() {
        return faOpenAccountSecret;
    }

    public void setFaOpenAccountSecret(String faOpenAccountSecret) {
        this.faOpenAccountSecret = faOpenAccountSecret == null ? null : faOpenAccountSecret.trim();
    }

    public String getFaAccountLoginPcSuccessUrl() {
        return faAccountLoginPcSuccessUrl;
    }

    public void setFaAccountLoginPcSuccessUrl(String faAccountLoginPcSuccessUrl) {
        this.faAccountLoginPcSuccessUrl = faAccountLoginPcSuccessUrl == null ? null : faAccountLoginPcSuccessUrl.trim();
    }

    public String getFaAccountLoginPcFailUrl() {
        return faAccountLoginPcFailUrl;
    }

    public void setFaAccountLoginPcFailUrl(String faAccountLoginPcFailUrl) {
        this.faAccountLoginPcFailUrl = faAccountLoginPcFailUrl == null ? null : faAccountLoginPcFailUrl.trim();
    }

    public Integer getFaAccountTypeState() {
        return faAccountTypeState;
    }

    public void setFaAccountTypeState(Integer faAccountTypeState) {
        this.faAccountTypeState = faAccountTypeState;
    }

    public String getFaAccountCallbackUrl() {
        return faAccountCallbackUrl;
    }

    public void setFaAccountCallbackUrl(String faAccountCallbackUrl) {
        this.faAccountCallbackUrl = faAccountCallbackUrl == null ? null : faAccountCallbackUrl.trim();
    }

    public Integer getFaAccountBindStategy() {
        return faAccountBindStategy;
    }

    public void setFaAccountBindStategy(Integer faAccountBindStategy) {
        this.faAccountBindStategy = faAccountBindStategy;
    }

    public Integer getFaAccountAsync() {
        return faAccountAsync;
    }

    public void setFaAccountAsync(Integer faAccountAsync) {
        this.faAccountAsync = faAccountAsync;
    }

    public String getFaAccountEndPoint() {
        return faAccountEndPoint;
    }

    public void setFaAccountEndPoint(String faAccountEndPoint) {
        this.faAccountEndPoint = faAccountEndPoint == null ? null : faAccountEndPoint.trim();
    }
}