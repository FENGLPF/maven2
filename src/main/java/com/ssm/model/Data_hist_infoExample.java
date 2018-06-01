package com.ssm.model;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

public class Data_hist_infoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Data_hist_infoExample() {
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

        public Criteria andDhIdIsNull() {
            addCriterion("DH_id is null");
            return (Criteria) this;
        }

        public Criteria andDhIdIsNotNull() {
            addCriterion("DH_id is not null");
            return (Criteria) this;
        }

        public Criteria andDhIdEqualTo(Integer value) {
            addCriterion("DH_id =", value, "dhId");
            return (Criteria) this;
        }

        public Criteria andDhIdNotEqualTo(Integer value) {
            addCriterion("DH_id <>", value, "dhId");
            return (Criteria) this;
        }

        public Criteria andDhIdGreaterThan(Integer value) {
            addCriterion("DH_id >", value, "dhId");
            return (Criteria) this;
        }

        public Criteria andDhIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DH_id >=", value, "dhId");
            return (Criteria) this;
        }

        public Criteria andDhIdLessThan(Integer value) {
            addCriterion("DH_id <", value, "dhId");
            return (Criteria) this;
        }

        public Criteria andDhIdLessThanOrEqualTo(Integer value) {
            addCriterion("DH_id <=", value, "dhId");
            return (Criteria) this;
        }

        public Criteria andDhIdIn(List<Integer> values) {
            addCriterion("DH_id in", values, "dhId");
            return (Criteria) this;
        }

        public Criteria andDhIdNotIn(List<Integer> values) {
            addCriterion("DH_id not in", values, "dhId");
            return (Criteria) this;
        }

        public Criteria andDhIdBetween(Integer value1, Integer value2) {
            addCriterion("DH_id between", value1, value2, "dhId");
            return (Criteria) this;
        }

        public Criteria andDhIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DH_id not between", value1, value2, "dhId");
            return (Criteria) this;
        }

        public Criteria andDtIdIsNull() {
            addCriterion("DT_id is null");
            return (Criteria) this;
        }

        public Criteria andDtIdIsNotNull() {
            addCriterion("DT_id is not null");
            return (Criteria) this;
        }

        public Criteria andDtIdEqualTo(Integer value) {
            addCriterion("DT_id =", value, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdNotEqualTo(Integer value) {
            addCriterion("DT_id <>", value, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdGreaterThan(Integer value) {
            addCriterion("DT_id >", value, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DT_id >=", value, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdLessThan(Integer value) {
            addCriterion("DT_id <", value, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdLessThanOrEqualTo(Integer value) {
            addCriterion("DT_id <=", value, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdIn(List<Integer> values) {
            addCriterion("DT_id in", values, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdNotIn(List<Integer> values) {
            addCriterion("DT_id not in", values, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdBetween(Integer value1, Integer value2) {
            addCriterion("DT_id between", value1, value2, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DT_id not between", value1, value2, "dtId");
            return (Criteria) this;
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

        public Criteria andDhDataIsNull() {
            addCriterion("DH_Data is null");
            return (Criteria) this;
        }

        public Criteria andDhDataIsNotNull() {
            addCriterion("DH_Data is not null");
            return (Criteria) this;
        }

        public Criteria andDhDataEqualTo(Float value) {
            addCriterion("DH_Data =", value, "dhData");
            return (Criteria) this;
        }

        public Criteria andDhDataNotEqualTo(Float value) {
            addCriterion("DH_Data <>", value, "dhData");
            return (Criteria) this;
        }

        public Criteria andDhDataGreaterThan(Float value) {
            addCriterion("DH_Data >", value, "dhData");
            return (Criteria) this;
        }

        public Criteria andDhDataGreaterThanOrEqualTo(Float value) {
            addCriterion("DH_Data >=", value, "dhData");
            return (Criteria) this;
        }

        public Criteria andDhDataLessThan(Float value) {
            addCriterion("DH_Data <", value, "dhData");
            return (Criteria) this;
        }

        public Criteria andDhDataLessThanOrEqualTo(Float value) {
            addCriterion("DH_Data <=", value, "dhData");
            return (Criteria) this;
        }

        public Criteria andDhDataIn(List<Float> values) {
            addCriterion("DH_Data in", values, "dhData");
            return (Criteria) this;
        }

        public Criteria andDhDataNotIn(List<Float> values) {
            addCriterion("DH_Data not in", values, "dhData");
            return (Criteria) this;
        }

        public Criteria andDhDataBetween(Float value1, Float value2) {
            addCriterion("DH_Data between", value1, value2, "dhData");
            return (Criteria) this;
        }

        public Criteria andDhDataNotBetween(Float value1, Float value2) {
            addCriterion("DH_Data not between", value1, value2, "dhData");
            return (Criteria) this;
        }

        public Criteria andDhDateIsNull() {
            addCriterion("DH_Date is null");
            return (Criteria) this;
        }

        public Criteria andDhDateIsNotNull() {
            addCriterion("DH_Date is not null");
            return (Criteria) this;
        }

        public Criteria andDhDateEqualTo(Date value) {
            addCriterion("DH_Date =", value, "dhDate");
            return (Criteria) this;
        }

        public Criteria andDhDateNotEqualTo(Date value) {
            addCriterion("DH_Date <>", value, "dhDate");
            return (Criteria) this;
        }

        public Criteria andDhDateGreaterThan(Date value) {
            addCriterion("DH_Date >", value, "dhDate");
            return (Criteria) this;
        }

        public Criteria andDhDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DH_Date >=", value, "dhDate");
            return (Criteria) this;
        }

        public Criteria andDhDateLessThan(Date value) {
            addCriterion("DH_Date <", value, "dhDate");
            return (Criteria) this;
        }

        public Criteria andDhDateLessThanOrEqualTo(Date value) {
            addCriterion("DH_Date <=", value, "dhDate");
            return (Criteria) this;
        }

        public Criteria andDhDateIn(List<Date> values) {
            addCriterion("DH_Date in", values, "dhDate");
            return (Criteria) this;
        }

        public Criteria andDhDateNotIn(List<Date> values) {
            addCriterion("DH_Date not in", values, "dhDate");
            return (Criteria) this;
        }

        public Criteria andDhDateBetween(Date value1, Date value2) {
            addCriterion("DH_Date between", value1, value2, "dhDate");
            return (Criteria) this;
        }

        public Criteria andDhDateNotBetween(Date value1, Date value2) {
            addCriterion("DH_Date not between", value1, value2, "dhDate");
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