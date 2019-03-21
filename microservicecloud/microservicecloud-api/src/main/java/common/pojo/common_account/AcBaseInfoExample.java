package common.pojo.common_account;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AcBaseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcBaseInfoExample() {
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

        public Criteria andUbInfoIdIsNull() {
            addCriterion("ubInfoId is null");
            return (Criteria) this;
        }

        public Criteria andUbInfoIdIsNotNull() {
            addCriterion("ubInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andUbInfoIdEqualTo(Integer value) {
            addCriterion("ubInfoId =", value, "ubInfoId");
            return (Criteria) this;
        }

        public Criteria andUbInfoIdNotEqualTo(Integer value) {
            addCriterion("ubInfoId <>", value, "ubInfoId");
            return (Criteria) this;
        }

        public Criteria andUbInfoIdGreaterThan(Integer value) {
            addCriterion("ubInfoId >", value, "ubInfoId");
            return (Criteria) this;
        }

        public Criteria andUbInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ubInfoId >=", value, "ubInfoId");
            return (Criteria) this;
        }

        public Criteria andUbInfoIdLessThan(Integer value) {
            addCriterion("ubInfoId <", value, "ubInfoId");
            return (Criteria) this;
        }

        public Criteria andUbInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("ubInfoId <=", value, "ubInfoId");
            return (Criteria) this;
        }

        public Criteria andUbInfoIdIn(List<Integer> values) {
            addCriterion("ubInfoId in", values, "ubInfoId");
            return (Criteria) this;
        }

        public Criteria andUbInfoIdNotIn(List<Integer> values) {
            addCriterion("ubInfoId not in", values, "ubInfoId");
            return (Criteria) this;
        }

        public Criteria andUbInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("ubInfoId between", value1, value2, "ubInfoId");
            return (Criteria) this;
        }

        public Criteria andUbInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ubInfoId not between", value1, value2, "ubInfoId");
            return (Criteria) this;
        }

        public Criteria andUNameIsNull() {
            addCriterion("uName is null");
            return (Criteria) this;
        }

        public Criteria andUNameIsNotNull() {
            addCriterion("uName is not null");
            return (Criteria) this;
        }

        public Criteria andUNameEqualTo(String value) {
            addCriterion("uName =", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotEqualTo(String value) {
            addCriterion("uName <>", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThan(String value) {
            addCriterion("uName >", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThanOrEqualTo(String value) {
            addCriterion("uName >=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThan(String value) {
            addCriterion("uName <", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThanOrEqualTo(String value) {
            addCriterion("uName <=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLike(String value) {
            addCriterion("uName like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotLike(String value) {
            addCriterion("uName not like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameIn(List<String> values) {
            addCriterion("uName in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotIn(List<String> values) {
            addCriterion("uName not in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameBetween(String value1, String value2) {
            addCriterion("uName between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotBetween(String value1, String value2) {
            addCriterion("uName not between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUEmailIsNull() {
            addCriterion("uEmail is null");
            return (Criteria) this;
        }

        public Criteria andUEmailIsNotNull() {
            addCriterion("uEmail is not null");
            return (Criteria) this;
        }

        public Criteria andUEmailEqualTo(String value) {
            addCriterion("uEmail =", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotEqualTo(String value) {
            addCriterion("uEmail <>", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailGreaterThan(String value) {
            addCriterion("uEmail >", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailGreaterThanOrEqualTo(String value) {
            addCriterion("uEmail >=", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLessThan(String value) {
            addCriterion("uEmail <", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLessThanOrEqualTo(String value) {
            addCriterion("uEmail <=", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLike(String value) {
            addCriterion("uEmail like", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotLike(String value) {
            addCriterion("uEmail not like", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailIn(List<String> values) {
            addCriterion("uEmail in", values, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotIn(List<String> values) {
            addCriterion("uEmail not in", values, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailBetween(String value1, String value2) {
            addCriterion("uEmail between", value1, value2, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotBetween(String value1, String value2) {
            addCriterion("uEmail not between", value1, value2, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUTelIsNull() {
            addCriterion("uTel is null");
            return (Criteria) this;
        }

        public Criteria andUTelIsNotNull() {
            addCriterion("uTel is not null");
            return (Criteria) this;
        }

        public Criteria andUTelEqualTo(String value) {
            addCriterion("uTel =", value, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelNotEqualTo(String value) {
            addCriterion("uTel <>", value, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelGreaterThan(String value) {
            addCriterion("uTel >", value, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelGreaterThanOrEqualTo(String value) {
            addCriterion("uTel >=", value, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelLessThan(String value) {
            addCriterion("uTel <", value, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelLessThanOrEqualTo(String value) {
            addCriterion("uTel <=", value, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelLike(String value) {
            addCriterion("uTel like", value, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelNotLike(String value) {
            addCriterion("uTel not like", value, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelIn(List<String> values) {
            addCriterion("uTel in", values, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelNotIn(List<String> values) {
            addCriterion("uTel not in", values, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelBetween(String value1, String value2) {
            addCriterion("uTel between", value1, value2, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelNotBetween(String value1, String value2) {
            addCriterion("uTel not between", value1, value2, "uTel");
            return (Criteria) this;
        }

        public Criteria andUIdcardIsNull() {
            addCriterion("uIdcard is null");
            return (Criteria) this;
        }

        public Criteria andUIdcardIsNotNull() {
            addCriterion("uIdcard is not null");
            return (Criteria) this;
        }

        public Criteria andUIdcardEqualTo(String value) {
            addCriterion("uIdcard =", value, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardNotEqualTo(String value) {
            addCriterion("uIdcard <>", value, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardGreaterThan(String value) {
            addCriterion("uIdcard >", value, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("uIdcard >=", value, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardLessThan(String value) {
            addCriterion("uIdcard <", value, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardLessThanOrEqualTo(String value) {
            addCriterion("uIdcard <=", value, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardLike(String value) {
            addCriterion("uIdcard like", value, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardNotLike(String value) {
            addCriterion("uIdcard not like", value, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardIn(List<String> values) {
            addCriterion("uIdcard in", values, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardNotIn(List<String> values) {
            addCriterion("uIdcard not in", values, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardBetween(String value1, String value2) {
            addCriterion("uIdcard between", value1, value2, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardNotBetween(String value1, String value2) {
            addCriterion("uIdcard not between", value1, value2, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardTypeIsNull() {
            addCriterion("uIdcardType is null");
            return (Criteria) this;
        }

        public Criteria andUIdcardTypeIsNotNull() {
            addCriterion("uIdcardType is not null");
            return (Criteria) this;
        }

        public Criteria andUIdcardTypeEqualTo(Integer value) {
            addCriterion("uIdcardType =", value, "uIdcardType");
            return (Criteria) this;
        }

        public Criteria andUIdcardTypeNotEqualTo(Integer value) {
            addCriterion("uIdcardType <>", value, "uIdcardType");
            return (Criteria) this;
        }

        public Criteria andUIdcardTypeGreaterThan(Integer value) {
            addCriterion("uIdcardType >", value, "uIdcardType");
            return (Criteria) this;
        }

        public Criteria andUIdcardTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("uIdcardType >=", value, "uIdcardType");
            return (Criteria) this;
        }

        public Criteria andUIdcardTypeLessThan(Integer value) {
            addCriterion("uIdcardType <", value, "uIdcardType");
            return (Criteria) this;
        }

        public Criteria andUIdcardTypeLessThanOrEqualTo(Integer value) {
            addCriterion("uIdcardType <=", value, "uIdcardType");
            return (Criteria) this;
        }

        public Criteria andUIdcardTypeIn(List<Integer> values) {
            addCriterion("uIdcardType in", values, "uIdcardType");
            return (Criteria) this;
        }

        public Criteria andUIdcardTypeNotIn(List<Integer> values) {
            addCriterion("uIdcardType not in", values, "uIdcardType");
            return (Criteria) this;
        }

        public Criteria andUIdcardTypeBetween(Integer value1, Integer value2) {
            addCriterion("uIdcardType between", value1, value2, "uIdcardType");
            return (Criteria) this;
        }

        public Criteria andUIdcardTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("uIdcardType not between", value1, value2, "uIdcardType");
            return (Criteria) this;
        }

        public Criteria andUTrueNameIsNull() {
            addCriterion("uTrueName is null");
            return (Criteria) this;
        }

        public Criteria andUTrueNameIsNotNull() {
            addCriterion("uTrueName is not null");
            return (Criteria) this;
        }

        public Criteria andUTrueNameEqualTo(String value) {
            addCriterion("uTrueName =", value, "uTrueName");
            return (Criteria) this;
        }

        public Criteria andUTrueNameNotEqualTo(String value) {
            addCriterion("uTrueName <>", value, "uTrueName");
            return (Criteria) this;
        }

        public Criteria andUTrueNameGreaterThan(String value) {
            addCriterion("uTrueName >", value, "uTrueName");
            return (Criteria) this;
        }

        public Criteria andUTrueNameGreaterThanOrEqualTo(String value) {
            addCriterion("uTrueName >=", value, "uTrueName");
            return (Criteria) this;
        }

        public Criteria andUTrueNameLessThan(String value) {
            addCriterion("uTrueName <", value, "uTrueName");
            return (Criteria) this;
        }

        public Criteria andUTrueNameLessThanOrEqualTo(String value) {
            addCriterion("uTrueName <=", value, "uTrueName");
            return (Criteria) this;
        }

        public Criteria andUTrueNameLike(String value) {
            addCriterion("uTrueName like", value, "uTrueName");
            return (Criteria) this;
        }

        public Criteria andUTrueNameNotLike(String value) {
            addCriterion("uTrueName not like", value, "uTrueName");
            return (Criteria) this;
        }

        public Criteria andUTrueNameIn(List<String> values) {
            addCriterion("uTrueName in", values, "uTrueName");
            return (Criteria) this;
        }

        public Criteria andUTrueNameNotIn(List<String> values) {
            addCriterion("uTrueName not in", values, "uTrueName");
            return (Criteria) this;
        }

        public Criteria andUTrueNameBetween(String value1, String value2) {
            addCriterion("uTrueName between", value1, value2, "uTrueName");
            return (Criteria) this;
        }

        public Criteria andUTrueNameNotBetween(String value1, String value2) {
            addCriterion("uTrueName not between", value1, value2, "uTrueName");
            return (Criteria) this;
        }

        public Criteria andUGenderIsNull() {
            addCriterion("uGender is null");
            return (Criteria) this;
        }

        public Criteria andUGenderIsNotNull() {
            addCriterion("uGender is not null");
            return (Criteria) this;
        }

        public Criteria andUGenderEqualTo(Integer value) {
            addCriterion("uGender =", value, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderNotEqualTo(Integer value) {
            addCriterion("uGender <>", value, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderGreaterThan(Integer value) {
            addCriterion("uGender >", value, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("uGender >=", value, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderLessThan(Integer value) {
            addCriterion("uGender <", value, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderLessThanOrEqualTo(Integer value) {
            addCriterion("uGender <=", value, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderIn(List<Integer> values) {
            addCriterion("uGender in", values, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderNotIn(List<Integer> values) {
            addCriterion("uGender not in", values, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderBetween(Integer value1, Integer value2) {
            addCriterion("uGender between", value1, value2, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("uGender not between", value1, value2, "uGender");
            return (Criteria) this;
        }

        public Criteria andUBirthdayIsNull() {
            addCriterion("uBirthday is null");
            return (Criteria) this;
        }

        public Criteria andUBirthdayIsNotNull() {
            addCriterion("uBirthday is not null");
            return (Criteria) this;
        }

        public Criteria andUBirthdayEqualTo(Date value) {
            addCriterion("uBirthday =", value, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayNotEqualTo(Date value) {
            addCriterion("uBirthday <>", value, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayGreaterThan(Date value) {
            addCriterion("uBirthday >", value, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("uBirthday >=", value, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayLessThan(Date value) {
            addCriterion("uBirthday <", value, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("uBirthday <=", value, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayIn(List<Date> values) {
            addCriterion("uBirthday in", values, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayNotIn(List<Date> values) {
            addCriterion("uBirthday not in", values, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayBetween(Date value1, Date value2) {
            addCriterion("uBirthday between", value1, value2, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("uBirthday not between", value1, value2, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUDegreeIsNull() {
            addCriterion("uDegree is null");
            return (Criteria) this;
        }

        public Criteria andUDegreeIsNotNull() {
            addCriterion("uDegree is not null");
            return (Criteria) this;
        }

        public Criteria andUDegreeEqualTo(String value) {
            addCriterion("uDegree =", value, "uDegree");
            return (Criteria) this;
        }

        public Criteria andUDegreeNotEqualTo(String value) {
            addCriterion("uDegree <>", value, "uDegree");
            return (Criteria) this;
        }

        public Criteria andUDegreeGreaterThan(String value) {
            addCriterion("uDegree >", value, "uDegree");
            return (Criteria) this;
        }

        public Criteria andUDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("uDegree >=", value, "uDegree");
            return (Criteria) this;
        }

        public Criteria andUDegreeLessThan(String value) {
            addCriterion("uDegree <", value, "uDegree");
            return (Criteria) this;
        }

        public Criteria andUDegreeLessThanOrEqualTo(String value) {
            addCriterion("uDegree <=", value, "uDegree");
            return (Criteria) this;
        }

        public Criteria andUDegreeLike(String value) {
            addCriterion("uDegree like", value, "uDegree");
            return (Criteria) this;
        }

        public Criteria andUDegreeNotLike(String value) {
            addCriterion("uDegree not like", value, "uDegree");
            return (Criteria) this;
        }

        public Criteria andUDegreeIn(List<String> values) {
            addCriterion("uDegree in", values, "uDegree");
            return (Criteria) this;
        }

        public Criteria andUDegreeNotIn(List<String> values) {
            addCriterion("uDegree not in", values, "uDegree");
            return (Criteria) this;
        }

        public Criteria andUDegreeBetween(String value1, String value2) {
            addCriterion("uDegree between", value1, value2, "uDegree");
            return (Criteria) this;
        }

        public Criteria andUDegreeNotBetween(String value1, String value2) {
            addCriterion("uDegree not between", value1, value2, "uDegree");
            return (Criteria) this;
        }

        public Criteria andULocationIsNull() {
            addCriterion("uLocation is null");
            return (Criteria) this;
        }

        public Criteria andULocationIsNotNull() {
            addCriterion("uLocation is not null");
            return (Criteria) this;
        }

        public Criteria andULocationEqualTo(String value) {
            addCriterion("uLocation =", value, "uLocation");
            return (Criteria) this;
        }

        public Criteria andULocationNotEqualTo(String value) {
            addCriterion("uLocation <>", value, "uLocation");
            return (Criteria) this;
        }

        public Criteria andULocationGreaterThan(String value) {
            addCriterion("uLocation >", value, "uLocation");
            return (Criteria) this;
        }

        public Criteria andULocationGreaterThanOrEqualTo(String value) {
            addCriterion("uLocation >=", value, "uLocation");
            return (Criteria) this;
        }

        public Criteria andULocationLessThan(String value) {
            addCriterion("uLocation <", value, "uLocation");
            return (Criteria) this;
        }

        public Criteria andULocationLessThanOrEqualTo(String value) {
            addCriterion("uLocation <=", value, "uLocation");
            return (Criteria) this;
        }

        public Criteria andULocationLike(String value) {
            addCriterion("uLocation like", value, "uLocation");
            return (Criteria) this;
        }

        public Criteria andULocationNotLike(String value) {
            addCriterion("uLocation not like", value, "uLocation");
            return (Criteria) this;
        }

        public Criteria andULocationIn(List<String> values) {
            addCriterion("uLocation in", values, "uLocation");
            return (Criteria) this;
        }

        public Criteria andULocationNotIn(List<String> values) {
            addCriterion("uLocation not in", values, "uLocation");
            return (Criteria) this;
        }

        public Criteria andULocationBetween(String value1, String value2) {
            addCriterion("uLocation between", value1, value2, "uLocation");
            return (Criteria) this;
        }

        public Criteria andULocationNotBetween(String value1, String value2) {
            addCriterion("uLocation not between", value1, value2, "uLocation");
            return (Criteria) this;
        }

        public Criteria andUCompanyIsNull() {
            addCriterion("uCompany is null");
            return (Criteria) this;
        }

        public Criteria andUCompanyIsNotNull() {
            addCriterion("uCompany is not null");
            return (Criteria) this;
        }

        public Criteria andUCompanyEqualTo(String value) {
            addCriterion("uCompany =", value, "uCompany");
            return (Criteria) this;
        }

        public Criteria andUCompanyNotEqualTo(String value) {
            addCriterion("uCompany <>", value, "uCompany");
            return (Criteria) this;
        }

        public Criteria andUCompanyGreaterThan(String value) {
            addCriterion("uCompany >", value, "uCompany");
            return (Criteria) this;
        }

        public Criteria andUCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("uCompany >=", value, "uCompany");
            return (Criteria) this;
        }

        public Criteria andUCompanyLessThan(String value) {
            addCriterion("uCompany <", value, "uCompany");
            return (Criteria) this;
        }

        public Criteria andUCompanyLessThanOrEqualTo(String value) {
            addCriterion("uCompany <=", value, "uCompany");
            return (Criteria) this;
        }

        public Criteria andUCompanyLike(String value) {
            addCriterion("uCompany like", value, "uCompany");
            return (Criteria) this;
        }

        public Criteria andUCompanyNotLike(String value) {
            addCriterion("uCompany not like", value, "uCompany");
            return (Criteria) this;
        }

        public Criteria andUCompanyIn(List<String> values) {
            addCriterion("uCompany in", values, "uCompany");
            return (Criteria) this;
        }

        public Criteria andUCompanyNotIn(List<String> values) {
            addCriterion("uCompany not in", values, "uCompany");
            return (Criteria) this;
        }

        public Criteria andUCompanyBetween(String value1, String value2) {
            addCriterion("uCompany between", value1, value2, "uCompany");
            return (Criteria) this;
        }

        public Criteria andUCompanyNotBetween(String value1, String value2) {
            addCriterion("uCompany not between", value1, value2, "uCompany");
            return (Criteria) this;
        }

        public Criteria andUPositionIsNull() {
            addCriterion("uPosition is null");
            return (Criteria) this;
        }

        public Criteria andUPositionIsNotNull() {
            addCriterion("uPosition is not null");
            return (Criteria) this;
        }

        public Criteria andUPositionEqualTo(String value) {
            addCriterion("uPosition =", value, "uPosition");
            return (Criteria) this;
        }

        public Criteria andUPositionNotEqualTo(String value) {
            addCriterion("uPosition <>", value, "uPosition");
            return (Criteria) this;
        }

        public Criteria andUPositionGreaterThan(String value) {
            addCriterion("uPosition >", value, "uPosition");
            return (Criteria) this;
        }

        public Criteria andUPositionGreaterThanOrEqualTo(String value) {
            addCriterion("uPosition >=", value, "uPosition");
            return (Criteria) this;
        }

        public Criteria andUPositionLessThan(String value) {
            addCriterion("uPosition <", value, "uPosition");
            return (Criteria) this;
        }

        public Criteria andUPositionLessThanOrEqualTo(String value) {
            addCriterion("uPosition <=", value, "uPosition");
            return (Criteria) this;
        }

        public Criteria andUPositionLike(String value) {
            addCriterion("uPosition like", value, "uPosition");
            return (Criteria) this;
        }

        public Criteria andUPositionNotLike(String value) {
            addCriterion("uPosition not like", value, "uPosition");
            return (Criteria) this;
        }

        public Criteria andUPositionIn(List<String> values) {
            addCriterion("uPosition in", values, "uPosition");
            return (Criteria) this;
        }

        public Criteria andUPositionNotIn(List<String> values) {
            addCriterion("uPosition not in", values, "uPosition");
            return (Criteria) this;
        }

        public Criteria andUPositionBetween(String value1, String value2) {
            addCriterion("uPosition between", value1, value2, "uPosition");
            return (Criteria) this;
        }

        public Criteria andUPositionNotBetween(String value1, String value2) {
            addCriterion("uPosition not between", value1, value2, "uPosition");
            return (Criteria) this;
        }

        public Criteria andULatitudeIsNull() {
            addCriterion("uLatitude is null");
            return (Criteria) this;
        }

        public Criteria andULatitudeIsNotNull() {
            addCriterion("uLatitude is not null");
            return (Criteria) this;
        }

        public Criteria andULatitudeEqualTo(Double value) {
            addCriterion("uLatitude =", value, "uLatitude");
            return (Criteria) this;
        }

        public Criteria andULatitudeNotEqualTo(Double value) {
            addCriterion("uLatitude <>", value, "uLatitude");
            return (Criteria) this;
        }

        public Criteria andULatitudeGreaterThan(Double value) {
            addCriterion("uLatitude >", value, "uLatitude");
            return (Criteria) this;
        }

        public Criteria andULatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("uLatitude >=", value, "uLatitude");
            return (Criteria) this;
        }

        public Criteria andULatitudeLessThan(Double value) {
            addCriterion("uLatitude <", value, "uLatitude");
            return (Criteria) this;
        }

        public Criteria andULatitudeLessThanOrEqualTo(Double value) {
            addCriterion("uLatitude <=", value, "uLatitude");
            return (Criteria) this;
        }

        public Criteria andULatitudeIn(List<Double> values) {
            addCriterion("uLatitude in", values, "uLatitude");
            return (Criteria) this;
        }

        public Criteria andULatitudeNotIn(List<Double> values) {
            addCriterion("uLatitude not in", values, "uLatitude");
            return (Criteria) this;
        }

        public Criteria andULatitudeBetween(Double value1, Double value2) {
            addCriterion("uLatitude between", value1, value2, "uLatitude");
            return (Criteria) this;
        }

        public Criteria andULatitudeNotBetween(Double value1, Double value2) {
            addCriterion("uLatitude not between", value1, value2, "uLatitude");
            return (Criteria) this;
        }

        public Criteria andULongtitudeIsNull() {
            addCriterion("uLongtitude is null");
            return (Criteria) this;
        }

        public Criteria andULongtitudeIsNotNull() {
            addCriterion("uLongtitude is not null");
            return (Criteria) this;
        }

        public Criteria andULongtitudeEqualTo(Double value) {
            addCriterion("uLongtitude =", value, "uLongtitude");
            return (Criteria) this;
        }

        public Criteria andULongtitudeNotEqualTo(Double value) {
            addCriterion("uLongtitude <>", value, "uLongtitude");
            return (Criteria) this;
        }

        public Criteria andULongtitudeGreaterThan(Double value) {
            addCriterion("uLongtitude >", value, "uLongtitude");
            return (Criteria) this;
        }

        public Criteria andULongtitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("uLongtitude >=", value, "uLongtitude");
            return (Criteria) this;
        }

        public Criteria andULongtitudeLessThan(Double value) {
            addCriterion("uLongtitude <", value, "uLongtitude");
            return (Criteria) this;
        }

        public Criteria andULongtitudeLessThanOrEqualTo(Double value) {
            addCriterion("uLongtitude <=", value, "uLongtitude");
            return (Criteria) this;
        }

        public Criteria andULongtitudeIn(List<Double> values) {
            addCriterion("uLongtitude in", values, "uLongtitude");
            return (Criteria) this;
        }

        public Criteria andULongtitudeNotIn(List<Double> values) {
            addCriterion("uLongtitude not in", values, "uLongtitude");
            return (Criteria) this;
        }

        public Criteria andULongtitudeBetween(Double value1, Double value2) {
            addCriterion("uLongtitude between", value1, value2, "uLongtitude");
            return (Criteria) this;
        }

        public Criteria andULongtitudeNotBetween(Double value1, Double value2) {
            addCriterion("uLongtitude not between", value1, value2, "uLongtitude");
            return (Criteria) this;
        }

        public Criteria andUImageIsNull() {
            addCriterion("uImage is null");
            return (Criteria) this;
        }

        public Criteria andUImageIsNotNull() {
            addCriterion("uImage is not null");
            return (Criteria) this;
        }

        public Criteria andUImageEqualTo(String value) {
            addCriterion("uImage =", value, "uImage");
            return (Criteria) this;
        }

        public Criteria andUImageNotEqualTo(String value) {
            addCriterion("uImage <>", value, "uImage");
            return (Criteria) this;
        }

        public Criteria andUImageGreaterThan(String value) {
            addCriterion("uImage >", value, "uImage");
            return (Criteria) this;
        }

        public Criteria andUImageGreaterThanOrEqualTo(String value) {
            addCriterion("uImage >=", value, "uImage");
            return (Criteria) this;
        }

        public Criteria andUImageLessThan(String value) {
            addCriterion("uImage <", value, "uImage");
            return (Criteria) this;
        }

        public Criteria andUImageLessThanOrEqualTo(String value) {
            addCriterion("uImage <=", value, "uImage");
            return (Criteria) this;
        }

        public Criteria andUImageLike(String value) {
            addCriterion("uImage like", value, "uImage");
            return (Criteria) this;
        }

        public Criteria andUImageNotLike(String value) {
            addCriterion("uImage not like", value, "uImage");
            return (Criteria) this;
        }

        public Criteria andUImageIn(List<String> values) {
            addCriterion("uImage in", values, "uImage");
            return (Criteria) this;
        }

        public Criteria andUImageNotIn(List<String> values) {
            addCriterion("uImage not in", values, "uImage");
            return (Criteria) this;
        }

        public Criteria andUImageBetween(String value1, String value2) {
            addCriterion("uImage between", value1, value2, "uImage");
            return (Criteria) this;
        }

        public Criteria andUImageNotBetween(String value1, String value2) {
            addCriterion("uImage not between", value1, value2, "uImage");
            return (Criteria) this;
        }

        public Criteria andUSourceIsNull() {
            addCriterion("uSource is null");
            return (Criteria) this;
        }

        public Criteria andUSourceIsNotNull() {
            addCriterion("uSource is not null");
            return (Criteria) this;
        }

        public Criteria andUSourceEqualTo(String value) {
            addCriterion("uSource =", value, "uSource");
            return (Criteria) this;
        }

        public Criteria andUSourceNotEqualTo(String value) {
            addCriterion("uSource <>", value, "uSource");
            return (Criteria) this;
        }

        public Criteria andUSourceGreaterThan(String value) {
            addCriterion("uSource >", value, "uSource");
            return (Criteria) this;
        }

        public Criteria andUSourceGreaterThanOrEqualTo(String value) {
            addCriterion("uSource >=", value, "uSource");
            return (Criteria) this;
        }

        public Criteria andUSourceLessThan(String value) {
            addCriterion("uSource <", value, "uSource");
            return (Criteria) this;
        }

        public Criteria andUSourceLessThanOrEqualTo(String value) {
            addCriterion("uSource <=", value, "uSource");
            return (Criteria) this;
        }

        public Criteria andUSourceLike(String value) {
            addCriterion("uSource like", value, "uSource");
            return (Criteria) this;
        }

        public Criteria andUSourceNotLike(String value) {
            addCriterion("uSource not like", value, "uSource");
            return (Criteria) this;
        }

        public Criteria andUSourceIn(List<String> values) {
            addCriterion("uSource in", values, "uSource");
            return (Criteria) this;
        }

        public Criteria andUSourceNotIn(List<String> values) {
            addCriterion("uSource not in", values, "uSource");
            return (Criteria) this;
        }

        public Criteria andUSourceBetween(String value1, String value2) {
            addCriterion("uSource between", value1, value2, "uSource");
            return (Criteria) this;
        }

        public Criteria andUSourceNotBetween(String value1, String value2) {
            addCriterion("uSource not between", value1, value2, "uSource");
            return (Criteria) this;
        }

        public Criteria andUAccountIdIsNull() {
            addCriterion("uAccountId is null");
            return (Criteria) this;
        }

        public Criteria andUAccountIdIsNotNull() {
            addCriterion("uAccountId is not null");
            return (Criteria) this;
        }

        public Criteria andUAccountIdEqualTo(Integer value) {
            addCriterion("uAccountId =", value, "uAccountId");
            return (Criteria) this;
        }

        public Criteria andUAccountIdNotEqualTo(Integer value) {
            addCriterion("uAccountId <>", value, "uAccountId");
            return (Criteria) this;
        }

        public Criteria andUAccountIdGreaterThan(Integer value) {
            addCriterion("uAccountId >", value, "uAccountId");
            return (Criteria) this;
        }

        public Criteria andUAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("uAccountId >=", value, "uAccountId");
            return (Criteria) this;
        }

        public Criteria andUAccountIdLessThan(Integer value) {
            addCriterion("uAccountId <", value, "uAccountId");
            return (Criteria) this;
        }

        public Criteria andUAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("uAccountId <=", value, "uAccountId");
            return (Criteria) this;
        }

        public Criteria andUAccountIdIn(List<Integer> values) {
            addCriterion("uAccountId in", values, "uAccountId");
            return (Criteria) this;
        }

        public Criteria andUAccountIdNotIn(List<Integer> values) {
            addCriterion("uAccountId not in", values, "uAccountId");
            return (Criteria) this;
        }

        public Criteria andUAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("uAccountId between", value1, value2, "uAccountId");
            return (Criteria) this;
        }

        public Criteria andUAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("uAccountId not between", value1, value2, "uAccountId");
            return (Criteria) this;
        }

        public Criteria andUHeightIsNull() {
            addCriterion("uHeight is null");
            return (Criteria) this;
        }

        public Criteria andUHeightIsNotNull() {
            addCriterion("uHeight is not null");
            return (Criteria) this;
        }

        public Criteria andUHeightEqualTo(Integer value) {
            addCriterion("uHeight =", value, "uHeight");
            return (Criteria) this;
        }

        public Criteria andUHeightNotEqualTo(Integer value) {
            addCriterion("uHeight <>", value, "uHeight");
            return (Criteria) this;
        }

        public Criteria andUHeightGreaterThan(Integer value) {
            addCriterion("uHeight >", value, "uHeight");
            return (Criteria) this;
        }

        public Criteria andUHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("uHeight >=", value, "uHeight");
            return (Criteria) this;
        }

        public Criteria andUHeightLessThan(Integer value) {
            addCriterion("uHeight <", value, "uHeight");
            return (Criteria) this;
        }

        public Criteria andUHeightLessThanOrEqualTo(Integer value) {
            addCriterion("uHeight <=", value, "uHeight");
            return (Criteria) this;
        }

        public Criteria andUHeightIn(List<Integer> values) {
            addCriterion("uHeight in", values, "uHeight");
            return (Criteria) this;
        }

        public Criteria andUHeightNotIn(List<Integer> values) {
            addCriterion("uHeight not in", values, "uHeight");
            return (Criteria) this;
        }

        public Criteria andUHeightBetween(Integer value1, Integer value2) {
            addCriterion("uHeight between", value1, value2, "uHeight");
            return (Criteria) this;
        }

        public Criteria andUHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("uHeight not between", value1, value2, "uHeight");
            return (Criteria) this;
        }

        public Criteria andUWeightIsNull() {
            addCriterion("uWeight is null");
            return (Criteria) this;
        }

        public Criteria andUWeightIsNotNull() {
            addCriterion("uWeight is not null");
            return (Criteria) this;
        }

        public Criteria andUWeightEqualTo(Integer value) {
            addCriterion("uWeight =", value, "uWeight");
            return (Criteria) this;
        }

        public Criteria andUWeightNotEqualTo(Integer value) {
            addCriterion("uWeight <>", value, "uWeight");
            return (Criteria) this;
        }

        public Criteria andUWeightGreaterThan(Integer value) {
            addCriterion("uWeight >", value, "uWeight");
            return (Criteria) this;
        }

        public Criteria andUWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("uWeight >=", value, "uWeight");
            return (Criteria) this;
        }

        public Criteria andUWeightLessThan(Integer value) {
            addCriterion("uWeight <", value, "uWeight");
            return (Criteria) this;
        }

        public Criteria andUWeightLessThanOrEqualTo(Integer value) {
            addCriterion("uWeight <=", value, "uWeight");
            return (Criteria) this;
        }

        public Criteria andUWeightIn(List<Integer> values) {
            addCriterion("uWeight in", values, "uWeight");
            return (Criteria) this;
        }

        public Criteria andUWeightNotIn(List<Integer> values) {
            addCriterion("uWeight not in", values, "uWeight");
            return (Criteria) this;
        }

        public Criteria andUWeightBetween(Integer value1, Integer value2) {
            addCriterion("uWeight between", value1, value2, "uWeight");
            return (Criteria) this;
        }

        public Criteria andUWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("uWeight not between", value1, value2, "uWeight");
            return (Criteria) this;
        }

        public Criteria andUAreaIdIsNull() {
            addCriterion("uAreaId is null");
            return (Criteria) this;
        }

        public Criteria andUAreaIdIsNotNull() {
            addCriterion("uAreaId is not null");
            return (Criteria) this;
        }

        public Criteria andUAreaIdEqualTo(Integer value) {
            addCriterion("uAreaId =", value, "uAreaId");
            return (Criteria) this;
        }

        public Criteria andUAreaIdNotEqualTo(Integer value) {
            addCriterion("uAreaId <>", value, "uAreaId");
            return (Criteria) this;
        }

        public Criteria andUAreaIdGreaterThan(Integer value) {
            addCriterion("uAreaId >", value, "uAreaId");
            return (Criteria) this;
        }

        public Criteria andUAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("uAreaId >=", value, "uAreaId");
            return (Criteria) this;
        }

        public Criteria andUAreaIdLessThan(Integer value) {
            addCriterion("uAreaId <", value, "uAreaId");
            return (Criteria) this;
        }

        public Criteria andUAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("uAreaId <=", value, "uAreaId");
            return (Criteria) this;
        }

        public Criteria andUAreaIdIn(List<Integer> values) {
            addCriterion("uAreaId in", values, "uAreaId");
            return (Criteria) this;
        }

        public Criteria andUAreaIdNotIn(List<Integer> values) {
            addCriterion("uAreaId not in", values, "uAreaId");
            return (Criteria) this;
        }

        public Criteria andUAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("uAreaId between", value1, value2, "uAreaId");
            return (Criteria) this;
        }

        public Criteria andUAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("uAreaId not between", value1, value2, "uAreaId");
            return (Criteria) this;
        }

        public Criteria andUCharacterIsNull() {
            addCriterion("uCharacter is null");
            return (Criteria) this;
        }

        public Criteria andUCharacterIsNotNull() {
            addCriterion("uCharacter is not null");
            return (Criteria) this;
        }

        public Criteria andUCharacterEqualTo(String value) {
            addCriterion("uCharacter =", value, "uCharacter");
            return (Criteria) this;
        }

        public Criteria andUCharacterNotEqualTo(String value) {
            addCriterion("uCharacter <>", value, "uCharacter");
            return (Criteria) this;
        }

        public Criteria andUCharacterGreaterThan(String value) {
            addCriterion("uCharacter >", value, "uCharacter");
            return (Criteria) this;
        }

        public Criteria andUCharacterGreaterThanOrEqualTo(String value) {
            addCriterion("uCharacter >=", value, "uCharacter");
            return (Criteria) this;
        }

        public Criteria andUCharacterLessThan(String value) {
            addCriterion("uCharacter <", value, "uCharacter");
            return (Criteria) this;
        }

        public Criteria andUCharacterLessThanOrEqualTo(String value) {
            addCriterion("uCharacter <=", value, "uCharacter");
            return (Criteria) this;
        }

        public Criteria andUCharacterLike(String value) {
            addCriterion("uCharacter like", value, "uCharacter");
            return (Criteria) this;
        }

        public Criteria andUCharacterNotLike(String value) {
            addCriterion("uCharacter not like", value, "uCharacter");
            return (Criteria) this;
        }

        public Criteria andUCharacterIn(List<String> values) {
            addCriterion("uCharacter in", values, "uCharacter");
            return (Criteria) this;
        }

        public Criteria andUCharacterNotIn(List<String> values) {
            addCriterion("uCharacter not in", values, "uCharacter");
            return (Criteria) this;
        }

        public Criteria andUCharacterBetween(String value1, String value2) {
            addCriterion("uCharacter between", value1, value2, "uCharacter");
            return (Criteria) this;
        }

        public Criteria andUCharacterNotBetween(String value1, String value2) {
            addCriterion("uCharacter not between", value1, value2, "uCharacter");
            return (Criteria) this;
        }

        public Criteria andUUpdateTimeIsNull() {
            addCriterion("uUpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andUUpdateTimeIsNotNull() {
            addCriterion("uUpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUUpdateTimeEqualTo(Date value) {
            addCriterion("uUpdateTime =", value, "uUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUUpdateTimeNotEqualTo(Date value) {
            addCriterion("uUpdateTime <>", value, "uUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUUpdateTimeGreaterThan(Date value) {
            addCriterion("uUpdateTime >", value, "uUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("uUpdateTime >=", value, "uUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUUpdateTimeLessThan(Date value) {
            addCriterion("uUpdateTime <", value, "uUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("uUpdateTime <=", value, "uUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUUpdateTimeIn(List<Date> values) {
            addCriterion("uUpdateTime in", values, "uUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUUpdateTimeNotIn(List<Date> values) {
            addCriterion("uUpdateTime not in", values, "uUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("uUpdateTime between", value1, value2, "uUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("uUpdateTime not between", value1, value2, "uUpdateTime");
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

        public Criteria andUSignatureIsNull() {
            addCriterion("uSignature is null");
            return (Criteria) this;
        }

        public Criteria andUSignatureIsNotNull() {
            addCriterion("uSignature is not null");
            return (Criteria) this;
        }

        public Criteria andUSignatureEqualTo(String value) {
            addCriterion("uSignature =", value, "uSignature");
            return (Criteria) this;
        }

        public Criteria andUSignatureNotEqualTo(String value) {
            addCriterion("uSignature <>", value, "uSignature");
            return (Criteria) this;
        }

        public Criteria andUSignatureGreaterThan(String value) {
            addCriterion("uSignature >", value, "uSignature");
            return (Criteria) this;
        }

        public Criteria andUSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("uSignature >=", value, "uSignature");
            return (Criteria) this;
        }

        public Criteria andUSignatureLessThan(String value) {
            addCriterion("uSignature <", value, "uSignature");
            return (Criteria) this;
        }

        public Criteria andUSignatureLessThanOrEqualTo(String value) {
            addCriterion("uSignature <=", value, "uSignature");
            return (Criteria) this;
        }

        public Criteria andUSignatureLike(String value) {
            addCriterion("uSignature like", value, "uSignature");
            return (Criteria) this;
        }

        public Criteria andUSignatureNotLike(String value) {
            addCriterion("uSignature not like", value, "uSignature");
            return (Criteria) this;
        }

        public Criteria andUSignatureIn(List<String> values) {
            addCriterion("uSignature in", values, "uSignature");
            return (Criteria) this;
        }

        public Criteria andUSignatureNotIn(List<String> values) {
            addCriterion("uSignature not in", values, "uSignature");
            return (Criteria) this;
        }

        public Criteria andUSignatureBetween(String value1, String value2) {
            addCriterion("uSignature between", value1, value2, "uSignature");
            return (Criteria) this;
        }

        public Criteria andUSignatureNotBetween(String value1, String value2) {
            addCriterion("uSignature not between", value1, value2, "uSignature");
            return (Criteria) this;
        }

        public Criteria andULabelIsNull() {
            addCriterion("uLabel is null");
            return (Criteria) this;
        }

        public Criteria andULabelIsNotNull() {
            addCriterion("uLabel is not null");
            return (Criteria) this;
        }

        public Criteria andULabelEqualTo(String value) {
            addCriterion("uLabel =", value, "uLabel");
            return (Criteria) this;
        }

        public Criteria andULabelNotEqualTo(String value) {
            addCriterion("uLabel <>", value, "uLabel");
            return (Criteria) this;
        }

        public Criteria andULabelGreaterThan(String value) {
            addCriterion("uLabel >", value, "uLabel");
            return (Criteria) this;
        }

        public Criteria andULabelGreaterThanOrEqualTo(String value) {
            addCriterion("uLabel >=", value, "uLabel");
            return (Criteria) this;
        }

        public Criteria andULabelLessThan(String value) {
            addCriterion("uLabel <", value, "uLabel");
            return (Criteria) this;
        }

        public Criteria andULabelLessThanOrEqualTo(String value) {
            addCriterion("uLabel <=", value, "uLabel");
            return (Criteria) this;
        }

        public Criteria andULabelLike(String value) {
            addCriterion("uLabel like", value, "uLabel");
            return (Criteria) this;
        }

        public Criteria andULabelNotLike(String value) {
            addCriterion("uLabel not like", value, "uLabel");
            return (Criteria) this;
        }

        public Criteria andULabelIn(List<String> values) {
            addCriterion("uLabel in", values, "uLabel");
            return (Criteria) this;
        }

        public Criteria andULabelNotIn(List<String> values) {
            addCriterion("uLabel not in", values, "uLabel");
            return (Criteria) this;
        }

        public Criteria andULabelBetween(String value1, String value2) {
            addCriterion("uLabel between", value1, value2, "uLabel");
            return (Criteria) this;
        }

        public Criteria andULabelNotBetween(String value1, String value2) {
            addCriterion("uLabel not between", value1, value2, "uLabel");
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