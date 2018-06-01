package com.ssm.model;

import java.util.ArrayList;
import java.util.List;

public class Function_infoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Function_infoExample() {
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

        public Criteria andFIdIsNull() {
            addCriterion("F_id is null");
            return (Criteria) this;
        }

        public Criteria andFIdIsNotNull() {
            addCriterion("F_id is not null");
            return (Criteria) this;
        }

        public Criteria andFIdEqualTo(Integer value) {
            addCriterion("F_id =", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotEqualTo(Integer value) {
            addCriterion("F_id <>", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThan(Integer value) {
            addCriterion("F_id >", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_id >=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThan(Integer value) {
            addCriterion("F_id <", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThanOrEqualTo(Integer value) {
            addCriterion("F_id <=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdIn(List<Integer> values) {
            addCriterion("F_id in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotIn(List<Integer> values) {
            addCriterion("F_id not in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdBetween(Integer value1, Integer value2) {
            addCriterion("F_id between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotBetween(Integer value1, Integer value2) {
            addCriterion("F_id not between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFNameIsNull() {
            addCriterion("F_Name is null");
            return (Criteria) this;
        }

        public Criteria andFNameIsNotNull() {
            addCriterion("F_Name is not null");
            return (Criteria) this;
        }

        public Criteria andFNameEqualTo(String value) {
            addCriterion("F_Name =", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotEqualTo(String value) {
            addCriterion("F_Name <>", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameGreaterThan(String value) {
            addCriterion("F_Name >", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameGreaterThanOrEqualTo(String value) {
            addCriterion("F_Name >=", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameLessThan(String value) {
            addCriterion("F_Name <", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameLessThanOrEqualTo(String value) {
            addCriterion("F_Name <=", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameLike(String value) {
            addCriterion("F_Name like", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotLike(String value) {
            addCriterion("F_Name not like", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameIn(List<String> values) {
            addCriterion("F_Name in", values, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotIn(List<String> values) {
            addCriterion("F_Name not in", values, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameBetween(String value1, String value2) {
            addCriterion("F_Name between", value1, value2, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotBetween(String value1, String value2) {
            addCriterion("F_Name not between", value1, value2, "fName");
            return (Criteria) this;
        }

        public Criteria andFCommandIsNull() {
            addCriterion("F_Command is null");
            return (Criteria) this;
        }

        public Criteria andFCommandIsNotNull() {
            addCriterion("F_Command is not null");
            return (Criteria) this;
        }

        public Criteria andFCommandEqualTo(String value) {
            addCriterion("F_Command =", value, "fCommand");
            return (Criteria) this;
        }

        public Criteria andFCommandNotEqualTo(String value) {
            addCriterion("F_Command <>", value, "fCommand");
            return (Criteria) this;
        }

        public Criteria andFCommandGreaterThan(String value) {
            addCriterion("F_Command >", value, "fCommand");
            return (Criteria) this;
        }

        public Criteria andFCommandGreaterThanOrEqualTo(String value) {
            addCriterion("F_Command >=", value, "fCommand");
            return (Criteria) this;
        }

        public Criteria andFCommandLessThan(String value) {
            addCriterion("F_Command <", value, "fCommand");
            return (Criteria) this;
        }

        public Criteria andFCommandLessThanOrEqualTo(String value) {
            addCriterion("F_Command <=", value, "fCommand");
            return (Criteria) this;
        }

        public Criteria andFCommandLike(String value) {
            addCriterion("F_Command like", value, "fCommand");
            return (Criteria) this;
        }

        public Criteria andFCommandNotLike(String value) {
            addCriterion("F_Command not like", value, "fCommand");
            return (Criteria) this;
        }

        public Criteria andFCommandIn(List<String> values) {
            addCriterion("F_Command in", values, "fCommand");
            return (Criteria) this;
        }

        public Criteria andFCommandNotIn(List<String> values) {
            addCriterion("F_Command not in", values, "fCommand");
            return (Criteria) this;
        }

        public Criteria andFCommandBetween(String value1, String value2) {
            addCriterion("F_Command between", value1, value2, "fCommand");
            return (Criteria) this;
        }

        public Criteria andFCommandNotBetween(String value1, String value2) {
            addCriterion("F_Command not between", value1, value2, "fCommand");
            return (Criteria) this;
        }

        public Criteria andFComKeyIsNull() {
            addCriterion("F_Com_Key is null");
            return (Criteria) this;
        }

        public Criteria andFComKeyIsNotNull() {
            addCriterion("F_Com_Key is not null");
            return (Criteria) this;
        }

        public Criteria andFComKeyEqualTo(String value) {
            addCriterion("F_Com_Key =", value, "fComKey");
            return (Criteria) this;
        }

        public Criteria andFComKeyNotEqualTo(String value) {
            addCriterion("F_Com_Key <>", value, "fComKey");
            return (Criteria) this;
        }

        public Criteria andFComKeyGreaterThan(String value) {
            addCriterion("F_Com_Key >", value, "fComKey");
            return (Criteria) this;
        }

        public Criteria andFComKeyGreaterThanOrEqualTo(String value) {
            addCriterion("F_Com_Key >=", value, "fComKey");
            return (Criteria) this;
        }

        public Criteria andFComKeyLessThan(String value) {
            addCriterion("F_Com_Key <", value, "fComKey");
            return (Criteria) this;
        }

        public Criteria andFComKeyLessThanOrEqualTo(String value) {
            addCriterion("F_Com_Key <=", value, "fComKey");
            return (Criteria) this;
        }

        public Criteria andFComKeyLike(String value) {
            addCriterion("F_Com_Key like", value, "fComKey");
            return (Criteria) this;
        }

        public Criteria andFComKeyNotLike(String value) {
            addCriterion("F_Com_Key not like", value, "fComKey");
            return (Criteria) this;
        }

        public Criteria andFComKeyIn(List<String> values) {
            addCriterion("F_Com_Key in", values, "fComKey");
            return (Criteria) this;
        }

        public Criteria andFComKeyNotIn(List<String> values) {
            addCriterion("F_Com_Key not in", values, "fComKey");
            return (Criteria) this;
        }

        public Criteria andFComKeyBetween(String value1, String value2) {
            addCriterion("F_Com_Key between", value1, value2, "fComKey");
            return (Criteria) this;
        }

        public Criteria andFComKeyNotBetween(String value1, String value2) {
            addCriterion("F_Com_Key not between", value1, value2, "fComKey");
            return (Criteria) this;
        }

        public Criteria andFNameLikeInsensitive(String value) {
            addCriterion("upper(F_Name) like", value.toUpperCase(), "fName");
            return (Criteria) this;
        }

        public Criteria andFCommandLikeInsensitive(String value) {
            addCriterion("upper(F_Command) like", value.toUpperCase(), "fCommand");
            return (Criteria) this;
        }

        public Criteria andFComKeyLikeInsensitive(String value) {
            addCriterion("upper(F_Com_Key) like", value.toUpperCase(), "fComKey");
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