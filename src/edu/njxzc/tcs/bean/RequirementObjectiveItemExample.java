package edu.njxzc.tcs.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RequirementObjectiveItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RequirementObjectiveItemExample() {
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

        public Criteria andRequireObjidIsNull() {
            addCriterion("require_objId is null");
            return (Criteria) this;
        }

        public Criteria andRequireObjidIsNotNull() {
            addCriterion("require_objId is not null");
            return (Criteria) this;
        }

        public Criteria andRequireObjidEqualTo(Integer value) {
            addCriterion("require_objId =", value, "requireObjid");
            return (Criteria) this;
        }

        public Criteria andRequireObjidNotEqualTo(Integer value) {
            addCriterion("require_objId <>", value, "requireObjid");
            return (Criteria) this;
        }

        public Criteria andRequireObjidGreaterThan(Integer value) {
            addCriterion("require_objId >", value, "requireObjid");
            return (Criteria) this;
        }

        public Criteria andRequireObjidGreaterThanOrEqualTo(Integer value) {
            addCriterion("require_objId >=", value, "requireObjid");
            return (Criteria) this;
        }

        public Criteria andRequireObjidLessThan(Integer value) {
            addCriterion("require_objId <", value, "requireObjid");
            return (Criteria) this;
        }

        public Criteria andRequireObjidLessThanOrEqualTo(Integer value) {
            addCriterion("require_objId <=", value, "requireObjid");
            return (Criteria) this;
        }

        public Criteria andRequireObjidIn(List<Integer> values) {
            addCriterion("require_objId in", values, "requireObjid");
            return (Criteria) this;
        }

        public Criteria andRequireObjidNotIn(List<Integer> values) {
            addCriterion("require_objId not in", values, "requireObjid");
            return (Criteria) this;
        }

        public Criteria andRequireObjidBetween(Integer value1, Integer value2) {
            addCriterion("require_objId between", value1, value2, "requireObjid");
            return (Criteria) this;
        }

        public Criteria andRequireObjidNotBetween(Integer value1, Integer value2) {
            addCriterion("require_objId not between", value1, value2, "requireObjid");
            return (Criteria) this;
        }

        public Criteria andRequirementidIsNull() {
            addCriterion("requirementid is null");
            return (Criteria) this;
        }

        public Criteria andRequirementidIsNotNull() {
            addCriterion("requirementid is not null");
            return (Criteria) this;
        }

        public Criteria andRequirementidEqualTo(Integer value) {
            addCriterion("requirementid =", value, "requirementid");
            return (Criteria) this;
        }

        public Criteria andRequirementidNotEqualTo(Integer value) {
            addCriterion("requirementid <>", value, "requirementid");
            return (Criteria) this;
        }

        public Criteria andRequirementidGreaterThan(Integer value) {
            addCriterion("requirementid >", value, "requirementid");
            return (Criteria) this;
        }

        public Criteria andRequirementidGreaterThanOrEqualTo(Integer value) {
            addCriterion("requirementid >=", value, "requirementid");
            return (Criteria) this;
        }

        public Criteria andRequirementidLessThan(Integer value) {
            addCriterion("requirementid <", value, "requirementid");
            return (Criteria) this;
        }

        public Criteria andRequirementidLessThanOrEqualTo(Integer value) {
            addCriterion("requirementid <=", value, "requirementid");
            return (Criteria) this;
        }

        public Criteria andRequirementidIn(List<Integer> values) {
            addCriterion("requirementid in", values, "requirementid");
            return (Criteria) this;
        }

        public Criteria andRequirementidNotIn(List<Integer> values) {
            addCriterion("requirementid not in", values, "requirementid");
            return (Criteria) this;
        }

        public Criteria andRequirementidBetween(Integer value1, Integer value2) {
            addCriterion("requirementid between", value1, value2, "requirementid");
            return (Criteria) this;
        }

        public Criteria andRequirementidNotBetween(Integer value1, Integer value2) {
            addCriterion("requirementid not between", value1, value2, "requirementid");
            return (Criteria) this;
        }

        public Criteria andObjectiveitemidIsNull() {
            addCriterion("objectiveitemid is null");
            return (Criteria) this;
        }

        public Criteria andObjectiveitemidIsNotNull() {
            addCriterion("objectiveitemid is not null");
            return (Criteria) this;
        }

        public Criteria andObjectiveitemidEqualTo(Integer value) {
            addCriterion("objectiveitemid =", value, "objectiveitemid");
            return (Criteria) this;
        }

        public Criteria andObjectiveitemidNotEqualTo(Integer value) {
            addCriterion("objectiveitemid <>", value, "objectiveitemid");
            return (Criteria) this;
        }

        public Criteria andObjectiveitemidGreaterThan(Integer value) {
            addCriterion("objectiveitemid >", value, "objectiveitemid");
            return (Criteria) this;
        }

        public Criteria andObjectiveitemidGreaterThanOrEqualTo(Integer value) {
            addCriterion("objectiveitemid >=", value, "objectiveitemid");
            return (Criteria) this;
        }

        public Criteria andObjectiveitemidLessThan(Integer value) {
            addCriterion("objectiveitemid <", value, "objectiveitemid");
            return (Criteria) this;
        }

        public Criteria andObjectiveitemidLessThanOrEqualTo(Integer value) {
            addCriterion("objectiveitemid <=", value, "objectiveitemid");
            return (Criteria) this;
        }

        public Criteria andObjectiveitemidIn(List<Integer> values) {
            addCriterion("objectiveitemid in", values, "objectiveitemid");
            return (Criteria) this;
        }

        public Criteria andObjectiveitemidNotIn(List<Integer> values) {
            addCriterion("objectiveitemid not in", values, "objectiveitemid");
            return (Criteria) this;
        }

        public Criteria andObjectiveitemidBetween(Integer value1, Integer value2) {
            addCriterion("objectiveitemid between", value1, value2, "objectiveitemid");
            return (Criteria) this;
        }

        public Criteria andObjectiveitemidNotBetween(Integer value1, Integer value2) {
            addCriterion("objectiveitemid not between", value1, value2, "objectiveitemid");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andCreatedUserSnIsNull() {
            addCriterion("created_user_sn is null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserSnIsNotNull() {
            addCriterion("created_user_sn is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserSnEqualTo(String value) {
            addCriterion("created_user_sn =", value, "createdUserSn");
            return (Criteria) this;
        }

        public Criteria andCreatedUserSnNotEqualTo(String value) {
            addCriterion("created_user_sn <>", value, "createdUserSn");
            return (Criteria) this;
        }

        public Criteria andCreatedUserSnGreaterThan(String value) {
            addCriterion("created_user_sn >", value, "createdUserSn");
            return (Criteria) this;
        }

        public Criteria andCreatedUserSnGreaterThanOrEqualTo(String value) {
            addCriterion("created_user_sn >=", value, "createdUserSn");
            return (Criteria) this;
        }

        public Criteria andCreatedUserSnLessThan(String value) {
            addCriterion("created_user_sn <", value, "createdUserSn");
            return (Criteria) this;
        }

        public Criteria andCreatedUserSnLessThanOrEqualTo(String value) {
            addCriterion("created_user_sn <=", value, "createdUserSn");
            return (Criteria) this;
        }

        public Criteria andCreatedUserSnLike(String value) {
            addCriterion("created_user_sn like", value, "createdUserSn");
            return (Criteria) this;
        }

        public Criteria andCreatedUserSnNotLike(String value) {
            addCriterion("created_user_sn not like", value, "createdUserSn");
            return (Criteria) this;
        }

        public Criteria andCreatedUserSnIn(List<String> values) {
            addCriterion("created_user_sn in", values, "createdUserSn");
            return (Criteria) this;
        }

        public Criteria andCreatedUserSnNotIn(List<String> values) {
            addCriterion("created_user_sn not in", values, "createdUserSn");
            return (Criteria) this;
        }

        public Criteria andCreatedUserSnBetween(String value1, String value2) {
            addCriterion("created_user_sn between", value1, value2, "createdUserSn");
            return (Criteria) this;
        }

        public Criteria andCreatedUserSnNotBetween(String value1, String value2) {
            addCriterion("created_user_sn not between", value1, value2, "createdUserSn");
            return (Criteria) this;
        }

        public Criteria andModifiedUserSnIsNull() {
            addCriterion("modified_user_sn is null");
            return (Criteria) this;
        }

        public Criteria andModifiedUserSnIsNotNull() {
            addCriterion("modified_user_sn is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedUserSnEqualTo(String value) {
            addCriterion("modified_user_sn =", value, "modifiedUserSn");
            return (Criteria) this;
        }

        public Criteria andModifiedUserSnNotEqualTo(String value) {
            addCriterion("modified_user_sn <>", value, "modifiedUserSn");
            return (Criteria) this;
        }

        public Criteria andModifiedUserSnGreaterThan(String value) {
            addCriterion("modified_user_sn >", value, "modifiedUserSn");
            return (Criteria) this;
        }

        public Criteria andModifiedUserSnGreaterThanOrEqualTo(String value) {
            addCriterion("modified_user_sn >=", value, "modifiedUserSn");
            return (Criteria) this;
        }

        public Criteria andModifiedUserSnLessThan(String value) {
            addCriterion("modified_user_sn <", value, "modifiedUserSn");
            return (Criteria) this;
        }

        public Criteria andModifiedUserSnLessThanOrEqualTo(String value) {
            addCriterion("modified_user_sn <=", value, "modifiedUserSn");
            return (Criteria) this;
        }

        public Criteria andModifiedUserSnLike(String value) {
            addCriterion("modified_user_sn like", value, "modifiedUserSn");
            return (Criteria) this;
        }

        public Criteria andModifiedUserSnNotLike(String value) {
            addCriterion("modified_user_sn not like", value, "modifiedUserSn");
            return (Criteria) this;
        }

        public Criteria andModifiedUserSnIn(List<String> values) {
            addCriterion("modified_user_sn in", values, "modifiedUserSn");
            return (Criteria) this;
        }

        public Criteria andModifiedUserSnNotIn(List<String> values) {
            addCriterion("modified_user_sn not in", values, "modifiedUserSn");
            return (Criteria) this;
        }

        public Criteria andModifiedUserSnBetween(String value1, String value2) {
            addCriterion("modified_user_sn between", value1, value2, "modifiedUserSn");
            return (Criteria) this;
        }

        public Criteria andModifiedUserSnNotBetween(String value1, String value2) {
            addCriterion("modified_user_sn not between", value1, value2, "modifiedUserSn");
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