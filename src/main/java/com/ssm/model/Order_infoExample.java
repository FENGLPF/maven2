package com.ssm.model;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

public class Order_infoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Order_infoExample() {
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

        public Criteria andOIdIsNull() {
            addCriterion("O_id is null");
            return (Criteria) this;
        }

        public Criteria andOIdIsNotNull() {
            addCriterion("O_id is not null");
            return (Criteria) this;
        }

        public Criteria andOIdEqualTo(Integer value) {
            addCriterion("O_id =", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotEqualTo(Integer value) {
            addCriterion("O_id <>", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThan(Integer value) {
            addCriterion("O_id >", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("O_id >=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThan(Integer value) {
            addCriterion("O_id <", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThanOrEqualTo(Integer value) {
            addCriterion("O_id <=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdIn(List<Integer> values) {
            addCriterion("O_id in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotIn(List<Integer> values) {
            addCriterion("O_id not in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdBetween(Integer value1, Integer value2) {
            addCriterion("O_id between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotBetween(Integer value1, Integer value2) {
            addCriterion("O_id not between", value1, value2, "oId");
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

        public Criteria andUIdIsNull() {
            addCriterion("U_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("U_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("U_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("U_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("U_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("U_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("U_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("U_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("U_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("U_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("U_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("U_id not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andOPaytypeIsNull() {
            addCriterion("O_paytype is null");
            return (Criteria) this;
        }

        public Criteria andOPaytypeIsNotNull() {
            addCriterion("O_paytype is not null");
            return (Criteria) this;
        }

        public Criteria andOPaytypeEqualTo(Integer value) {
            addCriterion("O_paytype =", value, "oPaytype");
            return (Criteria) this;
        }

        public Criteria andOPaytypeNotEqualTo(Integer value) {
            addCriterion("O_paytype <>", value, "oPaytype");
            return (Criteria) this;
        }

        public Criteria andOPaytypeGreaterThan(Integer value) {
            addCriterion("O_paytype >", value, "oPaytype");
            return (Criteria) this;
        }

        public Criteria andOPaytypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("O_paytype >=", value, "oPaytype");
            return (Criteria) this;
        }

        public Criteria andOPaytypeLessThan(Integer value) {
            addCriterion("O_paytype <", value, "oPaytype");
            return (Criteria) this;
        }

        public Criteria andOPaytypeLessThanOrEqualTo(Integer value) {
            addCriterion("O_paytype <=", value, "oPaytype");
            return (Criteria) this;
        }

        public Criteria andOPaytypeIn(List<Integer> values) {
            addCriterion("O_paytype in", values, "oPaytype");
            return (Criteria) this;
        }

        public Criteria andOPaytypeNotIn(List<Integer> values) {
            addCriterion("O_paytype not in", values, "oPaytype");
            return (Criteria) this;
        }

        public Criteria andOPaytypeBetween(Integer value1, Integer value2) {
            addCriterion("O_paytype between", value1, value2, "oPaytype");
            return (Criteria) this;
        }

        public Criteria andOPaytypeNotBetween(Integer value1, Integer value2) {
            addCriterion("O_paytype not between", value1, value2, "oPaytype");
            return (Criteria) this;
        }

        public Criteria andOPaymoneyIsNull() {
            addCriterion("O_paymoney is null");
            return (Criteria) this;
        }

        public Criteria andOPaymoneyIsNotNull() {
            addCriterion("O_paymoney is not null");
            return (Criteria) this;
        }

        public Criteria andOPaymoneyEqualTo(Float value) {
            addCriterion("O_paymoney =", value, "oPaymoney");
            return (Criteria) this;
        }

        public Criteria andOPaymoneyNotEqualTo(Float value) {
            addCriterion("O_paymoney <>", value, "oPaymoney");
            return (Criteria) this;
        }

        public Criteria andOPaymoneyGreaterThan(Float value) {
            addCriterion("O_paymoney >", value, "oPaymoney");
            return (Criteria) this;
        }

        public Criteria andOPaymoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("O_paymoney >=", value, "oPaymoney");
            return (Criteria) this;
        }

        public Criteria andOPaymoneyLessThan(Float value) {
            addCriterion("O_paymoney <", value, "oPaymoney");
            return (Criteria) this;
        }

        public Criteria andOPaymoneyLessThanOrEqualTo(Float value) {
            addCriterion("O_paymoney <=", value, "oPaymoney");
            return (Criteria) this;
        }

        public Criteria andOPaymoneyIn(List<Float> values) {
            addCriterion("O_paymoney in", values, "oPaymoney");
            return (Criteria) this;
        }

        public Criteria andOPaymoneyNotIn(List<Float> values) {
            addCriterion("O_paymoney not in", values, "oPaymoney");
            return (Criteria) this;
        }

        public Criteria andOPaymoneyBetween(Float value1, Float value2) {
            addCriterion("O_paymoney between", value1, value2, "oPaymoney");
            return (Criteria) this;
        }

        public Criteria andOPaymoneyNotBetween(Float value1, Float value2) {
            addCriterion("O_paymoney not between", value1, value2, "oPaymoney");
            return (Criteria) this;
        }

        public Criteria andOOrdernoIsNull() {
            addCriterion("O_orderNo is null");
            return (Criteria) this;
        }

        public Criteria andOOrdernoIsNotNull() {
            addCriterion("O_orderNo is not null");
            return (Criteria) this;
        }

        public Criteria andOOrdernoEqualTo(String value) {
            addCriterion("O_orderNo =", value, "oOrderno");
            return (Criteria) this;
        }

        public Criteria andOOrdernoNotEqualTo(String value) {
            addCriterion("O_orderNo <>", value, "oOrderno");
            return (Criteria) this;
        }

        public Criteria andOOrdernoGreaterThan(String value) {
            addCriterion("O_orderNo >", value, "oOrderno");
            return (Criteria) this;
        }

        public Criteria andOOrdernoGreaterThanOrEqualTo(String value) {
            addCriterion("O_orderNo >=", value, "oOrderno");
            return (Criteria) this;
        }

        public Criteria andOOrdernoLessThan(String value) {
            addCriterion("O_orderNo <", value, "oOrderno");
            return (Criteria) this;
        }

        public Criteria andOOrdernoLessThanOrEqualTo(String value) {
            addCriterion("O_orderNo <=", value, "oOrderno");
            return (Criteria) this;
        }

        public Criteria andOOrdernoLike(String value) {
            addCriterion("O_orderNo like", value, "oOrderno");
            return (Criteria) this;
        }

        public Criteria andOOrdernoNotLike(String value) {
            addCriterion("O_orderNo not like", value, "oOrderno");
            return (Criteria) this;
        }

        public Criteria andOOrdernoIn(List<String> values) {
            addCriterion("O_orderNo in", values, "oOrderno");
            return (Criteria) this;
        }

        public Criteria andOOrdernoNotIn(List<String> values) {
            addCriterion("O_orderNo not in", values, "oOrderno");
            return (Criteria) this;
        }

        public Criteria andOOrdernoBetween(String value1, String value2) {
            addCriterion("O_orderNo between", value1, value2, "oOrderno");
            return (Criteria) this;
        }

        public Criteria andOOrdernoNotBetween(String value1, String value2) {
            addCriterion("O_orderNo not between", value1, value2, "oOrderno");
            return (Criteria) this;
        }

        public Criteria andOTrxnoIsNull() {
            addCriterion("O_TrxNo is null");
            return (Criteria) this;
        }

        public Criteria andOTrxnoIsNotNull() {
            addCriterion("O_TrxNo is not null");
            return (Criteria) this;
        }

        public Criteria andOTrxnoEqualTo(String value) {
            addCriterion("O_TrxNo =", value, "oTrxno");
            return (Criteria) this;
        }

        public Criteria andOTrxnoNotEqualTo(String value) {
            addCriterion("O_TrxNo <>", value, "oTrxno");
            return (Criteria) this;
        }

        public Criteria andOTrxnoGreaterThan(String value) {
            addCriterion("O_TrxNo >", value, "oTrxno");
            return (Criteria) this;
        }

        public Criteria andOTrxnoGreaterThanOrEqualTo(String value) {
            addCriterion("O_TrxNo >=", value, "oTrxno");
            return (Criteria) this;
        }

        public Criteria andOTrxnoLessThan(String value) {
            addCriterion("O_TrxNo <", value, "oTrxno");
            return (Criteria) this;
        }

        public Criteria andOTrxnoLessThanOrEqualTo(String value) {
            addCriterion("O_TrxNo <=", value, "oTrxno");
            return (Criteria) this;
        }

        public Criteria andOTrxnoLike(String value) {
            addCriterion("O_TrxNo like", value, "oTrxno");
            return (Criteria) this;
        }

        public Criteria andOTrxnoNotLike(String value) {
            addCriterion("O_TrxNo not like", value, "oTrxno");
            return (Criteria) this;
        }

        public Criteria andOTrxnoIn(List<String> values) {
            addCriterion("O_TrxNo in", values, "oTrxno");
            return (Criteria) this;
        }

        public Criteria andOTrxnoNotIn(List<String> values) {
            addCriterion("O_TrxNo not in", values, "oTrxno");
            return (Criteria) this;
        }

        public Criteria andOTrxnoBetween(String value1, String value2) {
            addCriterion("O_TrxNo between", value1, value2, "oTrxno");
            return (Criteria) this;
        }

        public Criteria andOTrxnoNotBetween(String value1, String value2) {
            addCriterion("O_TrxNo not between", value1, value2, "oTrxno");
            return (Criteria) this;
        }

        public Criteria andOAddtimeIsNull() {
            addCriterion("O_addtime is null");
            return (Criteria) this;
        }

        public Criteria andOAddtimeIsNotNull() {
            addCriterion("O_addtime is not null");
            return (Criteria) this;
        }

        public Criteria andOAddtimeEqualTo(Date value) {
            addCriterion("O_addtime =", value, "oAddtime");
            return (Criteria) this;
        }

        public Criteria andOAddtimeNotEqualTo(Date value) {
            addCriterion("O_addtime <>", value, "oAddtime");
            return (Criteria) this;
        }

        public Criteria andOAddtimeGreaterThan(Date value) {
            addCriterion("O_addtime >", value, "oAddtime");
            return (Criteria) this;
        }

        public Criteria andOAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("O_addtime >=", value, "oAddtime");
            return (Criteria) this;
        }

        public Criteria andOAddtimeLessThan(Date value) {
            addCriterion("O_addtime <", value, "oAddtime");
            return (Criteria) this;
        }

        public Criteria andOAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("O_addtime <=", value, "oAddtime");
            return (Criteria) this;
        }

        public Criteria andOAddtimeIn(List<Date> values) {
            addCriterion("O_addtime in", values, "oAddtime");
            return (Criteria) this;
        }

        public Criteria andOAddtimeNotIn(List<Date> values) {
            addCriterion("O_addtime not in", values, "oAddtime");
            return (Criteria) this;
        }

        public Criteria andOAddtimeBetween(Date value1, Date value2) {
            addCriterion("O_addtime between", value1, value2, "oAddtime");
            return (Criteria) this;
        }

        public Criteria andOAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("O_addtime not between", value1, value2, "oAddtime");
            return (Criteria) this;
        }

        public Criteria andOPaytimeIsNull() {
            addCriterion("O_paytime is null");
            return (Criteria) this;
        }

        public Criteria andOPaytimeIsNotNull() {
            addCriterion("O_paytime is not null");
            return (Criteria) this;
        }

        public Criteria andOPaytimeEqualTo(Date value) {
            addCriterion("O_paytime =", value, "oPaytime");
            return (Criteria) this;
        }

        public Criteria andOPaytimeNotEqualTo(Date value) {
            addCriterion("O_paytime <>", value, "oPaytime");
            return (Criteria) this;
        }

        public Criteria andOPaytimeGreaterThan(Date value) {
            addCriterion("O_paytime >", value, "oPaytime");
            return (Criteria) this;
        }

        public Criteria andOPaytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("O_paytime >=", value, "oPaytime");
            return (Criteria) this;
        }

        public Criteria andOPaytimeLessThan(Date value) {
            addCriterion("O_paytime <", value, "oPaytime");
            return (Criteria) this;
        }

        public Criteria andOPaytimeLessThanOrEqualTo(Date value) {
            addCriterion("O_paytime <=", value, "oPaytime");
            return (Criteria) this;
        }

        public Criteria andOPaytimeIn(List<Date> values) {
            addCriterion("O_paytime in", values, "oPaytime");
            return (Criteria) this;
        }

        public Criteria andOPaytimeNotIn(List<Date> values) {
            addCriterion("O_paytime not in", values, "oPaytime");
            return (Criteria) this;
        }

        public Criteria andOPaytimeBetween(Date value1, Date value2) {
            addCriterion("O_paytime between", value1, value2, "oPaytime");
            return (Criteria) this;
        }

        public Criteria andOPaytimeNotBetween(Date value1, Date value2) {
            addCriterion("O_paytime not between", value1, value2, "oPaytime");
            return (Criteria) this;
        }

        public Criteria andOStatIsNull() {
            addCriterion("O_stat is null");
            return (Criteria) this;
        }

        public Criteria andOStatIsNotNull() {
            addCriterion("O_stat is not null");
            return (Criteria) this;
        }

        public Criteria andOStatEqualTo(Integer value) {
            addCriterion("O_stat =", value, "oStat");
            return (Criteria) this;
        }

        public Criteria andOStatNotEqualTo(Integer value) {
            addCriterion("O_stat <>", value, "oStat");
            return (Criteria) this;
        }

        public Criteria andOStatGreaterThan(Integer value) {
            addCriterion("O_stat >", value, "oStat");
            return (Criteria) this;
        }

        public Criteria andOStatGreaterThanOrEqualTo(Integer value) {
            addCriterion("O_stat >=", value, "oStat");
            return (Criteria) this;
        }

        public Criteria andOStatLessThan(Integer value) {
            addCriterion("O_stat <", value, "oStat");
            return (Criteria) this;
        }

        public Criteria andOStatLessThanOrEqualTo(Integer value) {
            addCriterion("O_stat <=", value, "oStat");
            return (Criteria) this;
        }

        public Criteria andOStatIn(List<Integer> values) {
            addCriterion("O_stat in", values, "oStat");
            return (Criteria) this;
        }

        public Criteria andOStatNotIn(List<Integer> values) {
            addCriterion("O_stat not in", values, "oStat");
            return (Criteria) this;
        }

        public Criteria andOStatBetween(Integer value1, Integer value2) {
            addCriterion("O_stat between", value1, value2, "oStat");
            return (Criteria) this;
        }

        public Criteria andOStatNotBetween(Integer value1, Integer value2) {
            addCriterion("O_stat not between", value1, value2, "oStat");
            return (Criteria) this;
        }

        public Criteria andODelIsNull() {
            addCriterion("O_del is null");
            return (Criteria) this;
        }

        public Criteria andODelIsNotNull() {
            addCriterion("O_del is not null");
            return (Criteria) this;
        }

        public Criteria andODelEqualTo(Integer value) {
            addCriterion("O_del =", value, "oDel");
            return (Criteria) this;
        }

        public Criteria andODelNotEqualTo(Integer value) {
            addCriterion("O_del <>", value, "oDel");
            return (Criteria) this;
        }

        public Criteria andODelGreaterThan(Integer value) {
            addCriterion("O_del >", value, "oDel");
            return (Criteria) this;
        }

        public Criteria andODelGreaterThanOrEqualTo(Integer value) {
            addCriterion("O_del >=", value, "oDel");
            return (Criteria) this;
        }

        public Criteria andODelLessThan(Integer value) {
            addCriterion("O_del <", value, "oDel");
            return (Criteria) this;
        }

        public Criteria andODelLessThanOrEqualTo(Integer value) {
            addCriterion("O_del <=", value, "oDel");
            return (Criteria) this;
        }

        public Criteria andODelIn(List<Integer> values) {
            addCriterion("O_del in", values, "oDel");
            return (Criteria) this;
        }

        public Criteria andODelNotIn(List<Integer> values) {
            addCriterion("O_del not in", values, "oDel");
            return (Criteria) this;
        }

        public Criteria andODelBetween(Integer value1, Integer value2) {
            addCriterion("O_del between", value1, value2, "oDel");
            return (Criteria) this;
        }

        public Criteria andODelNotBetween(Integer value1, Integer value2) {
            addCriterion("O_del not between", value1, value2, "oDel");
            return (Criteria) this;
        }

        public Criteria andOOrdernoLikeInsensitive(String value) {
            addCriterion("upper(O_orderNo) like", value.toUpperCase(), "oOrderno");
            return (Criteria) this;
        }

        public Criteria andOTrxnoLikeInsensitive(String value) {
            addCriterion("upper(O_TrxNo) like", value.toUpperCase(), "oTrxno");
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