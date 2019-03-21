package common.pojo.common_account;

import java.util.ArrayList;
import java.util.List;

public class PrAccountGroupMemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrAccountGroupMemberExample() {
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

        public Criteria andAgmIdIsNull() {
            addCriterion("agmId is null");
            return (Criteria) this;
        }

        public Criteria andAgmIdIsNotNull() {
            addCriterion("agmId is not null");
            return (Criteria) this;
        }

        public Criteria andAgmIdEqualTo(Integer value) {
            addCriterion("agmId =", value, "agmId");
            return (Criteria) this;
        }

        public Criteria andAgmIdNotEqualTo(Integer value) {
            addCriterion("agmId <>", value, "agmId");
            return (Criteria) this;
        }

        public Criteria andAgmIdGreaterThan(Integer value) {
            addCriterion("agmId >", value, "agmId");
            return (Criteria) this;
        }

        public Criteria andAgmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("agmId >=", value, "agmId");
            return (Criteria) this;
        }

        public Criteria andAgmIdLessThan(Integer value) {
            addCriterion("agmId <", value, "agmId");
            return (Criteria) this;
        }

        public Criteria andAgmIdLessThanOrEqualTo(Integer value) {
            addCriterion("agmId <=", value, "agmId");
            return (Criteria) this;
        }

        public Criteria andAgmIdIn(List<Integer> values) {
            addCriterion("agmId in", values, "agmId");
            return (Criteria) this;
        }

        public Criteria andAgmIdNotIn(List<Integer> values) {
            addCriterion("agmId not in", values, "agmId");
            return (Criteria) this;
        }

        public Criteria andAgmIdBetween(Integer value1, Integer value2) {
            addCriterion("agmId between", value1, value2, "agmId");
            return (Criteria) this;
        }

        public Criteria andAgmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("agmId not between", value1, value2, "agmId");
            return (Criteria) this;
        }

        public Criteria andAgmAccountIdIsNull() {
            addCriterion("agmAccountId is null");
            return (Criteria) this;
        }

        public Criteria andAgmAccountIdIsNotNull() {
            addCriterion("agmAccountId is not null");
            return (Criteria) this;
        }

        public Criteria andAgmAccountIdEqualTo(Integer value) {
            addCriterion("agmAccountId =", value, "agmAccountId");
            return (Criteria) this;
        }

        public Criteria andAgmAccountIdNotEqualTo(Integer value) {
            addCriterion("agmAccountId <>", value, "agmAccountId");
            return (Criteria) this;
        }

        public Criteria andAgmAccountIdGreaterThan(Integer value) {
            addCriterion("agmAccountId >", value, "agmAccountId");
            return (Criteria) this;
        }

        public Criteria andAgmAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("agmAccountId >=", value, "agmAccountId");
            return (Criteria) this;
        }

        public Criteria andAgmAccountIdLessThan(Integer value) {
            addCriterion("agmAccountId <", value, "agmAccountId");
            return (Criteria) this;
        }

        public Criteria andAgmAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("agmAccountId <=", value, "agmAccountId");
            return (Criteria) this;
        }

        public Criteria andAgmAccountIdIn(List<Integer> values) {
            addCriterion("agmAccountId in", values, "agmAccountId");
            return (Criteria) this;
        }

        public Criteria andAgmAccountIdNotIn(List<Integer> values) {
            addCriterion("agmAccountId not in", values, "agmAccountId");
            return (Criteria) this;
        }

        public Criteria andAgmAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("agmAccountId between", value1, value2, "agmAccountId");
            return (Criteria) this;
        }

        public Criteria andAgmAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("agmAccountId not between", value1, value2, "agmAccountId");
            return (Criteria) this;
        }

        public Criteria andAgmGroupIdIsNull() {
            addCriterion("agmGroupId is null");
            return (Criteria) this;
        }

        public Criteria andAgmGroupIdIsNotNull() {
            addCriterion("agmGroupId is not null");
            return (Criteria) this;
        }

        public Criteria andAgmGroupIdEqualTo(Integer value) {
            addCriterion("agmGroupId =", value, "agmGroupId");
            return (Criteria) this;
        }

        public Criteria andAgmGroupIdNotEqualTo(Integer value) {
            addCriterion("agmGroupId <>", value, "agmGroupId");
            return (Criteria) this;
        }

        public Criteria andAgmGroupIdGreaterThan(Integer value) {
            addCriterion("agmGroupId >", value, "agmGroupId");
            return (Criteria) this;
        }

        public Criteria andAgmGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("agmGroupId >=", value, "agmGroupId");
            return (Criteria) this;
        }

        public Criteria andAgmGroupIdLessThan(Integer value) {
            addCriterion("agmGroupId <", value, "agmGroupId");
            return (Criteria) this;
        }

        public Criteria andAgmGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("agmGroupId <=", value, "agmGroupId");
            return (Criteria) this;
        }

        public Criteria andAgmGroupIdIn(List<Integer> values) {
            addCriterion("agmGroupId in", values, "agmGroupId");
            return (Criteria) this;
        }

        public Criteria andAgmGroupIdNotIn(List<Integer> values) {
            addCriterion("agmGroupId not in", values, "agmGroupId");
            return (Criteria) this;
        }

        public Criteria andAgmGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("agmGroupId between", value1, value2, "agmGroupId");
            return (Criteria) this;
        }

        public Criteria andAgmGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("agmGroupId not between", value1, value2, "agmGroupId");
            return (Criteria) this;
        }

        public Criteria andAgmStateIsNull() {
            addCriterion("agmState is null");
            return (Criteria) this;
        }

        public Criteria andAgmStateIsNotNull() {
            addCriterion("agmState is not null");
            return (Criteria) this;
        }

        public Criteria andAgmStateEqualTo(Integer value) {
            addCriterion("agmState =", value, "agmState");
            return (Criteria) this;
        }

        public Criteria andAgmStateNotEqualTo(Integer value) {
            addCriterion("agmState <>", value, "agmState");
            return (Criteria) this;
        }

        public Criteria andAgmStateGreaterThan(Integer value) {
            addCriterion("agmState >", value, "agmState");
            return (Criteria) this;
        }

        public Criteria andAgmStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("agmState >=", value, "agmState");
            return (Criteria) this;
        }

        public Criteria andAgmStateLessThan(Integer value) {
            addCriterion("agmState <", value, "agmState");
            return (Criteria) this;
        }

        public Criteria andAgmStateLessThanOrEqualTo(Integer value) {
            addCriterion("agmState <=", value, "agmState");
            return (Criteria) this;
        }

        public Criteria andAgmStateIn(List<Integer> values) {
            addCriterion("agmState in", values, "agmState");
            return (Criteria) this;
        }

        public Criteria andAgmStateNotIn(List<Integer> values) {
            addCriterion("agmState not in", values, "agmState");
            return (Criteria) this;
        }

        public Criteria andAgmStateBetween(Integer value1, Integer value2) {
            addCriterion("agmState between", value1, value2, "agmState");
            return (Criteria) this;
        }

        public Criteria andAgmStateNotBetween(Integer value1, Integer value2) {
            addCriterion("agmState not between", value1, value2, "agmState");
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