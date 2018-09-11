package edu.njxzc.tcs.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseClassificationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseClassificationExample() {
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

        public Criteria andCourseclassificationidIsNull() {
            addCriterion("courseclassificationid is null");
            return (Criteria) this;
        }

        public Criteria andCourseclassificationidIsNotNull() {
            addCriterion("courseclassificationid is not null");
            return (Criteria) this;
        }

        public Criteria andCourseclassificationidEqualTo(Integer value) {
            addCriterion("courseclassificationid =", value, "courseclassificationid");
            return (Criteria) this;
        }

        public Criteria andCourseclassificationidNotEqualTo(Integer value) {
            addCriterion("courseclassificationid <>", value, "courseclassificationid");
            return (Criteria) this;
        }

        public Criteria andCourseclassificationidGreaterThan(Integer value) {
            addCriterion("courseclassificationid >", value, "courseclassificationid");
            return (Criteria) this;
        }

        public Criteria andCourseclassificationidGreaterThanOrEqualTo(Integer value) {
            addCriterion("courseclassificationid >=", value, "courseclassificationid");
            return (Criteria) this;
        }

        public Criteria andCourseclassificationidLessThan(Integer value) {
            addCriterion("courseclassificationid <", value, "courseclassificationid");
            return (Criteria) this;
        }

        public Criteria andCourseclassificationidLessThanOrEqualTo(Integer value) {
            addCriterion("courseclassificationid <=", value, "courseclassificationid");
            return (Criteria) this;
        }

        public Criteria andCourseclassificationidIn(List<Integer> values) {
            addCriterion("courseclassificationid in", values, "courseclassificationid");
            return (Criteria) this;
        }

        public Criteria andCourseclassificationidNotIn(List<Integer> values) {
            addCriterion("courseclassificationid not in", values, "courseclassificationid");
            return (Criteria) this;
        }

        public Criteria andCourseclassificationidBetween(Integer value1, Integer value2) {
            addCriterion("courseclassificationid between", value1, value2, "courseclassificationid");
            return (Criteria) this;
        }

        public Criteria andCourseclassificationidNotBetween(Integer value1, Integer value2) {
            addCriterion("courseclassificationid not between", value1, value2, "courseclassificationid");
            return (Criteria) this;
        }

        public Criteria andCourseclassificationnameIsNull() {
            addCriterion("courseclassificationname is null");
            return (Criteria) this;
        }

        public Criteria andCourseclassificationnameIsNotNull() {
            addCriterion("courseclassificationname is not null");
            return (Criteria) this;
        }

        public Criteria andCourseclassificationnameEqualTo(String value) {
            addCriterion("courseclassificationname =", value, "courseclassificationname");
            return (Criteria) this;
        }

        public Criteria andCourseclassificationnameNotEqualTo(String value) {
            addCriterion("courseclassificationname <>", value, "courseclassificationname");
            return (Criteria) this;
        }

        public Criteria andCourseclassificationnameGreaterThan(String value) {
            addCriterion("courseclassificationname >", value, "courseclassificationname");
            return (Criteria) this;
        }

        public Criteria andCourseclassificationnameGreaterThanOrEqualTo(String value) {
            addCriterion("courseclassificationname >=", value, "courseclassificationname");
            return (Criteria) this;
        }

        public Criteria andCourseclassificationnameLessThan(String value) {
            addCriterion("courseclassificationname <", value, "courseclassificationname");
            return (Criteria) this;
        }

        public Criteria andCourseclassificationnameLessThanOrEqualTo(String value) {
            addCriterion("courseclassificationname <=", value, "courseclassificationname");
            return (Criteria) this;
        }

        public Criteria andCourseclassificationnameLike(String value) {
            addCriterion("courseclassificationname like", value, "courseclassificationname");
            return (Criteria) this;
        }

        public Criteria andCourseclassificationnameNotLike(String value) {
            addCriterion("courseclassificationname not like", value, "courseclassificationname");
            return (Criteria) this;
        }

        public Criteria andCourseclassificationnameIn(List<String> values) {
            addCriterion("courseclassificationname in", values, "courseclassificationname");
            return (Criteria) this;
        }

        public Criteria andCourseclassificationnameNotIn(List<String> values) {
            addCriterion("courseclassificationname not in", values, "courseclassificationname");
            return (Criteria) this;
        }

        public Criteria andCourseclassificationnameBetween(String value1, String value2) {
            addCriterion("courseclassificationname between", value1, value2, "courseclassificationname");
            return (Criteria) this;
        }

        public Criteria andCourseclassificationnameNotBetween(String value1, String value2) {
            addCriterion("courseclassificationname not between", value1, value2, "courseclassificationname");
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

        public Criteria andCoursecreditruleIsNull() {
            addCriterion("coursecreditrule is null");
            return (Criteria) this;
        }

        public Criteria andCoursecreditruleIsNotNull() {
            addCriterion("coursecreditrule is not null");
            return (Criteria) this;
        }

        public Criteria andCoursecreditruleEqualTo(Float value) {
            addCriterion("coursecreditrule =", value, "coursecreditrule");
            return (Criteria) this;
        }

        public Criteria andCoursecreditruleNotEqualTo(Float value) {
            addCriterion("coursecreditrule <>", value, "coursecreditrule");
            return (Criteria) this;
        }

        public Criteria andCoursecreditruleGreaterThan(Float value) {
            addCriterion("coursecreditrule >", value, "coursecreditrule");
            return (Criteria) this;
        }

        public Criteria andCoursecreditruleGreaterThanOrEqualTo(Float value) {
            addCriterion("coursecreditrule >=", value, "coursecreditrule");
            return (Criteria) this;
        }

        public Criteria andCoursecreditruleLessThan(Float value) {
            addCriterion("coursecreditrule <", value, "coursecreditrule");
            return (Criteria) this;
        }

        public Criteria andCoursecreditruleLessThanOrEqualTo(Float value) {
            addCriterion("coursecreditrule <=", value, "coursecreditrule");
            return (Criteria) this;
        }

        public Criteria andCoursecreditruleIn(List<Float> values) {
            addCriterion("coursecreditrule in", values, "coursecreditrule");
            return (Criteria) this;
        }

        public Criteria andCoursecreditruleNotIn(List<Float> values) {
            addCriterion("coursecreditrule not in", values, "coursecreditrule");
            return (Criteria) this;
        }

        public Criteria andCoursecreditruleBetween(Float value1, Float value2) {
            addCriterion("coursecreditrule between", value1, value2, "coursecreditrule");
            return (Criteria) this;
        }

        public Criteria andCoursecreditruleNotBetween(Float value1, Float value2) {
            addCriterion("coursecreditrule not between", value1, value2, "coursecreditrule");
            return (Criteria) this;
        }

        public Criteria andSpeciaclassIdIsNull() {
            addCriterion("speciaclass_id is null");
            return (Criteria) this;
        }

        public Criteria andSpeciaclassIdIsNotNull() {
            addCriterion("speciaclass_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpeciaclassIdEqualTo(Integer value) {
            addCriterion("speciaclass_id =", value, "speciaclassId");
            return (Criteria) this;
        }

        public Criteria andSpeciaclassIdNotEqualTo(Integer value) {
            addCriterion("speciaclass_id <>", value, "speciaclassId");
            return (Criteria) this;
        }

        public Criteria andSpeciaclassIdGreaterThan(Integer value) {
            addCriterion("speciaclass_id >", value, "speciaclassId");
            return (Criteria) this;
        }

        public Criteria andSpeciaclassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("speciaclass_id >=", value, "speciaclassId");
            return (Criteria) this;
        }

        public Criteria andSpeciaclassIdLessThan(Integer value) {
            addCriterion("speciaclass_id <", value, "speciaclassId");
            return (Criteria) this;
        }

        public Criteria andSpeciaclassIdLessThanOrEqualTo(Integer value) {
            addCriterion("speciaclass_id <=", value, "speciaclassId");
            return (Criteria) this;
        }

        public Criteria andSpeciaclassIdIn(List<Integer> values) {
            addCriterion("speciaclass_id in", values, "speciaclassId");
            return (Criteria) this;
        }

        public Criteria andSpeciaclassIdNotIn(List<Integer> values) {
            addCriterion("speciaclass_id not in", values, "speciaclassId");
            return (Criteria) this;
        }

        public Criteria andSpeciaclassIdBetween(Integer value1, Integer value2) {
            addCriterion("speciaclass_id between", value1, value2, "speciaclassId");
            return (Criteria) this;
        }

        public Criteria andSpeciaclassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("speciaclass_id not between", value1, value2, "speciaclassId");
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

        public Criteria andOrderbyIsNull() {
            addCriterion("orderby is null");
            return (Criteria) this;
        }

        public Criteria andOrderbyIsNotNull() {
            addCriterion("orderby is not null");
            return (Criteria) this;
        }

        public Criteria andOrderbyEqualTo(Integer value) {
            addCriterion("orderby =", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyNotEqualTo(Integer value) {
            addCriterion("orderby <>", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyGreaterThan(Integer value) {
            addCriterion("orderby >", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderby >=", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyLessThan(Integer value) {
            addCriterion("orderby <", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyLessThanOrEqualTo(Integer value) {
            addCriterion("orderby <=", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyIn(List<Integer> values) {
            addCriterion("orderby in", values, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyNotIn(List<Integer> values) {
            addCriterion("orderby not in", values, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyBetween(Integer value1, Integer value2) {
            addCriterion("orderby between", value1, value2, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyNotBetween(Integer value1, Integer value2) {
            addCriterion("orderby not between", value1, value2, "orderby");
            return (Criteria) this;
        }

        public Criteria andCoursetagIsNull() {
            addCriterion("coursetag is null");
            return (Criteria) this;
        }

        public Criteria andCoursetagIsNotNull() {
            addCriterion("coursetag is not null");
            return (Criteria) this;
        }

        public Criteria andCoursetagEqualTo(Integer value) {
            addCriterion("coursetag =", value, "coursetag");
            return (Criteria) this;
        }

        public Criteria andCoursetagNotEqualTo(Integer value) {
            addCriterion("coursetag <>", value, "coursetag");
            return (Criteria) this;
        }

        public Criteria andCoursetagGreaterThan(Integer value) {
            addCriterion("coursetag >", value, "coursetag");
            return (Criteria) this;
        }

        public Criteria andCoursetagGreaterThanOrEqualTo(Integer value) {
            addCriterion("coursetag >=", value, "coursetag");
            return (Criteria) this;
        }

        public Criteria andCoursetagLessThan(Integer value) {
            addCriterion("coursetag <", value, "coursetag");
            return (Criteria) this;
        }

        public Criteria andCoursetagLessThanOrEqualTo(Integer value) {
            addCriterion("coursetag <=", value, "coursetag");
            return (Criteria) this;
        }

        public Criteria andCoursetagIn(List<Integer> values) {
            addCriterion("coursetag in", values, "coursetag");
            return (Criteria) this;
        }

        public Criteria andCoursetagNotIn(List<Integer> values) {
            addCriterion("coursetag not in", values, "coursetag");
            return (Criteria) this;
        }

        public Criteria andCoursetagBetween(Integer value1, Integer value2) {
            addCriterion("coursetag between", value1, value2, "coursetag");
            return (Criteria) this;
        }

        public Criteria andCoursetagNotBetween(Integer value1, Integer value2) {
            addCriterion("coursetag not between", value1, value2, "coursetag");
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