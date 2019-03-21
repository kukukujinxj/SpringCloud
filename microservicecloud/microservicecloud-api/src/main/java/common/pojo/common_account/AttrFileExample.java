package common.pojo.common_account;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AttrFileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttrFileExample() {
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

        public Criteria andFileIdIsNull() {
            addCriterion("fileId is null");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("fileId is not null");
            return (Criteria) this;
        }

        public Criteria andFileIdEqualTo(Integer value) {
            addCriterion("fileId =", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotEqualTo(Integer value) {
            addCriterion("fileId <>", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThan(Integer value) {
            addCriterion("fileId >", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fileId >=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThan(Integer value) {
            addCriterion("fileId <", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThanOrEqualTo(Integer value) {
            addCriterion("fileId <=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdIn(List<Integer> values) {
            addCriterion("fileId in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotIn(List<Integer> values) {
            addCriterion("fileId not in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdBetween(Integer value1, Integer value2) {
            addCriterion("fileId between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fileId not between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileuuidIsNull() {
            addCriterion("fileuuid is null");
            return (Criteria) this;
        }

        public Criteria andFileuuidIsNotNull() {
            addCriterion("fileuuid is not null");
            return (Criteria) this;
        }

        public Criteria andFileuuidEqualTo(String value) {
            addCriterion("fileuuid =", value, "fileuuid");
            return (Criteria) this;
        }

        public Criteria andFileuuidNotEqualTo(String value) {
            addCriterion("fileuuid <>", value, "fileuuid");
            return (Criteria) this;
        }

        public Criteria andFileuuidGreaterThan(String value) {
            addCriterion("fileuuid >", value, "fileuuid");
            return (Criteria) this;
        }

        public Criteria andFileuuidGreaterThanOrEqualTo(String value) {
            addCriterion("fileuuid >=", value, "fileuuid");
            return (Criteria) this;
        }

        public Criteria andFileuuidLessThan(String value) {
            addCriterion("fileuuid <", value, "fileuuid");
            return (Criteria) this;
        }

        public Criteria andFileuuidLessThanOrEqualTo(String value) {
            addCriterion("fileuuid <=", value, "fileuuid");
            return (Criteria) this;
        }

        public Criteria andFileuuidLike(String value) {
            addCriterion("fileuuid like", value, "fileuuid");
            return (Criteria) this;
        }

        public Criteria andFileuuidNotLike(String value) {
            addCriterion("fileuuid not like", value, "fileuuid");
            return (Criteria) this;
        }

        public Criteria andFileuuidIn(List<String> values) {
            addCriterion("fileuuid in", values, "fileuuid");
            return (Criteria) this;
        }

        public Criteria andFileuuidNotIn(List<String> values) {
            addCriterion("fileuuid not in", values, "fileuuid");
            return (Criteria) this;
        }

        public Criteria andFileuuidBetween(String value1, String value2) {
            addCriterion("fileuuid between", value1, value2, "fileuuid");
            return (Criteria) this;
        }

        public Criteria andFileuuidNotBetween(String value1, String value2) {
            addCriterion("fileuuid not between", value1, value2, "fileuuid");
            return (Criteria) this;
        }

        public Criteria andFilePositionIsNull() {
            addCriterion("filePosition is null");
            return (Criteria) this;
        }

        public Criteria andFilePositionIsNotNull() {
            addCriterion("filePosition is not null");
            return (Criteria) this;
        }

        public Criteria andFilePositionEqualTo(String value) {
            addCriterion("filePosition =", value, "filePosition");
            return (Criteria) this;
        }

        public Criteria andFilePositionNotEqualTo(String value) {
            addCriterion("filePosition <>", value, "filePosition");
            return (Criteria) this;
        }

        public Criteria andFilePositionGreaterThan(String value) {
            addCriterion("filePosition >", value, "filePosition");
            return (Criteria) this;
        }

        public Criteria andFilePositionGreaterThanOrEqualTo(String value) {
            addCriterion("filePosition >=", value, "filePosition");
            return (Criteria) this;
        }

        public Criteria andFilePositionLessThan(String value) {
            addCriterion("filePosition <", value, "filePosition");
            return (Criteria) this;
        }

        public Criteria andFilePositionLessThanOrEqualTo(String value) {
            addCriterion("filePosition <=", value, "filePosition");
            return (Criteria) this;
        }

        public Criteria andFilePositionLike(String value) {
            addCriterion("filePosition like", value, "filePosition");
            return (Criteria) this;
        }

        public Criteria andFilePositionNotLike(String value) {
            addCriterion("filePosition not like", value, "filePosition");
            return (Criteria) this;
        }

        public Criteria andFilePositionIn(List<String> values) {
            addCriterion("filePosition in", values, "filePosition");
            return (Criteria) this;
        }

        public Criteria andFilePositionNotIn(List<String> values) {
            addCriterion("filePosition not in", values, "filePosition");
            return (Criteria) this;
        }

        public Criteria andFilePositionBetween(String value1, String value2) {
            addCriterion("filePosition between", value1, value2, "filePosition");
            return (Criteria) this;
        }

        public Criteria andFilePositionNotBetween(String value1, String value2) {
            addCriterion("filePosition not between", value1, value2, "filePosition");
            return (Criteria) this;
        }

        public Criteria andFileUrlIsNull() {
            addCriterion("fileUrl is null");
            return (Criteria) this;
        }

        public Criteria andFileUrlIsNotNull() {
            addCriterion("fileUrl is not null");
            return (Criteria) this;
        }

        public Criteria andFileUrlEqualTo(String value) {
            addCriterion("fileUrl =", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotEqualTo(String value) {
            addCriterion("fileUrl <>", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlGreaterThan(String value) {
            addCriterion("fileUrl >", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlGreaterThanOrEqualTo(String value) {
            addCriterion("fileUrl >=", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlLessThan(String value) {
            addCriterion("fileUrl <", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlLessThanOrEqualTo(String value) {
            addCriterion("fileUrl <=", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlLike(String value) {
            addCriterion("fileUrl like", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotLike(String value) {
            addCriterion("fileUrl not like", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlIn(List<String> values) {
            addCriterion("fileUrl in", values, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotIn(List<String> values) {
            addCriterion("fileUrl not in", values, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlBetween(String value1, String value2) {
            addCriterion("fileUrl between", value1, value2, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotBetween(String value1, String value2) {
            addCriterion("fileUrl not between", value1, value2, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileCreateTimeIsNull() {
            addCriterion("fileCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andFileCreateTimeIsNotNull() {
            addCriterion("fileCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andFileCreateTimeEqualTo(Date value) {
            addCriterion("fileCreateTime =", value, "fileCreateTime");
            return (Criteria) this;
        }

        public Criteria andFileCreateTimeNotEqualTo(Date value) {
            addCriterion("fileCreateTime <>", value, "fileCreateTime");
            return (Criteria) this;
        }

        public Criteria andFileCreateTimeGreaterThan(Date value) {
            addCriterion("fileCreateTime >", value, "fileCreateTime");
            return (Criteria) this;
        }

        public Criteria andFileCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("fileCreateTime >=", value, "fileCreateTime");
            return (Criteria) this;
        }

        public Criteria andFileCreateTimeLessThan(Date value) {
            addCriterion("fileCreateTime <", value, "fileCreateTime");
            return (Criteria) this;
        }

        public Criteria andFileCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("fileCreateTime <=", value, "fileCreateTime");
            return (Criteria) this;
        }

        public Criteria andFileCreateTimeIn(List<Date> values) {
            addCriterion("fileCreateTime in", values, "fileCreateTime");
            return (Criteria) this;
        }

        public Criteria andFileCreateTimeNotIn(List<Date> values) {
            addCriterion("fileCreateTime not in", values, "fileCreateTime");
            return (Criteria) this;
        }

        public Criteria andFileCreateTimeBetween(Date value1, Date value2) {
            addCriterion("fileCreateTime between", value1, value2, "fileCreateTime");
            return (Criteria) this;
        }

        public Criteria andFileCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("fileCreateTime not between", value1, value2, "fileCreateTime");
            return (Criteria) this;
        }

        public Criteria andFileHashIsNull() {
            addCriterion("fileHash is null");
            return (Criteria) this;
        }

        public Criteria andFileHashIsNotNull() {
            addCriterion("fileHash is not null");
            return (Criteria) this;
        }

        public Criteria andFileHashEqualTo(String value) {
            addCriterion("fileHash =", value, "fileHash");
            return (Criteria) this;
        }

        public Criteria andFileHashNotEqualTo(String value) {
            addCriterion("fileHash <>", value, "fileHash");
            return (Criteria) this;
        }

        public Criteria andFileHashGreaterThan(String value) {
            addCriterion("fileHash >", value, "fileHash");
            return (Criteria) this;
        }

        public Criteria andFileHashGreaterThanOrEqualTo(String value) {
            addCriterion("fileHash >=", value, "fileHash");
            return (Criteria) this;
        }

        public Criteria andFileHashLessThan(String value) {
            addCriterion("fileHash <", value, "fileHash");
            return (Criteria) this;
        }

        public Criteria andFileHashLessThanOrEqualTo(String value) {
            addCriterion("fileHash <=", value, "fileHash");
            return (Criteria) this;
        }

        public Criteria andFileHashLike(String value) {
            addCriterion("fileHash like", value, "fileHash");
            return (Criteria) this;
        }

        public Criteria andFileHashNotLike(String value) {
            addCriterion("fileHash not like", value, "fileHash");
            return (Criteria) this;
        }

        public Criteria andFileHashIn(List<String> values) {
            addCriterion("fileHash in", values, "fileHash");
            return (Criteria) this;
        }

        public Criteria andFileHashNotIn(List<String> values) {
            addCriterion("fileHash not in", values, "fileHash");
            return (Criteria) this;
        }

        public Criteria andFileHashBetween(String value1, String value2) {
            addCriterion("fileHash between", value1, value2, "fileHash");
            return (Criteria) this;
        }

        public Criteria andFileHashNotBetween(String value1, String value2) {
            addCriterion("fileHash not between", value1, value2, "fileHash");
            return (Criteria) this;
        }

        public Criteria andFileSizeIsNull() {
            addCriterion("fileSize is null");
            return (Criteria) this;
        }

        public Criteria andFileSizeIsNotNull() {
            addCriterion("fileSize is not null");
            return (Criteria) this;
        }

        public Criteria andFileSizeEqualTo(Integer value) {
            addCriterion("fileSize =", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotEqualTo(Integer value) {
            addCriterion("fileSize <>", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThan(Integer value) {
            addCriterion("fileSize >", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("fileSize >=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThan(Integer value) {
            addCriterion("fileSize <", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThanOrEqualTo(Integer value) {
            addCriterion("fileSize <=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeIn(List<Integer> values) {
            addCriterion("fileSize in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotIn(List<Integer> values) {
            addCriterion("fileSize not in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeBetween(Integer value1, Integer value2) {
            addCriterion("fileSize between", value1, value2, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("fileSize not between", value1, value2, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNull() {
            addCriterion("fileType is null");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNotNull() {
            addCriterion("fileType is not null");
            return (Criteria) this;
        }

        public Criteria andFileTypeEqualTo(Integer value) {
            addCriterion("fileType =", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotEqualTo(Integer value) {
            addCriterion("fileType <>", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThan(Integer value) {
            addCriterion("fileType >", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("fileType >=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThan(Integer value) {
            addCriterion("fileType <", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThanOrEqualTo(Integer value) {
            addCriterion("fileType <=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeIn(List<Integer> values) {
            addCriterion("fileType in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotIn(List<Integer> values) {
            addCriterion("fileType not in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeBetween(Integer value1, Integer value2) {
            addCriterion("fileType between", value1, value2, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("fileType not between", value1, value2, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileCoverIsNull() {
            addCriterion("fileCover is null");
            return (Criteria) this;
        }

        public Criteria andFileCoverIsNotNull() {
            addCriterion("fileCover is not null");
            return (Criteria) this;
        }

        public Criteria andFileCoverEqualTo(String value) {
            addCriterion("fileCover =", value, "fileCover");
            return (Criteria) this;
        }

        public Criteria andFileCoverNotEqualTo(String value) {
            addCriterion("fileCover <>", value, "fileCover");
            return (Criteria) this;
        }

        public Criteria andFileCoverGreaterThan(String value) {
            addCriterion("fileCover >", value, "fileCover");
            return (Criteria) this;
        }

        public Criteria andFileCoverGreaterThanOrEqualTo(String value) {
            addCriterion("fileCover >=", value, "fileCover");
            return (Criteria) this;
        }

        public Criteria andFileCoverLessThan(String value) {
            addCriterion("fileCover <", value, "fileCover");
            return (Criteria) this;
        }

        public Criteria andFileCoverLessThanOrEqualTo(String value) {
            addCriterion("fileCover <=", value, "fileCover");
            return (Criteria) this;
        }

        public Criteria andFileCoverLike(String value) {
            addCriterion("fileCover like", value, "fileCover");
            return (Criteria) this;
        }

        public Criteria andFileCoverNotLike(String value) {
            addCriterion("fileCover not like", value, "fileCover");
            return (Criteria) this;
        }

        public Criteria andFileCoverIn(List<String> values) {
            addCriterion("fileCover in", values, "fileCover");
            return (Criteria) this;
        }

        public Criteria andFileCoverNotIn(List<String> values) {
            addCriterion("fileCover not in", values, "fileCover");
            return (Criteria) this;
        }

        public Criteria andFileCoverBetween(String value1, String value2) {
            addCriterion("fileCover between", value1, value2, "fileCover");
            return (Criteria) this;
        }

        public Criteria andFileCoverNotBetween(String value1, String value2) {
            addCriterion("fileCover not between", value1, value2, "fileCover");
            return (Criteria) this;
        }

        public Criteria andFileAbsoluteUrlIsNull() {
            addCriterion("fileAbsoluteUrl is null");
            return (Criteria) this;
        }

        public Criteria andFileAbsoluteUrlIsNotNull() {
            addCriterion("fileAbsoluteUrl is not null");
            return (Criteria) this;
        }

        public Criteria andFileAbsoluteUrlEqualTo(String value) {
            addCriterion("fileAbsoluteUrl =", value, "fileAbsoluteUrl");
            return (Criteria) this;
        }

        public Criteria andFileAbsoluteUrlNotEqualTo(String value) {
            addCriterion("fileAbsoluteUrl <>", value, "fileAbsoluteUrl");
            return (Criteria) this;
        }

        public Criteria andFileAbsoluteUrlGreaterThan(String value) {
            addCriterion("fileAbsoluteUrl >", value, "fileAbsoluteUrl");
            return (Criteria) this;
        }

        public Criteria andFileAbsoluteUrlGreaterThanOrEqualTo(String value) {
            addCriterion("fileAbsoluteUrl >=", value, "fileAbsoluteUrl");
            return (Criteria) this;
        }

        public Criteria andFileAbsoluteUrlLessThan(String value) {
            addCriterion("fileAbsoluteUrl <", value, "fileAbsoluteUrl");
            return (Criteria) this;
        }

        public Criteria andFileAbsoluteUrlLessThanOrEqualTo(String value) {
            addCriterion("fileAbsoluteUrl <=", value, "fileAbsoluteUrl");
            return (Criteria) this;
        }

        public Criteria andFileAbsoluteUrlLike(String value) {
            addCriterion("fileAbsoluteUrl like", value, "fileAbsoluteUrl");
            return (Criteria) this;
        }

        public Criteria andFileAbsoluteUrlNotLike(String value) {
            addCriterion("fileAbsoluteUrl not like", value, "fileAbsoluteUrl");
            return (Criteria) this;
        }

        public Criteria andFileAbsoluteUrlIn(List<String> values) {
            addCriterion("fileAbsoluteUrl in", values, "fileAbsoluteUrl");
            return (Criteria) this;
        }

        public Criteria andFileAbsoluteUrlNotIn(List<String> values) {
            addCriterion("fileAbsoluteUrl not in", values, "fileAbsoluteUrl");
            return (Criteria) this;
        }

        public Criteria andFileAbsoluteUrlBetween(String value1, String value2) {
            addCriterion("fileAbsoluteUrl between", value1, value2, "fileAbsoluteUrl");
            return (Criteria) this;
        }

        public Criteria andFileAbsoluteUrlNotBetween(String value1, String value2) {
            addCriterion("fileAbsoluteUrl not between", value1, value2, "fileAbsoluteUrl");
            return (Criteria) this;
        }

        public Criteria andFileExtIsNull() {
            addCriterion("fileExt is null");
            return (Criteria) this;
        }

        public Criteria andFileExtIsNotNull() {
            addCriterion("fileExt is not null");
            return (Criteria) this;
        }

        public Criteria andFileExtEqualTo(String value) {
            addCriterion("fileExt =", value, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtNotEqualTo(String value) {
            addCriterion("fileExt <>", value, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtGreaterThan(String value) {
            addCriterion("fileExt >", value, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtGreaterThanOrEqualTo(String value) {
            addCriterion("fileExt >=", value, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtLessThan(String value) {
            addCriterion("fileExt <", value, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtLessThanOrEqualTo(String value) {
            addCriterion("fileExt <=", value, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtLike(String value) {
            addCriterion("fileExt like", value, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtNotLike(String value) {
            addCriterion("fileExt not like", value, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtIn(List<String> values) {
            addCriterion("fileExt in", values, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtNotIn(List<String> values) {
            addCriterion("fileExt not in", values, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtBetween(String value1, String value2) {
            addCriterion("fileExt between", value1, value2, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtNotBetween(String value1, String value2) {
            addCriterion("fileExt not between", value1, value2, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileMsgIsNull() {
            addCriterion("fileMsg is null");
            return (Criteria) this;
        }

        public Criteria andFileMsgIsNotNull() {
            addCriterion("fileMsg is not null");
            return (Criteria) this;
        }

        public Criteria andFileMsgEqualTo(String value) {
            addCriterion("fileMsg =", value, "fileMsg");
            return (Criteria) this;
        }

        public Criteria andFileMsgNotEqualTo(String value) {
            addCriterion("fileMsg <>", value, "fileMsg");
            return (Criteria) this;
        }

        public Criteria andFileMsgGreaterThan(String value) {
            addCriterion("fileMsg >", value, "fileMsg");
            return (Criteria) this;
        }

        public Criteria andFileMsgGreaterThanOrEqualTo(String value) {
            addCriterion("fileMsg >=", value, "fileMsg");
            return (Criteria) this;
        }

        public Criteria andFileMsgLessThan(String value) {
            addCriterion("fileMsg <", value, "fileMsg");
            return (Criteria) this;
        }

        public Criteria andFileMsgLessThanOrEqualTo(String value) {
            addCriterion("fileMsg <=", value, "fileMsg");
            return (Criteria) this;
        }

        public Criteria andFileMsgLike(String value) {
            addCriterion("fileMsg like", value, "fileMsg");
            return (Criteria) this;
        }

        public Criteria andFileMsgNotLike(String value) {
            addCriterion("fileMsg not like", value, "fileMsg");
            return (Criteria) this;
        }

        public Criteria andFileMsgIn(List<String> values) {
            addCriterion("fileMsg in", values, "fileMsg");
            return (Criteria) this;
        }

        public Criteria andFileMsgNotIn(List<String> values) {
            addCriterion("fileMsg not in", values, "fileMsg");
            return (Criteria) this;
        }

        public Criteria andFileMsgBetween(String value1, String value2) {
            addCriterion("fileMsg between", value1, value2, "fileMsg");
            return (Criteria) this;
        }

        public Criteria andFileMsgNotBetween(String value1, String value2) {
            addCriterion("fileMsg not between", value1, value2, "fileMsg");
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