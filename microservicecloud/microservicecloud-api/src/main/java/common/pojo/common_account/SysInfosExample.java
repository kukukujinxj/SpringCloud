package common.pojo.common_account;

import java.util.ArrayList;
import java.util.List;

public class SysInfosExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysInfosExample() {
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

        public Criteria andSysInfoIdIsNull() {
            addCriterion("sysInfoId is null");
            return (Criteria) this;
        }

        public Criteria andSysInfoIdIsNotNull() {
            addCriterion("sysInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andSysInfoIdEqualTo(Integer value) {
            addCriterion("sysInfoId =", value, "sysInfoId");
            return (Criteria) this;
        }

        public Criteria andSysInfoIdNotEqualTo(Integer value) {
            addCriterion("sysInfoId <>", value, "sysInfoId");
            return (Criteria) this;
        }

        public Criteria andSysInfoIdGreaterThan(Integer value) {
            addCriterion("sysInfoId >", value, "sysInfoId");
            return (Criteria) this;
        }

        public Criteria andSysInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sysInfoId >=", value, "sysInfoId");
            return (Criteria) this;
        }

        public Criteria andSysInfoIdLessThan(Integer value) {
            addCriterion("sysInfoId <", value, "sysInfoId");
            return (Criteria) this;
        }

        public Criteria andSysInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("sysInfoId <=", value, "sysInfoId");
            return (Criteria) this;
        }

        public Criteria andSysInfoIdIn(List<Integer> values) {
            addCriterion("sysInfoId in", values, "sysInfoId");
            return (Criteria) this;
        }

        public Criteria andSysInfoIdNotIn(List<Integer> values) {
            addCriterion("sysInfoId not in", values, "sysInfoId");
            return (Criteria) this;
        }

        public Criteria andSysInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("sysInfoId between", value1, value2, "sysInfoId");
            return (Criteria) this;
        }

        public Criteria andSysInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sysInfoId not between", value1, value2, "sysInfoId");
            return (Criteria) this;
        }

        public Criteria andSysNameIsNull() {
            addCriterion("sysName is null");
            return (Criteria) this;
        }

        public Criteria andSysNameIsNotNull() {
            addCriterion("sysName is not null");
            return (Criteria) this;
        }

        public Criteria andSysNameEqualTo(String value) {
            addCriterion("sysName =", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameNotEqualTo(String value) {
            addCriterion("sysName <>", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameGreaterThan(String value) {
            addCriterion("sysName >", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameGreaterThanOrEqualTo(String value) {
            addCriterion("sysName >=", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameLessThan(String value) {
            addCriterion("sysName <", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameLessThanOrEqualTo(String value) {
            addCriterion("sysName <=", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameLike(String value) {
            addCriterion("sysName like", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameNotLike(String value) {
            addCriterion("sysName not like", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameIn(List<String> values) {
            addCriterion("sysName in", values, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameNotIn(List<String> values) {
            addCriterion("sysName not in", values, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameBetween(String value1, String value2) {
            addCriterion("sysName between", value1, value2, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameNotBetween(String value1, String value2) {
            addCriterion("sysName not between", value1, value2, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysStateIsNull() {
            addCriterion("sysState is null");
            return (Criteria) this;
        }

        public Criteria andSysStateIsNotNull() {
            addCriterion("sysState is not null");
            return (Criteria) this;
        }

        public Criteria andSysStateEqualTo(Integer value) {
            addCriterion("sysState =", value, "sysState");
            return (Criteria) this;
        }

        public Criteria andSysStateNotEqualTo(Integer value) {
            addCriterion("sysState <>", value, "sysState");
            return (Criteria) this;
        }

        public Criteria andSysStateGreaterThan(Integer value) {
            addCriterion("sysState >", value, "sysState");
            return (Criteria) this;
        }

        public Criteria andSysStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("sysState >=", value, "sysState");
            return (Criteria) this;
        }

        public Criteria andSysStateLessThan(Integer value) {
            addCriterion("sysState <", value, "sysState");
            return (Criteria) this;
        }

        public Criteria andSysStateLessThanOrEqualTo(Integer value) {
            addCriterion("sysState <=", value, "sysState");
            return (Criteria) this;
        }

        public Criteria andSysStateIn(List<Integer> values) {
            addCriterion("sysState in", values, "sysState");
            return (Criteria) this;
        }

        public Criteria andSysStateNotIn(List<Integer> values) {
            addCriterion("sysState not in", values, "sysState");
            return (Criteria) this;
        }

        public Criteria andSysStateBetween(Integer value1, Integer value2) {
            addCriterion("sysState between", value1, value2, "sysState");
            return (Criteria) this;
        }

        public Criteria andSysStateNotBetween(Integer value1, Integer value2) {
            addCriterion("sysState not between", value1, value2, "sysState");
            return (Criteria) this;
        }

        public Criteria andSysDataTypeIsNull() {
            addCriterion("sysDataType is null");
            return (Criteria) this;
        }

        public Criteria andSysDataTypeIsNotNull() {
            addCriterion("sysDataType is not null");
            return (Criteria) this;
        }

        public Criteria andSysDataTypeEqualTo(String value) {
            addCriterion("sysDataType =", value, "sysDataType");
            return (Criteria) this;
        }

        public Criteria andSysDataTypeNotEqualTo(String value) {
            addCriterion("sysDataType <>", value, "sysDataType");
            return (Criteria) this;
        }

        public Criteria andSysDataTypeGreaterThan(String value) {
            addCriterion("sysDataType >", value, "sysDataType");
            return (Criteria) this;
        }

        public Criteria andSysDataTypeGreaterThanOrEqualTo(String value) {
            addCriterion("sysDataType >=", value, "sysDataType");
            return (Criteria) this;
        }

        public Criteria andSysDataTypeLessThan(String value) {
            addCriterion("sysDataType <", value, "sysDataType");
            return (Criteria) this;
        }

        public Criteria andSysDataTypeLessThanOrEqualTo(String value) {
            addCriterion("sysDataType <=", value, "sysDataType");
            return (Criteria) this;
        }

        public Criteria andSysDataTypeLike(String value) {
            addCriterion("sysDataType like", value, "sysDataType");
            return (Criteria) this;
        }

        public Criteria andSysDataTypeNotLike(String value) {
            addCriterion("sysDataType not like", value, "sysDataType");
            return (Criteria) this;
        }

        public Criteria andSysDataTypeIn(List<String> values) {
            addCriterion("sysDataType in", values, "sysDataType");
            return (Criteria) this;
        }

        public Criteria andSysDataTypeNotIn(List<String> values) {
            addCriterion("sysDataType not in", values, "sysDataType");
            return (Criteria) this;
        }

        public Criteria andSysDataTypeBetween(String value1, String value2) {
            addCriterion("sysDataType between", value1, value2, "sysDataType");
            return (Criteria) this;
        }

        public Criteria andSysDataTypeNotBetween(String value1, String value2) {
            addCriterion("sysDataType not between", value1, value2, "sysDataType");
            return (Criteria) this;
        }

        public Criteria andSysInstructionIsNull() {
            addCriterion("sysInstruction is null");
            return (Criteria) this;
        }

        public Criteria andSysInstructionIsNotNull() {
            addCriterion("sysInstruction is not null");
            return (Criteria) this;
        }

        public Criteria andSysInstructionEqualTo(String value) {
            addCriterion("sysInstruction =", value, "sysInstruction");
            return (Criteria) this;
        }

        public Criteria andSysInstructionNotEqualTo(String value) {
            addCriterion("sysInstruction <>", value, "sysInstruction");
            return (Criteria) this;
        }

        public Criteria andSysInstructionGreaterThan(String value) {
            addCriterion("sysInstruction >", value, "sysInstruction");
            return (Criteria) this;
        }

        public Criteria andSysInstructionGreaterThanOrEqualTo(String value) {
            addCriterion("sysInstruction >=", value, "sysInstruction");
            return (Criteria) this;
        }

        public Criteria andSysInstructionLessThan(String value) {
            addCriterion("sysInstruction <", value, "sysInstruction");
            return (Criteria) this;
        }

        public Criteria andSysInstructionLessThanOrEqualTo(String value) {
            addCriterion("sysInstruction <=", value, "sysInstruction");
            return (Criteria) this;
        }

        public Criteria andSysInstructionLike(String value) {
            addCriterion("sysInstruction like", value, "sysInstruction");
            return (Criteria) this;
        }

        public Criteria andSysInstructionNotLike(String value) {
            addCriterion("sysInstruction not like", value, "sysInstruction");
            return (Criteria) this;
        }

        public Criteria andSysInstructionIn(List<String> values) {
            addCriterion("sysInstruction in", values, "sysInstruction");
            return (Criteria) this;
        }

        public Criteria andSysInstructionNotIn(List<String> values) {
            addCriterion("sysInstruction not in", values, "sysInstruction");
            return (Criteria) this;
        }

        public Criteria andSysInstructionBetween(String value1, String value2) {
            addCriterion("sysInstruction between", value1, value2, "sysInstruction");
            return (Criteria) this;
        }

        public Criteria andSysInstructionNotBetween(String value1, String value2) {
            addCriterion("sysInstruction not between", value1, value2, "sysInstruction");
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