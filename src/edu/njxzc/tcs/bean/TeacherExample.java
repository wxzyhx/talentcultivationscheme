package edu.njxzc.tcs.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTeacher_IDIsNull() {
            addCriterion("teacher_ID is null");
            return (Criteria) this;
        }

        public Criteria andTeacher_IDIsNotNull() {
            addCriterion("teacher_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTeacher_IDEqualTo(String value) {
            addCriterion("teacher_ID =", value, "teacher_ID");
            return (Criteria) this;
        }

        public Criteria andTeacher_IDNotEqualTo(String value) {
            addCriterion("teacher_ID <>", value, "teacher_ID");
            return (Criteria) this;
        }

        public Criteria andTeacher_IDGreaterThan(String value) {
            addCriterion("teacher_ID >", value, "teacher_ID");
            return (Criteria) this;
        }

        public Criteria andTeacher_IDGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_ID >=", value, "teacher_ID");
            return (Criteria) this;
        }

        public Criteria andTeacher_IDLessThan(String value) {
            addCriterion("teacher_ID <", value, "teacher_ID");
            return (Criteria) this;
        }

        public Criteria andTeacher_IDLessThanOrEqualTo(String value) {
            addCriterion("teacher_ID <=", value, "teacher_ID");
            return (Criteria) this;
        }

        public Criteria andTeacher_IDLike(String value) {
            addCriterion("teacher_ID like", value, "teacher_ID");
            return (Criteria) this;
        }

        public Criteria andTeacher_IDNotLike(String value) {
            addCriterion("teacher_ID not like", value, "teacher_ID");
            return (Criteria) this;
        }

        public Criteria andTeacher_IDIn(List<String> values) {
            addCriterion("teacher_ID in", values, "teacher_ID");
            return (Criteria) this;
        }

        public Criteria andTeacher_IDNotIn(List<String> values) {
            addCriterion("teacher_ID not in", values, "teacher_ID");
            return (Criteria) this;
        }

        public Criteria andTeacher_IDBetween(String value1, String value2) {
            addCriterion("teacher_ID between", value1, value2, "teacher_ID");
            return (Criteria) this;
        }

        public Criteria andTeacher_IDNotBetween(String value1, String value2) {
            addCriterion("teacher_ID not between", value1, value2, "teacher_ID");
            return (Criteria) this;
        }

        public Criteria andTeacher_statusIsNull() {
            addCriterion("teacher_status is null");
            return (Criteria) this;
        }

        public Criteria andTeacher_statusIsNotNull() {
            addCriterion("teacher_status is not null");
            return (Criteria) this;
        }

        public Criteria andTeacher_statusEqualTo(Short value) {
            addCriterion("teacher_status =", value, "teacher_status");
            return (Criteria) this;
        }

        public Criteria andTeacher_statusNotEqualTo(Short value) {
            addCriterion("teacher_status <>", value, "teacher_status");
            return (Criteria) this;
        }

        public Criteria andTeacher_statusGreaterThan(Short value) {
            addCriterion("teacher_status >", value, "teacher_status");
            return (Criteria) this;
        }

        public Criteria andTeacher_statusGreaterThanOrEqualTo(Short value) {
            addCriterion("teacher_status >=", value, "teacher_status");
            return (Criteria) this;
        }

        public Criteria andTeacher_statusLessThan(Short value) {
            addCriterion("teacher_status <", value, "teacher_status");
            return (Criteria) this;
        }

        public Criteria andTeacher_statusLessThanOrEqualTo(Short value) {
            addCriterion("teacher_status <=", value, "teacher_status");
            return (Criteria) this;
        }

        public Criteria andTeacher_statusIn(List<Short> values) {
            addCriterion("teacher_status in", values, "teacher_status");
            return (Criteria) this;
        }

        public Criteria andTeacher_statusNotIn(List<Short> values) {
            addCriterion("teacher_status not in", values, "teacher_status");
            return (Criteria) this;
        }

        public Criteria andTeacher_statusBetween(Short value1, Short value2) {
            addCriterion("teacher_status between", value1, value2, "teacher_status");
            return (Criteria) this;
        }

        public Criteria andTeacher_statusNotBetween(Short value1, Short value2) {
            addCriterion("teacher_status not between", value1, value2, "teacher_status");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andTeacher_nameIsNull() {
            addCriterion("teacher_name is null");
            return (Criteria) this;
        }

        public Criteria andTeacher_nameIsNotNull() {
            addCriterion("teacher_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeacher_nameEqualTo(String value) {
            addCriterion("teacher_name =", value, "teacher_name");
            return (Criteria) this;
        }

        public Criteria andTeacher_nameNotEqualTo(String value) {
            addCriterion("teacher_name <>", value, "teacher_name");
            return (Criteria) this;
        }

        public Criteria andTeacher_nameGreaterThan(String value) {
            addCriterion("teacher_name >", value, "teacher_name");
            return (Criteria) this;
        }

        public Criteria andTeacher_nameGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_name >=", value, "teacher_name");
            return (Criteria) this;
        }

        public Criteria andTeacher_nameLessThan(String value) {
            addCriterion("teacher_name <", value, "teacher_name");
            return (Criteria) this;
        }

        public Criteria andTeacher_nameLessThanOrEqualTo(String value) {
            addCriterion("teacher_name <=", value, "teacher_name");
            return (Criteria) this;
        }

        public Criteria andTeacher_nameLike(String value) {
            addCriterion("teacher_name like", value, "teacher_name");
            return (Criteria) this;
        }

        public Criteria andTeacher_nameNotLike(String value) {
            addCriterion("teacher_name not like", value, "teacher_name");
            return (Criteria) this;
        }

        public Criteria andTeacher_nameIn(List<String> values) {
            addCriterion("teacher_name in", values, "teacher_name");
            return (Criteria) this;
        }

        public Criteria andTeacher_nameNotIn(List<String> values) {
            addCriterion("teacher_name not in", values, "teacher_name");
            return (Criteria) this;
        }

        public Criteria andTeacher_nameBetween(String value1, String value2) {
            addCriterion("teacher_name between", value1, value2, "teacher_name");
            return (Criteria) this;
        }

        public Criteria andTeacher_nameNotBetween(String value1, String value2) {
            addCriterion("teacher_name not between", value1, value2, "teacher_name");
            return (Criteria) this;
        }

        public Criteria andTeacher_classIsNull() {
            addCriterion("teacher_class is null");
            return (Criteria) this;
        }

        public Criteria andTeacher_classIsNotNull() {
            addCriterion("teacher_class is not null");
            return (Criteria) this;
        }

        public Criteria andTeacher_classEqualTo(String value) {
            addCriterion("teacher_class =", value, "teacher_class");
            return (Criteria) this;
        }

        public Criteria andTeacher_classNotEqualTo(String value) {
            addCriterion("teacher_class <>", value, "teacher_class");
            return (Criteria) this;
        }

        public Criteria andTeacher_classGreaterThan(String value) {
            addCriterion("teacher_class >", value, "teacher_class");
            return (Criteria) this;
        }

        public Criteria andTeacher_classGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_class >=", value, "teacher_class");
            return (Criteria) this;
        }

        public Criteria andTeacher_classLessThan(String value) {
            addCriterion("teacher_class <", value, "teacher_class");
            return (Criteria) this;
        }

        public Criteria andTeacher_classLessThanOrEqualTo(String value) {
            addCriterion("teacher_class <=", value, "teacher_class");
            return (Criteria) this;
        }

        public Criteria andTeacher_classLike(String value) {
            addCriterion("teacher_class like", value, "teacher_class");
            return (Criteria) this;
        }

        public Criteria andTeacher_classNotLike(String value) {
            addCriterion("teacher_class not like", value, "teacher_class");
            return (Criteria) this;
        }

        public Criteria andTeacher_classIn(List<String> values) {
            addCriterion("teacher_class in", values, "teacher_class");
            return (Criteria) this;
        }

        public Criteria andTeacher_classNotIn(List<String> values) {
            addCriterion("teacher_class not in", values, "teacher_class");
            return (Criteria) this;
        }

        public Criteria andTeacher_classBetween(String value1, String value2) {
            addCriterion("teacher_class between", value1, value2, "teacher_class");
            return (Criteria) this;
        }

        public Criteria andTeacher_classNotBetween(String value1, String value2) {
            addCriterion("teacher_class not between", value1, value2, "teacher_class");
            return (Criteria) this;
        }

        public Criteria andGmt_createIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmt_createIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmt_createEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmt_create");
            return (Criteria) this;
        }

        public Criteria andGmt_createNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmt_create");
            return (Criteria) this;
        }

        public Criteria andGmt_createGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmt_create");
            return (Criteria) this;
        }

        public Criteria andGmt_createGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmt_create");
            return (Criteria) this;
        }

        public Criteria andGmt_createLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmt_create");
            return (Criteria) this;
        }

        public Criteria andGmt_createLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmt_create");
            return (Criteria) this;
        }

        public Criteria andGmt_createIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmt_create");
            return (Criteria) this;
        }

        public Criteria andGmt_createNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmt_create");
            return (Criteria) this;
        }

        public Criteria andGmt_createBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmt_create");
            return (Criteria) this;
        }

        public Criteria andGmt_createNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmt_create");
            return (Criteria) this;
        }

        public Criteria andGmt_modifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmt_modifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmt_modifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmt_modified");
            return (Criteria) this;
        }

        public Criteria andGmt_modifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmt_modified");
            return (Criteria) this;
        }

        public Criteria andGmt_modifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmt_modified");
            return (Criteria) this;
        }

        public Criteria andGmt_modifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmt_modified");
            return (Criteria) this;
        }

        public Criteria andGmt_modifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmt_modified");
            return (Criteria) this;
        }

        public Criteria andGmt_modifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmt_modified");
            return (Criteria) this;
        }

        public Criteria andGmt_modifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmt_modified");
            return (Criteria) this;
        }

        public Criteria andGmt_modifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmt_modified");
            return (Criteria) this;
        }

        public Criteria andGmt_modifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmt_modified");
            return (Criteria) this;
        }

        public Criteria andGmt_modifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmt_modified");
            return (Criteria) this;
        }

        public Criteria andModified_user_IDIsNull() {
            addCriterion("modified_user_ID is null");
            return (Criteria) this;
        }

        public Criteria andModified_user_IDIsNotNull() {
            addCriterion("modified_user_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModified_user_IDEqualTo(Integer value) {
            addCriterion("modified_user_ID =", value, "modified_user_ID");
            return (Criteria) this;
        }

        public Criteria andModified_user_IDNotEqualTo(Integer value) {
            addCriterion("modified_user_ID <>", value, "modified_user_ID");
            return (Criteria) this;
        }

        public Criteria andModified_user_IDGreaterThan(Integer value) {
            addCriterion("modified_user_ID >", value, "modified_user_ID");
            return (Criteria) this;
        }

        public Criteria andModified_user_IDGreaterThanOrEqualTo(Integer value) {
            addCriterion("modified_user_ID >=", value, "modified_user_ID");
            return (Criteria) this;
        }

        public Criteria andModified_user_IDLessThan(Integer value) {
            addCriterion("modified_user_ID <", value, "modified_user_ID");
            return (Criteria) this;
        }

        public Criteria andModified_user_IDLessThanOrEqualTo(Integer value) {
            addCriterion("modified_user_ID <=", value, "modified_user_ID");
            return (Criteria) this;
        }

        public Criteria andModified_user_IDIn(List<Integer> values) {
            addCriterion("modified_user_ID in", values, "modified_user_ID");
            return (Criteria) this;
        }

        public Criteria andModified_user_IDNotIn(List<Integer> values) {
            addCriterion("modified_user_ID not in", values, "modified_user_ID");
            return (Criteria) this;
        }

        public Criteria andModified_user_IDBetween(Integer value1, Integer value2) {
            addCriterion("modified_user_ID between", value1, value2, "modified_user_ID");
            return (Criteria) this;
        }

        public Criteria andModified_user_IDNotBetween(Integer value1, Integer value2) {
            addCriterion("modified_user_ID not between", value1, value2, "modified_user_ID");
            return (Criteria) this;
        }

        public Criteria andCreated_user_IDIsNull() {
            addCriterion("created_user_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreated_user_IDIsNotNull() {
            addCriterion("created_user_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreated_user_IDEqualTo(Integer value) {
            addCriterion("created_user_ID =", value, "created_user_ID");
            return (Criteria) this;
        }

        public Criteria andCreated_user_IDNotEqualTo(Integer value) {
            addCriterion("created_user_ID <>", value, "created_user_ID");
            return (Criteria) this;
        }

        public Criteria andCreated_user_IDGreaterThan(Integer value) {
            addCriterion("created_user_ID >", value, "created_user_ID");
            return (Criteria) this;
        }

        public Criteria andCreated_user_IDGreaterThanOrEqualTo(Integer value) {
            addCriterion("created_user_ID >=", value, "created_user_ID");
            return (Criteria) this;
        }

        public Criteria andCreated_user_IDLessThan(Integer value) {
            addCriterion("created_user_ID <", value, "created_user_ID");
            return (Criteria) this;
        }

        public Criteria andCreated_user_IDLessThanOrEqualTo(Integer value) {
            addCriterion("created_user_ID <=", value, "created_user_ID");
            return (Criteria) this;
        }

        public Criteria andCreated_user_IDIn(List<Integer> values) {
            addCriterion("created_user_ID in", values, "created_user_ID");
            return (Criteria) this;
        }

        public Criteria andCreated_user_IDNotIn(List<Integer> values) {
            addCriterion("created_user_ID not in", values, "created_user_ID");
            return (Criteria) this;
        }

        public Criteria andCreated_user_IDBetween(Integer value1, Integer value2) {
            addCriterion("created_user_ID between", value1, value2, "created_user_ID");
            return (Criteria) this;
        }

        public Criteria andCreated_user_IDNotBetween(Integer value1, Integer value2) {
            addCriterion("created_user_ID not between", value1, value2, "created_user_ID");
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