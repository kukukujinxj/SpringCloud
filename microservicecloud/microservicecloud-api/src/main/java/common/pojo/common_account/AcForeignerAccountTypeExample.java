package common.pojo.common_account;

import java.util.ArrayList;
import java.util.List;

public class AcForeignerAccountTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcForeignerAccountTypeExample() {
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

        public Criteria andFAccountIdIsNull() {
            addCriterion("fAccountId is null");
            return (Criteria) this;
        }

        public Criteria andFAccountIdIsNotNull() {
            addCriterion("fAccountId is not null");
            return (Criteria) this;
        }

        public Criteria andFAccountIdEqualTo(Integer value) {
            addCriterion("fAccountId =", value, "fAccountId");
            return (Criteria) this;
        }

        public Criteria andFAccountIdNotEqualTo(Integer value) {
            addCriterion("fAccountId <>", value, "fAccountId");
            return (Criteria) this;
        }

        public Criteria andFAccountIdGreaterThan(Integer value) {
            addCriterion("fAccountId >", value, "fAccountId");
            return (Criteria) this;
        }

        public Criteria andFAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fAccountId >=", value, "fAccountId");
            return (Criteria) this;
        }

        public Criteria andFAccountIdLessThan(Integer value) {
            addCriterion("fAccountId <", value, "fAccountId");
            return (Criteria) this;
        }

        public Criteria andFAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("fAccountId <=", value, "fAccountId");
            return (Criteria) this;
        }

        public Criteria andFAccountIdIn(List<Integer> values) {
            addCriterion("fAccountId in", values, "fAccountId");
            return (Criteria) this;
        }

        public Criteria andFAccountIdNotIn(List<Integer> values) {
            addCriterion("fAccountId not in", values, "fAccountId");
            return (Criteria) this;
        }

        public Criteria andFAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("fAccountId between", value1, value2, "fAccountId");
            return (Criteria) this;
        }

        public Criteria andFAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fAccountId not between", value1, value2, "fAccountId");
            return (Criteria) this;
        }

        public Criteria andFAccountNameIsNull() {
            addCriterion("fAccountName is null");
            return (Criteria) this;
        }

        public Criteria andFAccountNameIsNotNull() {
            addCriterion("fAccountName is not null");
            return (Criteria) this;
        }

        public Criteria andFAccountNameEqualTo(String value) {
            addCriterion("fAccountName =", value, "fAccountName");
            return (Criteria) this;
        }

        public Criteria andFAccountNameNotEqualTo(String value) {
            addCriterion("fAccountName <>", value, "fAccountName");
            return (Criteria) this;
        }

        public Criteria andFAccountNameGreaterThan(String value) {
            addCriterion("fAccountName >", value, "fAccountName");
            return (Criteria) this;
        }

        public Criteria andFAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("fAccountName >=", value, "fAccountName");
            return (Criteria) this;
        }

        public Criteria andFAccountNameLessThan(String value) {
            addCriterion("fAccountName <", value, "fAccountName");
            return (Criteria) this;
        }

        public Criteria andFAccountNameLessThanOrEqualTo(String value) {
            addCriterion("fAccountName <=", value, "fAccountName");
            return (Criteria) this;
        }

        public Criteria andFAccountNameLike(String value) {
            addCriterion("fAccountName like", value, "fAccountName");
            return (Criteria) this;
        }

        public Criteria andFAccountNameNotLike(String value) {
            addCriterion("fAccountName not like", value, "fAccountName");
            return (Criteria) this;
        }

        public Criteria andFAccountNameIn(List<String> values) {
            addCriterion("fAccountName in", values, "fAccountName");
            return (Criteria) this;
        }

        public Criteria andFAccountNameNotIn(List<String> values) {
            addCriterion("fAccountName not in", values, "fAccountName");
            return (Criteria) this;
        }

        public Criteria andFAccountNameBetween(String value1, String value2) {
            addCriterion("fAccountName between", value1, value2, "fAccountName");
            return (Criteria) this;
        }

        public Criteria andFAccountNameNotBetween(String value1, String value2) {
            addCriterion("fAccountName not between", value1, value2, "fAccountName");
            return (Criteria) this;
        }

        public Criteria andFAccountKeyIsNull() {
            addCriterion("fAccountKey is null");
            return (Criteria) this;
        }

        public Criteria andFAccountKeyIsNotNull() {
            addCriterion("fAccountKey is not null");
            return (Criteria) this;
        }

        public Criteria andFAccountKeyEqualTo(String value) {
            addCriterion("fAccountKey =", value, "fAccountKey");
            return (Criteria) this;
        }

        public Criteria andFAccountKeyNotEqualTo(String value) {
            addCriterion("fAccountKey <>", value, "fAccountKey");
            return (Criteria) this;
        }

        public Criteria andFAccountKeyGreaterThan(String value) {
            addCriterion("fAccountKey >", value, "fAccountKey");
            return (Criteria) this;
        }

        public Criteria andFAccountKeyGreaterThanOrEqualTo(String value) {
            addCriterion("fAccountKey >=", value, "fAccountKey");
            return (Criteria) this;
        }

        public Criteria andFAccountKeyLessThan(String value) {
            addCriterion("fAccountKey <", value, "fAccountKey");
            return (Criteria) this;
        }

        public Criteria andFAccountKeyLessThanOrEqualTo(String value) {
            addCriterion("fAccountKey <=", value, "fAccountKey");
            return (Criteria) this;
        }

        public Criteria andFAccountKeyLike(String value) {
            addCriterion("fAccountKey like", value, "fAccountKey");
            return (Criteria) this;
        }

        public Criteria andFAccountKeyNotLike(String value) {
            addCriterion("fAccountKey not like", value, "fAccountKey");
            return (Criteria) this;
        }

        public Criteria andFAccountKeyIn(List<String> values) {
            addCriterion("fAccountKey in", values, "fAccountKey");
            return (Criteria) this;
        }

        public Criteria andFAccountKeyNotIn(List<String> values) {
            addCriterion("fAccountKey not in", values, "fAccountKey");
            return (Criteria) this;
        }

        public Criteria andFAccountKeyBetween(String value1, String value2) {
            addCriterion("fAccountKey between", value1, value2, "fAccountKey");
            return (Criteria) this;
        }

        public Criteria andFAccountKeyNotBetween(String value1, String value2) {
            addCriterion("fAccountKey not between", value1, value2, "fAccountKey");
            return (Criteria) this;
        }

        public Criteria andFAccountSecretIsNull() {
            addCriterion("fAccountSecret is null");
            return (Criteria) this;
        }

        public Criteria andFAccountSecretIsNotNull() {
            addCriterion("fAccountSecret is not null");
            return (Criteria) this;
        }

        public Criteria andFAccountSecretEqualTo(String value) {
            addCriterion("fAccountSecret =", value, "fAccountSecret");
            return (Criteria) this;
        }

        public Criteria andFAccountSecretNotEqualTo(String value) {
            addCriterion("fAccountSecret <>", value, "fAccountSecret");
            return (Criteria) this;
        }

        public Criteria andFAccountSecretGreaterThan(String value) {
            addCriterion("fAccountSecret >", value, "fAccountSecret");
            return (Criteria) this;
        }

        public Criteria andFAccountSecretGreaterThanOrEqualTo(String value) {
            addCriterion("fAccountSecret >=", value, "fAccountSecret");
            return (Criteria) this;
        }

        public Criteria andFAccountSecretLessThan(String value) {
            addCriterion("fAccountSecret <", value, "fAccountSecret");
            return (Criteria) this;
        }

        public Criteria andFAccountSecretLessThanOrEqualTo(String value) {
            addCriterion("fAccountSecret <=", value, "fAccountSecret");
            return (Criteria) this;
        }

        public Criteria andFAccountSecretLike(String value) {
            addCriterion("fAccountSecret like", value, "fAccountSecret");
            return (Criteria) this;
        }

        public Criteria andFAccountSecretNotLike(String value) {
            addCriterion("fAccountSecret not like", value, "fAccountSecret");
            return (Criteria) this;
        }

        public Criteria andFAccountSecretIn(List<String> values) {
            addCriterion("fAccountSecret in", values, "fAccountSecret");
            return (Criteria) this;
        }

        public Criteria andFAccountSecretNotIn(List<String> values) {
            addCriterion("fAccountSecret not in", values, "fAccountSecret");
            return (Criteria) this;
        }

        public Criteria andFAccountSecretBetween(String value1, String value2) {
            addCriterion("fAccountSecret between", value1, value2, "fAccountSecret");
            return (Criteria) this;
        }

        public Criteria andFAccountSecretNotBetween(String value1, String value2) {
            addCriterion("fAccountSecret not between", value1, value2, "fAccountSecret");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginUrlIsNull() {
            addCriterion("fAccountLoginUrl is null");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginUrlIsNotNull() {
            addCriterion("fAccountLoginUrl is not null");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginUrlEqualTo(String value) {
            addCriterion("fAccountLoginUrl =", value, "fAccountLoginUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginUrlNotEqualTo(String value) {
            addCriterion("fAccountLoginUrl <>", value, "fAccountLoginUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginUrlGreaterThan(String value) {
            addCriterion("fAccountLoginUrl >", value, "fAccountLoginUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginUrlGreaterThanOrEqualTo(String value) {
            addCriterion("fAccountLoginUrl >=", value, "fAccountLoginUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginUrlLessThan(String value) {
            addCriterion("fAccountLoginUrl <", value, "fAccountLoginUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginUrlLessThanOrEqualTo(String value) {
            addCriterion("fAccountLoginUrl <=", value, "fAccountLoginUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginUrlLike(String value) {
            addCriterion("fAccountLoginUrl like", value, "fAccountLoginUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginUrlNotLike(String value) {
            addCriterion("fAccountLoginUrl not like", value, "fAccountLoginUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginUrlIn(List<String> values) {
            addCriterion("fAccountLoginUrl in", values, "fAccountLoginUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginUrlNotIn(List<String> values) {
            addCriterion("fAccountLoginUrl not in", values, "fAccountLoginUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginUrlBetween(String value1, String value2) {
            addCriterion("fAccountLoginUrl between", value1, value2, "fAccountLoginUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginUrlNotBetween(String value1, String value2) {
            addCriterion("fAccountLoginUrl not between", value1, value2, "fAccountLoginUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountRegisterUrlIsNull() {
            addCriterion("fAccountRegisterUrl is null");
            return (Criteria) this;
        }

        public Criteria andFAccountRegisterUrlIsNotNull() {
            addCriterion("fAccountRegisterUrl is not null");
            return (Criteria) this;
        }

        public Criteria andFAccountRegisterUrlEqualTo(String value) {
            addCriterion("fAccountRegisterUrl =", value, "fAccountRegisterUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountRegisterUrlNotEqualTo(String value) {
            addCriterion("fAccountRegisterUrl <>", value, "fAccountRegisterUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountRegisterUrlGreaterThan(String value) {
            addCriterion("fAccountRegisterUrl >", value, "fAccountRegisterUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountRegisterUrlGreaterThanOrEqualTo(String value) {
            addCriterion("fAccountRegisterUrl >=", value, "fAccountRegisterUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountRegisterUrlLessThan(String value) {
            addCriterion("fAccountRegisterUrl <", value, "fAccountRegisterUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountRegisterUrlLessThanOrEqualTo(String value) {
            addCriterion("fAccountRegisterUrl <=", value, "fAccountRegisterUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountRegisterUrlLike(String value) {
            addCriterion("fAccountRegisterUrl like", value, "fAccountRegisterUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountRegisterUrlNotLike(String value) {
            addCriterion("fAccountRegisterUrl not like", value, "fAccountRegisterUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountRegisterUrlIn(List<String> values) {
            addCriterion("fAccountRegisterUrl in", values, "fAccountRegisterUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountRegisterUrlNotIn(List<String> values) {
            addCriterion("fAccountRegisterUrl not in", values, "fAccountRegisterUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountRegisterUrlBetween(String value1, String value2) {
            addCriterion("fAccountRegisterUrl between", value1, value2, "fAccountRegisterUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountRegisterUrlNotBetween(String value1, String value2) {
            addCriterion("fAccountRegisterUrl not between", value1, value2, "fAccountRegisterUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginSuccessUrlIsNull() {
            addCriterion("fAccountLoginSuccessUrl is null");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginSuccessUrlIsNotNull() {
            addCriterion("fAccountLoginSuccessUrl is not null");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginSuccessUrlEqualTo(String value) {
            addCriterion("fAccountLoginSuccessUrl =", value, "fAccountLoginSuccessUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginSuccessUrlNotEqualTo(String value) {
            addCriterion("fAccountLoginSuccessUrl <>", value, "fAccountLoginSuccessUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginSuccessUrlGreaterThan(String value) {
            addCriterion("fAccountLoginSuccessUrl >", value, "fAccountLoginSuccessUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginSuccessUrlGreaterThanOrEqualTo(String value) {
            addCriterion("fAccountLoginSuccessUrl >=", value, "fAccountLoginSuccessUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginSuccessUrlLessThan(String value) {
            addCriterion("fAccountLoginSuccessUrl <", value, "fAccountLoginSuccessUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginSuccessUrlLessThanOrEqualTo(String value) {
            addCriterion("fAccountLoginSuccessUrl <=", value, "fAccountLoginSuccessUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginSuccessUrlLike(String value) {
            addCriterion("fAccountLoginSuccessUrl like", value, "fAccountLoginSuccessUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginSuccessUrlNotLike(String value) {
            addCriterion("fAccountLoginSuccessUrl not like", value, "fAccountLoginSuccessUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginSuccessUrlIn(List<String> values) {
            addCriterion("fAccountLoginSuccessUrl in", values, "fAccountLoginSuccessUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginSuccessUrlNotIn(List<String> values) {
            addCriterion("fAccountLoginSuccessUrl not in", values, "fAccountLoginSuccessUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginSuccessUrlBetween(String value1, String value2) {
            addCriterion("fAccountLoginSuccessUrl between", value1, value2, "fAccountLoginSuccessUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginSuccessUrlNotBetween(String value1, String value2) {
            addCriterion("fAccountLoginSuccessUrl not between", value1, value2, "fAccountLoginSuccessUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginFailUrlIsNull() {
            addCriterion("fAccountLoginFailUrl is null");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginFailUrlIsNotNull() {
            addCriterion("fAccountLoginFailUrl is not null");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginFailUrlEqualTo(String value) {
            addCriterion("fAccountLoginFailUrl =", value, "fAccountLoginFailUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginFailUrlNotEqualTo(String value) {
            addCriterion("fAccountLoginFailUrl <>", value, "fAccountLoginFailUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginFailUrlGreaterThan(String value) {
            addCriterion("fAccountLoginFailUrl >", value, "fAccountLoginFailUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginFailUrlGreaterThanOrEqualTo(String value) {
            addCriterion("fAccountLoginFailUrl >=", value, "fAccountLoginFailUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginFailUrlLessThan(String value) {
            addCriterion("fAccountLoginFailUrl <", value, "fAccountLoginFailUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginFailUrlLessThanOrEqualTo(String value) {
            addCriterion("fAccountLoginFailUrl <=", value, "fAccountLoginFailUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginFailUrlLike(String value) {
            addCriterion("fAccountLoginFailUrl like", value, "fAccountLoginFailUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginFailUrlNotLike(String value) {
            addCriterion("fAccountLoginFailUrl not like", value, "fAccountLoginFailUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginFailUrlIn(List<String> values) {
            addCriterion("fAccountLoginFailUrl in", values, "fAccountLoginFailUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginFailUrlNotIn(List<String> values) {
            addCriterion("fAccountLoginFailUrl not in", values, "fAccountLoginFailUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginFailUrlBetween(String value1, String value2) {
            addCriterion("fAccountLoginFailUrl between", value1, value2, "fAccountLoginFailUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountLoginFailUrlNotBetween(String value1, String value2) {
            addCriterion("fAccountLoginFailUrl not between", value1, value2, "fAccountLoginFailUrl");
            return (Criteria) this;
        }

        public Criteria andFAccountDomainNameIsNull() {
            addCriterion("fAccountDomainName is null");
            return (Criteria) this;
        }

        public Criteria andFAccountDomainNameIsNotNull() {
            addCriterion("fAccountDomainName is not null");
            return (Criteria) this;
        }

        public Criteria andFAccountDomainNameEqualTo(String value) {
            addCriterion("fAccountDomainName =", value, "fAccountDomainName");
            return (Criteria) this;
        }

        public Criteria andFAccountDomainNameNotEqualTo(String value) {
            addCriterion("fAccountDomainName <>", value, "fAccountDomainName");
            return (Criteria) this;
        }

        public Criteria andFAccountDomainNameGreaterThan(String value) {
            addCriterion("fAccountDomainName >", value, "fAccountDomainName");
            return (Criteria) this;
        }

        public Criteria andFAccountDomainNameGreaterThanOrEqualTo(String value) {
            addCriterion("fAccountDomainName >=", value, "fAccountDomainName");
            return (Criteria) this;
        }

        public Criteria andFAccountDomainNameLessThan(String value) {
            addCriterion("fAccountDomainName <", value, "fAccountDomainName");
            return (Criteria) this;
        }

        public Criteria andFAccountDomainNameLessThanOrEqualTo(String value) {
            addCriterion("fAccountDomainName <=", value, "fAccountDomainName");
            return (Criteria) this;
        }

        public Criteria andFAccountDomainNameLike(String value) {
            addCriterion("fAccountDomainName like", value, "fAccountDomainName");
            return (Criteria) this;
        }

        public Criteria andFAccountDomainNameNotLike(String value) {
            addCriterion("fAccountDomainName not like", value, "fAccountDomainName");
            return (Criteria) this;
        }

        public Criteria andFAccountDomainNameIn(List<String> values) {
            addCriterion("fAccountDomainName in", values, "fAccountDomainName");
            return (Criteria) this;
        }

        public Criteria andFAccountDomainNameNotIn(List<String> values) {
            addCriterion("fAccountDomainName not in", values, "fAccountDomainName");
            return (Criteria) this;
        }

        public Criteria andFAccountDomainNameBetween(String value1, String value2) {
            addCriterion("fAccountDomainName between", value1, value2, "fAccountDomainName");
            return (Criteria) this;
        }

        public Criteria andFAccountDomainNameNotBetween(String value1, String value2) {
            addCriterion("fAccountDomainName not between", value1, value2, "fAccountDomainName");
            return (Criteria) this;
        }

        public Criteria andFaOpenAccountKeyIsNull() {
            addCriterion("faOpenAccountKey is null");
            return (Criteria) this;
        }

        public Criteria andFaOpenAccountKeyIsNotNull() {
            addCriterion("faOpenAccountKey is not null");
            return (Criteria) this;
        }

        public Criteria andFaOpenAccountKeyEqualTo(String value) {
            addCriterion("faOpenAccountKey =", value, "faOpenAccountKey");
            return (Criteria) this;
        }

        public Criteria andFaOpenAccountKeyNotEqualTo(String value) {
            addCriterion("faOpenAccountKey <>", value, "faOpenAccountKey");
            return (Criteria) this;
        }

        public Criteria andFaOpenAccountKeyGreaterThan(String value) {
            addCriterion("faOpenAccountKey >", value, "faOpenAccountKey");
            return (Criteria) this;
        }

        public Criteria andFaOpenAccountKeyGreaterThanOrEqualTo(String value) {
            addCriterion("faOpenAccountKey >=", value, "faOpenAccountKey");
            return (Criteria) this;
        }

        public Criteria andFaOpenAccountKeyLessThan(String value) {
            addCriterion("faOpenAccountKey <", value, "faOpenAccountKey");
            return (Criteria) this;
        }

        public Criteria andFaOpenAccountKeyLessThanOrEqualTo(String value) {
            addCriterion("faOpenAccountKey <=", value, "faOpenAccountKey");
            return (Criteria) this;
        }

        public Criteria andFaOpenAccountKeyLike(String value) {
            addCriterion("faOpenAccountKey like", value, "faOpenAccountKey");
            return (Criteria) this;
        }

        public Criteria andFaOpenAccountKeyNotLike(String value) {
            addCriterion("faOpenAccountKey not like", value, "faOpenAccountKey");
            return (Criteria) this;
        }

        public Criteria andFaOpenAccountKeyIn(List<String> values) {
            addCriterion("faOpenAccountKey in", values, "faOpenAccountKey");
            return (Criteria) this;
        }

        public Criteria andFaOpenAccountKeyNotIn(List<String> values) {
            addCriterion("faOpenAccountKey not in", values, "faOpenAccountKey");
            return (Criteria) this;
        }

        public Criteria andFaOpenAccountKeyBetween(String value1, String value2) {
            addCriterion("faOpenAccountKey between", value1, value2, "faOpenAccountKey");
            return (Criteria) this;
        }

        public Criteria andFaOpenAccountKeyNotBetween(String value1, String value2) {
            addCriterion("faOpenAccountKey not between", value1, value2, "faOpenAccountKey");
            return (Criteria) this;
        }

        public Criteria andFaOpenAccountSecretIsNull() {
            addCriterion("faOpenAccountSecret is null");
            return (Criteria) this;
        }

        public Criteria andFaOpenAccountSecretIsNotNull() {
            addCriterion("faOpenAccountSecret is not null");
            return (Criteria) this;
        }

        public Criteria andFaOpenAccountSecretEqualTo(String value) {
            addCriterion("faOpenAccountSecret =", value, "faOpenAccountSecret");
            return (Criteria) this;
        }

        public Criteria andFaOpenAccountSecretNotEqualTo(String value) {
            addCriterion("faOpenAccountSecret <>", value, "faOpenAccountSecret");
            return (Criteria) this;
        }

        public Criteria andFaOpenAccountSecretGreaterThan(String value) {
            addCriterion("faOpenAccountSecret >", value, "faOpenAccountSecret");
            return (Criteria) this;
        }

        public Criteria andFaOpenAccountSecretGreaterThanOrEqualTo(String value) {
            addCriterion("faOpenAccountSecret >=", value, "faOpenAccountSecret");
            return (Criteria) this;
        }

        public Criteria andFaOpenAccountSecretLessThan(String value) {
            addCriterion("faOpenAccountSecret <", value, "faOpenAccountSecret");
            return (Criteria) this;
        }

        public Criteria andFaOpenAccountSecretLessThanOrEqualTo(String value) {
            addCriterion("faOpenAccountSecret <=", value, "faOpenAccountSecret");
            return (Criteria) this;
        }

        public Criteria andFaOpenAccountSecretLike(String value) {
            addCriterion("faOpenAccountSecret like", value, "faOpenAccountSecret");
            return (Criteria) this;
        }

        public Criteria andFaOpenAccountSecretNotLike(String value) {
            addCriterion("faOpenAccountSecret not like", value, "faOpenAccountSecret");
            return (Criteria) this;
        }

        public Criteria andFaOpenAccountSecretIn(List<String> values) {
            addCriterion("faOpenAccountSecret in", values, "faOpenAccountSecret");
            return (Criteria) this;
        }

        public Criteria andFaOpenAccountSecretNotIn(List<String> values) {
            addCriterion("faOpenAccountSecret not in", values, "faOpenAccountSecret");
            return (Criteria) this;
        }

        public Criteria andFaOpenAccountSecretBetween(String value1, String value2) {
            addCriterion("faOpenAccountSecret between", value1, value2, "faOpenAccountSecret");
            return (Criteria) this;
        }

        public Criteria andFaOpenAccountSecretNotBetween(String value1, String value2) {
            addCriterion("faOpenAccountSecret not between", value1, value2, "faOpenAccountSecret");
            return (Criteria) this;
        }

        public Criteria andFaAccountLoginPcSuccessUrlIsNull() {
            addCriterion("faAccountLoginPcSuccessUrl is null");
            return (Criteria) this;
        }

        public Criteria andFaAccountLoginPcSuccessUrlIsNotNull() {
            addCriterion("faAccountLoginPcSuccessUrl is not null");
            return (Criteria) this;
        }

        public Criteria andFaAccountLoginPcSuccessUrlEqualTo(String value) {
            addCriterion("faAccountLoginPcSuccessUrl =", value, "faAccountLoginPcSuccessUrl");
            return (Criteria) this;
        }

        public Criteria andFaAccountLoginPcSuccessUrlNotEqualTo(String value) {
            addCriterion("faAccountLoginPcSuccessUrl <>", value, "faAccountLoginPcSuccessUrl");
            return (Criteria) this;
        }

        public Criteria andFaAccountLoginPcSuccessUrlGreaterThan(String value) {
            addCriterion("faAccountLoginPcSuccessUrl >", value, "faAccountLoginPcSuccessUrl");
            return (Criteria) this;
        }

        public Criteria andFaAccountLoginPcSuccessUrlGreaterThanOrEqualTo(String value) {
            addCriterion("faAccountLoginPcSuccessUrl >=", value, "faAccountLoginPcSuccessUrl");
            return (Criteria) this;
        }

        public Criteria andFaAccountLoginPcSuccessUrlLessThan(String value) {
            addCriterion("faAccountLoginPcSuccessUrl <", value, "faAccountLoginPcSuccessUrl");
            return (Criteria) this;
        }

        public Criteria andFaAccountLoginPcSuccessUrlLessThanOrEqualTo(String value) {
            addCriterion("faAccountLoginPcSuccessUrl <=", value, "faAccountLoginPcSuccessUrl");
            return (Criteria) this;
        }

        public Criteria andFaAccountLoginPcSuccessUrlLike(String value) {
            addCriterion("faAccountLoginPcSuccessUrl like", value, "faAccountLoginPcSuccessUrl");
            return (Criteria) this;
        }

        public Criteria andFaAccountLoginPcSuccessUrlNotLike(String value) {
            addCriterion("faAccountLoginPcSuccessUrl not like", value, "faAccountLoginPcSuccessUrl");
            return (Criteria) this;
        }

        public Criteria andFaAccountLoginPcSuccessUrlIn(List<String> values) {
            addCriterion("faAccountLoginPcSuccessUrl in", values, "faAccountLoginPcSuccessUrl");
            return (Criteria) this;
        }

        public Criteria andFaAccountLoginPcSuccessUrlNotIn(List<String> values) {
            addCriterion("faAccountLoginPcSuccessUrl not in", values, "faAccountLoginPcSuccessUrl");
            return (Criteria) this;
        }

        public Criteria andFaAccountLoginPcSuccessUrlBetween(String value1, String value2) {
            addCriterion("faAccountLoginPcSuccessUrl between", value1, value2, "faAccountLoginPcSuccessUrl");
            return (Criteria) this;
        }

        public Criteria andFaAccountLoginPcSuccessUrlNotBetween(String value1, String value2) {
            addCriterion("faAccountLoginPcSuccessUrl not between", value1, value2, "faAccountLoginPcSuccessUrl");
            return (Criteria) this;
        }

        public Criteria andFaAccountLoginPcFailUrlIsNull() {
            addCriterion("faAccountLoginPcFailUrl is null");
            return (Criteria) this;
        }

        public Criteria andFaAccountLoginPcFailUrlIsNotNull() {
            addCriterion("faAccountLoginPcFailUrl is not null");
            return (Criteria) this;
        }

        public Criteria andFaAccountLoginPcFailUrlEqualTo(String value) {
            addCriterion("faAccountLoginPcFailUrl =", value, "faAccountLoginPcFailUrl");
            return (Criteria) this;
        }

        public Criteria andFaAccountLoginPcFailUrlNotEqualTo(String value) {
            addCriterion("faAccountLoginPcFailUrl <>", value, "faAccountLoginPcFailUrl");
            return (Criteria) this;
        }

        public Criteria andFaAccountLoginPcFailUrlGreaterThan(String value) {
            addCriterion("faAccountLoginPcFailUrl >", value, "faAccountLoginPcFailUrl");
            return (Criteria) this;
        }

        public Criteria andFaAccountLoginPcFailUrlGreaterThanOrEqualTo(String value) {
            addCriterion("faAccountLoginPcFailUrl >=", value, "faAccountLoginPcFailUrl");
            return (Criteria) this;
        }

        public Criteria andFaAccountLoginPcFailUrlLessThan(String value) {
            addCriterion("faAccountLoginPcFailUrl <", value, "faAccountLoginPcFailUrl");
            return (Criteria) this;
        }

        public Criteria andFaAccountLoginPcFailUrlLessThanOrEqualTo(String value) {
            addCriterion("faAccountLoginPcFailUrl <=", value, "faAccountLoginPcFailUrl");
            return (Criteria) this;
        }

        public Criteria andFaAccountLoginPcFailUrlLike(String value) {
            addCriterion("faAccountLoginPcFailUrl like", value, "faAccountLoginPcFailUrl");
            return (Criteria) this;
        }

        public Criteria andFaAccountLoginPcFailUrlNotLike(String value) {
            addCriterion("faAccountLoginPcFailUrl not like", value, "faAccountLoginPcFailUrl");
            return (Criteria) this;
        }

        public Criteria andFaAccountLoginPcFailUrlIn(List<String> values) {
            addCriterion("faAccountLoginPcFailUrl in", values, "faAccountLoginPcFailUrl");
            return (Criteria) this;
        }

        public Criteria andFaAccountLoginPcFailUrlNotIn(List<String> values) {
            addCriterion("faAccountLoginPcFailUrl not in", values, "faAccountLoginPcFailUrl");
            return (Criteria) this;
        }

        public Criteria andFaAccountLoginPcFailUrlBetween(String value1, String value2) {
            addCriterion("faAccountLoginPcFailUrl between", value1, value2, "faAccountLoginPcFailUrl");
            return (Criteria) this;
        }

        public Criteria andFaAccountLoginPcFailUrlNotBetween(String value1, String value2) {
            addCriterion("faAccountLoginPcFailUrl not between", value1, value2, "faAccountLoginPcFailUrl");
            return (Criteria) this;
        }

        public Criteria andFaAccountTypeStateIsNull() {
            addCriterion("faAccountTypeState is null");
            return (Criteria) this;
        }

        public Criteria andFaAccountTypeStateIsNotNull() {
            addCriterion("faAccountTypeState is not null");
            return (Criteria) this;
        }

        public Criteria andFaAccountTypeStateEqualTo(Integer value) {
            addCriterion("faAccountTypeState =", value, "faAccountTypeState");
            return (Criteria) this;
        }

        public Criteria andFaAccountTypeStateNotEqualTo(Integer value) {
            addCriterion("faAccountTypeState <>", value, "faAccountTypeState");
            return (Criteria) this;
        }

        public Criteria andFaAccountTypeStateGreaterThan(Integer value) {
            addCriterion("faAccountTypeState >", value, "faAccountTypeState");
            return (Criteria) this;
        }

        public Criteria andFaAccountTypeStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("faAccountTypeState >=", value, "faAccountTypeState");
            return (Criteria) this;
        }

        public Criteria andFaAccountTypeStateLessThan(Integer value) {
            addCriterion("faAccountTypeState <", value, "faAccountTypeState");
            return (Criteria) this;
        }

        public Criteria andFaAccountTypeStateLessThanOrEqualTo(Integer value) {
            addCriterion("faAccountTypeState <=", value, "faAccountTypeState");
            return (Criteria) this;
        }

        public Criteria andFaAccountTypeStateIn(List<Integer> values) {
            addCriterion("faAccountTypeState in", values, "faAccountTypeState");
            return (Criteria) this;
        }

        public Criteria andFaAccountTypeStateNotIn(List<Integer> values) {
            addCriterion("faAccountTypeState not in", values, "faAccountTypeState");
            return (Criteria) this;
        }

        public Criteria andFaAccountTypeStateBetween(Integer value1, Integer value2) {
            addCriterion("faAccountTypeState between", value1, value2, "faAccountTypeState");
            return (Criteria) this;
        }

        public Criteria andFaAccountTypeStateNotBetween(Integer value1, Integer value2) {
            addCriterion("faAccountTypeState not between", value1, value2, "faAccountTypeState");
            return (Criteria) this;
        }

        public Criteria andFaAccountCallbackUrlIsNull() {
            addCriterion("faAccountCallbackUrl is null");
            return (Criteria) this;
        }

        public Criteria andFaAccountCallbackUrlIsNotNull() {
            addCriterion("faAccountCallbackUrl is not null");
            return (Criteria) this;
        }

        public Criteria andFaAccountCallbackUrlEqualTo(String value) {
            addCriterion("faAccountCallbackUrl =", value, "faAccountCallbackUrl");
            return (Criteria) this;
        }

        public Criteria andFaAccountCallbackUrlNotEqualTo(String value) {
            addCriterion("faAccountCallbackUrl <>", value, "faAccountCallbackUrl");
            return (Criteria) this;
        }

        public Criteria andFaAccountCallbackUrlGreaterThan(String value) {
            addCriterion("faAccountCallbackUrl >", value, "faAccountCallbackUrl");
            return (Criteria) this;
        }

        public Criteria andFaAccountCallbackUrlGreaterThanOrEqualTo(String value) {
            addCriterion("faAccountCallbackUrl >=", value, "faAccountCallbackUrl");
            return (Criteria) this;
        }

        public Criteria andFaAccountCallbackUrlLessThan(String value) {
            addCriterion("faAccountCallbackUrl <", value, "faAccountCallbackUrl");
            return (Criteria) this;
        }

        public Criteria andFaAccountCallbackUrlLessThanOrEqualTo(String value) {
            addCriterion("faAccountCallbackUrl <=", value, "faAccountCallbackUrl");
            return (Criteria) this;
        }

        public Criteria andFaAccountCallbackUrlLike(String value) {
            addCriterion("faAccountCallbackUrl like", value, "faAccountCallbackUrl");
            return (Criteria) this;
        }

        public Criteria andFaAccountCallbackUrlNotLike(String value) {
            addCriterion("faAccountCallbackUrl not like", value, "faAccountCallbackUrl");
            return (Criteria) this;
        }

        public Criteria andFaAccountCallbackUrlIn(List<String> values) {
            addCriterion("faAccountCallbackUrl in", values, "faAccountCallbackUrl");
            return (Criteria) this;
        }

        public Criteria andFaAccountCallbackUrlNotIn(List<String> values) {
            addCriterion("faAccountCallbackUrl not in", values, "faAccountCallbackUrl");
            return (Criteria) this;
        }

        public Criteria andFaAccountCallbackUrlBetween(String value1, String value2) {
            addCriterion("faAccountCallbackUrl between", value1, value2, "faAccountCallbackUrl");
            return (Criteria) this;
        }

        public Criteria andFaAccountCallbackUrlNotBetween(String value1, String value2) {
            addCriterion("faAccountCallbackUrl not between", value1, value2, "faAccountCallbackUrl");
            return (Criteria) this;
        }

        public Criteria andFaAccountBindStategyIsNull() {
            addCriterion("faAccountBindStategy is null");
            return (Criteria) this;
        }

        public Criteria andFaAccountBindStategyIsNotNull() {
            addCriterion("faAccountBindStategy is not null");
            return (Criteria) this;
        }

        public Criteria andFaAccountBindStategyEqualTo(Integer value) {
            addCriterion("faAccountBindStategy =", value, "faAccountBindStategy");
            return (Criteria) this;
        }

        public Criteria andFaAccountBindStategyNotEqualTo(Integer value) {
            addCriterion("faAccountBindStategy <>", value, "faAccountBindStategy");
            return (Criteria) this;
        }

        public Criteria andFaAccountBindStategyGreaterThan(Integer value) {
            addCriterion("faAccountBindStategy >", value, "faAccountBindStategy");
            return (Criteria) this;
        }

        public Criteria andFaAccountBindStategyGreaterThanOrEqualTo(Integer value) {
            addCriterion("faAccountBindStategy >=", value, "faAccountBindStategy");
            return (Criteria) this;
        }

        public Criteria andFaAccountBindStategyLessThan(Integer value) {
            addCriterion("faAccountBindStategy <", value, "faAccountBindStategy");
            return (Criteria) this;
        }

        public Criteria andFaAccountBindStategyLessThanOrEqualTo(Integer value) {
            addCriterion("faAccountBindStategy <=", value, "faAccountBindStategy");
            return (Criteria) this;
        }

        public Criteria andFaAccountBindStategyIn(List<Integer> values) {
            addCriterion("faAccountBindStategy in", values, "faAccountBindStategy");
            return (Criteria) this;
        }

        public Criteria andFaAccountBindStategyNotIn(List<Integer> values) {
            addCriterion("faAccountBindStategy not in", values, "faAccountBindStategy");
            return (Criteria) this;
        }

        public Criteria andFaAccountBindStategyBetween(Integer value1, Integer value2) {
            addCriterion("faAccountBindStategy between", value1, value2, "faAccountBindStategy");
            return (Criteria) this;
        }

        public Criteria andFaAccountBindStategyNotBetween(Integer value1, Integer value2) {
            addCriterion("faAccountBindStategy not between", value1, value2, "faAccountBindStategy");
            return (Criteria) this;
        }

        public Criteria andFaAccountAsyncIsNull() {
            addCriterion("faAccountAsync is null");
            return (Criteria) this;
        }

        public Criteria andFaAccountAsyncIsNotNull() {
            addCriterion("faAccountAsync is not null");
            return (Criteria) this;
        }

        public Criteria andFaAccountAsyncEqualTo(Integer value) {
            addCriterion("faAccountAsync =", value, "faAccountAsync");
            return (Criteria) this;
        }

        public Criteria andFaAccountAsyncNotEqualTo(Integer value) {
            addCriterion("faAccountAsync <>", value, "faAccountAsync");
            return (Criteria) this;
        }

        public Criteria andFaAccountAsyncGreaterThan(Integer value) {
            addCriterion("faAccountAsync >", value, "faAccountAsync");
            return (Criteria) this;
        }

        public Criteria andFaAccountAsyncGreaterThanOrEqualTo(Integer value) {
            addCriterion("faAccountAsync >=", value, "faAccountAsync");
            return (Criteria) this;
        }

        public Criteria andFaAccountAsyncLessThan(Integer value) {
            addCriterion("faAccountAsync <", value, "faAccountAsync");
            return (Criteria) this;
        }

        public Criteria andFaAccountAsyncLessThanOrEqualTo(Integer value) {
            addCriterion("faAccountAsync <=", value, "faAccountAsync");
            return (Criteria) this;
        }

        public Criteria andFaAccountAsyncIn(List<Integer> values) {
            addCriterion("faAccountAsync in", values, "faAccountAsync");
            return (Criteria) this;
        }

        public Criteria andFaAccountAsyncNotIn(List<Integer> values) {
            addCriterion("faAccountAsync not in", values, "faAccountAsync");
            return (Criteria) this;
        }

        public Criteria andFaAccountAsyncBetween(Integer value1, Integer value2) {
            addCriterion("faAccountAsync between", value1, value2, "faAccountAsync");
            return (Criteria) this;
        }

        public Criteria andFaAccountAsyncNotBetween(Integer value1, Integer value2) {
            addCriterion("faAccountAsync not between", value1, value2, "faAccountAsync");
            return (Criteria) this;
        }

        public Criteria andFaAccountEndPointIsNull() {
            addCriterion("faAccountEndPoint is null");
            return (Criteria) this;
        }

        public Criteria andFaAccountEndPointIsNotNull() {
            addCriterion("faAccountEndPoint is not null");
            return (Criteria) this;
        }

        public Criteria andFaAccountEndPointEqualTo(String value) {
            addCriterion("faAccountEndPoint =", value, "faAccountEndPoint");
            return (Criteria) this;
        }

        public Criteria andFaAccountEndPointNotEqualTo(String value) {
            addCriterion("faAccountEndPoint <>", value, "faAccountEndPoint");
            return (Criteria) this;
        }

        public Criteria andFaAccountEndPointGreaterThan(String value) {
            addCriterion("faAccountEndPoint >", value, "faAccountEndPoint");
            return (Criteria) this;
        }

        public Criteria andFaAccountEndPointGreaterThanOrEqualTo(String value) {
            addCriterion("faAccountEndPoint >=", value, "faAccountEndPoint");
            return (Criteria) this;
        }

        public Criteria andFaAccountEndPointLessThan(String value) {
            addCriterion("faAccountEndPoint <", value, "faAccountEndPoint");
            return (Criteria) this;
        }

        public Criteria andFaAccountEndPointLessThanOrEqualTo(String value) {
            addCriterion("faAccountEndPoint <=", value, "faAccountEndPoint");
            return (Criteria) this;
        }

        public Criteria andFaAccountEndPointLike(String value) {
            addCriterion("faAccountEndPoint like", value, "faAccountEndPoint");
            return (Criteria) this;
        }

        public Criteria andFaAccountEndPointNotLike(String value) {
            addCriterion("faAccountEndPoint not like", value, "faAccountEndPoint");
            return (Criteria) this;
        }

        public Criteria andFaAccountEndPointIn(List<String> values) {
            addCriterion("faAccountEndPoint in", values, "faAccountEndPoint");
            return (Criteria) this;
        }

        public Criteria andFaAccountEndPointNotIn(List<String> values) {
            addCriterion("faAccountEndPoint not in", values, "faAccountEndPoint");
            return (Criteria) this;
        }

        public Criteria andFaAccountEndPointBetween(String value1, String value2) {
            addCriterion("faAccountEndPoint between", value1, value2, "faAccountEndPoint");
            return (Criteria) this;
        }

        public Criteria andFaAccountEndPointNotBetween(String value1, String value2) {
            addCriterion("faAccountEndPoint not between", value1, value2, "faAccountEndPoint");
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