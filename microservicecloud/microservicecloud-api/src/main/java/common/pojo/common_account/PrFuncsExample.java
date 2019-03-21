package common.pojo.common_account;

import java.util.ArrayList;
import java.util.List;

public class PrFuncsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrFuncsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andFuncIdIsNull() {
            addCriterion("funcId is null");
            return (Criteria) this;
        }

        public Criteria andFuncIdIsNotNull() {
            addCriterion("funcId is not null");
            return (Criteria) this;
        }

        public Criteria andFuncIdEqualTo(Integer value) {
            addCriterion("funcId =", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdNotEqualTo(Integer value) {
            addCriterion("funcId <>", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdGreaterThan(Integer value) {
            addCriterion("funcId >", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("funcId >=", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdLessThan(Integer value) {
            addCriterion("funcId <", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdLessThanOrEqualTo(Integer value) {
            addCriterion("funcId <=", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdIn(List<Integer> values) {
            addCriterion("funcId in", values, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdNotIn(List<Integer> values) {
            addCriterion("funcId not in", values, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdBetween(Integer value1, Integer value2) {
            addCriterion("funcId between", value1, value2, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdNotBetween(Integer value1, Integer value2) {
            addCriterion("funcId not between", value1, value2, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncResourceKeyIsNull() {
            addCriterion("funcResourceKey is null");
            return (Criteria) this;
        }

        public Criteria andFuncResourceKeyIsNotNull() {
            addCriterion("funcResourceKey is not null");
            return (Criteria) this;
        }

        public Criteria andFuncResourceKeyEqualTo(String value) {
            addCriterion("funcResourceKey =", value, "funcResourceKey");
            return (Criteria) this;
        }

        public Criteria andFuncResourceKeyNotEqualTo(String value) {
            addCriterion("funcResourceKey <>", value, "funcResourceKey");
            return (Criteria) this;
        }

        public Criteria andFuncResourceKeyGreaterThan(String value) {
            addCriterion("funcResourceKey >", value, "funcResourceKey");
            return (Criteria) this;
        }

        public Criteria andFuncResourceKeyGreaterThanOrEqualTo(String value) {
            addCriterion("funcResourceKey >=", value, "funcResourceKey");
            return (Criteria) this;
        }

        public Criteria andFuncResourceKeyLessThan(String value) {
            addCriterion("funcResourceKey <", value, "funcResourceKey");
            return (Criteria) this;
        }

        public Criteria andFuncResourceKeyLessThanOrEqualTo(String value) {
            addCriterion("funcResourceKey <=", value, "funcResourceKey");
            return (Criteria) this;
        }

        public Criteria andFuncResourceKeyLike(String value) {
            addCriterion("funcResourceKey like", value, "funcResourceKey");
            return (Criteria) this;
        }

        public Criteria andFuncResourceKeyNotLike(String value) {
            addCriterion("funcResourceKey not like", value, "funcResourceKey");
            return (Criteria) this;
        }

        public Criteria andFuncResourceKeyIn(List<String> values) {
            addCriterion("funcResourceKey in", values, "funcResourceKey");
            return (Criteria) this;
        }

        public Criteria andFuncResourceKeyNotIn(List<String> values) {
            addCriterion("funcResourceKey not in", values, "funcResourceKey");
            return (Criteria) this;
        }

        public Criteria andFuncResourceKeyBetween(String value1, String value2) {
            addCriterion("funcResourceKey between", value1, value2, "funcResourceKey");
            return (Criteria) this;
        }

        public Criteria andFuncResourceKeyNotBetween(String value1, String value2) {
            addCriterion("funcResourceKey not between", value1, value2, "funcResourceKey");
            return (Criteria) this;
        }

        public Criteria andFuncMethodIsNull() {
            addCriterion("funcMethod is null");
            return (Criteria) this;
        }

        public Criteria andFuncMethodIsNotNull() {
            addCriterion("funcMethod is not null");
            return (Criteria) this;
        }

        public Criteria andFuncMethodEqualTo(String value) {
            addCriterion("funcMethod =", value, "funcMethod");
            return (Criteria) this;
        }

        public Criteria andFuncMethodNotEqualTo(String value) {
            addCriterion("funcMethod <>", value, "funcMethod");
            return (Criteria) this;
        }

        public Criteria andFuncMethodGreaterThan(String value) {
            addCriterion("funcMethod >", value, "funcMethod");
            return (Criteria) this;
        }

        public Criteria andFuncMethodGreaterThanOrEqualTo(String value) {
            addCriterion("funcMethod >=", value, "funcMethod");
            return (Criteria) this;
        }

        public Criteria andFuncMethodLessThan(String value) {
            addCriterion("funcMethod <", value, "funcMethod");
            return (Criteria) this;
        }

        public Criteria andFuncMethodLessThanOrEqualTo(String value) {
            addCriterion("funcMethod <=", value, "funcMethod");
            return (Criteria) this;
        }

        public Criteria andFuncMethodLike(String value) {
            addCriterion("funcMethod like", value, "funcMethod");
            return (Criteria) this;
        }

        public Criteria andFuncMethodNotLike(String value) {
            addCriterion("funcMethod not like", value, "funcMethod");
            return (Criteria) this;
        }

        public Criteria andFuncMethodIn(List<String> values) {
            addCriterion("funcMethod in", values, "funcMethod");
            return (Criteria) this;
        }

        public Criteria andFuncMethodNotIn(List<String> values) {
            addCriterion("funcMethod not in", values, "funcMethod");
            return (Criteria) this;
        }

        public Criteria andFuncMethodBetween(String value1, String value2) {
            addCriterion("funcMethod between", value1, value2, "funcMethod");
            return (Criteria) this;
        }

        public Criteria andFuncMethodNotBetween(String value1, String value2) {
            addCriterion("funcMethod not between", value1, value2, "funcMethod");
            return (Criteria) this;
        }

        public Criteria andFuncDescriptionIsNull() {
            addCriterion("funcDescription is null");
            return (Criteria) this;
        }

        public Criteria andFuncDescriptionIsNotNull() {
            addCriterion("funcDescription is not null");
            return (Criteria) this;
        }

        public Criteria andFuncDescriptionEqualTo(String value) {
            addCriterion("funcDescription =", value, "funcDescription");
            return (Criteria) this;
        }

        public Criteria andFuncDescriptionNotEqualTo(String value) {
            addCriterion("funcDescription <>", value, "funcDescription");
            return (Criteria) this;
        }

        public Criteria andFuncDescriptionGreaterThan(String value) {
            addCriterion("funcDescription >", value, "funcDescription");
            return (Criteria) this;
        }

        public Criteria andFuncDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("funcDescription >=", value, "funcDescription");
            return (Criteria) this;
        }

        public Criteria andFuncDescriptionLessThan(String value) {
            addCriterion("funcDescription <", value, "funcDescription");
            return (Criteria) this;
        }

        public Criteria andFuncDescriptionLessThanOrEqualTo(String value) {
            addCriterion("funcDescription <=", value, "funcDescription");
            return (Criteria) this;
        }

        public Criteria andFuncDescriptionLike(String value) {
            addCriterion("funcDescription like", value, "funcDescription");
            return (Criteria) this;
        }

        public Criteria andFuncDescriptionNotLike(String value) {
            addCriterion("funcDescription not like", value, "funcDescription");
            return (Criteria) this;
        }

        public Criteria andFuncDescriptionIn(List<String> values) {
            addCriterion("funcDescription in", values, "funcDescription");
            return (Criteria) this;
        }

        public Criteria andFuncDescriptionNotIn(List<String> values) {
            addCriterion("funcDescription not in", values, "funcDescription");
            return (Criteria) this;
        }

        public Criteria andFuncDescriptionBetween(String value1, String value2) {
            addCriterion("funcDescription between", value1, value2, "funcDescription");
            return (Criteria) this;
        }

        public Criteria andFuncDescriptionNotBetween(String value1, String value2) {
            addCriterion("funcDescription not between", value1, value2, "funcDescription");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeParamIsNull() {
            addCriterion("funcJudgeParam is null");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeParamIsNotNull() {
            addCriterion("funcJudgeParam is not null");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeParamEqualTo(String value) {
            addCriterion("funcJudgeParam =", value, "funcJudgeParam");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeParamNotEqualTo(String value) {
            addCriterion("funcJudgeParam <>", value, "funcJudgeParam");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeParamGreaterThan(String value) {
            addCriterion("funcJudgeParam >", value, "funcJudgeParam");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeParamGreaterThanOrEqualTo(String value) {
            addCriterion("funcJudgeParam >=", value, "funcJudgeParam");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeParamLessThan(String value) {
            addCriterion("funcJudgeParam <", value, "funcJudgeParam");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeParamLessThanOrEqualTo(String value) {
            addCriterion("funcJudgeParam <=", value, "funcJudgeParam");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeParamLike(String value) {
            addCriterion("funcJudgeParam like", value, "funcJudgeParam");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeParamNotLike(String value) {
            addCriterion("funcJudgeParam not like", value, "funcJudgeParam");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeParamIn(List<String> values) {
            addCriterion("funcJudgeParam in", values, "funcJudgeParam");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeParamNotIn(List<String> values) {
            addCriterion("funcJudgeParam not in", values, "funcJudgeParam");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeParamBetween(String value1, String value2) {
            addCriterion("funcJudgeParam between", value1, value2, "funcJudgeParam");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeParamNotBetween(String value1, String value2) {
            addCriterion("funcJudgeParam not between", value1, value2, "funcJudgeParam");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeParamValueIsNull() {
            addCriterion("funcJudgeParamValue is null");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeParamValueIsNotNull() {
            addCriterion("funcJudgeParamValue is not null");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeParamValueEqualTo(String value) {
            addCriterion("funcJudgeParamValue =", value, "funcJudgeParamValue");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeParamValueNotEqualTo(String value) {
            addCriterion("funcJudgeParamValue <>", value, "funcJudgeParamValue");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeParamValueGreaterThan(String value) {
            addCriterion("funcJudgeParamValue >", value, "funcJudgeParamValue");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeParamValueGreaterThanOrEqualTo(String value) {
            addCriterion("funcJudgeParamValue >=", value, "funcJudgeParamValue");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeParamValueLessThan(String value) {
            addCriterion("funcJudgeParamValue <", value, "funcJudgeParamValue");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeParamValueLessThanOrEqualTo(String value) {
            addCriterion("funcJudgeParamValue <=", value, "funcJudgeParamValue");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeParamValueLike(String value) {
            addCriterion("funcJudgeParamValue like", value, "funcJudgeParamValue");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeParamValueNotLike(String value) {
            addCriterion("funcJudgeParamValue not like", value, "funcJudgeParamValue");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeParamValueIn(List<String> values) {
            addCriterion("funcJudgeParamValue in", values, "funcJudgeParamValue");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeParamValueNotIn(List<String> values) {
            addCriterion("funcJudgeParamValue not in", values, "funcJudgeParamValue");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeParamValueBetween(String value1, String value2) {
            addCriterion("funcJudgeParamValue between", value1, value2, "funcJudgeParamValue");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeParamValueNotBetween(String value1, String value2) {
            addCriterion("funcJudgeParamValue not between", value1, value2, "funcJudgeParamValue");
            return (Criteria) this;
        }

        public Criteria andFuncStateIsNull() {
            addCriterion("funcState is null");
            return (Criteria) this;
        }

        public Criteria andFuncStateIsNotNull() {
            addCriterion("funcState is not null");
            return (Criteria) this;
        }

        public Criteria andFuncStateEqualTo(Integer value) {
            addCriterion("funcState =", value, "funcState");
            return (Criteria) this;
        }

        public Criteria andFuncStateNotEqualTo(Integer value) {
            addCriterion("funcState <>", value, "funcState");
            return (Criteria) this;
        }

        public Criteria andFuncStateGreaterThan(Integer value) {
            addCriterion("funcState >", value, "funcState");
            return (Criteria) this;
        }

        public Criteria andFuncStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("funcState >=", value, "funcState");
            return (Criteria) this;
        }

        public Criteria andFuncStateLessThan(Integer value) {
            addCriterion("funcState <", value, "funcState");
            return (Criteria) this;
        }

        public Criteria andFuncStateLessThanOrEqualTo(Integer value) {
            addCriterion("funcState <=", value, "funcState");
            return (Criteria) this;
        }

        public Criteria andFuncStateIn(List<Integer> values) {
            addCriterion("funcState in", values, "funcState");
            return (Criteria) this;
        }

        public Criteria andFuncStateNotIn(List<Integer> values) {
            addCriterion("funcState not in", values, "funcState");
            return (Criteria) this;
        }

        public Criteria andFuncStateBetween(Integer value1, Integer value2) {
            addCriterion("funcState between", value1, value2, "funcState");
            return (Criteria) this;
        }

        public Criteria andFuncStateNotBetween(Integer value1, Integer value2) {
            addCriterion("funcState not between", value1, value2, "funcState");
            return (Criteria) this;
        }

        public Criteria andFuncGpReferIdIsNull() {
            addCriterion("funcGpReferId is null");
            return (Criteria) this;
        }

        public Criteria andFuncGpReferIdIsNotNull() {
            addCriterion("funcGpReferId is not null");
            return (Criteria) this;
        }

        public Criteria andFuncGpReferIdEqualTo(Integer value) {
            addCriterion("funcGpReferId =", value, "funcGpReferId");
            return (Criteria) this;
        }

        public Criteria andFuncGpReferIdNotEqualTo(Integer value) {
            addCriterion("funcGpReferId <>", value, "funcGpReferId");
            return (Criteria) this;
        }

        public Criteria andFuncGpReferIdGreaterThan(Integer value) {
            addCriterion("funcGpReferId >", value, "funcGpReferId");
            return (Criteria) this;
        }

        public Criteria andFuncGpReferIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("funcGpReferId >=", value, "funcGpReferId");
            return (Criteria) this;
        }

        public Criteria andFuncGpReferIdLessThan(Integer value) {
            addCriterion("funcGpReferId <", value, "funcGpReferId");
            return (Criteria) this;
        }

        public Criteria andFuncGpReferIdLessThanOrEqualTo(Integer value) {
            addCriterion("funcGpReferId <=", value, "funcGpReferId");
            return (Criteria) this;
        }

        public Criteria andFuncGpReferIdIn(List<Integer> values) {
            addCriterion("funcGpReferId in", values, "funcGpReferId");
            return (Criteria) this;
        }

        public Criteria andFuncGpReferIdNotIn(List<Integer> values) {
            addCriterion("funcGpReferId not in", values, "funcGpReferId");
            return (Criteria) this;
        }

        public Criteria andFuncGpReferIdBetween(Integer value1, Integer value2) {
            addCriterion("funcGpReferId between", value1, value2, "funcGpReferId");
            return (Criteria) this;
        }

        public Criteria andFuncGpReferIdNotBetween(Integer value1, Integer value2) {
            addCriterion("funcGpReferId not between", value1, value2, "funcGpReferId");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeSubParamIsNull() {
            addCriterion("funcJudgeSubParam is null");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeSubParamIsNotNull() {
            addCriterion("funcJudgeSubParam is not null");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeSubParamEqualTo(String value) {
            addCriterion("funcJudgeSubParam =", value, "funcJudgeSubParam");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeSubParamNotEqualTo(String value) {
            addCriterion("funcJudgeSubParam <>", value, "funcJudgeSubParam");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeSubParamGreaterThan(String value) {
            addCriterion("funcJudgeSubParam >", value, "funcJudgeSubParam");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeSubParamGreaterThanOrEqualTo(String value) {
            addCriterion("funcJudgeSubParam >=", value, "funcJudgeSubParam");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeSubParamLessThan(String value) {
            addCriterion("funcJudgeSubParam <", value, "funcJudgeSubParam");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeSubParamLessThanOrEqualTo(String value) {
            addCriterion("funcJudgeSubParam <=", value, "funcJudgeSubParam");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeSubParamLike(String value) {
            addCriterion("funcJudgeSubParam like", value, "funcJudgeSubParam");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeSubParamNotLike(String value) {
            addCriterion("funcJudgeSubParam not like", value, "funcJudgeSubParam");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeSubParamIn(List<String> values) {
            addCriterion("funcJudgeSubParam in", values, "funcJudgeSubParam");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeSubParamNotIn(List<String> values) {
            addCriterion("funcJudgeSubParam not in", values, "funcJudgeSubParam");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeSubParamBetween(String value1, String value2) {
            addCriterion("funcJudgeSubParam between", value1, value2, "funcJudgeSubParam");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeSubParamNotBetween(String value1, String value2) {
            addCriterion("funcJudgeSubParam not between", value1, value2, "funcJudgeSubParam");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeSubParamValueIsNull() {
            addCriterion("funcJudgeSubParamValue is null");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeSubParamValueIsNotNull() {
            addCriterion("funcJudgeSubParamValue is not null");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeSubParamValueEqualTo(String value) {
            addCriterion("funcJudgeSubParamValue =", value, "funcJudgeSubParamValue");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeSubParamValueNotEqualTo(String value) {
            addCriterion("funcJudgeSubParamValue <>", value, "funcJudgeSubParamValue");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeSubParamValueGreaterThan(String value) {
            addCriterion("funcJudgeSubParamValue >", value, "funcJudgeSubParamValue");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeSubParamValueGreaterThanOrEqualTo(String value) {
            addCriterion("funcJudgeSubParamValue >=", value, "funcJudgeSubParamValue");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeSubParamValueLessThan(String value) {
            addCriterion("funcJudgeSubParamValue <", value, "funcJudgeSubParamValue");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeSubParamValueLessThanOrEqualTo(String value) {
            addCriterion("funcJudgeSubParamValue <=", value, "funcJudgeSubParamValue");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeSubParamValueLike(String value) {
            addCriterion("funcJudgeSubParamValue like", value, "funcJudgeSubParamValue");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeSubParamValueNotLike(String value) {
            addCriterion("funcJudgeSubParamValue not like", value, "funcJudgeSubParamValue");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeSubParamValueIn(List<String> values) {
            addCriterion("funcJudgeSubParamValue in", values, "funcJudgeSubParamValue");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeSubParamValueNotIn(List<String> values) {
            addCriterion("funcJudgeSubParamValue not in", values, "funcJudgeSubParamValue");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeSubParamValueBetween(String value1, String value2) {
            addCriterion("funcJudgeSubParamValue between", value1, value2, "funcJudgeSubParamValue");
            return (Criteria) this;
        }

        public Criteria andFuncJudgeSubParamValueNotBetween(String value1, String value2) {
            addCriterion("funcJudgeSubParamValue not between", value1, value2, "funcJudgeSubParamValue");
            return (Criteria) this;
        }

        public Criteria andFuncGpNameIsNull() {
            addCriterion("funcGpName is null");
            return (Criteria) this;
        }

        public Criteria andFuncGpNameIsNotNull() {
            addCriterion("funcGpName is not null");
            return (Criteria) this;
        }

        public Criteria andFuncGpNameEqualTo(String value) {
            addCriterion("funcGpName =", value, "funcGpName");
            return (Criteria) this;
        }

        public Criteria andFuncGpNameNotEqualTo(String value) {
            addCriterion("funcGpName <>", value, "funcGpName");
            return (Criteria) this;
        }

        public Criteria andFuncGpNameGreaterThan(String value) {
            addCriterion("funcGpName >", value, "funcGpName");
            return (Criteria) this;
        }

        public Criteria andFuncGpNameGreaterThanOrEqualTo(String value) {
            addCriterion("funcGpName >=", value, "funcGpName");
            return (Criteria) this;
        }

        public Criteria andFuncGpNameLessThan(String value) {
            addCriterion("funcGpName <", value, "funcGpName");
            return (Criteria) this;
        }

        public Criteria andFuncGpNameLessThanOrEqualTo(String value) {
            addCriterion("funcGpName <=", value, "funcGpName");
            return (Criteria) this;
        }

        public Criteria andFuncGpNameLike(String value) {
            addCriterion("funcGpName like", value, "funcGpName");
            return (Criteria) this;
        }

        public Criteria andFuncGpNameNotLike(String value) {
            addCriterion("funcGpName not like", value, "funcGpName");
            return (Criteria) this;
        }

        public Criteria andFuncGpNameIn(List<String> values) {
            addCriterion("funcGpName in", values, "funcGpName");
            return (Criteria) this;
        }

        public Criteria andFuncGpNameNotIn(List<String> values) {
            addCriterion("funcGpName not in", values, "funcGpName");
            return (Criteria) this;
        }

        public Criteria andFuncGpNameBetween(String value1, String value2) {
            addCriterion("funcGpName between", value1, value2, "funcGpName");
            return (Criteria) this;
        }

        public Criteria andFuncGpNameNotBetween(String value1, String value2) {
            addCriterion("funcGpName not between", value1, value2, "funcGpName");
            return (Criteria) this;
        }

        public Criteria andFuncSubGpNameIsNull() {
            addCriterion("funcSubGpName is null");
            return (Criteria) this;
        }

        public Criteria andFuncSubGpNameIsNotNull() {
            addCriterion("funcSubGpName is not null");
            return (Criteria) this;
        }

        public Criteria andFuncSubGpNameEqualTo(String value) {
            addCriterion("funcSubGpName =", value, "funcSubGpName");
            return (Criteria) this;
        }

        public Criteria andFuncSubGpNameNotEqualTo(String value) {
            addCriterion("funcSubGpName <>", value, "funcSubGpName");
            return (Criteria) this;
        }

        public Criteria andFuncSubGpNameGreaterThan(String value) {
            addCriterion("funcSubGpName >", value, "funcSubGpName");
            return (Criteria) this;
        }

        public Criteria andFuncSubGpNameGreaterThanOrEqualTo(String value) {
            addCriterion("funcSubGpName >=", value, "funcSubGpName");
            return (Criteria) this;
        }

        public Criteria andFuncSubGpNameLessThan(String value) {
            addCriterion("funcSubGpName <", value, "funcSubGpName");
            return (Criteria) this;
        }

        public Criteria andFuncSubGpNameLessThanOrEqualTo(String value) {
            addCriterion("funcSubGpName <=", value, "funcSubGpName");
            return (Criteria) this;
        }

        public Criteria andFuncSubGpNameLike(String value) {
            addCriterion("funcSubGpName like", value, "funcSubGpName");
            return (Criteria) this;
        }

        public Criteria andFuncSubGpNameNotLike(String value) {
            addCriterion("funcSubGpName not like", value, "funcSubGpName");
            return (Criteria) this;
        }

        public Criteria andFuncSubGpNameIn(List<String> values) {
            addCriterion("funcSubGpName in", values, "funcSubGpName");
            return (Criteria) this;
        }

        public Criteria andFuncSubGpNameNotIn(List<String> values) {
            addCriterion("funcSubGpName not in", values, "funcSubGpName");
            return (Criteria) this;
        }

        public Criteria andFuncSubGpNameBetween(String value1, String value2) {
            addCriterion("funcSubGpName between", value1, value2, "funcSubGpName");
            return (Criteria) this;
        }

        public Criteria andFuncSubGpNameNotBetween(String value1, String value2) {
            addCriterion("funcSubGpName not between", value1, value2, "funcSubGpName");
            return (Criteria) this;
        }

        public Criteria andFuncImplPathIsNull() {
            addCriterion("funcImplPath is null");
            return (Criteria) this;
        }

        public Criteria andFuncImplPathIsNotNull() {
            addCriterion("funcImplPath is not null");
            return (Criteria) this;
        }

        public Criteria andFuncImplPathEqualTo(String value) {
            addCriterion("funcImplPath =", value, "funcImplPath");
            return (Criteria) this;
        }

        public Criteria andFuncImplPathNotEqualTo(String value) {
            addCriterion("funcImplPath <>", value, "funcImplPath");
            return (Criteria) this;
        }

        public Criteria andFuncImplPathGreaterThan(String value) {
            addCriterion("funcImplPath >", value, "funcImplPath");
            return (Criteria) this;
        }

        public Criteria andFuncImplPathGreaterThanOrEqualTo(String value) {
            addCriterion("funcImplPath >=", value, "funcImplPath");
            return (Criteria) this;
        }

        public Criteria andFuncImplPathLessThan(String value) {
            addCriterion("funcImplPath <", value, "funcImplPath");
            return (Criteria) this;
        }

        public Criteria andFuncImplPathLessThanOrEqualTo(String value) {
            addCriterion("funcImplPath <=", value, "funcImplPath");
            return (Criteria) this;
        }

        public Criteria andFuncImplPathLike(String value) {
            addCriterion("funcImplPath like", value, "funcImplPath");
            return (Criteria) this;
        }

        public Criteria andFuncImplPathNotLike(String value) {
            addCriterion("funcImplPath not like", value, "funcImplPath");
            return (Criteria) this;
        }

        public Criteria andFuncImplPathIn(List<String> values) {
            addCriterion("funcImplPath in", values, "funcImplPath");
            return (Criteria) this;
        }

        public Criteria andFuncImplPathNotIn(List<String> values) {
            addCriterion("funcImplPath not in", values, "funcImplPath");
            return (Criteria) this;
        }

        public Criteria andFuncImplPathBetween(String value1, String value2) {
            addCriterion("funcImplPath between", value1, value2, "funcImplPath");
            return (Criteria) this;
        }

        public Criteria andFuncImplPathNotBetween(String value1, String value2) {
            addCriterion("funcImplPath not between", value1, value2, "funcImplPath");
            return (Criteria) this;
        }

        public Criteria andFuncLevelIsNull() {
            addCriterion("funcLevel is null");
            return (Criteria) this;
        }

        public Criteria andFuncLevelIsNotNull() {
            addCriterion("funcLevel is not null");
            return (Criteria) this;
        }

        public Criteria andFuncLevelEqualTo(Integer value) {
            addCriterion("funcLevel =", value, "funcLevel");
            return (Criteria) this;
        }

        public Criteria andFuncLevelNotEqualTo(Integer value) {
            addCriterion("funcLevel <>", value, "funcLevel");
            return (Criteria) this;
        }

        public Criteria andFuncLevelGreaterThan(Integer value) {
            addCriterion("funcLevel >", value, "funcLevel");
            return (Criteria) this;
        }

        public Criteria andFuncLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("funcLevel >=", value, "funcLevel");
            return (Criteria) this;
        }

        public Criteria andFuncLevelLessThan(Integer value) {
            addCriterion("funcLevel <", value, "funcLevel");
            return (Criteria) this;
        }

        public Criteria andFuncLevelLessThanOrEqualTo(Integer value) {
            addCriterion("funcLevel <=", value, "funcLevel");
            return (Criteria) this;
        }

        public Criteria andFuncLevelIn(List<Integer> values) {
            addCriterion("funcLevel in", values, "funcLevel");
            return (Criteria) this;
        }

        public Criteria andFuncLevelNotIn(List<Integer> values) {
            addCriterion("funcLevel not in", values, "funcLevel");
            return (Criteria) this;
        }

        public Criteria andFuncLevelBetween(Integer value1, Integer value2) {
            addCriterion("funcLevel between", value1, value2, "funcLevel");
            return (Criteria) this;
        }

        public Criteria andFuncLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("funcLevel not between", value1, value2, "funcLevel");
            return (Criteria) this;
        }

        public Criteria andFuncMainDescriptionIsNull() {
            addCriterion("funcMainDescription is null");
            return (Criteria) this;
        }

        public Criteria andFuncMainDescriptionIsNotNull() {
            addCriterion("funcMainDescription is not null");
            return (Criteria) this;
        }

        public Criteria andFuncMainDescriptionEqualTo(String value) {
            addCriterion("funcMainDescription =", value, "funcMainDescription");
            return (Criteria) this;
        }

        public Criteria andFuncMainDescriptionNotEqualTo(String value) {
            addCriterion("funcMainDescription <>", value, "funcMainDescription");
            return (Criteria) this;
        }

        public Criteria andFuncMainDescriptionGreaterThan(String value) {
            addCriterion("funcMainDescription >", value, "funcMainDescription");
            return (Criteria) this;
        }

        public Criteria andFuncMainDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("funcMainDescription >=", value, "funcMainDescription");
            return (Criteria) this;
        }

        public Criteria andFuncMainDescriptionLessThan(String value) {
            addCriterion("funcMainDescription <", value, "funcMainDescription");
            return (Criteria) this;
        }

        public Criteria andFuncMainDescriptionLessThanOrEqualTo(String value) {
            addCriterion("funcMainDescription <=", value, "funcMainDescription");
            return (Criteria) this;
        }

        public Criteria andFuncMainDescriptionLike(String value) {
            addCriterion("funcMainDescription like", value, "funcMainDescription");
            return (Criteria) this;
        }

        public Criteria andFuncMainDescriptionNotLike(String value) {
            addCriterion("funcMainDescription not like", value, "funcMainDescription");
            return (Criteria) this;
        }

        public Criteria andFuncMainDescriptionIn(List<String> values) {
            addCriterion("funcMainDescription in", values, "funcMainDescription");
            return (Criteria) this;
        }

        public Criteria andFuncMainDescriptionNotIn(List<String> values) {
            addCriterion("funcMainDescription not in", values, "funcMainDescription");
            return (Criteria) this;
        }

        public Criteria andFuncMainDescriptionBetween(String value1, String value2) {
            addCriterion("funcMainDescription between", value1, value2, "funcMainDescription");
            return (Criteria) this;
        }

        public Criteria andFuncMainDescriptionNotBetween(String value1, String value2) {
            addCriterion("funcMainDescription not between", value1, value2, "funcMainDescription");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}