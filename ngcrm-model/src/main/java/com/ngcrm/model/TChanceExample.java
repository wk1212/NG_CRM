package com.ngcrm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TChanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TChanceExample() {
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

        public Criteria andChnoIsNull() {
            addCriterion("chno is null");
            return (Criteria) this;
        }

        public Criteria andChnoIsNotNull() {
            addCriterion("chno is not null");
            return (Criteria) this;
        }

        public Criteria andChnoEqualTo(Long value) {
            addCriterion("chno =", value, "chno");
            return (Criteria) this;
        }

        public Criteria andChnoNotEqualTo(Long value) {
            addCriterion("chno <>", value, "chno");
            return (Criteria) this;
        }

        public Criteria andChnoGreaterThan(Long value) {
            addCriterion("chno >", value, "chno");
            return (Criteria) this;
        }

        public Criteria andChnoGreaterThanOrEqualTo(Long value) {
            addCriterion("chno >=", value, "chno");
            return (Criteria) this;
        }

        public Criteria andChnoLessThan(Long value) {
            addCriterion("chno <", value, "chno");
            return (Criteria) this;
        }

        public Criteria andChnoLessThanOrEqualTo(Long value) {
            addCriterion("chno <=", value, "chno");
            return (Criteria) this;
        }

        public Criteria andChnoIn(List<Long> values) {
            addCriterion("chno in", values, "chno");
            return (Criteria) this;
        }

        public Criteria andChnoNotIn(List<Long> values) {
            addCriterion("chno not in", values, "chno");
            return (Criteria) this;
        }

        public Criteria andChnoBetween(Long value1, Long value2) {
            addCriterion("chno between", value1, value2, "chno");
            return (Criteria) this;
        }

        public Criteria andChnoNotBetween(Long value1, Long value2) {
            addCriterion("chno not between", value1, value2, "chno");
            return (Criteria) this;
        }

        public Criteria andChsourceIsNull() {
            addCriterion("chsource is null");
            return (Criteria) this;
        }

        public Criteria andChsourceIsNotNull() {
            addCriterion("chsource is not null");
            return (Criteria) this;
        }

        public Criteria andChsourceEqualTo(String value) {
            addCriterion("chsource =", value, "chsource");
            return (Criteria) this;
        }

        public Criteria andChsourceNotEqualTo(String value) {
            addCriterion("chsource <>", value, "chsource");
            return (Criteria) this;
        }

        public Criteria andChsourceGreaterThan(String value) {
            addCriterion("chsource >", value, "chsource");
            return (Criteria) this;
        }

        public Criteria andChsourceGreaterThanOrEqualTo(String value) {
            addCriterion("chsource >=", value, "chsource");
            return (Criteria) this;
        }

        public Criteria andChsourceLessThan(String value) {
            addCriterion("chsource <", value, "chsource");
            return (Criteria) this;
        }

        public Criteria andChsourceLessThanOrEqualTo(String value) {
            addCriterion("chsource <=", value, "chsource");
            return (Criteria) this;
        }

        public Criteria andChsourceLike(String value) {
            addCriterion("chsource like", value, "chsource");
            return (Criteria) this;
        }

        public Criteria andChsourceNotLike(String value) {
            addCriterion("chsource not like", value, "chsource");
            return (Criteria) this;
        }

        public Criteria andChsourceIn(List<String> values) {
            addCriterion("chsource in", values, "chsource");
            return (Criteria) this;
        }

        public Criteria andChsourceNotIn(List<String> values) {
            addCriterion("chsource not in", values, "chsource");
            return (Criteria) this;
        }

        public Criteria andChsourceBetween(String value1, String value2) {
            addCriterion("chsource between", value1, value2, "chsource");
            return (Criteria) this;
        }

        public Criteria andChsourceNotBetween(String value1, String value2) {
            addCriterion("chsource not between", value1, value2, "chsource");
            return (Criteria) this;
        }

        public Criteria andChcustnameIsNull() {
            addCriterion("chcustname is null");
            return (Criteria) this;
        }

        public Criteria andChcustnameIsNotNull() {
            addCriterion("chcustname is not null");
            return (Criteria) this;
        }

        public Criteria andChcustnameEqualTo(String value) {
            addCriterion("chcustname =", value, "chcustname");
            return (Criteria) this;
        }

        public Criteria andChcustnameNotEqualTo(String value) {
            addCriterion("chcustname <>", value, "chcustname");
            return (Criteria) this;
        }

        public Criteria andChcustnameGreaterThan(String value) {
            addCriterion("chcustname >", value, "chcustname");
            return (Criteria) this;
        }

        public Criteria andChcustnameGreaterThanOrEqualTo(String value) {
            addCriterion("chcustname >=", value, "chcustname");
            return (Criteria) this;
        }

        public Criteria andChcustnameLessThan(String value) {
            addCriterion("chcustname <", value, "chcustname");
            return (Criteria) this;
        }

        public Criteria andChcustnameLessThanOrEqualTo(String value) {
            addCriterion("chcustname <=", value, "chcustname");
            return (Criteria) this;
        }

        public Criteria andChcustnameLike(String value) {
            addCriterion("chcustname like", value, "chcustname");
            return (Criteria) this;
        }

        public Criteria andChcustnameNotLike(String value) {
            addCriterion("chcustname not like", value, "chcustname");
            return (Criteria) this;
        }

        public Criteria andChcustnameIn(List<String> values) {
            addCriterion("chcustname in", values, "chcustname");
            return (Criteria) this;
        }

        public Criteria andChcustnameNotIn(List<String> values) {
            addCriterion("chcustname not in", values, "chcustname");
            return (Criteria) this;
        }

        public Criteria andChcustnameBetween(String value1, String value2) {
            addCriterion("chcustname between", value1, value2, "chcustname");
            return (Criteria) this;
        }

        public Criteria andChcustnameNotBetween(String value1, String value2) {
            addCriterion("chcustname not between", value1, value2, "chcustname");
            return (Criteria) this;
        }

        public Criteria andChtitleIsNull() {
            addCriterion("chtitle is null");
            return (Criteria) this;
        }

        public Criteria andChtitleIsNotNull() {
            addCriterion("chtitle is not null");
            return (Criteria) this;
        }

        public Criteria andChtitleEqualTo(String value) {
            addCriterion("chtitle =", value, "chtitle");
            return (Criteria) this;
        }

        public Criteria andChtitleNotEqualTo(String value) {
            addCriterion("chtitle <>", value, "chtitle");
            return (Criteria) this;
        }

        public Criteria andChtitleGreaterThan(String value) {
            addCriterion("chtitle >", value, "chtitle");
            return (Criteria) this;
        }

        public Criteria andChtitleGreaterThanOrEqualTo(String value) {
            addCriterion("chtitle >=", value, "chtitle");
            return (Criteria) this;
        }

        public Criteria andChtitleLessThan(String value) {
            addCriterion("chtitle <", value, "chtitle");
            return (Criteria) this;
        }

        public Criteria andChtitleLessThanOrEqualTo(String value) {
            addCriterion("chtitle <=", value, "chtitle");
            return (Criteria) this;
        }

        public Criteria andChtitleLike(String value) {
            addCriterion("chtitle like", value, "chtitle");
            return (Criteria) this;
        }

        public Criteria andChtitleNotLike(String value) {
            addCriterion("chtitle not like", value, "chtitle");
            return (Criteria) this;
        }

        public Criteria andChtitleIn(List<String> values) {
            addCriterion("chtitle in", values, "chtitle");
            return (Criteria) this;
        }

        public Criteria andChtitleNotIn(List<String> values) {
            addCriterion("chtitle not in", values, "chtitle");
            return (Criteria) this;
        }

        public Criteria andChtitleBetween(String value1, String value2) {
            addCriterion("chtitle between", value1, value2, "chtitle");
            return (Criteria) this;
        }

        public Criteria andChtitleNotBetween(String value1, String value2) {
            addCriterion("chtitle not between", value1, value2, "chtitle");
            return (Criteria) this;
        }

        public Criteria andChrateIsNull() {
            addCriterion("chrate is null");
            return (Criteria) this;
        }

        public Criteria andChrateIsNotNull() {
            addCriterion("chrate is not null");
            return (Criteria) this;
        }

        public Criteria andChrateEqualTo(Integer value) {
            addCriterion("chrate =", value, "chrate");
            return (Criteria) this;
        }

        public Criteria andChrateNotEqualTo(Integer value) {
            addCriterion("chrate <>", value, "chrate");
            return (Criteria) this;
        }

        public Criteria andChrateGreaterThan(Integer value) {
            addCriterion("chrate >", value, "chrate");
            return (Criteria) this;
        }

        public Criteria andChrateGreaterThanOrEqualTo(Integer value) {
            addCriterion("chrate >=", value, "chrate");
            return (Criteria) this;
        }

        public Criteria andChrateLessThan(Integer value) {
            addCriterion("chrate <", value, "chrate");
            return (Criteria) this;
        }

        public Criteria andChrateLessThanOrEqualTo(Integer value) {
            addCriterion("chrate <=", value, "chrate");
            return (Criteria) this;
        }

        public Criteria andChrateIn(List<Integer> values) {
            addCriterion("chrate in", values, "chrate");
            return (Criteria) this;
        }

        public Criteria andChrateNotIn(List<Integer> values) {
            addCriterion("chrate not in", values, "chrate");
            return (Criteria) this;
        }

        public Criteria andChrateBetween(Integer value1, Integer value2) {
            addCriterion("chrate between", value1, value2, "chrate");
            return (Criteria) this;
        }

        public Criteria andChrateNotBetween(Integer value1, Integer value2) {
            addCriterion("chrate not between", value1, value2, "chrate");
            return (Criteria) this;
        }

        public Criteria andChlinkmanIsNull() {
            addCriterion("chlinkman is null");
            return (Criteria) this;
        }

        public Criteria andChlinkmanIsNotNull() {
            addCriterion("chlinkman is not null");
            return (Criteria) this;
        }

        public Criteria andChlinkmanEqualTo(String value) {
            addCriterion("chlinkman =", value, "chlinkman");
            return (Criteria) this;
        }

        public Criteria andChlinkmanNotEqualTo(String value) {
            addCriterion("chlinkman <>", value, "chlinkman");
            return (Criteria) this;
        }

        public Criteria andChlinkmanGreaterThan(String value) {
            addCriterion("chlinkman >", value, "chlinkman");
            return (Criteria) this;
        }

        public Criteria andChlinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("chlinkman >=", value, "chlinkman");
            return (Criteria) this;
        }

        public Criteria andChlinkmanLessThan(String value) {
            addCriterion("chlinkman <", value, "chlinkman");
            return (Criteria) this;
        }

        public Criteria andChlinkmanLessThanOrEqualTo(String value) {
            addCriterion("chlinkman <=", value, "chlinkman");
            return (Criteria) this;
        }

        public Criteria andChlinkmanLike(String value) {
            addCriterion("chlinkman like", value, "chlinkman");
            return (Criteria) this;
        }

        public Criteria andChlinkmanNotLike(String value) {
            addCriterion("chlinkman not like", value, "chlinkman");
            return (Criteria) this;
        }

        public Criteria andChlinkmanIn(List<String> values) {
            addCriterion("chlinkman in", values, "chlinkman");
            return (Criteria) this;
        }

        public Criteria andChlinkmanNotIn(List<String> values) {
            addCriterion("chlinkman not in", values, "chlinkman");
            return (Criteria) this;
        }

        public Criteria andChlinkmanBetween(String value1, String value2) {
            addCriterion("chlinkman between", value1, value2, "chlinkman");
            return (Criteria) this;
        }

        public Criteria andChlinkmanNotBetween(String value1, String value2) {
            addCriterion("chlinkman not between", value1, value2, "chlinkman");
            return (Criteria) this;
        }

        public Criteria andChtelIsNull() {
            addCriterion("chtel is null");
            return (Criteria) this;
        }

        public Criteria andChtelIsNotNull() {
            addCriterion("chtel is not null");
            return (Criteria) this;
        }

        public Criteria andChtelEqualTo(String value) {
            addCriterion("chtel =", value, "chtel");
            return (Criteria) this;
        }

        public Criteria andChtelNotEqualTo(String value) {
            addCriterion("chtel <>", value, "chtel");
            return (Criteria) this;
        }

        public Criteria andChtelGreaterThan(String value) {
            addCriterion("chtel >", value, "chtel");
            return (Criteria) this;
        }

        public Criteria andChtelGreaterThanOrEqualTo(String value) {
            addCriterion("chtel >=", value, "chtel");
            return (Criteria) this;
        }

        public Criteria andChtelLessThan(String value) {
            addCriterion("chtel <", value, "chtel");
            return (Criteria) this;
        }

        public Criteria andChtelLessThanOrEqualTo(String value) {
            addCriterion("chtel <=", value, "chtel");
            return (Criteria) this;
        }

        public Criteria andChtelLike(String value) {
            addCriterion("chtel like", value, "chtel");
            return (Criteria) this;
        }

        public Criteria andChtelNotLike(String value) {
            addCriterion("chtel not like", value, "chtel");
            return (Criteria) this;
        }

        public Criteria andChtelIn(List<String> values) {
            addCriterion("chtel in", values, "chtel");
            return (Criteria) this;
        }

        public Criteria andChtelNotIn(List<String> values) {
            addCriterion("chtel not in", values, "chtel");
            return (Criteria) this;
        }

        public Criteria andChtelBetween(String value1, String value2) {
            addCriterion("chtel between", value1, value2, "chtel");
            return (Criteria) this;
        }

        public Criteria andChtelNotBetween(String value1, String value2) {
            addCriterion("chtel not between", value1, value2, "chtel");
            return (Criteria) this;
        }

        public Criteria andChdescIsNull() {
            addCriterion("chdesc is null");
            return (Criteria) this;
        }

        public Criteria andChdescIsNotNull() {
            addCriterion("chdesc is not null");
            return (Criteria) this;
        }

        public Criteria andChdescEqualTo(String value) {
            addCriterion("chdesc =", value, "chdesc");
            return (Criteria) this;
        }

        public Criteria andChdescNotEqualTo(String value) {
            addCriterion("chdesc <>", value, "chdesc");
            return (Criteria) this;
        }

        public Criteria andChdescGreaterThan(String value) {
            addCriterion("chdesc >", value, "chdesc");
            return (Criteria) this;
        }

        public Criteria andChdescGreaterThanOrEqualTo(String value) {
            addCriterion("chdesc >=", value, "chdesc");
            return (Criteria) this;
        }

        public Criteria andChdescLessThan(String value) {
            addCriterion("chdesc <", value, "chdesc");
            return (Criteria) this;
        }

        public Criteria andChdescLessThanOrEqualTo(String value) {
            addCriterion("chdesc <=", value, "chdesc");
            return (Criteria) this;
        }

        public Criteria andChdescLike(String value) {
            addCriterion("chdesc like", value, "chdesc");
            return (Criteria) this;
        }

        public Criteria andChdescNotLike(String value) {
            addCriterion("chdesc not like", value, "chdesc");
            return (Criteria) this;
        }

        public Criteria andChdescIn(List<String> values) {
            addCriterion("chdesc in", values, "chdesc");
            return (Criteria) this;
        }

        public Criteria andChdescNotIn(List<String> values) {
            addCriterion("chdesc not in", values, "chdesc");
            return (Criteria) this;
        }

        public Criteria andChdescBetween(String value1, String value2) {
            addCriterion("chdesc between", value1, value2, "chdesc");
            return (Criteria) this;
        }

        public Criteria andChdescNotBetween(String value1, String value2) {
            addCriterion("chdesc not between", value1, value2, "chdesc");
            return (Criteria) this;
        }

        public Criteria andChcreateidIsNull() {
            addCriterion("chcreateid is null");
            return (Criteria) this;
        }

        public Criteria andChcreateidIsNotNull() {
            addCriterion("chcreateid is not null");
            return (Criteria) this;
        }

        public Criteria andChcreateidEqualTo(Integer value) {
            addCriterion("chcreateid =", value, "chcreateid");
            return (Criteria) this;
        }

        public Criteria andChcreateidNotEqualTo(Integer value) {
            addCriterion("chcreateid <>", value, "chcreateid");
            return (Criteria) this;
        }

        public Criteria andChcreateidGreaterThan(Integer value) {
            addCriterion("chcreateid >", value, "chcreateid");
            return (Criteria) this;
        }

        public Criteria andChcreateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("chcreateid >=", value, "chcreateid");
            return (Criteria) this;
        }

        public Criteria andChcreateidLessThan(Integer value) {
            addCriterion("chcreateid <", value, "chcreateid");
            return (Criteria) this;
        }

        public Criteria andChcreateidLessThanOrEqualTo(Integer value) {
            addCriterion("chcreateid <=", value, "chcreateid");
            return (Criteria) this;
        }

        public Criteria andChcreateidIn(List<Integer> values) {
            addCriterion("chcreateid in", values, "chcreateid");
            return (Criteria) this;
        }

        public Criteria andChcreateidNotIn(List<Integer> values) {
            addCriterion("chcreateid not in", values, "chcreateid");
            return (Criteria) this;
        }

        public Criteria andChcreateidBetween(Integer value1, Integer value2) {
            addCriterion("chcreateid between", value1, value2, "chcreateid");
            return (Criteria) this;
        }

        public Criteria andChcreateidNotBetween(Integer value1, Integer value2) {
            addCriterion("chcreateid not between", value1, value2, "chcreateid");
            return (Criteria) this;
        }

        public Criteria andChcreatebyIsNull() {
            addCriterion("chcreateby is null");
            return (Criteria) this;
        }

        public Criteria andChcreatebyIsNotNull() {
            addCriterion("chcreateby is not null");
            return (Criteria) this;
        }

        public Criteria andChcreatebyEqualTo(String value) {
            addCriterion("chcreateby =", value, "chcreateby");
            return (Criteria) this;
        }

        public Criteria andChcreatebyNotEqualTo(String value) {
            addCriterion("chcreateby <>", value, "chcreateby");
            return (Criteria) this;
        }

        public Criteria andChcreatebyGreaterThan(String value) {
            addCriterion("chcreateby >", value, "chcreateby");
            return (Criteria) this;
        }

        public Criteria andChcreatebyGreaterThanOrEqualTo(String value) {
            addCriterion("chcreateby >=", value, "chcreateby");
            return (Criteria) this;
        }

        public Criteria andChcreatebyLessThan(String value) {
            addCriterion("chcreateby <", value, "chcreateby");
            return (Criteria) this;
        }

        public Criteria andChcreatebyLessThanOrEqualTo(String value) {
            addCriterion("chcreateby <=", value, "chcreateby");
            return (Criteria) this;
        }

        public Criteria andChcreatebyLike(String value) {
            addCriterion("chcreateby like", value, "chcreateby");
            return (Criteria) this;
        }

        public Criteria andChcreatebyNotLike(String value) {
            addCriterion("chcreateby not like", value, "chcreateby");
            return (Criteria) this;
        }

        public Criteria andChcreatebyIn(List<String> values) {
            addCriterion("chcreateby in", values, "chcreateby");
            return (Criteria) this;
        }

        public Criteria andChcreatebyNotIn(List<String> values) {
            addCriterion("chcreateby not in", values, "chcreateby");
            return (Criteria) this;
        }

        public Criteria andChcreatebyBetween(String value1, String value2) {
            addCriterion("chcreateby between", value1, value2, "chcreateby");
            return (Criteria) this;
        }

        public Criteria andChcreatebyNotBetween(String value1, String value2) {
            addCriterion("chcreateby not between", value1, value2, "chcreateby");
            return (Criteria) this;
        }

        public Criteria andChcreatedateIsNull() {
            addCriterion("chcreatedate is null");
            return (Criteria) this;
        }

        public Criteria andChcreatedateIsNotNull() {
            addCriterion("chcreatedate is not null");
            return (Criteria) this;
        }

        public Criteria andChcreatedateEqualTo(Date value) {
            addCriterion("chcreatedate =", value, "chcreatedate");
            return (Criteria) this;
        }

        public Criteria andChcreatedateNotEqualTo(Date value) {
            addCriterion("chcreatedate <>", value, "chcreatedate");
            return (Criteria) this;
        }

        public Criteria andChcreatedateGreaterThan(Date value) {
            addCriterion("chcreatedate >", value, "chcreatedate");
            return (Criteria) this;
        }

        public Criteria andChcreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("chcreatedate >=", value, "chcreatedate");
            return (Criteria) this;
        }

        public Criteria andChcreatedateLessThan(Date value) {
            addCriterion("chcreatedate <", value, "chcreatedate");
            return (Criteria) this;
        }

        public Criteria andChcreatedateLessThanOrEqualTo(Date value) {
            addCriterion("chcreatedate <=", value, "chcreatedate");
            return (Criteria) this;
        }

        public Criteria andChcreatedateIn(List<Date> values) {
            addCriterion("chcreatedate in", values, "chcreatedate");
            return (Criteria) this;
        }

        public Criteria andChcreatedateNotIn(List<Date> values) {
            addCriterion("chcreatedate not in", values, "chcreatedate");
            return (Criteria) this;
        }

        public Criteria andChcreatedateBetween(Date value1, Date value2) {
            addCriterion("chcreatedate between", value1, value2, "chcreatedate");
            return (Criteria) this;
        }

        public Criteria andChcreatedateNotBetween(Date value1, Date value2) {
            addCriterion("chcreatedate not between", value1, value2, "chcreatedate");
            return (Criteria) this;
        }

        public Criteria andChdueidIsNull() {
            addCriterion("chdueid is null");
            return (Criteria) this;
        }

        public Criteria andChdueidIsNotNull() {
            addCriterion("chdueid is not null");
            return (Criteria) this;
        }

        public Criteria andChdueidEqualTo(Integer value) {
            addCriterion("chdueid =", value, "chdueid");
            return (Criteria) this;
        }

        public Criteria andChdueidNotEqualTo(Integer value) {
            addCriterion("chdueid <>", value, "chdueid");
            return (Criteria) this;
        }

        public Criteria andChdueidGreaterThan(Integer value) {
            addCriterion("chdueid >", value, "chdueid");
            return (Criteria) this;
        }

        public Criteria andChdueidGreaterThanOrEqualTo(Integer value) {
            addCriterion("chdueid >=", value, "chdueid");
            return (Criteria) this;
        }

        public Criteria andChdueidLessThan(Integer value) {
            addCriterion("chdueid <", value, "chdueid");
            return (Criteria) this;
        }

        public Criteria andChdueidLessThanOrEqualTo(Integer value) {
            addCriterion("chdueid <=", value, "chdueid");
            return (Criteria) this;
        }

        public Criteria andChdueidIn(List<Integer> values) {
            addCriterion("chdueid in", values, "chdueid");
            return (Criteria) this;
        }

        public Criteria andChdueidNotIn(List<Integer> values) {
            addCriterion("chdueid not in", values, "chdueid");
            return (Criteria) this;
        }

        public Criteria andChdueidBetween(Integer value1, Integer value2) {
            addCriterion("chdueid between", value1, value2, "chdueid");
            return (Criteria) this;
        }

        public Criteria andChdueidNotBetween(Integer value1, Integer value2) {
            addCriterion("chdueid not between", value1, value2, "chdueid");
            return (Criteria) this;
        }

        public Criteria andChduetoIsNull() {
            addCriterion("chdueto is null");
            return (Criteria) this;
        }

        public Criteria andChduetoIsNotNull() {
            addCriterion("chdueto is not null");
            return (Criteria) this;
        }

        public Criteria andChduetoEqualTo(String value) {
            addCriterion("chdueto =", value, "chdueto");
            return (Criteria) this;
        }

        public Criteria andChduetoNotEqualTo(String value) {
            addCriterion("chdueto <>", value, "chdueto");
            return (Criteria) this;
        }

        public Criteria andChduetoGreaterThan(String value) {
            addCriterion("chdueto >", value, "chdueto");
            return (Criteria) this;
        }

        public Criteria andChduetoGreaterThanOrEqualTo(String value) {
            addCriterion("chdueto >=", value, "chdueto");
            return (Criteria) this;
        }

        public Criteria andChduetoLessThan(String value) {
            addCriterion("chdueto <", value, "chdueto");
            return (Criteria) this;
        }

        public Criteria andChduetoLessThanOrEqualTo(String value) {
            addCriterion("chdueto <=", value, "chdueto");
            return (Criteria) this;
        }

        public Criteria andChduetoLike(String value) {
            addCriterion("chdueto like", value, "chdueto");
            return (Criteria) this;
        }

        public Criteria andChduetoNotLike(String value) {
            addCriterion("chdueto not like", value, "chdueto");
            return (Criteria) this;
        }

        public Criteria andChduetoIn(List<String> values) {
            addCriterion("chdueto in", values, "chdueto");
            return (Criteria) this;
        }

        public Criteria andChduetoNotIn(List<String> values) {
            addCriterion("chdueto not in", values, "chdueto");
            return (Criteria) this;
        }

        public Criteria andChduetoBetween(String value1, String value2) {
            addCriterion("chdueto between", value1, value2, "chdueto");
            return (Criteria) this;
        }

        public Criteria andChduetoNotBetween(String value1, String value2) {
            addCriterion("chdueto not between", value1, value2, "chdueto");
            return (Criteria) this;
        }

        public Criteria andChduedateIsNull() {
            addCriterion("chduedate is null");
            return (Criteria) this;
        }

        public Criteria andChduedateIsNotNull() {
            addCriterion("chduedate is not null");
            return (Criteria) this;
        }

        public Criteria andChduedateEqualTo(Date value) {
            addCriterion("chduedate =", value, "chduedate");
            return (Criteria) this;
        }

        public Criteria andChduedateNotEqualTo(Date value) {
            addCriterion("chduedate <>", value, "chduedate");
            return (Criteria) this;
        }

        public Criteria andChduedateGreaterThan(Date value) {
            addCriterion("chduedate >", value, "chduedate");
            return (Criteria) this;
        }

        public Criteria andChduedateGreaterThanOrEqualTo(Date value) {
            addCriterion("chduedate >=", value, "chduedate");
            return (Criteria) this;
        }

        public Criteria andChduedateLessThan(Date value) {
            addCriterion("chduedate <", value, "chduedate");
            return (Criteria) this;
        }

        public Criteria andChduedateLessThanOrEqualTo(Date value) {
            addCriterion("chduedate <=", value, "chduedate");
            return (Criteria) this;
        }

        public Criteria andChduedateIn(List<Date> values) {
            addCriterion("chduedate in", values, "chduedate");
            return (Criteria) this;
        }

        public Criteria andChduedateNotIn(List<Date> values) {
            addCriterion("chduedate not in", values, "chduedate");
            return (Criteria) this;
        }

        public Criteria andChduedateBetween(Date value1, Date value2) {
            addCriterion("chduedate between", value1, value2, "chduedate");
            return (Criteria) this;
        }

        public Criteria andChduedateNotBetween(Date value1, Date value2) {
            addCriterion("chduedate not between", value1, value2, "chduedate");
            return (Criteria) this;
        }

        public Criteria andChstatusIsNull() {
            addCriterion("chstatus is null");
            return (Criteria) this;
        }

        public Criteria andChstatusIsNotNull() {
            addCriterion("chstatus is not null");
            return (Criteria) this;
        }

        public Criteria andChstatusEqualTo(String value) {
            addCriterion("chstatus =", value, "chstatus");
            return (Criteria) this;
        }

        public Criteria andChstatusNotEqualTo(String value) {
            addCriterion("chstatus <>", value, "chstatus");
            return (Criteria) this;
        }

        public Criteria andChstatusGreaterThan(String value) {
            addCriterion("chstatus >", value, "chstatus");
            return (Criteria) this;
        }

        public Criteria andChstatusGreaterThanOrEqualTo(String value) {
            addCriterion("chstatus >=", value, "chstatus");
            return (Criteria) this;
        }

        public Criteria andChstatusLessThan(String value) {
            addCriterion("chstatus <", value, "chstatus");
            return (Criteria) this;
        }

        public Criteria andChstatusLessThanOrEqualTo(String value) {
            addCriterion("chstatus <=", value, "chstatus");
            return (Criteria) this;
        }

        public Criteria andChstatusLike(String value) {
            addCriterion("chstatus like", value, "chstatus");
            return (Criteria) this;
        }

        public Criteria andChstatusNotLike(String value) {
            addCriterion("chstatus not like", value, "chstatus");
            return (Criteria) this;
        }

        public Criteria andChstatusIn(List<String> values) {
            addCriterion("chstatus in", values, "chstatus");
            return (Criteria) this;
        }

        public Criteria andChstatusNotIn(List<String> values) {
            addCriterion("chstatus not in", values, "chstatus");
            return (Criteria) this;
        }

        public Criteria andChstatusBetween(String value1, String value2) {
            addCriterion("chstatus between", value1, value2, "chstatus");
            return (Criteria) this;
        }

        public Criteria andChstatusNotBetween(String value1, String value2) {
            addCriterion("chstatus not between", value1, value2, "chstatus");
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