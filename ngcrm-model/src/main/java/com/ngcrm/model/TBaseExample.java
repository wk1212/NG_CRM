package com.ngcrm.model;

import java.util.ArrayList;
import java.util.List;

public class TBaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TBaseExample() {
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

        public Criteria andBidIsNull() {
            addCriterion("bid is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("bid is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(Integer value) {
            addCriterion("bid =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(Integer value) {
            addCriterion("bid <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(Integer value) {
            addCriterion("bid >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bid >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(Integer value) {
            addCriterion("bid <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(Integer value) {
            addCriterion("bid <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<Integer> values) {
            addCriterion("bid in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<Integer> values) {
            addCriterion("bid not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(Integer value1, Integer value2) {
            addCriterion("bid between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(Integer value1, Integer value2) {
            addCriterion("bid not between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBtypeIsNull() {
            addCriterion("btype is null");
            return (Criteria) this;
        }

        public Criteria andBtypeIsNotNull() {
            addCriterion("btype is not null");
            return (Criteria) this;
        }

        public Criteria andBtypeEqualTo(String value) {
            addCriterion("btype =", value, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeNotEqualTo(String value) {
            addCriterion("btype <>", value, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeGreaterThan(String value) {
            addCriterion("btype >", value, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeGreaterThanOrEqualTo(String value) {
            addCriterion("btype >=", value, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeLessThan(String value) {
            addCriterion("btype <", value, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeLessThanOrEqualTo(String value) {
            addCriterion("btype <=", value, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeLike(String value) {
            addCriterion("btype like", value, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeNotLike(String value) {
            addCriterion("btype not like", value, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeIn(List<String> values) {
            addCriterion("btype in", values, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeNotIn(List<String> values) {
            addCriterion("btype not in", values, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeBetween(String value1, String value2) {
            addCriterion("btype between", value1, value2, "btype");
            return (Criteria) this;
        }

        public Criteria andBtypeNotBetween(String value1, String value2) {
            addCriterion("btype not between", value1, value2, "btype");
            return (Criteria) this;
        }

        public Criteria andBitemIsNull() {
            addCriterion("bitem is null");
            return (Criteria) this;
        }

        public Criteria andBitemIsNotNull() {
            addCriterion("bitem is not null");
            return (Criteria) this;
        }

        public Criteria andBitemEqualTo(String value) {
            addCriterion("bitem =", value, "bitem");
            return (Criteria) this;
        }

        public Criteria andBitemNotEqualTo(String value) {
            addCriterion("bitem <>", value, "bitem");
            return (Criteria) this;
        }

        public Criteria andBitemGreaterThan(String value) {
            addCriterion("bitem >", value, "bitem");
            return (Criteria) this;
        }

        public Criteria andBitemGreaterThanOrEqualTo(String value) {
            addCriterion("bitem >=", value, "bitem");
            return (Criteria) this;
        }

        public Criteria andBitemLessThan(String value) {
            addCriterion("bitem <", value, "bitem");
            return (Criteria) this;
        }

        public Criteria andBitemLessThanOrEqualTo(String value) {
            addCriterion("bitem <=", value, "bitem");
            return (Criteria) this;
        }

        public Criteria andBitemLike(String value) {
            addCriterion("bitem like", value, "bitem");
            return (Criteria) this;
        }

        public Criteria andBitemNotLike(String value) {
            addCriterion("bitem not like", value, "bitem");
            return (Criteria) this;
        }

        public Criteria andBitemIn(List<String> values) {
            addCriterion("bitem in", values, "bitem");
            return (Criteria) this;
        }

        public Criteria andBitemNotIn(List<String> values) {
            addCriterion("bitem not in", values, "bitem");
            return (Criteria) this;
        }

        public Criteria andBitemBetween(String value1, String value2) {
            addCriterion("bitem between", value1, value2, "bitem");
            return (Criteria) this;
        }

        public Criteria andBitemNotBetween(String value1, String value2) {
            addCriterion("bitem not between", value1, value2, "bitem");
            return (Criteria) this;
        }

        public Criteria andBvalueIsNull() {
            addCriterion("bvalue is null");
            return (Criteria) this;
        }

        public Criteria andBvalueIsNotNull() {
            addCriterion("bvalue is not null");
            return (Criteria) this;
        }

        public Criteria andBvalueEqualTo(String value) {
            addCriterion("bvalue =", value, "bvalue");
            return (Criteria) this;
        }

        public Criteria andBvalueNotEqualTo(String value) {
            addCriterion("bvalue <>", value, "bvalue");
            return (Criteria) this;
        }

        public Criteria andBvalueGreaterThan(String value) {
            addCriterion("bvalue >", value, "bvalue");
            return (Criteria) this;
        }

        public Criteria andBvalueGreaterThanOrEqualTo(String value) {
            addCriterion("bvalue >=", value, "bvalue");
            return (Criteria) this;
        }

        public Criteria andBvalueLessThan(String value) {
            addCriterion("bvalue <", value, "bvalue");
            return (Criteria) this;
        }

        public Criteria andBvalueLessThanOrEqualTo(String value) {
            addCriterion("bvalue <=", value, "bvalue");
            return (Criteria) this;
        }

        public Criteria andBvalueLike(String value) {
            addCriterion("bvalue like", value, "bvalue");
            return (Criteria) this;
        }

        public Criteria andBvalueNotLike(String value) {
            addCriterion("bvalue not like", value, "bvalue");
            return (Criteria) this;
        }

        public Criteria andBvalueIn(List<String> values) {
            addCriterion("bvalue in", values, "bvalue");
            return (Criteria) this;
        }

        public Criteria andBvalueNotIn(List<String> values) {
            addCriterion("bvalue not in", values, "bvalue");
            return (Criteria) this;
        }

        public Criteria andBvalueBetween(String value1, String value2) {
            addCriterion("bvalue between", value1, value2, "bvalue");
            return (Criteria) this;
        }

        public Criteria andBvalueNotBetween(String value1, String value2) {
            addCriterion("bvalue not between", value1, value2, "bvalue");
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