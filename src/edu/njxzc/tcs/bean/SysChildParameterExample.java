package edu.njxzc.tcs.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysChildParameterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysChildParameterExample() {
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

        public Criteria andChildParmIdIsNull() {
            addCriterion("child_parm_ID is null");
            return (Criteria) this;
        }

        public Criteria andChildParmIdIsNotNull() {
            addCriterion("child_parm_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChildParmIdEqualTo(Integer value) {
            addCriterion("child_parm_ID =", value, "childParmId");
            return (Criteria) this;
        }

        public Criteria andChildParmIdNotEqualTo(Integer value) {
            addCriterion("child_parm_ID <>", value, "childParmId");
            return (Criteria) this;
        }

        public Criteria andChildParmIdGreaterThan(Integer value) {
            addCriterion("child_parm_ID >", value, "childParmId");
            return (Criteria) this;
        }

        public Criteria andChildParmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("child_parm_ID >=", value, "childParmId");
            return (Criteria) this;
        }

        public Criteria andChildParmIdLessThan(Integer value) {
            addCriterion("child_parm_ID <", value, "childParmId");
            return (Criteria) this;
        }

        public Criteria andChildParmIdLessThanOrEqualTo(Integer value) {
            addCriterion("child_parm_ID <=", value, "childParmId");
            return (Criteria) this;
        }

        public Criteria andChildParmIdIn(List<Integer> values) {
            addCriterion("child_parm_ID in", values, "childParmId");
            return (Criteria) this;
        }

        public Criteria andChildParmIdNotIn(List<Integer> values) {
            addCriterion("child_parm_ID not in", values, "childParmId");
            return (Criteria) this;
        }

        public Criteria andChildParmIdBetween(Integer value1, Integer value2) {
            addCriterion("child_parm_ID between", value1, value2, "childParmId");
            return (Criteria) this;
        }

        public Criteria andChildParmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("child_parm_ID not between", value1, value2, "childParmId");
            return (Criteria) this;
        }

        public Criteria andChildParmNameIsNull() {
            addCriterion("child_parm_name is null");
            return (Criteria) this;
        }

        public Criteria andChildParmNameIsNotNull() {
            addCriterion("child_parm_name is not null");
            return (Criteria) this;
        }

        public Criteria andChildParmNameEqualTo(String value) {
            addCriterion("child_parm_name =", value, "childParmName");
            return (Criteria) this;
        }

        public Criteria andChildParmNameNotEqualTo(String value) {
            addCriterion("child_parm_name <>", value, "childParmName");
            return (Criteria) this;
        }

        public Criteria andChildParmNameGreaterThan(String value) {
            addCriterion("child_parm_name >", value, "childParmName");
            return (Criteria) this;
        }

        public Criteria andChildParmNameGreaterThanOrEqualTo(String value) {
            addCriterion("child_parm_name >=", value, "childParmName");
            return (Criteria) this;
        }

        public Criteria andChildParmNameLessThan(String value) {
            addCriterion("child_parm_name <", value, "childParmName");
            return (Criteria) this;
        }

        public Criteria andChildParmNameLessThanOrEqualTo(String value) {
            addCriterion("child_parm_name <=", value, "childParmName");
            return (Criteria) this;
        }

        public Criteria andChildParmNameLike(String value) {
            addCriterion("child_parm_name like", value, "childParmName");
            return (Criteria) this;
        }

        public Criteria andChildParmNameNotLike(String value) {
            addCriterion("child_parm_name not like", value, "childParmName");
            return (Criteria) this;
        }

        public Criteria andChildParmNameIn(List<String> values) {
            addCriterion("child_parm_name in", values, "childParmName");
            return (Criteria) this;
        }

        public Criteria andChildParmNameNotIn(List<String> values) {
            addCriterion("child_parm_name not in", values, "childParmName");
            return (Criteria) this;
        }

        public Criteria andChildParmNameBetween(String value1, String value2) {
            addCriterion("child_parm_name between", value1, value2, "childParmName");
            return (Criteria) this;
        }

        public Criteria andChildParmNameNotBetween(String value1, String value2) {
            addCriterion("child_parm_name not between", value1, value2, "childParmName");
            return (Criteria) this;
        }

        public Criteria andChildParmDisplayIsNull() {
            addCriterion("child_parm_display is null");
            return (Criteria) this;
        }

        public Criteria andChildParmDisplayIsNotNull() {
            addCriterion("child_parm_display is not null");
            return (Criteria) this;
        }

        public Criteria andChildParmDisplayEqualTo(String value) {
            addCriterion("child_parm_display =", value, "childParmDisplay");
            return (Criteria) this;
        }

        public Criteria andChildParmDisplayNotEqualTo(String value) {
            addCriterion("child_parm_display <>", value, "childParmDisplay");
            return (Criteria) this;
        }

        public Criteria andChildParmDisplayGreaterThan(String value) {
            addCriterion("child_parm_display >", value, "childParmDisplay");
            return (Criteria) this;
        }

        public Criteria andChildParmDisplayGreaterThanOrEqualTo(String value) {
            addCriterion("child_parm_display >=", value, "childParmDisplay");
            return (Criteria) this;
        }

        public Criteria andChildParmDisplayLessThan(String value) {
            addCriterion("child_parm_display <", value, "childParmDisplay");
            return (Criteria) this;
        }

        public Criteria andChildParmDisplayLessThanOrEqualTo(String value) {
            addCriterion("child_parm_display <=", value, "childParmDisplay");
            return (Criteria) this;
        }

        public Criteria andChildParmDisplayLike(String value) {
            addCriterion("child_parm_display like", value, "childParmDisplay");
            return (Criteria) this;
        }

        public Criteria andChildParmDisplayNotLike(String value) {
            addCriterion("child_parm_display not like", value, "childParmDisplay");
            return (Criteria) this;
        }

        public Criteria andChildParmDisplayIn(List<String> values) {
            addCriterion("child_parm_display in", values, "childParmDisplay");
            return (Criteria) this;
        }

        public Criteria andChildParmDisplayNotIn(List<String> values) {
            addCriterion("child_parm_display not in", values, "childParmDisplay");
            return (Criteria) this;
        }

        public Criteria andChildParmDisplayBetween(String value1, String value2) {
            addCriterion("child_parm_display between", value1, value2, "childParmDisplay");
            return (Criteria) this;
        }

        public Criteria andChildParmDisplayNotBetween(String value1, String value2) {
            addCriterion("child_parm_display not between", value1, value2, "childParmDisplay");
            return (Criteria) this;
        }

        public Criteria andChildParmDescriptionIsNull() {
            addCriterion("child_parm_description is null");
            return (Criteria) this;
        }

        public Criteria andChildParmDescriptionIsNotNull() {
            addCriterion("child_parm_description is not null");
            return (Criteria) this;
        }

        public Criteria andChildParmDescriptionEqualTo(String value) {
            addCriterion("child_parm_description =", value, "childParmDescription");
            return (Criteria) this;
        }

        public Criteria andChildParmDescriptionNotEqualTo(String value) {
            addCriterion("child_parm_description <>", value, "childParmDescription");
            return (Criteria) this;
        }

        public Criteria andChildParmDescriptionGreaterThan(String value) {
            addCriterion("child_parm_description >", value, "childParmDescription");
            return (Criteria) this;
        }

        public Criteria andChildParmDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("child_parm_description >=", value, "childParmDescription");
            return (Criteria) this;
        }

        public Criteria andChildParmDescriptionLessThan(String value) {
            addCriterion("child_parm_description <", value, "childParmDescription");
            return (Criteria) this;
        }

        public Criteria andChildParmDescriptionLessThanOrEqualTo(String value) {
            addCriterion("child_parm_description <=", value, "childParmDescription");
            return (Criteria) this;
        }

        public Criteria andChildParmDescriptionLike(String value) {
            addCriterion("child_parm_description like", value, "childParmDescription");
            return (Criteria) this;
        }

        public Criteria andChildParmDescriptionNotLike(String value) {
            addCriterion("child_parm_description not like", value, "childParmDescription");
            return (Criteria) this;
        }

        public Criteria andChildParmDescriptionIn(List<String> values) {
            addCriterion("child_parm_description in", values, "childParmDescription");
            return (Criteria) this;
        }

        public Criteria andChildParmDescriptionNotIn(List<String> values) {
            addCriterion("child_parm_description not in", values, "childParmDescription");
            return (Criteria) this;
        }

        public Criteria andChildParmDescriptionBetween(String value1, String value2) {
            addCriterion("child_parm_description between", value1, value2, "childParmDescription");
            return (Criteria) this;
        }

        public Criteria andChildParmDescriptionNotBetween(String value1, String value2) {
            addCriterion("child_parm_description not between", value1, value2, "childParmDescription");
            return (Criteria) this;
        }

        public Criteria andParParmIdIsNull() {
            addCriterion("par_parm_id is null");
            return (Criteria) this;
        }

        public Criteria andParParmIdIsNotNull() {
            addCriterion("par_parm_id is not null");
            return (Criteria) this;
        }

        public Criteria andParParmIdEqualTo(Short value) {
            addCriterion("par_parm_id =", value, "parParmId");
            return (Criteria) this;
        }

        public Criteria andParParmIdNotEqualTo(Short value) {
            addCriterion("par_parm_id <>", value, "parParmId");
            return (Criteria) this;
        }

        public Criteria andParParmIdGreaterThan(Short value) {
            addCriterion("par_parm_id >", value, "parParmId");
            return (Criteria) this;
        }

        public Criteria andParParmIdGreaterThanOrEqualTo(Short value) {
            addCriterion("par_parm_id >=", value, "parParmId");
            return (Criteria) this;
        }

        public Criteria andParParmIdLessThan(Short value) {
            addCriterion("par_parm_id <", value, "parParmId");
            return (Criteria) this;
        }

        public Criteria andParParmIdLessThanOrEqualTo(Short value) {
            addCriterion("par_parm_id <=", value, "parParmId");
            return (Criteria) this;
        }

        public Criteria andParParmIdIn(List<Short> values) {
            addCriterion("par_parm_id in", values, "parParmId");
            return (Criteria) this;
        }

        public Criteria andParParmIdNotIn(List<Short> values) {
            addCriterion("par_parm_id not in", values, "parParmId");
            return (Criteria) this;
        }

        public Criteria andParParmIdBetween(Short value1, Short value2) {
            addCriterion("par_parm_id between", value1, value2, "parParmId");
            return (Criteria) this;
        }

        public Criteria andParParmIdNotBetween(Short value1, Short value2) {
            addCriterion("par_parm_id not between", value1, value2, "parParmId");
            return (Criteria) this;
        }

        public Criteria andChildParmOrderIsNull() {
            addCriterion("child_parm_order is null");
            return (Criteria) this;
        }

        public Criteria andChildParmOrderIsNotNull() {
            addCriterion("child_parm_order is not null");
            return (Criteria) this;
        }

        public Criteria andChildParmOrderEqualTo(String value) {
            addCriterion("child_parm_order =", value, "childParmOrder");
            return (Criteria) this;
        }

        public Criteria andChildParmOrderNotEqualTo(String value) {
            addCriterion("child_parm_order <>", value, "childParmOrder");
            return (Criteria) this;
        }

        public Criteria andChildParmOrderGreaterThan(String value) {
            addCriterion("child_parm_order >", value, "childParmOrder");
            return (Criteria) this;
        }

        public Criteria andChildParmOrderGreaterThanOrEqualTo(String value) {
            addCriterion("child_parm_order >=", value, "childParmOrder");
            return (Criteria) this;
        }

        public Criteria andChildParmOrderLessThan(String value) {
            addCriterion("child_parm_order <", value, "childParmOrder");
            return (Criteria) this;
        }

        public Criteria andChildParmOrderLessThanOrEqualTo(String value) {
            addCriterion("child_parm_order <=", value, "childParmOrder");
            return (Criteria) this;
        }

        public Criteria andChildParmOrderLike(String value) {
            addCriterion("child_parm_order like", value, "childParmOrder");
            return (Criteria) this;
        }

        public Criteria andChildParmOrderNotLike(String value) {
            addCriterion("child_parm_order not like", value, "childParmOrder");
            return (Criteria) this;
        }

        public Criteria andChildParmOrderIn(List<String> values) {
            addCriterion("child_parm_order in", values, "childParmOrder");
            return (Criteria) this;
        }

        public Criteria andChildParmOrderNotIn(List<String> values) {
            addCriterion("child_parm_order not in", values, "childParmOrder");
            return (Criteria) this;
        }

        public Criteria andChildParmOrderBetween(String value1, String value2) {
            addCriterion("child_parm_order between", value1, value2, "childParmOrder");
            return (Criteria) this;
        }

        public Criteria andChildParmOrderNotBetween(String value1, String value2) {
            addCriterion("child_parm_order not between", value1, value2, "childParmOrder");
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

        public Criteria andModifiedUserIdIsNull() {
            addCriterion("modified_user_ID is null");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIdIsNotNull() {
            addCriterion("modified_user_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIdEqualTo(Integer value) {
            addCriterion("modified_user_ID =", value, "modifiedUserId");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIdNotEqualTo(Integer value) {
            addCriterion("modified_user_ID <>", value, "modifiedUserId");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIdGreaterThan(Integer value) {
            addCriterion("modified_user_ID >", value, "modifiedUserId");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("modified_user_ID >=", value, "modifiedUserId");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIdLessThan(Integer value) {
            addCriterion("modified_user_ID <", value, "modifiedUserId");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("modified_user_ID <=", value, "modifiedUserId");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIdIn(List<Integer> values) {
            addCriterion("modified_user_ID in", values, "modifiedUserId");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIdNotIn(List<Integer> values) {
            addCriterion("modified_user_ID not in", values, "modifiedUserId");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIdBetween(Integer value1, Integer value2) {
            addCriterion("modified_user_ID between", value1, value2, "modifiedUserId");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("modified_user_ID not between", value1, value2, "modifiedUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdIsNull() {
            addCriterion("created_user_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdIsNotNull() {
            addCriterion("created_user_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdEqualTo(Integer value) {
            addCriterion("created_user_ID =", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdNotEqualTo(Integer value) {
            addCriterion("created_user_ID <>", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdGreaterThan(Integer value) {
            addCriterion("created_user_ID >", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("created_user_ID >=", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdLessThan(Integer value) {
            addCriterion("created_user_ID <", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("created_user_ID <=", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdIn(List<Integer> values) {
            addCriterion("created_user_ID in", values, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdNotIn(List<Integer> values) {
            addCriterion("created_user_ID not in", values, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdBetween(Integer value1, Integer value2) {
            addCriterion("created_user_ID between", value1, value2, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("created_user_ID not between", value1, value2, "createdUserId");
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