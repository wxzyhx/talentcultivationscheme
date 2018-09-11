package edu.njxzc.tcs.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SchoolSystemDegreeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SchoolSystemDegreeExample() {
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

        public Criteria andSchoolsystemdegreeidIsNull() {
            addCriterion("schoolsystemdegreeid is null");
            return (Criteria) this;
        }

        public Criteria andSchoolsystemdegreeidIsNotNull() {
            addCriterion("schoolsystemdegreeid is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolsystemdegreeidEqualTo(Integer value) {
            addCriterion("schoolsystemdegreeid =", value, "schoolsystemdegreeid");
            return (Criteria) this;
        }

        public Criteria andSchoolsystemdegreeidNotEqualTo(Integer value) {
            addCriterion("schoolsystemdegreeid <>", value, "schoolsystemdegreeid");
            return (Criteria) this;
        }

        public Criteria andSchoolsystemdegreeidGreaterThan(Integer value) {
            addCriterion("schoolsystemdegreeid >", value, "schoolsystemdegreeid");
            return (Criteria) this;
        }

        public Criteria andSchoolsystemdegreeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("schoolsystemdegreeid >=", value, "schoolsystemdegreeid");
            return (Criteria) this;
        }

        public Criteria andSchoolsystemdegreeidLessThan(Integer value) {
            addCriterion("schoolsystemdegreeid <", value, "schoolsystemdegreeid");
            return (Criteria) this;
        }

        public Criteria andSchoolsystemdegreeidLessThanOrEqualTo(Integer value) {
            addCriterion("schoolsystemdegreeid <=", value, "schoolsystemdegreeid");
            return (Criteria) this;
        }

        public Criteria andSchoolsystemdegreeidIn(List<Integer> values) {
            addCriterion("schoolsystemdegreeid in", values, "schoolsystemdegreeid");
            return (Criteria) this;
        }

        public Criteria andSchoolsystemdegreeidNotIn(List<Integer> values) {
            addCriterion("schoolsystemdegreeid not in", values, "schoolsystemdegreeid");
            return (Criteria) this;
        }

        public Criteria andSchoolsystemdegreeidBetween(Integer value1, Integer value2) {
            addCriterion("schoolsystemdegreeid between", value1, value2, "schoolsystemdegreeid");
            return (Criteria) this;
        }

        public Criteria andSchoolsystemdegreeidNotBetween(Integer value1, Integer value2) {
            addCriterion("schoolsystemdegreeid not between", value1, value2, "schoolsystemdegreeid");
            return (Criteria) this;
        }

        public Criteria andSchoolsystemIsNull() {
            addCriterion("schoolsystem is null");
            return (Criteria) this;
        }

        public Criteria andSchoolsystemIsNotNull() {
            addCriterion("schoolsystem is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolsystemEqualTo(Integer value) {
            addCriterion("schoolsystem =", value, "schoolsystem");
            return (Criteria) this;
        }

        public Criteria andSchoolsystemNotEqualTo(Integer value) {
            addCriterion("schoolsystem <>", value, "schoolsystem");
            return (Criteria) this;
        }

        public Criteria andSchoolsystemGreaterThan(Integer value) {
            addCriterion("schoolsystem >", value, "schoolsystem");
            return (Criteria) this;
        }

        public Criteria andSchoolsystemGreaterThanOrEqualTo(Integer value) {
            addCriterion("schoolsystem >=", value, "schoolsystem");
            return (Criteria) this;
        }

        public Criteria andSchoolsystemLessThan(Integer value) {
            addCriterion("schoolsystem <", value, "schoolsystem");
            return (Criteria) this;
        }

        public Criteria andSchoolsystemLessThanOrEqualTo(Integer value) {
            addCriterion("schoolsystem <=", value, "schoolsystem");
            return (Criteria) this;
        }

        public Criteria andSchoolsystemIn(List<Integer> values) {
            addCriterion("schoolsystem in", values, "schoolsystem");
            return (Criteria) this;
        }

        public Criteria andSchoolsystemNotIn(List<Integer> values) {
            addCriterion("schoolsystem not in", values, "schoolsystem");
            return (Criteria) this;
        }

        public Criteria andSchoolsystemBetween(Integer value1, Integer value2) {
            addCriterion("schoolsystem between", value1, value2, "schoolsystem");
            return (Criteria) this;
        }

        public Criteria andSchoolsystemNotBetween(Integer value1, Integer value2) {
            addCriterion("schoolsystem not between", value1, value2, "schoolsystem");
            return (Criteria) this;
        }

        public Criteria andUpperyearsIsNull() {
            addCriterion("upperyears is null");
            return (Criteria) this;
        }

        public Criteria andUpperyearsIsNotNull() {
            addCriterion("upperyears is not null");
            return (Criteria) this;
        }

        public Criteria andUpperyearsEqualTo(Integer value) {
            addCriterion("upperyears =", value, "upperyears");
            return (Criteria) this;
        }

        public Criteria andUpperyearsNotEqualTo(Integer value) {
            addCriterion("upperyears <>", value, "upperyears");
            return (Criteria) this;
        }

        public Criteria andUpperyearsGreaterThan(Integer value) {
            addCriterion("upperyears >", value, "upperyears");
            return (Criteria) this;
        }

        public Criteria andUpperyearsGreaterThanOrEqualTo(Integer value) {
            addCriterion("upperyears >=", value, "upperyears");
            return (Criteria) this;
        }

        public Criteria andUpperyearsLessThan(Integer value) {
            addCriterion("upperyears <", value, "upperyears");
            return (Criteria) this;
        }

        public Criteria andUpperyearsLessThanOrEqualTo(Integer value) {
            addCriterion("upperyears <=", value, "upperyears");
            return (Criteria) this;
        }

        public Criteria andUpperyearsIn(List<Integer> values) {
            addCriterion("upperyears in", values, "upperyears");
            return (Criteria) this;
        }

        public Criteria andUpperyearsNotIn(List<Integer> values) {
            addCriterion("upperyears not in", values, "upperyears");
            return (Criteria) this;
        }

        public Criteria andUpperyearsBetween(Integer value1, Integer value2) {
            addCriterion("upperyears between", value1, value2, "upperyears");
            return (Criteria) this;
        }

        public Criteria andUpperyearsNotBetween(Integer value1, Integer value2) {
            addCriterion("upperyears not between", value1, value2, "upperyears");
            return (Criteria) this;
        }

        public Criteria andLoweryearsIsNull() {
            addCriterion("loweryears is null");
            return (Criteria) this;
        }

        public Criteria andLoweryearsIsNotNull() {
            addCriterion("loweryears is not null");
            return (Criteria) this;
        }

        public Criteria andLoweryearsEqualTo(Integer value) {
            addCriterion("loweryears =", value, "loweryears");
            return (Criteria) this;
        }

        public Criteria andLoweryearsNotEqualTo(Integer value) {
            addCriterion("loweryears <>", value, "loweryears");
            return (Criteria) this;
        }

        public Criteria andLoweryearsGreaterThan(Integer value) {
            addCriterion("loweryears >", value, "loweryears");
            return (Criteria) this;
        }

        public Criteria andLoweryearsGreaterThanOrEqualTo(Integer value) {
            addCriterion("loweryears >=", value, "loweryears");
            return (Criteria) this;
        }

        public Criteria andLoweryearsLessThan(Integer value) {
            addCriterion("loweryears <", value, "loweryears");
            return (Criteria) this;
        }

        public Criteria andLoweryearsLessThanOrEqualTo(Integer value) {
            addCriterion("loweryears <=", value, "loweryears");
            return (Criteria) this;
        }

        public Criteria andLoweryearsIn(List<Integer> values) {
            addCriterion("loweryears in", values, "loweryears");
            return (Criteria) this;
        }

        public Criteria andLoweryearsNotIn(List<Integer> values) {
            addCriterion("loweryears not in", values, "loweryears");
            return (Criteria) this;
        }

        public Criteria andLoweryearsBetween(Integer value1, Integer value2) {
            addCriterion("loweryears between", value1, value2, "loweryears");
            return (Criteria) this;
        }

        public Criteria andLoweryearsNotBetween(Integer value1, Integer value2) {
            addCriterion("loweryears not between", value1, value2, "loweryears");
            return (Criteria) this;
        }

        public Criteria andDegreeIdIsNull() {
            addCriterion("degree_id is null");
            return (Criteria) this;
        }

        public Criteria andDegreeIdIsNotNull() {
            addCriterion("degree_id is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeIdEqualTo(Integer value) {
            addCriterion("degree_id =", value, "degreeId");
            return (Criteria) this;
        }

        public Criteria andDegreeIdNotEqualTo(Integer value) {
            addCriterion("degree_id <>", value, "degreeId");
            return (Criteria) this;
        }

        public Criteria andDegreeIdGreaterThan(Integer value) {
            addCriterion("degree_id >", value, "degreeId");
            return (Criteria) this;
        }

        public Criteria andDegreeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("degree_id >=", value, "degreeId");
            return (Criteria) this;
        }

        public Criteria andDegreeIdLessThan(Integer value) {
            addCriterion("degree_id <", value, "degreeId");
            return (Criteria) this;
        }

        public Criteria andDegreeIdLessThanOrEqualTo(Integer value) {
            addCriterion("degree_id <=", value, "degreeId");
            return (Criteria) this;
        }

        public Criteria andDegreeIdIn(List<Integer> values) {
            addCriterion("degree_id in", values, "degreeId");
            return (Criteria) this;
        }

        public Criteria andDegreeIdNotIn(List<Integer> values) {
            addCriterion("degree_id not in", values, "degreeId");
            return (Criteria) this;
        }

        public Criteria andDegreeIdBetween(Integer value1, Integer value2) {
            addCriterion("degree_id between", value1, value2, "degreeId");
            return (Criteria) this;
        }

        public Criteria andDegreeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("degree_id not between", value1, value2, "degreeId");
            return (Criteria) this;
        }

        public Criteria andCultivationschemeIdIsNull() {
            addCriterion("cultivationscheme_id is null");
            return (Criteria) this;
        }

        public Criteria andCultivationschemeIdIsNotNull() {
            addCriterion("cultivationscheme_id is not null");
            return (Criteria) this;
        }

        public Criteria andCultivationschemeIdEqualTo(Integer value) {
            addCriterion("cultivationscheme_id =", value, "cultivationschemeId");
            return (Criteria) this;
        }

        public Criteria andCultivationschemeIdNotEqualTo(Integer value) {
            addCriterion("cultivationscheme_id <>", value, "cultivationschemeId");
            return (Criteria) this;
        }

        public Criteria andCultivationschemeIdGreaterThan(Integer value) {
            addCriterion("cultivationscheme_id >", value, "cultivationschemeId");
            return (Criteria) this;
        }

        public Criteria andCultivationschemeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cultivationscheme_id >=", value, "cultivationschemeId");
            return (Criteria) this;
        }

        public Criteria andCultivationschemeIdLessThan(Integer value) {
            addCriterion("cultivationscheme_id <", value, "cultivationschemeId");
            return (Criteria) this;
        }

        public Criteria andCultivationschemeIdLessThanOrEqualTo(Integer value) {
            addCriterion("cultivationscheme_id <=", value, "cultivationschemeId");
            return (Criteria) this;
        }

        public Criteria andCultivationschemeIdIn(List<Integer> values) {
            addCriterion("cultivationscheme_id in", values, "cultivationschemeId");
            return (Criteria) this;
        }

        public Criteria andCultivationschemeIdNotIn(List<Integer> values) {
            addCriterion("cultivationscheme_id not in", values, "cultivationschemeId");
            return (Criteria) this;
        }

        public Criteria andCultivationschemeIdBetween(Integer value1, Integer value2) {
            addCriterion("cultivationscheme_id between", value1, value2, "cultivationschemeId");
            return (Criteria) this;
        }

        public Criteria andCultivationschemeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cultivationscheme_id not between", value1, value2, "cultivationschemeId");
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