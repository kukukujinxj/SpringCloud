package common.pojo.common_account;

import java.util.ArrayList;
import java.util.List;

public class PrAccountGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrAccountGroupExample() {
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

        public Criteria andAgIdIsNull() {
            addCriterion("agId is null");
            return (Criteria) this;
        }

        public Criteria andAgIdIsNotNull() {
            addCriterion("agId is not null");
            return (Criteria) this;
        }

        public Criteria andAgIdEqualTo(Integer value) {
            addCriterion("agId =", value, "agId");
            return (Criteria) this;
        }

        public Criteria andAgIdNotEqualTo(Integer value) {
            addCriterion("agId <>", value, "agId");
            return (Criteria) this;
        }

        public Criteria andAgIdGreaterThan(Integer value) {
            addCriterion("agId >", value, "agId");
            return (Criteria) this;
        }

        public Criteria andAgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("agId >=", value, "agId");
            return (Criteria) this;
        }

        public Criteria andAgIdLessThan(Integer value) {
            addCriterion("agId <", value, "agId");
            return (Criteria) this;
        }

        public Criteria andAgIdLessThanOrEqualTo(Integer value) {
            addCriterion("agId <=", value, "agId");
            return (Criteria) this;
        }

        public Criteria andAgIdIn(List<Integer> values) {
            addCriterion("agId in", values, "agId");
            return (Criteria) this;
        }

        public Criteria andAgIdNotIn(List<Integer> values) {
            addCriterion("agId not in", values, "agId");
            return (Criteria) this;
        }

        public Criteria andAgIdBetween(Integer value1, Integer value2) {
            addCriterion("agId between", value1, value2, "agId");
            return (Criteria) this;
        }

        public Criteria andAgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("agId not between", value1, value2, "agId");
            return (Criteria) this;
        }

        public Criteria andAgAdminAccountIdIsNull() {
            addCriterion("agAdminAccountId is null");
            return (Criteria) this;
        }

        public Criteria andAgAdminAccountIdIsNotNull() {
            addCriterion("agAdminAccountId is not null");
            return (Criteria) this;
        }

        public Criteria andAgAdminAccountIdEqualTo(Integer value) {
            addCriterion("agAdminAccountId =", value, "agAdminAccountId");
            return (Criteria) this;
        }

        public Criteria andAgAdminAccountIdNotEqualTo(Integer value) {
            addCriterion("agAdminAccountId <>", value, "agAdminAccountId");
            return (Criteria) this;
        }

        public Criteria andAgAdminAccountIdGreaterThan(Integer value) {
            addCriterion("agAdminAccountId >", value, "agAdminAccountId");
            return (Criteria) this;
        }

        public Criteria andAgAdminAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("agAdminAccountId >=", value, "agAdminAccountId");
            return (Criteria) this;
        }

        public Criteria andAgAdminAccountIdLessThan(Integer value) {
            addCriterion("agAdminAccountId <", value, "agAdminAccountId");
            return (Criteria) this;
        }

        public Criteria andAgAdminAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("agAdminAccountId <=", value, "agAdminAccountId");
            return (Criteria) this;
        }

        public Criteria andAgAdminAccountIdIn(List<Integer> values) {
            addCriterion("agAdminAccountId in", values, "agAdminAccountId");
            return (Criteria) this;
        }

        public Criteria andAgAdminAccountIdNotIn(List<Integer> values) {
            addCriterion("agAdminAccountId not in", values, "agAdminAccountId");
            return (Criteria) this;
        }

        public Criteria andAgAdminAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("agAdminAccountId between", value1, value2, "agAdminAccountId");
            return (Criteria) this;
        }

        public Criteria andAgAdminAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("agAdminAccountId not between", value1, value2, "agAdminAccountId");
            return (Criteria) this;
        }

        public Criteria andAgNameIsNull() {
            addCriterion("agName is null");
            return (Criteria) this;
        }

        public Criteria andAgNameIsNotNull() {
            addCriterion("agName is not null");
            return (Criteria) this;
        }

        public Criteria andAgNameEqualTo(String value) {
            addCriterion("agName =", value, "agName");
            return (Criteria) this;
        }

        public Criteria andAgNameNotEqualTo(String value) {
            addCriterion("agName <>", value, "agName");
            return (Criteria) this;
        }

        public Criteria andAgNameGreaterThan(String value) {
            addCriterion("agName >", value, "agName");
            return (Criteria) this;
        }

        public Criteria andAgNameGreaterThanOrEqualTo(String value) {
            addCriterion("agName >=", value, "agName");
            return (Criteria) this;
        }

        public Criteria andAgNameLessThan(String value) {
            addCriterion("agName <", value, "agName");
            return (Criteria) this;
        }

        public Criteria andAgNameLessThanOrEqualTo(String value) {
            addCriterion("agName <=", value, "agName");
            return (Criteria) this;
        }

        public Criteria andAgNameLike(String value) {
            addCriterion("agName like", value, "agName");
            return (Criteria) this;
        }

        public Criteria andAgNameNotLike(String value) {
            addCriterion("agName not like", value, "agName");
            return (Criteria) this;
        }

        public Criteria andAgNameIn(List<String> values) {
            addCriterion("agName in", values, "agName");
            return (Criteria) this;
        }

        public Criteria andAgNameNotIn(List<String> values) {
            addCriterion("agName not in", values, "agName");
            return (Criteria) this;
        }

        public Criteria andAgNameBetween(String value1, String value2) {
            addCriterion("agName between", value1, value2, "agName");
            return (Criteria) this;
        }

        public Criteria andAgNameNotBetween(String value1, String value2) {
            addCriterion("agName not between", value1, value2, "agName");
            return (Criteria) this;
        }

        public Criteria andAgStateIsNull() {
            addCriterion("agState is null");
            return (Criteria) this;
        }

        public Criteria andAgStateIsNotNull() {
            addCriterion("agState is not null");
            return (Criteria) this;
        }

        public Criteria andAgStateEqualTo(Integer value) {
            addCriterion("agState =", value, "agState");
            return (Criteria) this;
        }

        public Criteria andAgStateNotEqualTo(Integer value) {
            addCriterion("agState <>", value, "agState");
            return (Criteria) this;
        }

        public Criteria andAgStateGreaterThan(Integer value) {
            addCriterion("agState >", value, "agState");
            return (Criteria) this;
        }

        public Criteria andAgStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("agState >=", value, "agState");
            return (Criteria) this;
        }

        public Criteria andAgStateLessThan(Integer value) {
            addCriterion("agState <", value, "agState");
            return (Criteria) this;
        }

        public Criteria andAgStateLessThanOrEqualTo(Integer value) {
            addCriterion("agState <=", value, "agState");
            return (Criteria) this;
        }

        public Criteria andAgStateIn(List<Integer> values) {
            addCriterion("agState in", values, "agState");
            return (Criteria) this;
        }

        public Criteria andAgStateNotIn(List<Integer> values) {
            addCriterion("agState not in", values, "agState");
            return (Criteria) this;
        }

        public Criteria andAgStateBetween(Integer value1, Integer value2) {
            addCriterion("agState between", value1, value2, "agState");
            return (Criteria) this;
        }

        public Criteria andAgStateNotBetween(Integer value1, Integer value2) {
            addCriterion("agState not between", value1, value2, "agState");
            return (Criteria) this;
        }

        public Criteria andAgIncludeTypeIsNull() {
            addCriterion("agIncludeType is null");
            return (Criteria) this;
        }

        public Criteria andAgIncludeTypeIsNotNull() {
            addCriterion("agIncludeType is not null");
            return (Criteria) this;
        }

        public Criteria andAgIncludeTypeEqualTo(Integer value) {
            addCriterion("agIncludeType =", value, "agIncludeType");
            return (Criteria) this;
        }

        public Criteria andAgIncludeTypeNotEqualTo(Integer value) {
            addCriterion("agIncludeType <>", value, "agIncludeType");
            return (Criteria) this;
        }

        public Criteria andAgIncludeTypeGreaterThan(Integer value) {
            addCriterion("agIncludeType >", value, "agIncludeType");
            return (Criteria) this;
        }

        public Criteria andAgIncludeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("agIncludeType >=", value, "agIncludeType");
            return (Criteria) this;
        }

        public Criteria andAgIncludeTypeLessThan(Integer value) {
            addCriterion("agIncludeType <", value, "agIncludeType");
            return (Criteria) this;
        }

        public Criteria andAgIncludeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("agIncludeType <=", value, "agIncludeType");
            return (Criteria) this;
        }

        public Criteria andAgIncludeTypeIn(List<Integer> values) {
            addCriterion("agIncludeType in", values, "agIncludeType");
            return (Criteria) this;
        }

        public Criteria andAgIncludeTypeNotIn(List<Integer> values) {
            addCriterion("agIncludeType not in", values, "agIncludeType");
            return (Criteria) this;
        }

        public Criteria andAgIncludeTypeBetween(Integer value1, Integer value2) {
            addCriterion("agIncludeType between", value1, value2, "agIncludeType");
            return (Criteria) this;
        }

        public Criteria andAgIncludeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("agIncludeType not between", value1, value2, "agIncludeType");
            return (Criteria) this;
        }

        public Criteria andAgDefaultTypeIsNull() {
            addCriterion("agDefaultType is null");
            return (Criteria) this;
        }

        public Criteria andAgDefaultTypeIsNotNull() {
            addCriterion("agDefaultType is not null");
            return (Criteria) this;
        }

        public Criteria andAgDefaultTypeEqualTo(Integer value) {
            addCriterion("agDefaultType =", value, "agDefaultType");
            return (Criteria) this;
        }

        public Criteria andAgDefaultTypeNotEqualTo(Integer value) {
            addCriterion("agDefaultType <>", value, "agDefaultType");
            return (Criteria) this;
        }

        public Criteria andAgDefaultTypeGreaterThan(Integer value) {
            addCriterion("agDefaultType >", value, "agDefaultType");
            return (Criteria) this;
        }

        public Criteria andAgDefaultTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("agDefaultType >=", value, "agDefaultType");
            return (Criteria) this;
        }

        public Criteria andAgDefaultTypeLessThan(Integer value) {
            addCriterion("agDefaultType <", value, "agDefaultType");
            return (Criteria) this;
        }

        public Criteria andAgDefaultTypeLessThanOrEqualTo(Integer value) {
            addCriterion("agDefaultType <=", value, "agDefaultType");
            return (Criteria) this;
        }

        public Criteria andAgDefaultTypeIn(List<Integer> values) {
            addCriterion("agDefaultType in", values, "agDefaultType");
            return (Criteria) this;
        }

        public Criteria andAgDefaultTypeNotIn(List<Integer> values) {
            addCriterion("agDefaultType not in", values, "agDefaultType");
            return (Criteria) this;
        }

        public Criteria andAgDefaultTypeBetween(Integer value1, Integer value2) {
            addCriterion("agDefaultType between", value1, value2, "agDefaultType");
            return (Criteria) this;
        }

        public Criteria andAgDefaultTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("agDefaultType not between", value1, value2, "agDefaultType");
            return (Criteria) this;
        }

        public Criteria andAgLevelIsNull() {
            addCriterion("agLevel is null");
            return (Criteria) this;
        }

        public Criteria andAgLevelIsNotNull() {
            addCriterion("agLevel is not null");
            return (Criteria) this;
        }

        public Criteria andAgLevelEqualTo(Integer value) {
            addCriterion("agLevel =", value, "agLevel");
            return (Criteria) this;
        }

        public Criteria andAgLevelNotEqualTo(Integer value) {
            addCriterion("agLevel <>", value, "agLevel");
            return (Criteria) this;
        }

        public Criteria andAgLevelGreaterThan(Integer value) {
            addCriterion("agLevel >", value, "agLevel");
            return (Criteria) this;
        }

        public Criteria andAgLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("agLevel >=", value, "agLevel");
            return (Criteria) this;
        }

        public Criteria andAgLevelLessThan(Integer value) {
            addCriterion("agLevel <", value, "agLevel");
            return (Criteria) this;
        }

        public Criteria andAgLevelLessThanOrEqualTo(Integer value) {
            addCriterion("agLevel <=", value, "agLevel");
            return (Criteria) this;
        }

        public Criteria andAgLevelIn(List<Integer> values) {
            addCriterion("agLevel in", values, "agLevel");
            return (Criteria) this;
        }

        public Criteria andAgLevelNotIn(List<Integer> values) {
            addCriterion("agLevel not in", values, "agLevel");
            return (Criteria) this;
        }

        public Criteria andAgLevelBetween(Integer value1, Integer value2) {
            addCriterion("agLevel between", value1, value2, "agLevel");
            return (Criteria) this;
        }

        public Criteria andAgLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("agLevel not between", value1, value2, "agLevel");
            return (Criteria) this;
        }

        public Criteria andAgOnlyGpIsNull() {
            addCriterion("agOnlyGp is null");
            return (Criteria) this;
        }

        public Criteria andAgOnlyGpIsNotNull() {
            addCriterion("agOnlyGp is not null");
            return (Criteria) this;
        }

        public Criteria andAgOnlyGpEqualTo(Integer value) {
            addCriterion("agOnlyGp =", value, "agOnlyGp");
            return (Criteria) this;
        }

        public Criteria andAgOnlyGpNotEqualTo(Integer value) {
            addCriterion("agOnlyGp <>", value, "agOnlyGp");
            return (Criteria) this;
        }

        public Criteria andAgOnlyGpGreaterThan(Integer value) {
            addCriterion("agOnlyGp >", value, "agOnlyGp");
            return (Criteria) this;
        }

        public Criteria andAgOnlyGpGreaterThanOrEqualTo(Integer value) {
            addCriterion("agOnlyGp >=", value, "agOnlyGp");
            return (Criteria) this;
        }

        public Criteria andAgOnlyGpLessThan(Integer value) {
            addCriterion("agOnlyGp <", value, "agOnlyGp");
            return (Criteria) this;
        }

        public Criteria andAgOnlyGpLessThanOrEqualTo(Integer value) {
            addCriterion("agOnlyGp <=", value, "agOnlyGp");
            return (Criteria) this;
        }

        public Criteria andAgOnlyGpIn(List<Integer> values) {
            addCriterion("agOnlyGp in", values, "agOnlyGp");
            return (Criteria) this;
        }

        public Criteria andAgOnlyGpNotIn(List<Integer> values) {
            addCriterion("agOnlyGp not in", values, "agOnlyGp");
            return (Criteria) this;
        }

        public Criteria andAgOnlyGpBetween(Integer value1, Integer value2) {
            addCriterion("agOnlyGp between", value1, value2, "agOnlyGp");
            return (Criteria) this;
        }

        public Criteria andAgOnlyGpNotBetween(Integer value1, Integer value2) {
            addCriterion("agOnlyGp not between", value1, value2, "agOnlyGp");
            return (Criteria) this;
        }

        public Criteria andAgDespIsNull() {
            addCriterion("agDesp is null");
            return (Criteria) this;
        }

        public Criteria andAgDespIsNotNull() {
            addCriterion("agDesp is not null");
            return (Criteria) this;
        }

        public Criteria andAgDespEqualTo(String value) {
            addCriterion("agDesp =", value, "agDesp");
            return (Criteria) this;
        }

        public Criteria andAgDespNotEqualTo(String value) {
            addCriterion("agDesp <>", value, "agDesp");
            return (Criteria) this;
        }

        public Criteria andAgDespGreaterThan(String value) {
            addCriterion("agDesp >", value, "agDesp");
            return (Criteria) this;
        }

        public Criteria andAgDespGreaterThanOrEqualTo(String value) {
            addCriterion("agDesp >=", value, "agDesp");
            return (Criteria) this;
        }

        public Criteria andAgDespLessThan(String value) {
            addCriterion("agDesp <", value, "agDesp");
            return (Criteria) this;
        }

        public Criteria andAgDespLessThanOrEqualTo(String value) {
            addCriterion("agDesp <=", value, "agDesp");
            return (Criteria) this;
        }

        public Criteria andAgDespLike(String value) {
            addCriterion("agDesp like", value, "agDesp");
            return (Criteria) this;
        }

        public Criteria andAgDespNotLike(String value) {
            addCriterion("agDesp not like", value, "agDesp");
            return (Criteria) this;
        }

        public Criteria andAgDespIn(List<String> values) {
            addCriterion("agDesp in", values, "agDesp");
            return (Criteria) this;
        }

        public Criteria andAgDespNotIn(List<String> values) {
            addCriterion("agDesp not in", values, "agDesp");
            return (Criteria) this;
        }

        public Criteria andAgDespBetween(String value1, String value2) {
            addCriterion("agDesp between", value1, value2, "agDesp");
            return (Criteria) this;
        }

        public Criteria andAgDespNotBetween(String value1, String value2) {
            addCriterion("agDesp not between", value1, value2, "agDesp");
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