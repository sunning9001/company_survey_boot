package com.wiot.survey.model;

import java.util.ArrayList;
import java.util.List;

public class SurveyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SurveyExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNull() {
            addCriterion("companyName is null");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNotNull() {
            addCriterion("companyName is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynameEqualTo(String value) {
            addCriterion("companyName =", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotEqualTo(String value) {
            addCriterion("companyName <>", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThan(String value) {
            addCriterion("companyName >", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("companyName >=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThan(String value) {
            addCriterion("companyName <", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThanOrEqualTo(String value) {
            addCriterion("companyName <=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLike(String value) {
            addCriterion("companyName like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotLike(String value) {
            addCriterion("companyName not like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIn(List<String> values) {
            addCriterion("companyName in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotIn(List<String> values) {
            addCriterion("companyName not in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameBetween(String value1, String value2) {
            addCriterion("companyName between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotBetween(String value1, String value2) {
            addCriterion("companyName not between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanyinfoIsNull() {
            addCriterion("companyInfo is null");
            return (Criteria) this;
        }

        public Criteria andCompanyinfoIsNotNull() {
            addCriterion("companyInfo is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyinfoEqualTo(String value) {
            addCriterion("companyInfo =", value, "companyinfo");
            return (Criteria) this;
        }

        public Criteria andCompanyinfoNotEqualTo(String value) {
            addCriterion("companyInfo <>", value, "companyinfo");
            return (Criteria) this;
        }

        public Criteria andCompanyinfoGreaterThan(String value) {
            addCriterion("companyInfo >", value, "companyinfo");
            return (Criteria) this;
        }

        public Criteria andCompanyinfoGreaterThanOrEqualTo(String value) {
            addCriterion("companyInfo >=", value, "companyinfo");
            return (Criteria) this;
        }

        public Criteria andCompanyinfoLessThan(String value) {
            addCriterion("companyInfo <", value, "companyinfo");
            return (Criteria) this;
        }

        public Criteria andCompanyinfoLessThanOrEqualTo(String value) {
            addCriterion("companyInfo <=", value, "companyinfo");
            return (Criteria) this;
        }

        public Criteria andCompanyinfoLike(String value) {
            addCriterion("companyInfo like", value, "companyinfo");
            return (Criteria) this;
        }

        public Criteria andCompanyinfoNotLike(String value) {
            addCriterion("companyInfo not like", value, "companyinfo");
            return (Criteria) this;
        }

        public Criteria andCompanyinfoIn(List<String> values) {
            addCriterion("companyInfo in", values, "companyinfo");
            return (Criteria) this;
        }

        public Criteria andCompanyinfoNotIn(List<String> values) {
            addCriterion("companyInfo not in", values, "companyinfo");
            return (Criteria) this;
        }

        public Criteria andCompanyinfoBetween(String value1, String value2) {
            addCriterion("companyInfo between", value1, value2, "companyinfo");
            return (Criteria) this;
        }

        public Criteria andCompanyinfoNotBetween(String value1, String value2) {
            addCriterion("companyInfo not between", value1, value2, "companyinfo");
            return (Criteria) this;
        }

        public Criteria andCompanylinkIsNull() {
            addCriterion("companyLink is null");
            return (Criteria) this;
        }

        public Criteria andCompanylinkIsNotNull() {
            addCriterion("companyLink is not null");
            return (Criteria) this;
        }

        public Criteria andCompanylinkEqualTo(String value) {
            addCriterion("companyLink =", value, "companylink");
            return (Criteria) this;
        }

        public Criteria andCompanylinkNotEqualTo(String value) {
            addCriterion("companyLink <>", value, "companylink");
            return (Criteria) this;
        }

        public Criteria andCompanylinkGreaterThan(String value) {
            addCriterion("companyLink >", value, "companylink");
            return (Criteria) this;
        }

        public Criteria andCompanylinkGreaterThanOrEqualTo(String value) {
            addCriterion("companyLink >=", value, "companylink");
            return (Criteria) this;
        }

        public Criteria andCompanylinkLessThan(String value) {
            addCriterion("companyLink <", value, "companylink");
            return (Criteria) this;
        }

        public Criteria andCompanylinkLessThanOrEqualTo(String value) {
            addCriterion("companyLink <=", value, "companylink");
            return (Criteria) this;
        }

        public Criteria andCompanylinkLike(String value) {
            addCriterion("companyLink like", value, "companylink");
            return (Criteria) this;
        }

        public Criteria andCompanylinkNotLike(String value) {
            addCriterion("companyLink not like", value, "companylink");
            return (Criteria) this;
        }

        public Criteria andCompanylinkIn(List<String> values) {
            addCriterion("companyLink in", values, "companylink");
            return (Criteria) this;
        }

        public Criteria andCompanylinkNotIn(List<String> values) {
            addCriterion("companyLink not in", values, "companylink");
            return (Criteria) this;
        }

        public Criteria andCompanylinkBetween(String value1, String value2) {
            addCriterion("companyLink between", value1, value2, "companylink");
            return (Criteria) this;
        }

        public Criteria andCompanylinkNotBetween(String value1, String value2) {
            addCriterion("companyLink not between", value1, value2, "companylink");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressIsNull() {
            addCriterion("companyAddress is null");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressIsNotNull() {
            addCriterion("companyAddress is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressEqualTo(String value) {
            addCriterion("companyAddress =", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressNotEqualTo(String value) {
            addCriterion("companyAddress <>", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressGreaterThan(String value) {
            addCriterion("companyAddress >", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressGreaterThanOrEqualTo(String value) {
            addCriterion("companyAddress >=", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressLessThan(String value) {
            addCriterion("companyAddress <", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressLessThanOrEqualTo(String value) {
            addCriterion("companyAddress <=", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressLike(String value) {
            addCriterion("companyAddress like", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressNotLike(String value) {
            addCriterion("companyAddress not like", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressIn(List<String> values) {
            addCriterion("companyAddress in", values, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressNotIn(List<String> values) {
            addCriterion("companyAddress not in", values, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressBetween(String value1, String value2) {
            addCriterion("companyAddress between", value1, value2, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressNotBetween(String value1, String value2) {
            addCriterion("companyAddress not between", value1, value2, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(String value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(String value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(String value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(String value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(String value) {
            addCriterion("createTime like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(String value) {
            addCriterion("createTime not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<String> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<String> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(String value1, String value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(String value1, String value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andLinknameIsNull() {
            addCriterion("linkName is null");
            return (Criteria) this;
        }

        public Criteria andLinknameIsNotNull() {
            addCriterion("linkName is not null");
            return (Criteria) this;
        }

        public Criteria andLinknameEqualTo(String value) {
            addCriterion("linkName =", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameNotEqualTo(String value) {
            addCriterion("linkName <>", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameGreaterThan(String value) {
            addCriterion("linkName >", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameGreaterThanOrEqualTo(String value) {
            addCriterion("linkName >=", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameLessThan(String value) {
            addCriterion("linkName <", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameLessThanOrEqualTo(String value) {
            addCriterion("linkName <=", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameLike(String value) {
            addCriterion("linkName like", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameNotLike(String value) {
            addCriterion("linkName not like", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameIn(List<String> values) {
            addCriterion("linkName in", values, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameNotIn(List<String> values) {
            addCriterion("linkName not in", values, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameBetween(String value1, String value2) {
            addCriterion("linkName between", value1, value2, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameNotBetween(String value1, String value2) {
            addCriterion("linkName not between", value1, value2, "linkname");
            return (Criteria) this;
        }

        public Criteria andLiketelephoneIsNull() {
            addCriterion("likeTelephone is null");
            return (Criteria) this;
        }

        public Criteria andLiketelephoneIsNotNull() {
            addCriterion("likeTelephone is not null");
            return (Criteria) this;
        }

        public Criteria andLiketelephoneEqualTo(String value) {
            addCriterion("likeTelephone =", value, "liketelephone");
            return (Criteria) this;
        }

        public Criteria andLiketelephoneNotEqualTo(String value) {
            addCriterion("likeTelephone <>", value, "liketelephone");
            return (Criteria) this;
        }

        public Criteria andLiketelephoneGreaterThan(String value) {
            addCriterion("likeTelephone >", value, "liketelephone");
            return (Criteria) this;
        }

        public Criteria andLiketelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("likeTelephone >=", value, "liketelephone");
            return (Criteria) this;
        }

        public Criteria andLiketelephoneLessThan(String value) {
            addCriterion("likeTelephone <", value, "liketelephone");
            return (Criteria) this;
        }

        public Criteria andLiketelephoneLessThanOrEqualTo(String value) {
            addCriterion("likeTelephone <=", value, "liketelephone");
            return (Criteria) this;
        }

        public Criteria andLiketelephoneLike(String value) {
            addCriterion("likeTelephone like", value, "liketelephone");
            return (Criteria) this;
        }

        public Criteria andLiketelephoneNotLike(String value) {
            addCriterion("likeTelephone not like", value, "liketelephone");
            return (Criteria) this;
        }

        public Criteria andLiketelephoneIn(List<String> values) {
            addCriterion("likeTelephone in", values, "liketelephone");
            return (Criteria) this;
        }

        public Criteria andLiketelephoneNotIn(List<String> values) {
            addCriterion("likeTelephone not in", values, "liketelephone");
            return (Criteria) this;
        }

        public Criteria andLiketelephoneBetween(String value1, String value2) {
            addCriterion("likeTelephone between", value1, value2, "liketelephone");
            return (Criteria) this;
        }

        public Criteria andLiketelephoneNotBetween(String value1, String value2) {
            addCriterion("likeTelephone not between", value1, value2, "liketelephone");
            return (Criteria) this;
        }

        public Criteria andLinkemailIsNull() {
            addCriterion("linkEmail is null");
            return (Criteria) this;
        }

        public Criteria andLinkemailIsNotNull() {
            addCriterion("linkEmail is not null");
            return (Criteria) this;
        }

        public Criteria andLinkemailEqualTo(String value) {
            addCriterion("linkEmail =", value, "linkemail");
            return (Criteria) this;
        }

        public Criteria andLinkemailNotEqualTo(String value) {
            addCriterion("linkEmail <>", value, "linkemail");
            return (Criteria) this;
        }

        public Criteria andLinkemailGreaterThan(String value) {
            addCriterion("linkEmail >", value, "linkemail");
            return (Criteria) this;
        }

        public Criteria andLinkemailGreaterThanOrEqualTo(String value) {
            addCriterion("linkEmail >=", value, "linkemail");
            return (Criteria) this;
        }

        public Criteria andLinkemailLessThan(String value) {
            addCriterion("linkEmail <", value, "linkemail");
            return (Criteria) this;
        }

        public Criteria andLinkemailLessThanOrEqualTo(String value) {
            addCriterion("linkEmail <=", value, "linkemail");
            return (Criteria) this;
        }

        public Criteria andLinkemailLike(String value) {
            addCriterion("linkEmail like", value, "linkemail");
            return (Criteria) this;
        }

        public Criteria andLinkemailNotLike(String value) {
            addCriterion("linkEmail not like", value, "linkemail");
            return (Criteria) this;
        }

        public Criteria andLinkemailIn(List<String> values) {
            addCriterion("linkEmail in", values, "linkemail");
            return (Criteria) this;
        }

        public Criteria andLinkemailNotIn(List<String> values) {
            addCriterion("linkEmail not in", values, "linkemail");
            return (Criteria) this;
        }

        public Criteria andLinkemailBetween(String value1, String value2) {
            addCriterion("linkEmail between", value1, value2, "linkemail");
            return (Criteria) this;
        }

        public Criteria andLinkemailNotBetween(String value1, String value2) {
            addCriterion("linkEmail not between", value1, value2, "linkemail");
            return (Criteria) this;
        }

        public Criteria andRegisterflagIsNull() {
            addCriterion("registerFlag is null");
            return (Criteria) this;
        }

        public Criteria andRegisterflagIsNotNull() {
            addCriterion("registerFlag is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterflagEqualTo(String value) {
            addCriterion("registerFlag =", value, "registerflag");
            return (Criteria) this;
        }

        public Criteria andRegisterflagNotEqualTo(String value) {
            addCriterion("registerFlag <>", value, "registerflag");
            return (Criteria) this;
        }

        public Criteria andRegisterflagGreaterThan(String value) {
            addCriterion("registerFlag >", value, "registerflag");
            return (Criteria) this;
        }

        public Criteria andRegisterflagGreaterThanOrEqualTo(String value) {
            addCriterion("registerFlag >=", value, "registerflag");
            return (Criteria) this;
        }

        public Criteria andRegisterflagLessThan(String value) {
            addCriterion("registerFlag <", value, "registerflag");
            return (Criteria) this;
        }

        public Criteria andRegisterflagLessThanOrEqualTo(String value) {
            addCriterion("registerFlag <=", value, "registerflag");
            return (Criteria) this;
        }

        public Criteria andRegisterflagLike(String value) {
            addCriterion("registerFlag like", value, "registerflag");
            return (Criteria) this;
        }

        public Criteria andRegisterflagNotLike(String value) {
            addCriterion("registerFlag not like", value, "registerflag");
            return (Criteria) this;
        }

        public Criteria andRegisterflagIn(List<String> values) {
            addCriterion("registerFlag in", values, "registerflag");
            return (Criteria) this;
        }

        public Criteria andRegisterflagNotIn(List<String> values) {
            addCriterion("registerFlag not in", values, "registerflag");
            return (Criteria) this;
        }

        public Criteria andRegisterflagBetween(String value1, String value2) {
            addCriterion("registerFlag between", value1, value2, "registerflag");
            return (Criteria) this;
        }

        public Criteria andRegisterflagNotBetween(String value1, String value2) {
            addCriterion("registerFlag not between", value1, value2, "registerflag");
            return (Criteria) this;
        }

        public Criteria andRegistertelephoneIsNull() {
            addCriterion("registerTelephone is null");
            return (Criteria) this;
        }

        public Criteria andRegistertelephoneIsNotNull() {
            addCriterion("registerTelephone is not null");
            return (Criteria) this;
        }

        public Criteria andRegistertelephoneEqualTo(String value) {
            addCriterion("registerTelephone =", value, "registertelephone");
            return (Criteria) this;
        }

        public Criteria andRegistertelephoneNotEqualTo(String value) {
            addCriterion("registerTelephone <>", value, "registertelephone");
            return (Criteria) this;
        }

        public Criteria andRegistertelephoneGreaterThan(String value) {
            addCriterion("registerTelephone >", value, "registertelephone");
            return (Criteria) this;
        }

        public Criteria andRegistertelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("registerTelephone >=", value, "registertelephone");
            return (Criteria) this;
        }

        public Criteria andRegistertelephoneLessThan(String value) {
            addCriterion("registerTelephone <", value, "registertelephone");
            return (Criteria) this;
        }

        public Criteria andRegistertelephoneLessThanOrEqualTo(String value) {
            addCriterion("registerTelephone <=", value, "registertelephone");
            return (Criteria) this;
        }

        public Criteria andRegistertelephoneLike(String value) {
            addCriterion("registerTelephone like", value, "registertelephone");
            return (Criteria) this;
        }

        public Criteria andRegistertelephoneNotLike(String value) {
            addCriterion("registerTelephone not like", value, "registertelephone");
            return (Criteria) this;
        }

        public Criteria andRegistertelephoneIn(List<String> values) {
            addCriterion("registerTelephone in", values, "registertelephone");
            return (Criteria) this;
        }

        public Criteria andRegistertelephoneNotIn(List<String> values) {
            addCriterion("registerTelephone not in", values, "registertelephone");
            return (Criteria) this;
        }

        public Criteria andRegistertelephoneBetween(String value1, String value2) {
            addCriterion("registerTelephone between", value1, value2, "registertelephone");
            return (Criteria) this;
        }

        public Criteria andRegistertelephoneNotBetween(String value1, String value2) {
            addCriterion("registerTelephone not between", value1, value2, "registertelephone");
            return (Criteria) this;
        }

        public Criteria andImportantbusinessIsNull() {
            addCriterion("importantBusiness is null");
            return (Criteria) this;
        }

        public Criteria andImportantbusinessIsNotNull() {
            addCriterion("importantBusiness is not null");
            return (Criteria) this;
        }

        public Criteria andImportantbusinessEqualTo(String value) {
            addCriterion("importantBusiness =", value, "importantbusiness");
            return (Criteria) this;
        }

        public Criteria andImportantbusinessNotEqualTo(String value) {
            addCriterion("importantBusiness <>", value, "importantbusiness");
            return (Criteria) this;
        }

        public Criteria andImportantbusinessGreaterThan(String value) {
            addCriterion("importantBusiness >", value, "importantbusiness");
            return (Criteria) this;
        }

        public Criteria andImportantbusinessGreaterThanOrEqualTo(String value) {
            addCriterion("importantBusiness >=", value, "importantbusiness");
            return (Criteria) this;
        }

        public Criteria andImportantbusinessLessThan(String value) {
            addCriterion("importantBusiness <", value, "importantbusiness");
            return (Criteria) this;
        }

        public Criteria andImportantbusinessLessThanOrEqualTo(String value) {
            addCriterion("importantBusiness <=", value, "importantbusiness");
            return (Criteria) this;
        }

        public Criteria andImportantbusinessLike(String value) {
            addCriterion("importantBusiness like", value, "importantbusiness");
            return (Criteria) this;
        }

        public Criteria andImportantbusinessNotLike(String value) {
            addCriterion("importantBusiness not like", value, "importantbusiness");
            return (Criteria) this;
        }

        public Criteria andImportantbusinessIn(List<String> values) {
            addCriterion("importantBusiness in", values, "importantbusiness");
            return (Criteria) this;
        }

        public Criteria andImportantbusinessNotIn(List<String> values) {
            addCriterion("importantBusiness not in", values, "importantbusiness");
            return (Criteria) this;
        }

        public Criteria andImportantbusinessBetween(String value1, String value2) {
            addCriterion("importantBusiness between", value1, value2, "importantbusiness");
            return (Criteria) this;
        }

        public Criteria andImportantbusinessNotBetween(String value1, String value2) {
            addCriterion("importantBusiness not between", value1, value2, "importantbusiness");
            return (Criteria) this;
        }

        public Criteria andMasterbusinessIsNull() {
            addCriterion("masterBusiness is null");
            return (Criteria) this;
        }

        public Criteria andMasterbusinessIsNotNull() {
            addCriterion("masterBusiness is not null");
            return (Criteria) this;
        }

        public Criteria andMasterbusinessEqualTo(String value) {
            addCriterion("masterBusiness =", value, "masterbusiness");
            return (Criteria) this;
        }

        public Criteria andMasterbusinessNotEqualTo(String value) {
            addCriterion("masterBusiness <>", value, "masterbusiness");
            return (Criteria) this;
        }

        public Criteria andMasterbusinessGreaterThan(String value) {
            addCriterion("masterBusiness >", value, "masterbusiness");
            return (Criteria) this;
        }

        public Criteria andMasterbusinessGreaterThanOrEqualTo(String value) {
            addCriterion("masterBusiness >=", value, "masterbusiness");
            return (Criteria) this;
        }

        public Criteria andMasterbusinessLessThan(String value) {
            addCriterion("masterBusiness <", value, "masterbusiness");
            return (Criteria) this;
        }

        public Criteria andMasterbusinessLessThanOrEqualTo(String value) {
            addCriterion("masterBusiness <=", value, "masterbusiness");
            return (Criteria) this;
        }

        public Criteria andMasterbusinessLike(String value) {
            addCriterion("masterBusiness like", value, "masterbusiness");
            return (Criteria) this;
        }

        public Criteria andMasterbusinessNotLike(String value) {
            addCriterion("masterBusiness not like", value, "masterbusiness");
            return (Criteria) this;
        }

        public Criteria andMasterbusinessIn(List<String> values) {
            addCriterion("masterBusiness in", values, "masterbusiness");
            return (Criteria) this;
        }

        public Criteria andMasterbusinessNotIn(List<String> values) {
            addCriterion("masterBusiness not in", values, "masterbusiness");
            return (Criteria) this;
        }

        public Criteria andMasterbusinessBetween(String value1, String value2) {
            addCriterion("masterBusiness between", value1, value2, "masterbusiness");
            return (Criteria) this;
        }

        public Criteria andMasterbusinessNotBetween(String value1, String value2) {
            addCriterion("masterBusiness not between", value1, value2, "masterbusiness");
            return (Criteria) this;
        }

        public Criteria andOweipIsNull() {
            addCriterion("oweIp is null");
            return (Criteria) this;
        }

        public Criteria andOweipIsNotNull() {
            addCriterion("oweIp is not null");
            return (Criteria) this;
        }

        public Criteria andOweipEqualTo(String value) {
            addCriterion("oweIp =", value, "oweip");
            return (Criteria) this;
        }

        public Criteria andOweipNotEqualTo(String value) {
            addCriterion("oweIp <>", value, "oweip");
            return (Criteria) this;
        }

        public Criteria andOweipGreaterThan(String value) {
            addCriterion("oweIp >", value, "oweip");
            return (Criteria) this;
        }

        public Criteria andOweipGreaterThanOrEqualTo(String value) {
            addCriterion("oweIp >=", value, "oweip");
            return (Criteria) this;
        }

        public Criteria andOweipLessThan(String value) {
            addCriterion("oweIp <", value, "oweip");
            return (Criteria) this;
        }

        public Criteria andOweipLessThanOrEqualTo(String value) {
            addCriterion("oweIp <=", value, "oweip");
            return (Criteria) this;
        }

        public Criteria andOweipLike(String value) {
            addCriterion("oweIp like", value, "oweip");
            return (Criteria) this;
        }

        public Criteria andOweipNotLike(String value) {
            addCriterion("oweIp not like", value, "oweip");
            return (Criteria) this;
        }

        public Criteria andOweipIn(List<String> values) {
            addCriterion("oweIp in", values, "oweip");
            return (Criteria) this;
        }

        public Criteria andOweipNotIn(List<String> values) {
            addCriterion("oweIp not in", values, "oweip");
            return (Criteria) this;
        }

        public Criteria andOweipBetween(String value1, String value2) {
            addCriterion("oweIp between", value1, value2, "oweip");
            return (Criteria) this;
        }

        public Criteria andOweipNotBetween(String value1, String value2) {
            addCriterion("oweIp not between", value1, value2, "oweip");
            return (Criteria) this;
        }

        public Criteria andCompanymemberIsNull() {
            addCriterion("companyMember is null");
            return (Criteria) this;
        }

        public Criteria andCompanymemberIsNotNull() {
            addCriterion("companyMember is not null");
            return (Criteria) this;
        }

        public Criteria andCompanymemberEqualTo(String value) {
            addCriterion("companyMember =", value, "companymember");
            return (Criteria) this;
        }

        public Criteria andCompanymemberNotEqualTo(String value) {
            addCriterion("companyMember <>", value, "companymember");
            return (Criteria) this;
        }

        public Criteria andCompanymemberGreaterThan(String value) {
            addCriterion("companyMember >", value, "companymember");
            return (Criteria) this;
        }

        public Criteria andCompanymemberGreaterThanOrEqualTo(String value) {
            addCriterion("companyMember >=", value, "companymember");
            return (Criteria) this;
        }

        public Criteria andCompanymemberLessThan(String value) {
            addCriterion("companyMember <", value, "companymember");
            return (Criteria) this;
        }

        public Criteria andCompanymemberLessThanOrEqualTo(String value) {
            addCriterion("companyMember <=", value, "companymember");
            return (Criteria) this;
        }

        public Criteria andCompanymemberLike(String value) {
            addCriterion("companyMember like", value, "companymember");
            return (Criteria) this;
        }

        public Criteria andCompanymemberNotLike(String value) {
            addCriterion("companyMember not like", value, "companymember");
            return (Criteria) this;
        }

        public Criteria andCompanymemberIn(List<String> values) {
            addCriterion("companyMember in", values, "companymember");
            return (Criteria) this;
        }

        public Criteria andCompanymemberNotIn(List<String> values) {
            addCriterion("companyMember not in", values, "companymember");
            return (Criteria) this;
        }

        public Criteria andCompanymemberBetween(String value1, String value2) {
            addCriterion("companyMember between", value1, value2, "companymember");
            return (Criteria) this;
        }

        public Criteria andCompanymemberNotBetween(String value1, String value2) {
            addCriterion("companyMember not between", value1, value2, "companymember");
            return (Criteria) this;
        }

        public Criteria andTechmemberIsNull() {
            addCriterion("techMember is null");
            return (Criteria) this;
        }

        public Criteria andTechmemberIsNotNull() {
            addCriterion("techMember is not null");
            return (Criteria) this;
        }

        public Criteria andTechmemberEqualTo(String value) {
            addCriterion("techMember =", value, "techmember");
            return (Criteria) this;
        }

        public Criteria andTechmemberNotEqualTo(String value) {
            addCriterion("techMember <>", value, "techmember");
            return (Criteria) this;
        }

        public Criteria andTechmemberGreaterThan(String value) {
            addCriterion("techMember >", value, "techmember");
            return (Criteria) this;
        }

        public Criteria andTechmemberGreaterThanOrEqualTo(String value) {
            addCriterion("techMember >=", value, "techmember");
            return (Criteria) this;
        }

        public Criteria andTechmemberLessThan(String value) {
            addCriterion("techMember <", value, "techmember");
            return (Criteria) this;
        }

        public Criteria andTechmemberLessThanOrEqualTo(String value) {
            addCriterion("techMember <=", value, "techmember");
            return (Criteria) this;
        }

        public Criteria andTechmemberLike(String value) {
            addCriterion("techMember like", value, "techmember");
            return (Criteria) this;
        }

        public Criteria andTechmemberNotLike(String value) {
            addCriterion("techMember not like", value, "techmember");
            return (Criteria) this;
        }

        public Criteria andTechmemberIn(List<String> values) {
            addCriterion("techMember in", values, "techmember");
            return (Criteria) this;
        }

        public Criteria andTechmemberNotIn(List<String> values) {
            addCriterion("techMember not in", values, "techmember");
            return (Criteria) this;
        }

        public Criteria andTechmemberBetween(String value1, String value2) {
            addCriterion("techMember between", value1, value2, "techmember");
            return (Criteria) this;
        }

        public Criteria andTechmemberNotBetween(String value1, String value2) {
            addCriterion("techMember not between", value1, value2, "techmember");
            return (Criteria) this;
        }

        public Criteria andTechmoneyIsNull() {
            addCriterion("techMoney is null");
            return (Criteria) this;
        }

        public Criteria andTechmoneyIsNotNull() {
            addCriterion("techMoney is not null");
            return (Criteria) this;
        }

        public Criteria andTechmoneyEqualTo(String value) {
            addCriterion("techMoney =", value, "techmoney");
            return (Criteria) this;
        }

        public Criteria andTechmoneyNotEqualTo(String value) {
            addCriterion("techMoney <>", value, "techmoney");
            return (Criteria) this;
        }

        public Criteria andTechmoneyGreaterThan(String value) {
            addCriterion("techMoney >", value, "techmoney");
            return (Criteria) this;
        }

        public Criteria andTechmoneyGreaterThanOrEqualTo(String value) {
            addCriterion("techMoney >=", value, "techmoney");
            return (Criteria) this;
        }

        public Criteria andTechmoneyLessThan(String value) {
            addCriterion("techMoney <", value, "techmoney");
            return (Criteria) this;
        }

        public Criteria andTechmoneyLessThanOrEqualTo(String value) {
            addCriterion("techMoney <=", value, "techmoney");
            return (Criteria) this;
        }

        public Criteria andTechmoneyLike(String value) {
            addCriterion("techMoney like", value, "techmoney");
            return (Criteria) this;
        }

        public Criteria andTechmoneyNotLike(String value) {
            addCriterion("techMoney not like", value, "techmoney");
            return (Criteria) this;
        }

        public Criteria andTechmoneyIn(List<String> values) {
            addCriterion("techMoney in", values, "techmoney");
            return (Criteria) this;
        }

        public Criteria andTechmoneyNotIn(List<String> values) {
            addCriterion("techMoney not in", values, "techmoney");
            return (Criteria) this;
        }

        public Criteria andTechmoneyBetween(String value1, String value2) {
            addCriterion("techMoney between", value1, value2, "techmoney");
            return (Criteria) this;
        }

        public Criteria andTechmoneyNotBetween(String value1, String value2) {
            addCriterion("techMoney not between", value1, value2, "techmoney");
            return (Criteria) this;
        }

        public Criteria andBusinessmoneyIsNull() {
            addCriterion("businessMoney is null");
            return (Criteria) this;
        }

        public Criteria andBusinessmoneyIsNotNull() {
            addCriterion("businessMoney is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessmoneyEqualTo(String value) {
            addCriterion("businessMoney =", value, "businessmoney");
            return (Criteria) this;
        }

        public Criteria andBusinessmoneyNotEqualTo(String value) {
            addCriterion("businessMoney <>", value, "businessmoney");
            return (Criteria) this;
        }

        public Criteria andBusinessmoneyGreaterThan(String value) {
            addCriterion("businessMoney >", value, "businessmoney");
            return (Criteria) this;
        }

        public Criteria andBusinessmoneyGreaterThanOrEqualTo(String value) {
            addCriterion("businessMoney >=", value, "businessmoney");
            return (Criteria) this;
        }

        public Criteria andBusinessmoneyLessThan(String value) {
            addCriterion("businessMoney <", value, "businessmoney");
            return (Criteria) this;
        }

        public Criteria andBusinessmoneyLessThanOrEqualTo(String value) {
            addCriterion("businessMoney <=", value, "businessmoney");
            return (Criteria) this;
        }

        public Criteria andBusinessmoneyLike(String value) {
            addCriterion("businessMoney like", value, "businessmoney");
            return (Criteria) this;
        }

        public Criteria andBusinessmoneyNotLike(String value) {
            addCriterion("businessMoney not like", value, "businessmoney");
            return (Criteria) this;
        }

        public Criteria andBusinessmoneyIn(List<String> values) {
            addCriterion("businessMoney in", values, "businessmoney");
            return (Criteria) this;
        }

        public Criteria andBusinessmoneyNotIn(List<String> values) {
            addCriterion("businessMoney not in", values, "businessmoney");
            return (Criteria) this;
        }

        public Criteria andBusinessmoneyBetween(String value1, String value2) {
            addCriterion("businessMoney between", value1, value2, "businessmoney");
            return (Criteria) this;
        }

        public Criteria andBusinessmoneyNotBetween(String value1, String value2) {
            addCriterion("businessMoney not between", value1, value2, "businessmoney");
            return (Criteria) this;
        }

        public Criteria andCompanydemandIsNull() {
            addCriterion("companyDemand is null");
            return (Criteria) this;
        }

        public Criteria andCompanydemandIsNotNull() {
            addCriterion("companyDemand is not null");
            return (Criteria) this;
        }

        public Criteria andCompanydemandEqualTo(String value) {
            addCriterion("companyDemand =", value, "companydemand");
            return (Criteria) this;
        }

        public Criteria andCompanydemandNotEqualTo(String value) {
            addCriterion("companyDemand <>", value, "companydemand");
            return (Criteria) this;
        }

        public Criteria andCompanydemandGreaterThan(String value) {
            addCriterion("companyDemand >", value, "companydemand");
            return (Criteria) this;
        }

        public Criteria andCompanydemandGreaterThanOrEqualTo(String value) {
            addCriterion("companyDemand >=", value, "companydemand");
            return (Criteria) this;
        }

        public Criteria andCompanydemandLessThan(String value) {
            addCriterion("companyDemand <", value, "companydemand");
            return (Criteria) this;
        }

        public Criteria andCompanydemandLessThanOrEqualTo(String value) {
            addCriterion("companyDemand <=", value, "companydemand");
            return (Criteria) this;
        }

        public Criteria andCompanydemandLike(String value) {
            addCriterion("companyDemand like", value, "companydemand");
            return (Criteria) this;
        }

        public Criteria andCompanydemandNotLike(String value) {
            addCriterion("companyDemand not like", value, "companydemand");
            return (Criteria) this;
        }

        public Criteria andCompanydemandIn(List<String> values) {
            addCriterion("companyDemand in", values, "companydemand");
            return (Criteria) this;
        }

        public Criteria andCompanydemandNotIn(List<String> values) {
            addCriterion("companyDemand not in", values, "companydemand");
            return (Criteria) this;
        }

        public Criteria andCompanydemandBetween(String value1, String value2) {
            addCriterion("companyDemand between", value1, value2, "companydemand");
            return (Criteria) this;
        }

        public Criteria andCompanydemandNotBetween(String value1, String value2) {
            addCriterion("companyDemand not between", value1, value2, "companydemand");
            return (Criteria) this;
        }

        public Criteria andRemarkinfosIsNull() {
            addCriterion("remarkInfos is null");
            return (Criteria) this;
        }

        public Criteria andRemarkinfosIsNotNull() {
            addCriterion("remarkInfos is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkinfosEqualTo(String value) {
            addCriterion("remarkInfos =", value, "remarkinfos");
            return (Criteria) this;
        }

        public Criteria andRemarkinfosNotEqualTo(String value) {
            addCriterion("remarkInfos <>", value, "remarkinfos");
            return (Criteria) this;
        }

        public Criteria andRemarkinfosGreaterThan(String value) {
            addCriterion("remarkInfos >", value, "remarkinfos");
            return (Criteria) this;
        }

        public Criteria andRemarkinfosGreaterThanOrEqualTo(String value) {
            addCriterion("remarkInfos >=", value, "remarkinfos");
            return (Criteria) this;
        }

        public Criteria andRemarkinfosLessThan(String value) {
            addCriterion("remarkInfos <", value, "remarkinfos");
            return (Criteria) this;
        }

        public Criteria andRemarkinfosLessThanOrEqualTo(String value) {
            addCriterion("remarkInfos <=", value, "remarkinfos");
            return (Criteria) this;
        }

        public Criteria andRemarkinfosLike(String value) {
            addCriterion("remarkInfos like", value, "remarkinfos");
            return (Criteria) this;
        }

        public Criteria andRemarkinfosNotLike(String value) {
            addCriterion("remarkInfos not like", value, "remarkinfos");
            return (Criteria) this;
        }

        public Criteria andRemarkinfosIn(List<String> values) {
            addCriterion("remarkInfos in", values, "remarkinfos");
            return (Criteria) this;
        }

        public Criteria andRemarkinfosNotIn(List<String> values) {
            addCriterion("remarkInfos not in", values, "remarkinfos");
            return (Criteria) this;
        }

        public Criteria andRemarkinfosBetween(String value1, String value2) {
            addCriterion("remarkInfos between", value1, value2, "remarkinfos");
            return (Criteria) this;
        }

        public Criteria andRemarkinfosNotBetween(String value1, String value2) {
            addCriterion("remarkInfos not between", value1, value2, "remarkinfos");
            return (Criteria) this;
        }

        public Criteria andFilelistIsNull() {
            addCriterion("fileList is null");
            return (Criteria) this;
        }

        public Criteria andFilelistIsNotNull() {
            addCriterion("fileList is not null");
            return (Criteria) this;
        }

        public Criteria andFilelistEqualTo(String value) {
            addCriterion("fileList =", value, "filelist");
            return (Criteria) this;
        }

        public Criteria andFilelistNotEqualTo(String value) {
            addCriterion("fileList <>", value, "filelist");
            return (Criteria) this;
        }

        public Criteria andFilelistGreaterThan(String value) {
            addCriterion("fileList >", value, "filelist");
            return (Criteria) this;
        }

        public Criteria andFilelistGreaterThanOrEqualTo(String value) {
            addCriterion("fileList >=", value, "filelist");
            return (Criteria) this;
        }

        public Criteria andFilelistLessThan(String value) {
            addCriterion("fileList <", value, "filelist");
            return (Criteria) this;
        }

        public Criteria andFilelistLessThanOrEqualTo(String value) {
            addCriterion("fileList <=", value, "filelist");
            return (Criteria) this;
        }

        public Criteria andFilelistLike(String value) {
            addCriterion("fileList like", value, "filelist");
            return (Criteria) this;
        }

        public Criteria andFilelistNotLike(String value) {
            addCriterion("fileList not like", value, "filelist");
            return (Criteria) this;
        }

        public Criteria andFilelistIn(List<String> values) {
            addCriterion("fileList in", values, "filelist");
            return (Criteria) this;
        }

        public Criteria andFilelistNotIn(List<String> values) {
            addCriterion("fileList not in", values, "filelist");
            return (Criteria) this;
        }

        public Criteria andFilelistBetween(String value1, String value2) {
            addCriterion("fileList between", value1, value2, "filelist");
            return (Criteria) this;
        }

        public Criteria andFilelistNotBetween(String value1, String value2) {
            addCriterion("fileList not between", value1, value2, "filelist");
            return (Criteria) this;
        }

        public Criteria andLocationaddressIsNull() {
            addCriterion("locationAddress is null");
            return (Criteria) this;
        }

        public Criteria andLocationaddressIsNotNull() {
            addCriterion("locationAddress is not null");
            return (Criteria) this;
        }

        public Criteria andLocationaddressEqualTo(String value) {
            addCriterion("locationAddress =", value, "locationaddress");
            return (Criteria) this;
        }

        public Criteria andLocationaddressNotEqualTo(String value) {
            addCriterion("locationAddress <>", value, "locationaddress");
            return (Criteria) this;
        }

        public Criteria andLocationaddressGreaterThan(String value) {
            addCriterion("locationAddress >", value, "locationaddress");
            return (Criteria) this;
        }

        public Criteria andLocationaddressGreaterThanOrEqualTo(String value) {
            addCriterion("locationAddress >=", value, "locationaddress");
            return (Criteria) this;
        }

        public Criteria andLocationaddressLessThan(String value) {
            addCriterion("locationAddress <", value, "locationaddress");
            return (Criteria) this;
        }

        public Criteria andLocationaddressLessThanOrEqualTo(String value) {
            addCriterion("locationAddress <=", value, "locationaddress");
            return (Criteria) this;
        }

        public Criteria andLocationaddressLike(String value) {
            addCriterion("locationAddress like", value, "locationaddress");
            return (Criteria) this;
        }

        public Criteria andLocationaddressNotLike(String value) {
            addCriterion("locationAddress not like", value, "locationaddress");
            return (Criteria) this;
        }

        public Criteria andLocationaddressIn(List<String> values) {
            addCriterion("locationAddress in", values, "locationaddress");
            return (Criteria) this;
        }

        public Criteria andLocationaddressNotIn(List<String> values) {
            addCriterion("locationAddress not in", values, "locationaddress");
            return (Criteria) this;
        }

        public Criteria andLocationaddressBetween(String value1, String value2) {
            addCriterion("locationAddress between", value1, value2, "locationaddress");
            return (Criteria) this;
        }

        public Criteria andLocationaddressNotBetween(String value1, String value2) {
            addCriterion("locationAddress not between", value1, value2, "locationaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessnameIsNull() {
            addCriterion("businessName is null");
            return (Criteria) this;
        }

        public Criteria andBusinessnameIsNotNull() {
            addCriterion("businessName is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessnameEqualTo(String value) {
            addCriterion("businessName =", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameNotEqualTo(String value) {
            addCriterion("businessName <>", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameGreaterThan(String value) {
            addCriterion("businessName >", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameGreaterThanOrEqualTo(String value) {
            addCriterion("businessName >=", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameLessThan(String value) {
            addCriterion("businessName <", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameLessThanOrEqualTo(String value) {
            addCriterion("businessName <=", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameLike(String value) {
            addCriterion("businessName like", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameNotLike(String value) {
            addCriterion("businessName not like", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameIn(List<String> values) {
            addCriterion("businessName in", values, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameNotIn(List<String> values) {
            addCriterion("businessName not in", values, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameBetween(String value1, String value2) {
            addCriterion("businessName between", value1, value2, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameNotBetween(String value1, String value2) {
            addCriterion("businessName not between", value1, value2, "businessname");
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