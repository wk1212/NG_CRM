package com.ngcrm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TCustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCustomerExample() {
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

        public Criteria andCnoIsNull() {
            addCriterion("cno is null");
            return (Criteria) this;
        }

        public Criteria andCnoIsNotNull() {
            addCriterion("cno is not null");
            return (Criteria) this;
        }

        public Criteria andCnoEqualTo(Integer value) {
            addCriterion("cno =", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotEqualTo(Integer value) {
            addCriterion("cno <>", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoGreaterThan(Integer value) {
            addCriterion("cno >", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("cno >=", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoLessThan(Integer value) {
            addCriterion("cno <", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoLessThanOrEqualTo(Integer value) {
            addCriterion("cno <=", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoIn(List<Integer> values) {
            addCriterion("cno in", values, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotIn(List<Integer> values) {
            addCriterion("cno not in", values, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoBetween(Integer value1, Integer value2) {
            addCriterion("cno between", value1, value2, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotBetween(Integer value1, Integer value2) {
            addCriterion("cno not between", value1, value2, "cno");
            return (Criteria) this;
        }

        public Criteria andCnameIsNull() {
            addCriterion("cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cname not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCtelIsNull() {
            addCriterion("ctel is null");
            return (Criteria) this;
        }

        public Criteria andCtelIsNotNull() {
            addCriterion("ctel is not null");
            return (Criteria) this;
        }

        public Criteria andCtelEqualTo(String value) {
            addCriterion("ctel =", value, "ctel");
            return (Criteria) this;
        }

        public Criteria andCtelNotEqualTo(String value) {
            addCriterion("ctel <>", value, "ctel");
            return (Criteria) this;
        }

        public Criteria andCtelGreaterThan(String value) {
            addCriterion("ctel >", value, "ctel");
            return (Criteria) this;
        }

        public Criteria andCtelGreaterThanOrEqualTo(String value) {
            addCriterion("ctel >=", value, "ctel");
            return (Criteria) this;
        }

        public Criteria andCtelLessThan(String value) {
            addCriterion("ctel <", value, "ctel");
            return (Criteria) this;
        }

        public Criteria andCtelLessThanOrEqualTo(String value) {
            addCriterion("ctel <=", value, "ctel");
            return (Criteria) this;
        }

        public Criteria andCtelLike(String value) {
            addCriterion("ctel like", value, "ctel");
            return (Criteria) this;
        }

        public Criteria andCtelNotLike(String value) {
            addCriterion("ctel not like", value, "ctel");
            return (Criteria) this;
        }

        public Criteria andCtelIn(List<String> values) {
            addCriterion("ctel in", values, "ctel");
            return (Criteria) this;
        }

        public Criteria andCtelNotIn(List<String> values) {
            addCriterion("ctel not in", values, "ctel");
            return (Criteria) this;
        }

        public Criteria andCtelBetween(String value1, String value2) {
            addCriterion("ctel between", value1, value2, "ctel");
            return (Criteria) this;
        }

        public Criteria andCtelNotBetween(String value1, String value2) {
            addCriterion("ctel not between", value1, value2, "ctel");
            return (Criteria) this;
        }

        public Criteria andCdescIsNull() {
            addCriterion("cdesc is null");
            return (Criteria) this;
        }

        public Criteria andCdescIsNotNull() {
            addCriterion("cdesc is not null");
            return (Criteria) this;
        }

        public Criteria andCdescEqualTo(String value) {
            addCriterion("cdesc =", value, "cdesc");
            return (Criteria) this;
        }

        public Criteria andCdescNotEqualTo(String value) {
            addCriterion("cdesc <>", value, "cdesc");
            return (Criteria) this;
        }

        public Criteria andCdescGreaterThan(String value) {
            addCriterion("cdesc >", value, "cdesc");
            return (Criteria) this;
        }

        public Criteria andCdescGreaterThanOrEqualTo(String value) {
            addCriterion("cdesc >=", value, "cdesc");
            return (Criteria) this;
        }

        public Criteria andCdescLessThan(String value) {
            addCriterion("cdesc <", value, "cdesc");
            return (Criteria) this;
        }

        public Criteria andCdescLessThanOrEqualTo(String value) {
            addCriterion("cdesc <=", value, "cdesc");
            return (Criteria) this;
        }

        public Criteria andCdescLike(String value) {
            addCriterion("cdesc like", value, "cdesc");
            return (Criteria) this;
        }

        public Criteria andCdescNotLike(String value) {
            addCriterion("cdesc not like", value, "cdesc");
            return (Criteria) this;
        }

        public Criteria andCdescIn(List<String> values) {
            addCriterion("cdesc in", values, "cdesc");
            return (Criteria) this;
        }

        public Criteria andCdescNotIn(List<String> values) {
            addCriterion("cdesc not in", values, "cdesc");
            return (Criteria) this;
        }

        public Criteria andCdescBetween(String value1, String value2) {
            addCriterion("cdesc between", value1, value2, "cdesc");
            return (Criteria) this;
        }

        public Criteria andCdescNotBetween(String value1, String value2) {
            addCriterion("cdesc not between", value1, value2, "cdesc");
            return (Criteria) this;
        }

        public Criteria andCcreIsNull() {
            addCriterion("ccre is null");
            return (Criteria) this;
        }

        public Criteria andCcreIsNotNull() {
            addCriterion("ccre is not null");
            return (Criteria) this;
        }

        public Criteria andCcreEqualTo(Date value) {
            addCriterion("ccre =", value, "ccre");
            return (Criteria) this;
        }

        public Criteria andCcreNotEqualTo(Date value) {
            addCriterion("ccre <>", value, "ccre");
            return (Criteria) this;
        }

        public Criteria andCcreGreaterThan(Date value) {
            addCriterion("ccre >", value, "ccre");
            return (Criteria) this;
        }

        public Criteria andCcreGreaterThanOrEqualTo(Date value) {
            addCriterion("ccre >=", value, "ccre");
            return (Criteria) this;
        }

        public Criteria andCcreLessThan(Date value) {
            addCriterion("ccre <", value, "ccre");
            return (Criteria) this;
        }

        public Criteria andCcreLessThanOrEqualTo(Date value) {
            addCriterion("ccre <=", value, "ccre");
            return (Criteria) this;
        }

        public Criteria andCcreIn(List<Date> values) {
            addCriterion("ccre in", values, "ccre");
            return (Criteria) this;
        }

        public Criteria andCcreNotIn(List<Date> values) {
            addCriterion("ccre not in", values, "ccre");
            return (Criteria) this;
        }

        public Criteria andCcreBetween(Date value1, Date value2) {
            addCriterion("ccre between", value1, value2, "ccre");
            return (Criteria) this;
        }

        public Criteria andCcreNotBetween(Date value1, Date value2) {
            addCriterion("ccre not between", value1, value2, "ccre");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Date value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Date value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Date value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Date value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Date value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Date> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Date> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Date value1, Date value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Date value1, Date value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCnationIsNull() {
            addCriterion("cnation is null");
            return (Criteria) this;
        }

        public Criteria andCnationIsNotNull() {
            addCriterion("cnation is not null");
            return (Criteria) this;
        }

        public Criteria andCnationEqualTo(String value) {
            addCriterion("cnation =", value, "cnation");
            return (Criteria) this;
        }

        public Criteria andCnationNotEqualTo(String value) {
            addCriterion("cnation <>", value, "cnation");
            return (Criteria) this;
        }

        public Criteria andCnationGreaterThan(String value) {
            addCriterion("cnation >", value, "cnation");
            return (Criteria) this;
        }

        public Criteria andCnationGreaterThanOrEqualTo(String value) {
            addCriterion("cnation >=", value, "cnation");
            return (Criteria) this;
        }

        public Criteria andCnationLessThan(String value) {
            addCriterion("cnation <", value, "cnation");
            return (Criteria) this;
        }

        public Criteria andCnationLessThanOrEqualTo(String value) {
            addCriterion("cnation <=", value, "cnation");
            return (Criteria) this;
        }

        public Criteria andCnationLike(String value) {
            addCriterion("cnation like", value, "cnation");
            return (Criteria) this;
        }

        public Criteria andCnationNotLike(String value) {
            addCriterion("cnation not like", value, "cnation");
            return (Criteria) this;
        }

        public Criteria andCnationIn(List<String> values) {
            addCriterion("cnation in", values, "cnation");
            return (Criteria) this;
        }

        public Criteria andCnationNotIn(List<String> values) {
            addCriterion("cnation not in", values, "cnation");
            return (Criteria) this;
        }

        public Criteria andCnationBetween(String value1, String value2) {
            addCriterion("cnation between", value1, value2, "cnation");
            return (Criteria) this;
        }

        public Criteria andCnationNotBetween(String value1, String value2) {
            addCriterion("cnation not between", value1, value2, "cnation");
            return (Criteria) this;
        }

        public Criteria andCaddressIsNull() {
            addCriterion("caddress is null");
            return (Criteria) this;
        }

        public Criteria andCaddressIsNotNull() {
            addCriterion("caddress is not null");
            return (Criteria) this;
        }

        public Criteria andCaddressEqualTo(String value) {
            addCriterion("caddress =", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotEqualTo(String value) {
            addCriterion("caddress <>", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressGreaterThan(String value) {
            addCriterion("caddress >", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressGreaterThanOrEqualTo(String value) {
            addCriterion("caddress >=", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressLessThan(String value) {
            addCriterion("caddress <", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressLessThanOrEqualTo(String value) {
            addCriterion("caddress <=", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressLike(String value) {
            addCriterion("caddress like", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotLike(String value) {
            addCriterion("caddress not like", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressIn(List<String> values) {
            addCriterion("caddress in", values, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotIn(List<String> values) {
            addCriterion("caddress not in", values, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressBetween(String value1, String value2) {
            addCriterion("caddress between", value1, value2, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotBetween(String value1, String value2) {
            addCriterion("caddress not between", value1, value2, "caddress");
            return (Criteria) this;
        }

        public Criteria andCemailIsNull() {
            addCriterion("cemail is null");
            return (Criteria) this;
        }

        public Criteria andCemailIsNotNull() {
            addCriterion("cemail is not null");
            return (Criteria) this;
        }

        public Criteria andCemailEqualTo(String value) {
            addCriterion("cemail =", value, "cemail");
            return (Criteria) this;
        }

        public Criteria andCemailNotEqualTo(String value) {
            addCriterion("cemail <>", value, "cemail");
            return (Criteria) this;
        }

        public Criteria andCemailGreaterThan(String value) {
            addCriterion("cemail >", value, "cemail");
            return (Criteria) this;
        }

        public Criteria andCemailGreaterThanOrEqualTo(String value) {
            addCriterion("cemail >=", value, "cemail");
            return (Criteria) this;
        }

        public Criteria andCemailLessThan(String value) {
            addCriterion("cemail <", value, "cemail");
            return (Criteria) this;
        }

        public Criteria andCemailLessThanOrEqualTo(String value) {
            addCriterion("cemail <=", value, "cemail");
            return (Criteria) this;
        }

        public Criteria andCemailLike(String value) {
            addCriterion("cemail like", value, "cemail");
            return (Criteria) this;
        }

        public Criteria andCemailNotLike(String value) {
            addCriterion("cemail not like", value, "cemail");
            return (Criteria) this;
        }

        public Criteria andCemailIn(List<String> values) {
            addCriterion("cemail in", values, "cemail");
            return (Criteria) this;
        }

        public Criteria andCemailNotIn(List<String> values) {
            addCriterion("cemail not in", values, "cemail");
            return (Criteria) this;
        }

        public Criteria andCemailBetween(String value1, String value2) {
            addCriterion("cemail between", value1, value2, "cemail");
            return (Criteria) this;
        }

        public Criteria andCemailNotBetween(String value1, String value2) {
            addCriterion("cemail not between", value1, value2, "cemail");
            return (Criteria) this;
        }

        public Criteria andCincomeIsNull() {
            addCriterion("cincome is null");
            return (Criteria) this;
        }

        public Criteria andCincomeIsNotNull() {
            addCriterion("cincome is not null");
            return (Criteria) this;
        }

        public Criteria andCincomeEqualTo(String value) {
            addCriterion("cincome =", value, "cincome");
            return (Criteria) this;
        }

        public Criteria andCincomeNotEqualTo(String value) {
            addCriterion("cincome <>", value, "cincome");
            return (Criteria) this;
        }

        public Criteria andCincomeGreaterThan(String value) {
            addCriterion("cincome >", value, "cincome");
            return (Criteria) this;
        }

        public Criteria andCincomeGreaterThanOrEqualTo(String value) {
            addCriterion("cincome >=", value, "cincome");
            return (Criteria) this;
        }

        public Criteria andCincomeLessThan(String value) {
            addCriterion("cincome <", value, "cincome");
            return (Criteria) this;
        }

        public Criteria andCincomeLessThanOrEqualTo(String value) {
            addCriterion("cincome <=", value, "cincome");
            return (Criteria) this;
        }

        public Criteria andCincomeLike(String value) {
            addCriterion("cincome like", value, "cincome");
            return (Criteria) this;
        }

        public Criteria andCincomeNotLike(String value) {
            addCriterion("cincome not like", value, "cincome");
            return (Criteria) this;
        }

        public Criteria andCincomeIn(List<String> values) {
            addCriterion("cincome in", values, "cincome");
            return (Criteria) this;
        }

        public Criteria andCincomeNotIn(List<String> values) {
            addCriterion("cincome not in", values, "cincome");
            return (Criteria) this;
        }

        public Criteria andCincomeBetween(String value1, String value2) {
            addCriterion("cincome between", value1, value2, "cincome");
            return (Criteria) this;
        }

        public Criteria andCincomeNotBetween(String value1, String value2) {
            addCriterion("cincome not between", value1, value2, "cincome");
            return (Criteria) this;
        }

        public Criteria andCtypeIsNull() {
            addCriterion("ctype is null");
            return (Criteria) this;
        }

        public Criteria andCtypeIsNotNull() {
            addCriterion("ctype is not null");
            return (Criteria) this;
        }

        public Criteria andCtypeEqualTo(String value) {
            addCriterion("ctype =", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotEqualTo(String value) {
            addCriterion("ctype <>", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeGreaterThan(String value) {
            addCriterion("ctype >", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeGreaterThanOrEqualTo(String value) {
            addCriterion("ctype >=", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLessThan(String value) {
            addCriterion("ctype <", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLessThanOrEqualTo(String value) {
            addCriterion("ctype <=", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLike(String value) {
            addCriterion("ctype like", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotLike(String value) {
            addCriterion("ctype not like", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeIn(List<String> values) {
            addCriterion("ctype in", values, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotIn(List<String> values) {
            addCriterion("ctype not in", values, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeBetween(String value1, String value2) {
            addCriterion("ctype between", value1, value2, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotBetween(String value1, String value2) {
            addCriterion("ctype not between", value1, value2, "ctype");
            return (Criteria) this;
        }

        public Criteria andCempnumberIsNull() {
            addCriterion("cempnumber is null");
            return (Criteria) this;
        }

        public Criteria andCempnumberIsNotNull() {
            addCriterion("cempnumber is not null");
            return (Criteria) this;
        }

        public Criteria andCempnumberEqualTo(Integer value) {
            addCriterion("cempnumber =", value, "cempnumber");
            return (Criteria) this;
        }

        public Criteria andCempnumberNotEqualTo(Integer value) {
            addCriterion("cempnumber <>", value, "cempnumber");
            return (Criteria) this;
        }

        public Criteria andCempnumberGreaterThan(Integer value) {
            addCriterion("cempnumber >", value, "cempnumber");
            return (Criteria) this;
        }

        public Criteria andCempnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("cempnumber >=", value, "cempnumber");
            return (Criteria) this;
        }

        public Criteria andCempnumberLessThan(Integer value) {
            addCriterion("cempnumber <", value, "cempnumber");
            return (Criteria) this;
        }

        public Criteria andCempnumberLessThanOrEqualTo(Integer value) {
            addCriterion("cempnumber <=", value, "cempnumber");
            return (Criteria) this;
        }

        public Criteria andCempnumberIn(List<Integer> values) {
            addCriterion("cempnumber in", values, "cempnumber");
            return (Criteria) this;
        }

        public Criteria andCempnumberNotIn(List<Integer> values) {
            addCriterion("cempnumber not in", values, "cempnumber");
            return (Criteria) this;
        }

        public Criteria andCempnumberBetween(Integer value1, Integer value2) {
            addCriterion("cempnumber between", value1, value2, "cempnumber");
            return (Criteria) this;
        }

        public Criteria andCempnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("cempnumber not between", value1, value2, "cempnumber");
            return (Criteria) this;
        }

        public Criteria andCstatusIsNull() {
            addCriterion("cstatus is null");
            return (Criteria) this;
        }

        public Criteria andCstatusIsNotNull() {
            addCriterion("cstatus is not null");
            return (Criteria) this;
        }

        public Criteria andCstatusEqualTo(String value) {
            addCriterion("cstatus =", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusNotEqualTo(String value) {
            addCriterion("cstatus <>", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusGreaterThan(String value) {
            addCriterion("cstatus >", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusGreaterThanOrEqualTo(String value) {
            addCriterion("cstatus >=", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusLessThan(String value) {
            addCriterion("cstatus <", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusLessThanOrEqualTo(String value) {
            addCriterion("cstatus <=", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusLike(String value) {
            addCriterion("cstatus like", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusNotLike(String value) {
            addCriterion("cstatus not like", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusIn(List<String> values) {
            addCriterion("cstatus in", values, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusNotIn(List<String> values) {
            addCriterion("cstatus not in", values, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusBetween(String value1, String value2) {
            addCriterion("cstatus between", value1, value2, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusNotBetween(String value1, String value2) {
            addCriterion("cstatus not between", value1, value2, "cstatus");
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