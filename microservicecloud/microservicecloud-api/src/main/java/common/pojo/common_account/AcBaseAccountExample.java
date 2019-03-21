package common.pojo.common_account;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AcBaseAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcBaseAccountExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andULoginNameIsNull() {
            addCriterion("uLoginName is null");
            return (Criteria) this;
        }

        public Criteria andULoginNameIsNotNull() {
            addCriterion("uLoginName is not null");
            return (Criteria) this;
        }

        public Criteria andULoginNameEqualTo(String value) {
            addCriterion("uLoginName =", value, "uLoginName");
            return (Criteria) this;
        }

        public Criteria andULoginNameNotEqualTo(String value) {
            addCriterion("uLoginName <>", value, "uLoginName");
            return (Criteria) this;
        }

        public Criteria andULoginNameGreaterThan(String value) {
            addCriterion("uLoginName >", value, "uLoginName");
            return (Criteria) this;
        }

        public Criteria andULoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("uLoginName >=", value, "uLoginName");
            return (Criteria) this;
        }

        public Criteria andULoginNameLessThan(String value) {
            addCriterion("uLoginName <", value, "uLoginName");
            return (Criteria) this;
        }

        public Criteria andULoginNameLessThanOrEqualTo(String value) {
            addCriterion("uLoginName <=", value, "uLoginName");
            return (Criteria) this;
        }

        public Criteria andULoginNameLike(String value) {
            addCriterion("uLoginName like", value, "uLoginName");
            return (Criteria) this;
        }

        public Criteria andULoginNameNotLike(String value) {
            addCriterion("uLoginName not like", value, "uLoginName");
            return (Criteria) this;
        }

        public Criteria andULoginNameIn(List<String> values) {
            addCriterion("uLoginName in", values, "uLoginName");
            return (Criteria) this;
        }

        public Criteria andULoginNameNotIn(List<String> values) {
            addCriterion("uLoginName not in", values, "uLoginName");
            return (Criteria) this;
        }

        public Criteria andULoginNameBetween(String value1, String value2) {
            addCriterion("uLoginName between", value1, value2, "uLoginName");
            return (Criteria) this;
        }

        public Criteria andULoginNameNotBetween(String value1, String value2) {
            addCriterion("uLoginName not between", value1, value2, "uLoginName");
            return (Criteria) this;
        }

        public Criteria andUPwdIsNull() {
            addCriterion("uPwd is null");
            return (Criteria) this;
        }

        public Criteria andUPwdIsNotNull() {
            addCriterion("uPwd is not null");
            return (Criteria) this;
        }

        public Criteria andUPwdEqualTo(String value) {
            addCriterion("uPwd =", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdNotEqualTo(String value) {
            addCriterion("uPwd <>", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdGreaterThan(String value) {
            addCriterion("uPwd >", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdGreaterThanOrEqualTo(String value) {
            addCriterion("uPwd >=", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdLessThan(String value) {
            addCriterion("uPwd <", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdLessThanOrEqualTo(String value) {
            addCriterion("uPwd <=", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdLike(String value) {
            addCriterion("uPwd like", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdNotLike(String value) {
            addCriterion("uPwd not like", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdIn(List<String> values) {
            addCriterion("uPwd in", values, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdNotIn(List<String> values) {
            addCriterion("uPwd not in", values, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdBetween(String value1, String value2) {
            addCriterion("uPwd between", value1, value2, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdNotBetween(String value1, String value2) {
            addCriterion("uPwd not between", value1, value2, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUStateIsNull() {
            addCriterion("uState is null");
            return (Criteria) this;
        }

        public Criteria andUStateIsNotNull() {
            addCriterion("uState is not null");
            return (Criteria) this;
        }

        public Criteria andUStateEqualTo(Integer value) {
            addCriterion("uState =", value, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateNotEqualTo(Integer value) {
            addCriterion("uState <>", value, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateGreaterThan(Integer value) {
            addCriterion("uState >", value, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("uState >=", value, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateLessThan(Integer value) {
            addCriterion("uState <", value, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateLessThanOrEqualTo(Integer value) {
            addCriterion("uState <=", value, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateIn(List<Integer> values) {
            addCriterion("uState in", values, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateNotIn(List<Integer> values) {
            addCriterion("uState not in", values, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateBetween(Integer value1, Integer value2) {
            addCriterion("uState between", value1, value2, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateNotBetween(Integer value1, Integer value2) {
            addCriterion("uState not between", value1, value2, "uState");
            return (Criteria) this;
        }

        public Criteria andUModifiedTimeIsNull() {
            addCriterion("uModifiedTime is null");
            return (Criteria) this;
        }

        public Criteria andUModifiedTimeIsNotNull() {
            addCriterion("uModifiedTime is not null");
            return (Criteria) this;
        }

        public Criteria andUModifiedTimeEqualTo(Date value) {
            addCriterion("uModifiedTime =", value, "uModifiedTime");
            return (Criteria) this;
        }

        public Criteria andUModifiedTimeNotEqualTo(Date value) {
            addCriterion("uModifiedTime <>", value, "uModifiedTime");
            return (Criteria) this;
        }

        public Criteria andUModifiedTimeGreaterThan(Date value) {
            addCriterion("uModifiedTime >", value, "uModifiedTime");
            return (Criteria) this;
        }

        public Criteria andUModifiedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("uModifiedTime >=", value, "uModifiedTime");
            return (Criteria) this;
        }

        public Criteria andUModifiedTimeLessThan(Date value) {
            addCriterion("uModifiedTime <", value, "uModifiedTime");
            return (Criteria) this;
        }

        public Criteria andUModifiedTimeLessThanOrEqualTo(Date value) {
            addCriterion("uModifiedTime <=", value, "uModifiedTime");
            return (Criteria) this;
        }

        public Criteria andUModifiedTimeIn(List<Date> values) {
            addCriterion("uModifiedTime in", values, "uModifiedTime");
            return (Criteria) this;
        }

        public Criteria andUModifiedTimeNotIn(List<Date> values) {
            addCriterion("uModifiedTime not in", values, "uModifiedTime");
            return (Criteria) this;
        }

        public Criteria andUModifiedTimeBetween(Date value1, Date value2) {
            addCriterion("uModifiedTime between", value1, value2, "uModifiedTime");
            return (Criteria) this;
        }

        public Criteria andUModifiedTimeNotBetween(Date value1, Date value2) {
            addCriterion("uModifiedTime not between", value1, value2, "uModifiedTime");
            return (Criteria) this;
        }

        public Criteria andUCreateTimeIsNull() {
            addCriterion("uCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andUCreateTimeIsNotNull() {
            addCriterion("uCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUCreateTimeEqualTo(Date value) {
            addCriterion("uCreateTime =", value, "uCreateTime");
            return (Criteria) this;
        }

        public Criteria andUCreateTimeNotEqualTo(Date value) {
            addCriterion("uCreateTime <>", value, "uCreateTime");
            return (Criteria) this;
        }

        public Criteria andUCreateTimeGreaterThan(Date value) {
            addCriterion("uCreateTime >", value, "uCreateTime");
            return (Criteria) this;
        }

        public Criteria andUCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("uCreateTime >=", value, "uCreateTime");
            return (Criteria) this;
        }

        public Criteria andUCreateTimeLessThan(Date value) {
            addCriterion("uCreateTime <", value, "uCreateTime");
            return (Criteria) this;
        }

        public Criteria andUCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("uCreateTime <=", value, "uCreateTime");
            return (Criteria) this;
        }

        public Criteria andUCreateTimeIn(List<Date> values) {
            addCriterion("uCreateTime in", values, "uCreateTime");
            return (Criteria) this;
        }

        public Criteria andUCreateTimeNotIn(List<Date> values) {
            addCriterion("uCreateTime not in", values, "uCreateTime");
            return (Criteria) this;
        }

        public Criteria andUCreateTimeBetween(Date value1, Date value2) {
            addCriterion("uCreateTime between", value1, value2, "uCreateTime");
            return (Criteria) this;
        }

        public Criteria andUCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("uCreateTime not between", value1, value2, "uCreateTime");
            return (Criteria) this;
        }

        public Criteria andULoginIpIsNull() {
            addCriterion("uLoginIp is null");
            return (Criteria) this;
        }

        public Criteria andULoginIpIsNotNull() {
            addCriterion("uLoginIp is not null");
            return (Criteria) this;
        }

        public Criteria andULoginIpEqualTo(String value) {
            addCriterion("uLoginIp =", value, "uLoginIp");
            return (Criteria) this;
        }

        public Criteria andULoginIpNotEqualTo(String value) {
            addCriterion("uLoginIp <>", value, "uLoginIp");
            return (Criteria) this;
        }

        public Criteria andULoginIpGreaterThan(String value) {
            addCriterion("uLoginIp >", value, "uLoginIp");
            return (Criteria) this;
        }

        public Criteria andULoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("uLoginIp >=", value, "uLoginIp");
            return (Criteria) this;
        }

        public Criteria andULoginIpLessThan(String value) {
            addCriterion("uLoginIp <", value, "uLoginIp");
            return (Criteria) this;
        }

        public Criteria andULoginIpLessThanOrEqualTo(String value) {
            addCriterion("uLoginIp <=", value, "uLoginIp");
            return (Criteria) this;
        }

        public Criteria andULoginIpLike(String value) {
            addCriterion("uLoginIp like", value, "uLoginIp");
            return (Criteria) this;
        }

        public Criteria andULoginIpNotLike(String value) {
            addCriterion("uLoginIp not like", value, "uLoginIp");
            return (Criteria) this;
        }

        public Criteria andULoginIpIn(List<String> values) {
            addCriterion("uLoginIp in", values, "uLoginIp");
            return (Criteria) this;
        }

        public Criteria andULoginIpNotIn(List<String> values) {
            addCriterion("uLoginIp not in", values, "uLoginIp");
            return (Criteria) this;
        }

        public Criteria andULoginIpBetween(String value1, String value2) {
            addCriterion("uLoginIp between", value1, value2, "uLoginIp");
            return (Criteria) this;
        }

        public Criteria andULoginIpNotBetween(String value1, String value2) {
            addCriterion("uLoginIp not between", value1, value2, "uLoginIp");
            return (Criteria) this;
        }

        public Criteria andULoginTimesIsNull() {
            addCriterion("uLoginTimes is null");
            return (Criteria) this;
        }

        public Criteria andULoginTimesIsNotNull() {
            addCriterion("uLoginTimes is not null");
            return (Criteria) this;
        }

        public Criteria andULoginTimesEqualTo(Integer value) {
            addCriterion("uLoginTimes =", value, "uLoginTimes");
            return (Criteria) this;
        }

        public Criteria andULoginTimesNotEqualTo(Integer value) {
            addCriterion("uLoginTimes <>", value, "uLoginTimes");
            return (Criteria) this;
        }

        public Criteria andULoginTimesGreaterThan(Integer value) {
            addCriterion("uLoginTimes >", value, "uLoginTimes");
            return (Criteria) this;
        }

        public Criteria andULoginTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("uLoginTimes >=", value, "uLoginTimes");
            return (Criteria) this;
        }

        public Criteria andULoginTimesLessThan(Integer value) {
            addCriterion("uLoginTimes <", value, "uLoginTimes");
            return (Criteria) this;
        }

        public Criteria andULoginTimesLessThanOrEqualTo(Integer value) {
            addCriterion("uLoginTimes <=", value, "uLoginTimes");
            return (Criteria) this;
        }

        public Criteria andULoginTimesIn(List<Integer> values) {
            addCriterion("uLoginTimes in", values, "uLoginTimes");
            return (Criteria) this;
        }

        public Criteria andULoginTimesNotIn(List<Integer> values) {
            addCriterion("uLoginTimes not in", values, "uLoginTimes");
            return (Criteria) this;
        }

        public Criteria andULoginTimesBetween(Integer value1, Integer value2) {
            addCriterion("uLoginTimes between", value1, value2, "uLoginTimes");
            return (Criteria) this;
        }

        public Criteria andULoginTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("uLoginTimes not between", value1, value2, "uLoginTimes");
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