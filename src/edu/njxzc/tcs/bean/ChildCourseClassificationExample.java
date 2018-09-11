package edu.njxzc.tcs.bean;

import java.util.ArrayList;
import java.util.List;

public class ChildCourseClassificationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChildCourseClassificationExample() {
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

        public Criteria andChildcourseclassificationidIsNull() {
            addCriterion("childcourseclassificationid is null");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassificationidIsNotNull() {
            addCriterion("childcourseclassificationid is not null");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassificationidEqualTo(Integer value) {
            addCriterion("childcourseclassificationid =", value, "childcourseclassificationid");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassificationidNotEqualTo(Integer value) {
            addCriterion("childcourseclassificationid <>", value, "childcourseclassificationid");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassificationidGreaterThan(Integer value) {
            addCriterion("childcourseclassificationid >", value, "childcourseclassificationid");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassificationidGreaterThanOrEqualTo(Integer value) {
            addCriterion("childcourseclassificationid >=", value, "childcourseclassificationid");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassificationidLessThan(Integer value) {
            addCriterion("childcourseclassificationid <", value, "childcourseclassificationid");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassificationidLessThanOrEqualTo(Integer value) {
            addCriterion("childcourseclassificationid <=", value, "childcourseclassificationid");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassificationidIn(List<Integer> values) {
            addCriterion("childcourseclassificationid in", values, "childcourseclassificationid");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassificationidNotIn(List<Integer> values) {
            addCriterion("childcourseclassificationid not in", values, "childcourseclassificationid");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassificationidBetween(Integer value1, Integer value2) {
            addCriterion("childcourseclassificationid between", value1, value2, "childcourseclassificationid");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassificationidNotBetween(Integer value1, Integer value2) {
            addCriterion("childcourseclassificationid not between", value1, value2, "childcourseclassificationid");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassificationnameIsNull() {
            addCriterion("childcourseclassificationname is null");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassificationnameIsNotNull() {
            addCriterion("childcourseclassificationname is not null");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassificationnameEqualTo(String value) {
            addCriterion("childcourseclassificationname =", value, "childcourseclassificationname");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassificationnameNotEqualTo(String value) {
            addCriterion("childcourseclassificationname <>", value, "childcourseclassificationname");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassificationnameGreaterThan(String value) {
            addCriterion("childcourseclassificationname >", value, "childcourseclassificationname");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassificationnameGreaterThanOrEqualTo(String value) {
            addCriterion("childcourseclassificationname >=", value, "childcourseclassificationname");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassificationnameLessThan(String value) {
            addCriterion("childcourseclassificationname <", value, "childcourseclassificationname");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassificationnameLessThanOrEqualTo(String value) {
            addCriterion("childcourseclassificationname <=", value, "childcourseclassificationname");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassificationnameLike(String value) {
            addCriterion("childcourseclassificationname like", value, "childcourseclassificationname");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassificationnameNotLike(String value) {
            addCriterion("childcourseclassificationname not like", value, "childcourseclassificationname");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassificationnameIn(List<String> values) {
            addCriterion("childcourseclassificationname in", values, "childcourseclassificationname");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassificationnameNotIn(List<String> values) {
            addCriterion("childcourseclassificationname not in", values, "childcourseclassificationname");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassificationnameBetween(String value1, String value2) {
            addCriterion("childcourseclassificationname between", value1, value2, "childcourseclassificationname");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassificationnameNotBetween(String value1, String value2) {
            addCriterion("childcourseclassificationname not between", value1, value2, "childcourseclassificationname");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassifcationdescIsNull() {
            addCriterion("childcourseclassifcationdesc is null");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassifcationdescIsNotNull() {
            addCriterion("childcourseclassifcationdesc is not null");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassifcationdescEqualTo(String value) {
            addCriterion("childcourseclassifcationdesc =", value, "childcourseclassifcationdesc");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassifcationdescNotEqualTo(String value) {
            addCriterion("childcourseclassifcationdesc <>", value, "childcourseclassifcationdesc");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassifcationdescGreaterThan(String value) {
            addCriterion("childcourseclassifcationdesc >", value, "childcourseclassifcationdesc");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassifcationdescGreaterThanOrEqualTo(String value) {
            addCriterion("childcourseclassifcationdesc >=", value, "childcourseclassifcationdesc");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassifcationdescLessThan(String value) {
            addCriterion("childcourseclassifcationdesc <", value, "childcourseclassifcationdesc");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassifcationdescLessThanOrEqualTo(String value) {
            addCriterion("childcourseclassifcationdesc <=", value, "childcourseclassifcationdesc");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassifcationdescLike(String value) {
            addCriterion("childcourseclassifcationdesc like", value, "childcourseclassifcationdesc");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassifcationdescNotLike(String value) {
            addCriterion("childcourseclassifcationdesc not like", value, "childcourseclassifcationdesc");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassifcationdescIn(List<String> values) {
            addCriterion("childcourseclassifcationdesc in", values, "childcourseclassifcationdesc");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassifcationdescNotIn(List<String> values) {
            addCriterion("childcourseclassifcationdesc not in", values, "childcourseclassifcationdesc");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassifcationdescBetween(String value1, String value2) {
            addCriterion("childcourseclassifcationdesc between", value1, value2, "childcourseclassifcationdesc");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassifcationdescNotBetween(String value1, String value2) {
            addCriterion("childcourseclassifcationdesc not between", value1, value2, "childcourseclassifcationdesc");
            return (Criteria) this;
        }

        public Criteria andCourseclassifcationdescIsNull() {
            addCriterion("courseclassifcationdesc is null");
            return (Criteria) this;
        }

        public Criteria andCourseclassifcationdescIsNotNull() {
            addCriterion("courseclassifcationdesc is not null");
            return (Criteria) this;
        }

        public Criteria andCourseclassifcationdescEqualTo(String value) {
            addCriterion("courseclassifcationdesc =", value, "courseclassifcationdesc");
            return (Criteria) this;
        }

        public Criteria andCourseclassifcationdescNotEqualTo(String value) {
            addCriterion("courseclassifcationdesc <>", value, "courseclassifcationdesc");
            return (Criteria) this;
        }

        public Criteria andCourseclassifcationdescGreaterThan(String value) {
            addCriterion("courseclassifcationdesc >", value, "courseclassifcationdesc");
            return (Criteria) this;
        }

        public Criteria andCourseclassifcationdescGreaterThanOrEqualTo(String value) {
            addCriterion("courseclassifcationdesc >=", value, "courseclassifcationdesc");
            return (Criteria) this;
        }

        public Criteria andCourseclassifcationdescLessThan(String value) {
            addCriterion("courseclassifcationdesc <", value, "courseclassifcationdesc");
            return (Criteria) this;
        }

        public Criteria andCourseclassifcationdescLessThanOrEqualTo(String value) {
            addCriterion("courseclassifcationdesc <=", value, "courseclassifcationdesc");
            return (Criteria) this;
        }

        public Criteria andCourseclassifcationdescLike(String value) {
            addCriterion("courseclassifcationdesc like", value, "courseclassifcationdesc");
            return (Criteria) this;
        }

        public Criteria andCourseclassifcationdescNotLike(String value) {
            addCriterion("courseclassifcationdesc not like", value, "courseclassifcationdesc");
            return (Criteria) this;
        }

        public Criteria andCourseclassifcationdescIn(List<String> values) {
            addCriterion("courseclassifcationdesc in", values, "courseclassifcationdesc");
            return (Criteria) this;
        }

        public Criteria andCourseclassifcationdescNotIn(List<String> values) {
            addCriterion("courseclassifcationdesc not in", values, "courseclassifcationdesc");
            return (Criteria) this;
        }

        public Criteria andCourseclassifcationdescBetween(String value1, String value2) {
            addCriterion("courseclassifcationdesc between", value1, value2, "courseclassifcationdesc");
            return (Criteria) this;
        }

        public Criteria andCourseclassifcationdescNotBetween(String value1, String value2) {
            addCriterion("courseclassifcationdesc not between", value1, value2, "courseclassifcationdesc");
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