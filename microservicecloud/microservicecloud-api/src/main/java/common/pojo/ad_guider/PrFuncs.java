package common.pojo.ad_guider;

import java.io.Serializable;

public class PrFuncs implements Serializable {
    private Integer funcId;

    private String funcResourceKey;

    private String funcMethod;

    private String funcDescription;

    private String funcJudgeParam;

    private String funcJudgeParamValue;

    private Integer funcState;

    private Integer funcGpReferId;

    private String funcJudgeSubParam;

    private String funcJudgeSubParamValue;

    private String funcGpName;

    private String funcSubGpName;

    private String funcImplPath;

    private Integer funcLevel;

    private String funcMainDescription;

    private String funcJudgeCondition;

    private static final long serialVersionUID = 1L;

    public Integer getFuncId() {
        return funcId;
    }

    public void setFuncId(Integer funcId) {
        this.funcId = funcId;
    }

    public String getFuncResourceKey() {
        return funcResourceKey;
    }

    public void setFuncResourceKey(String funcResourceKey) {
        this.funcResourceKey = funcResourceKey == null ? null : funcResourceKey.trim();
    }

    public String getFuncMethod() {
        return funcMethod;
    }

    public void setFuncMethod(String funcMethod) {
        this.funcMethod = funcMethod == null ? null : funcMethod.trim();
    }

    public String getFuncDescription() {
        return funcDescription;
    }

    public void setFuncDescription(String funcDescription) {
        this.funcDescription = funcDescription == null ? null : funcDescription.trim();
    }

    public String getFuncJudgeParam() {
        return funcJudgeParam;
    }

    public void setFuncJudgeParam(String funcJudgeParam) {
        this.funcJudgeParam = funcJudgeParam == null ? null : funcJudgeParam.trim();
    }

    public String getFuncJudgeParamValue() {
        return funcJudgeParamValue;
    }

    public void setFuncJudgeParamValue(String funcJudgeParamValue) {
        this.funcJudgeParamValue = funcJudgeParamValue == null ? null : funcJudgeParamValue.trim();
    }

    public Integer getFuncState() {
        return funcState;
    }

    public void setFuncState(Integer funcState) {
        this.funcState = funcState;
    }

    public Integer getFuncGpReferId() {
        return funcGpReferId;
    }

    public void setFuncGpReferId(Integer funcGpReferId) {
        this.funcGpReferId = funcGpReferId;
    }

    public String getFuncJudgeSubParam() {
        return funcJudgeSubParam;
    }

    public void setFuncJudgeSubParam(String funcJudgeSubParam) {
        this.funcJudgeSubParam = funcJudgeSubParam == null ? null : funcJudgeSubParam.trim();
    }

    public String getFuncJudgeSubParamValue() {
        return funcJudgeSubParamValue;
    }

    public void setFuncJudgeSubParamValue(String funcJudgeSubParamValue) {
        this.funcJudgeSubParamValue = funcJudgeSubParamValue == null ? null : funcJudgeSubParamValue.trim();
    }

    public String getFuncGpName() {
        return funcGpName;
    }

    public void setFuncGpName(String funcGpName) {
        this.funcGpName = funcGpName == null ? null : funcGpName.trim();
    }

    public String getFuncSubGpName() {
        return funcSubGpName;
    }

    public void setFuncSubGpName(String funcSubGpName) {
        this.funcSubGpName = funcSubGpName == null ? null : funcSubGpName.trim();
    }

    public String getFuncImplPath() {
        return funcImplPath;
    }

    public void setFuncImplPath(String funcImplPath) {
        this.funcImplPath = funcImplPath == null ? null : funcImplPath.trim();
    }

    public Integer getFuncLevel() {
        return funcLevel;
    }

    public void setFuncLevel(Integer funcLevel) {
        this.funcLevel = funcLevel;
    }

    public String getFuncMainDescription() {
        return funcMainDescription;
    }

    public void setFuncMainDescription(String funcMainDescription) {
        this.funcMainDescription = funcMainDescription == null ? null : funcMainDescription.trim();
    }

    public String getFuncJudgeCondition() {
        return funcJudgeCondition;
    }

    public void setFuncJudgeCondition(String funcJudgeCondition) {
        this.funcJudgeCondition = funcJudgeCondition == null ? null : funcJudgeCondition.trim();
    }
}