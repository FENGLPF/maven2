package com.ssm.model;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

public class Device_infoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Device_infoExample() {
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

        public Criteria andDIdIsNull() {
            addCriterion("D_id is null");
            return (Criteria) this;
        }

        public Criteria andDIdIsNotNull() {
            addCriterion("D_id is not null");
            return (Criteria) this;
        }

        public Criteria andDIdEqualTo(Integer value) {
            addCriterion("D_id =", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotEqualTo(Integer value) {
            addCriterion("D_id <>", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThan(Integer value) {
            addCriterion("D_id >", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("D_id >=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThan(Integer value) {
            addCriterion("D_id <", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThanOrEqualTo(Integer value) {
            addCriterion("D_id <=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdIn(List<Integer> values) {
            addCriterion("D_id in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotIn(List<Integer> values) {
            addCriterion("D_id not in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdBetween(Integer value1, Integer value2) {
            addCriterion("D_id between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotBetween(Integer value1, Integer value2) {
            addCriterion("D_id not between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andMIdIsNull() {
            addCriterion("M_id is null");
            return (Criteria) this;
        }

        public Criteria andMIdIsNotNull() {
            addCriterion("M_id is not null");
            return (Criteria) this;
        }

        public Criteria andMIdEqualTo(Integer value) {
            addCriterion("M_id =", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotEqualTo(Integer value) {
            addCriterion("M_id <>", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThan(Integer value) {
            addCriterion("M_id >", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("M_id >=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThan(Integer value) {
            addCriterion("M_id <", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThanOrEqualTo(Integer value) {
            addCriterion("M_id <=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdIn(List<Integer> values) {
            addCriterion("M_id in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotIn(List<Integer> values) {
            addCriterion("M_id not in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdBetween(Integer value1, Integer value2) {
            addCriterion("M_id between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotBetween(Integer value1, Integer value2) {
            addCriterion("M_id not between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andDRidIsNull() {
            addCriterion("D_Rid is null");
            return (Criteria) this;
        }

        public Criteria andDRidIsNotNull() {
            addCriterion("D_Rid is not null");
            return (Criteria) this;
        }

        public Criteria andDRidEqualTo(Integer value) {
            addCriterion("D_Rid =", value, "dRid");
            return (Criteria) this;
        }

        public Criteria andDRidNotEqualTo(Integer value) {
            addCriterion("D_Rid <>", value, "dRid");
            return (Criteria) this;
        }

        public Criteria andDRidGreaterThan(Integer value) {
            addCriterion("D_Rid >", value, "dRid");
            return (Criteria) this;
        }

        public Criteria andDRidGreaterThanOrEqualTo(Integer value) {
            addCriterion("D_Rid >=", value, "dRid");
            return (Criteria) this;
        }

        public Criteria andDRidLessThan(Integer value) {
            addCriterion("D_Rid <", value, "dRid");
            return (Criteria) this;
        }

        public Criteria andDRidLessThanOrEqualTo(Integer value) {
            addCriterion("D_Rid <=", value, "dRid");
            return (Criteria) this;
        }

        public Criteria andDRidIn(List<Integer> values) {
            addCriterion("D_Rid in", values, "dRid");
            return (Criteria) this;
        }

        public Criteria andDRidNotIn(List<Integer> values) {
            addCriterion("D_Rid not in", values, "dRid");
            return (Criteria) this;
        }

        public Criteria andDRidBetween(Integer value1, Integer value2) {
            addCriterion("D_Rid between", value1, value2, "dRid");
            return (Criteria) this;
        }

        public Criteria andDRidNotBetween(Integer value1, Integer value2) {
            addCriterion("D_Rid not between", value1, value2, "dRid");
            return (Criteria) this;
        }

        public Criteria andDNameIsNull() {
            addCriterion("D_Name is null");
            return (Criteria) this;
        }

        public Criteria andDNameIsNotNull() {
            addCriterion("D_Name is not null");
            return (Criteria) this;
        }

        public Criteria andDNameEqualTo(String value) {
            addCriterion("D_Name =", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotEqualTo(String value) {
            addCriterion("D_Name <>", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameGreaterThan(String value) {
            addCriterion("D_Name >", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameGreaterThanOrEqualTo(String value) {
            addCriterion("D_Name >=", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLessThan(String value) {
            addCriterion("D_Name <", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLessThanOrEqualTo(String value) {
            addCriterion("D_Name <=", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLike(String value) {
            addCriterion("D_Name like", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotLike(String value) {
            addCriterion("D_Name not like", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameIn(List<String> values) {
            addCriterion("D_Name in", values, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotIn(List<String> values) {
            addCriterion("D_Name not in", values, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameBetween(String value1, String value2) {
            addCriterion("D_Name between", value1, value2, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotBetween(String value1, String value2) {
            addCriterion("D_Name not between", value1, value2, "dName");
            return (Criteria) this;
        }

        public Criteria andDSnIsNull() {
            addCriterion("D_Sn is null");
            return (Criteria) this;
        }

        public Criteria andDSnIsNotNull() {
            addCriterion("D_Sn is not null");
            return (Criteria) this;
        }

        public Criteria andDSnEqualTo(String value) {
            addCriterion("D_Sn =", value, "dSn");
            return (Criteria) this;
        }

        public Criteria andDSnNotEqualTo(String value) {
            addCriterion("D_Sn <>", value, "dSn");
            return (Criteria) this;
        }

        public Criteria andDSnGreaterThan(String value) {
            addCriterion("D_Sn >", value, "dSn");
            return (Criteria) this;
        }

        public Criteria andDSnGreaterThanOrEqualTo(String value) {
            addCriterion("D_Sn >=", value, "dSn");
            return (Criteria) this;
        }

        public Criteria andDSnLessThan(String value) {
            addCriterion("D_Sn <", value, "dSn");
            return (Criteria) this;
        }

        public Criteria andDSnLessThanOrEqualTo(String value) {
            addCriterion("D_Sn <=", value, "dSn");
            return (Criteria) this;
        }

        public Criteria andDSnLike(String value) {
            addCriterion("D_Sn like", value, "dSn");
            return (Criteria) this;
        }

        public Criteria andDSnNotLike(String value) {
            addCriterion("D_Sn not like", value, "dSn");
            return (Criteria) this;
        }

        public Criteria andDSnIn(List<String> values) {
            addCriterion("D_Sn in", values, "dSn");
            return (Criteria) this;
        }

        public Criteria andDSnNotIn(List<String> values) {
            addCriterion("D_Sn not in", values, "dSn");
            return (Criteria) this;
        }

        public Criteria andDSnBetween(String value1, String value2) {
            addCriterion("D_Sn between", value1, value2, "dSn");
            return (Criteria) this;
        }

        public Criteria andDSnNotBetween(String value1, String value2) {
            addCriterion("D_Sn not between", value1, value2, "dSn");
            return (Criteria) this;
        }

        public Criteria andDCcidNoIsNull() {
            addCriterion("D_CCID_No is null");
            return (Criteria) this;
        }

        public Criteria andDCcidNoIsNotNull() {
            addCriterion("D_CCID_No is not null");
            return (Criteria) this;
        }

        public Criteria andDCcidNoEqualTo(String value) {
            addCriterion("D_CCID_No =", value, "dCcidNo");
            return (Criteria) this;
        }

        public Criteria andDCcidNoNotEqualTo(String value) {
            addCriterion("D_CCID_No <>", value, "dCcidNo");
            return (Criteria) this;
        }

        public Criteria andDCcidNoGreaterThan(String value) {
            addCriterion("D_CCID_No >", value, "dCcidNo");
            return (Criteria) this;
        }

        public Criteria andDCcidNoGreaterThanOrEqualTo(String value) {
            addCriterion("D_CCID_No >=", value, "dCcidNo");
            return (Criteria) this;
        }

        public Criteria andDCcidNoLessThan(String value) {
            addCriterion("D_CCID_No <", value, "dCcidNo");
            return (Criteria) this;
        }

        public Criteria andDCcidNoLessThanOrEqualTo(String value) {
            addCriterion("D_CCID_No <=", value, "dCcidNo");
            return (Criteria) this;
        }

        public Criteria andDCcidNoLike(String value) {
            addCriterion("D_CCID_No like", value, "dCcidNo");
            return (Criteria) this;
        }

        public Criteria andDCcidNoNotLike(String value) {
            addCriterion("D_CCID_No not like", value, "dCcidNo");
            return (Criteria) this;
        }

        public Criteria andDCcidNoIn(List<String> values) {
            addCriterion("D_CCID_No in", values, "dCcidNo");
            return (Criteria) this;
        }

        public Criteria andDCcidNoNotIn(List<String> values) {
            addCriterion("D_CCID_No not in", values, "dCcidNo");
            return (Criteria) this;
        }

        public Criteria andDCcidNoBetween(String value1, String value2) {
            addCriterion("D_CCID_No between", value1, value2, "dCcidNo");
            return (Criteria) this;
        }

        public Criteria andDCcidNoNotBetween(String value1, String value2) {
            addCriterion("D_CCID_No not between", value1, value2, "dCcidNo");
            return (Criteria) this;
        }

        public Criteria andDMadeDateIsNull() {
            addCriterion("D_Made_Date is null");
            return (Criteria) this;
        }

        public Criteria andDMadeDateIsNotNull() {
            addCriterion("D_Made_Date is not null");
            return (Criteria) this;
        }

        public Criteria andDMadeDateEqualTo(Date value) {
            addCriterion("D_Made_Date =", value, "dMadeDate");
            return (Criteria) this;
        }

        public Criteria andDMadeDateNotEqualTo(Date value) {
            addCriterion("D_Made_Date <>", value, "dMadeDate");
            return (Criteria) this;
        }

        public Criteria andDMadeDateGreaterThan(Date value) {
            addCriterion("D_Made_Date >", value, "dMadeDate");
            return (Criteria) this;
        }

        public Criteria andDMadeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("D_Made_Date >=", value, "dMadeDate");
            return (Criteria) this;
        }

        public Criteria andDMadeDateLessThan(Date value) {
            addCriterion("D_Made_Date <", value, "dMadeDate");
            return (Criteria) this;
        }

        public Criteria andDMadeDateLessThanOrEqualTo(Date value) {
            addCriterion("D_Made_Date <=", value, "dMadeDate");
            return (Criteria) this;
        }

        public Criteria andDMadeDateIn(List<Date> values) {
            addCriterion("D_Made_Date in", values, "dMadeDate");
            return (Criteria) this;
        }

        public Criteria andDMadeDateNotIn(List<Date> values) {
            addCriterion("D_Made_Date not in", values, "dMadeDate");
            return (Criteria) this;
        }

        public Criteria andDMadeDateBetween(Date value1, Date value2) {
            addCriterion("D_Made_Date between", value1, value2, "dMadeDate");
            return (Criteria) this;
        }

        public Criteria andDMadeDateNotBetween(Date value1, Date value2) {
            addCriterion("D_Made_Date not between", value1, value2, "dMadeDate");
            return (Criteria) this;
        }

        public Criteria andDActiveDateIsNull() {
            addCriterion("D_Active_Date is null");
            return (Criteria) this;
        }

        public Criteria andDActiveDateIsNotNull() {
            addCriterion("D_Active_Date is not null");
            return (Criteria) this;
        }

        public Criteria andDActiveDateEqualTo(Date value) {
            addCriterion("D_Active_Date =", value, "dActiveDate");
            return (Criteria) this;
        }

        public Criteria andDActiveDateNotEqualTo(Date value) {
            addCriterion("D_Active_Date <>", value, "dActiveDate");
            return (Criteria) this;
        }

        public Criteria andDActiveDateGreaterThan(Date value) {
            addCriterion("D_Active_Date >", value, "dActiveDate");
            return (Criteria) this;
        }

        public Criteria andDActiveDateGreaterThanOrEqualTo(Date value) {
            addCriterion("D_Active_Date >=", value, "dActiveDate");
            return (Criteria) this;
        }

        public Criteria andDActiveDateLessThan(Date value) {
            addCriterion("D_Active_Date <", value, "dActiveDate");
            return (Criteria) this;
        }

        public Criteria andDActiveDateLessThanOrEqualTo(Date value) {
            addCriterion("D_Active_Date <=", value, "dActiveDate");
            return (Criteria) this;
        }

        public Criteria andDActiveDateIn(List<Date> values) {
            addCriterion("D_Active_Date in", values, "dActiveDate");
            return (Criteria) this;
        }

        public Criteria andDActiveDateNotIn(List<Date> values) {
            addCriterion("D_Active_Date not in", values, "dActiveDate");
            return (Criteria) this;
        }

        public Criteria andDActiveDateBetween(Date value1, Date value2) {
            addCriterion("D_Active_Date between", value1, value2, "dActiveDate");
            return (Criteria) this;
        }

        public Criteria andDActiveDateNotBetween(Date value1, Date value2) {
            addCriterion("D_Active_Date not between", value1, value2, "dActiveDate");
            return (Criteria) this;
        }

        public Criteria andDVerIsNull() {
            addCriterion("D_Ver is null");
            return (Criteria) this;
        }

        public Criteria andDVerIsNotNull() {
            addCriterion("D_Ver is not null");
            return (Criteria) this;
        }

        public Criteria andDVerEqualTo(String value) {
            addCriterion("D_Ver =", value, "dVer");
            return (Criteria) this;
        }

        public Criteria andDVerNotEqualTo(String value) {
            addCriterion("D_Ver <>", value, "dVer");
            return (Criteria) this;
        }

        public Criteria andDVerGreaterThan(String value) {
            addCriterion("D_Ver >", value, "dVer");
            return (Criteria) this;
        }

        public Criteria andDVerGreaterThanOrEqualTo(String value) {
            addCriterion("D_Ver >=", value, "dVer");
            return (Criteria) this;
        }

        public Criteria andDVerLessThan(String value) {
            addCriterion("D_Ver <", value, "dVer");
            return (Criteria) this;
        }

        public Criteria andDVerLessThanOrEqualTo(String value) {
            addCriterion("D_Ver <=", value, "dVer");
            return (Criteria) this;
        }

        public Criteria andDVerLike(String value) {
            addCriterion("D_Ver like", value, "dVer");
            return (Criteria) this;
        }

        public Criteria andDVerNotLike(String value) {
            addCriterion("D_Ver not like", value, "dVer");
            return (Criteria) this;
        }

        public Criteria andDVerIn(List<String> values) {
            addCriterion("D_Ver in", values, "dVer");
            return (Criteria) this;
        }

        public Criteria andDVerNotIn(List<String> values) {
            addCriterion("D_Ver not in", values, "dVer");
            return (Criteria) this;
        }

        public Criteria andDVerBetween(String value1, String value2) {
            addCriterion("D_Ver between", value1, value2, "dVer");
            return (Criteria) this;
        }

        public Criteria andDVerNotBetween(String value1, String value2) {
            addCriterion("D_Ver not between", value1, value2, "dVer");
            return (Criteria) this;
        }

        public Criteria andDBoxnoIsNull() {
            addCriterion("D_BoxNo is null");
            return (Criteria) this;
        }

        public Criteria andDBoxnoIsNotNull() {
            addCriterion("D_BoxNo is not null");
            return (Criteria) this;
        }

        public Criteria andDBoxnoEqualTo(Integer value) {
            addCriterion("D_BoxNo =", value, "dBoxno");
            return (Criteria) this;
        }

        public Criteria andDBoxnoNotEqualTo(Integer value) {
            addCriterion("D_BoxNo <>", value, "dBoxno");
            return (Criteria) this;
        }

        public Criteria andDBoxnoGreaterThan(Integer value) {
            addCriterion("D_BoxNo >", value, "dBoxno");
            return (Criteria) this;
        }

        public Criteria andDBoxnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("D_BoxNo >=", value, "dBoxno");
            return (Criteria) this;
        }

        public Criteria andDBoxnoLessThan(Integer value) {
            addCriterion("D_BoxNo <", value, "dBoxno");
            return (Criteria) this;
        }

        public Criteria andDBoxnoLessThanOrEqualTo(Integer value) {
            addCriterion("D_BoxNo <=", value, "dBoxno");
            return (Criteria) this;
        }

        public Criteria andDBoxnoIn(List<Integer> values) {
            addCriterion("D_BoxNo in", values, "dBoxno");
            return (Criteria) this;
        }

        public Criteria andDBoxnoNotIn(List<Integer> values) {
            addCriterion("D_BoxNo not in", values, "dBoxno");
            return (Criteria) this;
        }

        public Criteria andDBoxnoBetween(Integer value1, Integer value2) {
            addCriterion("D_BoxNo between", value1, value2, "dBoxno");
            return (Criteria) this;
        }

        public Criteria andDBoxnoNotBetween(Integer value1, Integer value2) {
            addCriterion("D_BoxNo not between", value1, value2, "dBoxno");
            return (Criteria) this;
        }

        public Criteria andDStateIsNull() {
            addCriterion("D_State is null");
            return (Criteria) this;
        }

        public Criteria andDStateIsNotNull() {
            addCriterion("D_State is not null");
            return (Criteria) this;
        }

        public Criteria andDStateEqualTo(Integer value) {
            addCriterion("D_State =", value, "dState");
            return (Criteria) this;
        }

        public Criteria andDStateNotEqualTo(Integer value) {
            addCriterion("D_State <>", value, "dState");
            return (Criteria) this;
        }

        public Criteria andDStateGreaterThan(Integer value) {
            addCriterion("D_State >", value, "dState");
            return (Criteria) this;
        }

        public Criteria andDStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("D_State >=", value, "dState");
            return (Criteria) this;
        }

        public Criteria andDStateLessThan(Integer value) {
            addCriterion("D_State <", value, "dState");
            return (Criteria) this;
        }

        public Criteria andDStateLessThanOrEqualTo(Integer value) {
            addCriterion("D_State <=", value, "dState");
            return (Criteria) this;
        }

        public Criteria andDStateIn(List<Integer> values) {
            addCriterion("D_State in", values, "dState");
            return (Criteria) this;
        }

        public Criteria andDStateNotIn(List<Integer> values) {
            addCriterion("D_State not in", values, "dState");
            return (Criteria) this;
        }

        public Criteria andDStateBetween(Integer value1, Integer value2) {
            addCriterion("D_State between", value1, value2, "dState");
            return (Criteria) this;
        }

        public Criteria andDStateNotBetween(Integer value1, Integer value2) {
            addCriterion("D_State not between", value1, value2, "dState");
            return (Criteria) this;
        }

        public Criteria andDNameLikeInsensitive(String value) {
            addCriterion("upper(D_Name) like", value.toUpperCase(), "dName");
            return (Criteria) this;
        }

        public Criteria andDSnLikeInsensitive(String value) {
            addCriterion("upper(D_Sn) like", value.toUpperCase(), "dSn");
            return (Criteria) this;
        }

        public Criteria andDCcidNoLikeInsensitive(String value) {
            addCriterion("upper(D_CCID_No) like", value.toUpperCase(), "dCcidNo");
            return (Criteria) this;
        }

        public Criteria andDVerLikeInsensitive(String value) {
            addCriterion("upper(D_Ver) like", value.toUpperCase(), "dVer");
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