package com.ssm.model;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

public class Command_hist_infoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Command_hist_infoExample() {
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

        public Criteria andChIdIsNull() {
            addCriterion("CH_id is null");
            return (Criteria) this;
        }

        public Criteria andChIdIsNotNull() {
            addCriterion("CH_id is not null");
            return (Criteria) this;
        }

        public Criteria andChIdEqualTo(Integer value) {
            addCriterion("CH_id =", value, "chId");
            return (Criteria) this;
        }

        public Criteria andChIdNotEqualTo(Integer value) {
            addCriterion("CH_id <>", value, "chId");
            return (Criteria) this;
        }

        public Criteria andChIdGreaterThan(Integer value) {
            addCriterion("CH_id >", value, "chId");
            return (Criteria) this;
        }

        public Criteria andChIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CH_id >=", value, "chId");
            return (Criteria) this;
        }

        public Criteria andChIdLessThan(Integer value) {
            addCriterion("CH_id <", value, "chId");
            return (Criteria) this;
        }

        public Criteria andChIdLessThanOrEqualTo(Integer value) {
            addCriterion("CH_id <=", value, "chId");
            return (Criteria) this;
        }

        public Criteria andChIdIn(List<Integer> values) {
            addCriterion("CH_id in", values, "chId");
            return (Criteria) this;
        }

        public Criteria andChIdNotIn(List<Integer> values) {
            addCriterion("CH_id not in", values, "chId");
            return (Criteria) this;
        }

        public Criteria andChIdBetween(Integer value1, Integer value2) {
            addCriterion("CH_id between", value1, value2, "chId");
            return (Criteria) this;
        }

        public Criteria andChIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CH_id not between", value1, value2, "chId");
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

        public Criteria andChStrIsNull() {
            addCriterion("CH_Str is null");
            return (Criteria) this;
        }

        public Criteria andChStrIsNotNull() {
            addCriterion("CH_Str is not null");
            return (Criteria) this;
        }

        public Criteria andChStrEqualTo(String value) {
            addCriterion("CH_Str =", value, "chStr");
            return (Criteria) this;
        }

        public Criteria andChStrNotEqualTo(String value) {
            addCriterion("CH_Str <>", value, "chStr");
            return (Criteria) this;
        }

        public Criteria andChStrGreaterThan(String value) {
            addCriterion("CH_Str >", value, "chStr");
            return (Criteria) this;
        }

        public Criteria andChStrGreaterThanOrEqualTo(String value) {
            addCriterion("CH_Str >=", value, "chStr");
            return (Criteria) this;
        }

        public Criteria andChStrLessThan(String value) {
            addCriterion("CH_Str <", value, "chStr");
            return (Criteria) this;
        }

        public Criteria andChStrLessThanOrEqualTo(String value) {
            addCriterion("CH_Str <=", value, "chStr");
            return (Criteria) this;
        }

        public Criteria andChStrLike(String value) {
            addCriterion("CH_Str like", value, "chStr");
            return (Criteria) this;
        }

        public Criteria andChStrNotLike(String value) {
            addCriterion("CH_Str not like", value, "chStr");
            return (Criteria) this;
        }

        public Criteria andChStrIn(List<String> values) {
            addCriterion("CH_Str in", values, "chStr");
            return (Criteria) this;
        }

        public Criteria andChStrNotIn(List<String> values) {
            addCriterion("CH_Str not in", values, "chStr");
            return (Criteria) this;
        }

        public Criteria andChStrBetween(String value1, String value2) {
            addCriterion("CH_Str between", value1, value2, "chStr");
            return (Criteria) this;
        }

        public Criteria andChStrNotBetween(String value1, String value2) {
            addCriterion("CH_Str not between", value1, value2, "chStr");
            return (Criteria) this;
        }

        public Criteria andChDateIsNull() {
            addCriterion("CH_Date is null");
            return (Criteria) this;
        }

        public Criteria andChDateIsNotNull() {
            addCriterion("CH_Date is not null");
            return (Criteria) this;
        }

        public Criteria andChDateEqualTo(Date value) {
            addCriterion("CH_Date =", value, "chDate");
            return (Criteria) this;
        }

        public Criteria andChDateNotEqualTo(Date value) {
            addCriterion("CH_Date <>", value, "chDate");
            return (Criteria) this;
        }

        public Criteria andChDateGreaterThan(Date value) {
            addCriterion("CH_Date >", value, "chDate");
            return (Criteria) this;
        }

        public Criteria andChDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CH_Date >=", value, "chDate");
            return (Criteria) this;
        }

        public Criteria andChDateLessThan(Date value) {
            addCriterion("CH_Date <", value, "chDate");
            return (Criteria) this;
        }

        public Criteria andChDateLessThanOrEqualTo(Date value) {
            addCriterion("CH_Date <=", value, "chDate");
            return (Criteria) this;
        }

        public Criteria andChDateIn(List<Date> values) {
            addCriterion("CH_Date in", values, "chDate");
            return (Criteria) this;
        }

        public Criteria andChDateNotIn(List<Date> values) {
            addCriterion("CH_Date not in", values, "chDate");
            return (Criteria) this;
        }

        public Criteria andChDateBetween(Date value1, Date value2) {
            addCriterion("CH_Date between", value1, value2, "chDate");
            return (Criteria) this;
        }

        public Criteria andChDateNotBetween(Date value1, Date value2) {
            addCriterion("CH_Date not between", value1, value2, "chDate");
            return (Criteria) this;
        }

        public Criteria andChStrLikeInsensitive(String value) {
            addCriterion("upper(CH_Str) like", value.toUpperCase(), "chStr");
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