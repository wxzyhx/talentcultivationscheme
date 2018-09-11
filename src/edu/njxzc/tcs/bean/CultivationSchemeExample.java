package edu.njxzc.tcs.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CultivationSchemeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CultivationSchemeExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andCultivationidIsNull() {
            addCriterion("cultivationid is null");
            return (Criteria) this;
        }

        public Criteria andCultivationidIsNotNull() {
            addCriterion("cultivationid is not null");
            return (Criteria) this;
        }

        public Criteria andCultivationidEqualTo(Integer value) {
            addCriterion("cultivationid =", value, "cultivationid");
            return (Criteria) this;
        }

        public Criteria andCultivationidNotEqualTo(Integer value) {
            addCriterion("cultivationid <>", value, "cultivationid");
            return (Criteria) this;
        }

        public Criteria andCultivationidGreaterThan(Integer value) {
            addCriterion("cultivationid >", value, "cultivationid");
            return (Criteria) this;
        }

        public Criteria andCultivationidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cultivationid >=", value, "cultivationid");
            return (Criteria) this;
        }

        public Criteria andCultivationidLessThan(Integer value) {
            addCriterion("cultivationid <", value, "cultivationid");
            return (Criteria) this;
        }

        public Criteria andCultivationidLessThanOrEqualTo(Integer value) {
            addCriterion("cultivationid <=", value, "cultivationid");
            return (Criteria) this;
        }

        public Criteria andCultivationidIn(List<Integer> values) {
            addCriterion("cultivationid in", values, "cultivationid");
            return (Criteria) this;
        }

        public Criteria andCultivationidNotIn(List<Integer> values) {
            addCriterion("cultivationid not in", values, "cultivationid");
            return (Criteria) this;
        }

        public Criteria andCultivationidBetween(Integer value1, Integer value2) {
            addCriterion("cultivationid between", value1, value2, "cultivationid");
            return (Criteria) this;
        }

        public Criteria andCultivationidNotBetween(Integer value1, Integer value2) {
            addCriterion("cultivationid not between", value1, value2, "cultivationid");
            return (Criteria) this;
        }

        public Criteria andCultivationnameIsNull() {
            addCriterion("cultivationname is null");
            return (Criteria) this;
        }

        public Criteria andCultivationnameIsNotNull() {
            addCriterion("cultivationname is not null");
            return (Criteria) this;
        }

        public Criteria andCultivationnameEqualTo(String value) {
            addCriterion("cultivationname =", value, "cultivationname");
            return (Criteria) this;
        }

        public Criteria andCultivationnameNotEqualTo(String value) {
            addCriterion("cultivationname <>", value, "cultivationname");
            return (Criteria) this;
        }

        public Criteria andCultivationnameGreaterThan(String value) {
            addCriterion("cultivationname >", value, "cultivationname");
            return (Criteria) this;
        }

        public Criteria andCultivationnameGreaterThanOrEqualTo(String value) {
            addCriterion("cultivationname >=", value, "cultivationname");
            return (Criteria) this;
        }

        public Criteria andCultivationnameLessThan(String value) {
            addCriterion("cultivationname <", value, "cultivationname");
            return (Criteria) this;
        }

        public Criteria andCultivationnameLessThanOrEqualTo(String value) {
            addCriterion("cultivationname <=", value, "cultivationname");
            return (Criteria) this;
        }

        public Criteria andCultivationnameLike(String value) {
            addCriterion("cultivationname like", value, "cultivationname");
            return (Criteria) this;
        }

        public Criteria andCultivationnameNotLike(String value) {
            addCriterion("cultivationname not like", value, "cultivationname");
            return (Criteria) this;
        }

        public Criteria andCultivationnameIn(List<String> values) {
            addCriterion("cultivationname in", values, "cultivationname");
            return (Criteria) this;
        }

        public Criteria andCultivationnameNotIn(List<String> values) {
            addCriterion("cultivationname not in", values, "cultivationname");
            return (Criteria) this;
        }

        public Criteria andCultivationnameBetween(String value1, String value2) {
            addCriterion("cultivationname between", value1, value2, "cultivationname");
            return (Criteria) this;
        }

        public Criteria andCultivationnameNotBetween(String value1, String value2) {
            addCriterion("cultivationname not between", value1, value2, "cultivationname");
            return (Criteria) this;
        }

        public Criteria andCulcreatetimeIsNull() {
            addCriterion("culcreatetime is null");
            return (Criteria) this;
        }

        public Criteria andCulcreatetimeIsNotNull() {
            addCriterion("culcreatetime is not null");
            return (Criteria) this;
        }

        public Criteria andCulcreatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("culcreatetime =", value, "culcreatetime");
            return (Criteria) this;
        }

        public Criteria andCulcreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("culcreatetime <>", value, "culcreatetime");
            return (Criteria) this;
        }

        public Criteria andCulcreatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("culcreatetime >", value, "culcreatetime");
            return (Criteria) this;
        }

        public Criteria andCulcreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("culcreatetime >=", value, "culcreatetime");
            return (Criteria) this;
        }

        public Criteria andCulcreatetimeLessThan(Date value) {
            addCriterionForJDBCDate("culcreatetime <", value, "culcreatetime");
            return (Criteria) this;
        }

        public Criteria andCulcreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("culcreatetime <=", value, "culcreatetime");
            return (Criteria) this;
        }

        public Criteria andCulcreatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("culcreatetime in", values, "culcreatetime");
            return (Criteria) this;
        }

        public Criteria andCulcreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("culcreatetime not in", values, "culcreatetime");
            return (Criteria) this;
        }

        public Criteria andCulcreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("culcreatetime between", value1, value2, "culcreatetime");
            return (Criteria) this;
        }

        public Criteria andCulcreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("culcreatetime not between", value1, value2, "culcreatetime");
            return (Criteria) this;
        }

        public Criteria andSpecialityclassificationIdIsNull() {
            addCriterion("specialityclassification_id is null");
            return (Criteria) this;
        }

        public Criteria andSpecialityclassificationIdIsNotNull() {
            addCriterion("specialityclassification_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialityclassificationIdEqualTo(Integer value) {
            addCriterion("specialityclassification_id =", value, "specialityclassificationId");
            return (Criteria) this;
        }

        public Criteria andSpecialityclassificationIdNotEqualTo(Integer value) {
            addCriterion("specialityclassification_id <>", value, "specialityclassificationId");
            return (Criteria) this;
        }

        public Criteria andSpecialityclassificationIdGreaterThan(Integer value) {
            addCriterion("specialityclassification_id >", value, "specialityclassificationId");
            return (Criteria) this;
        }

        public Criteria andSpecialityclassificationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("specialityclassification_id >=", value, "specialityclassificationId");
            return (Criteria) this;
        }

        public Criteria andSpecialityclassificationIdLessThan(Integer value) {
            addCriterion("specialityclassification_id <", value, "specialityclassificationId");
            return (Criteria) this;
        }

        public Criteria andSpecialityclassificationIdLessThanOrEqualTo(Integer value) {
            addCriterion("specialityclassification_id <=", value, "specialityclassificationId");
            return (Criteria) this;
        }

        public Criteria andSpecialityclassificationIdIn(List<Integer> values) {
            addCriterion("specialityclassification_id in", values, "specialityclassificationId");
            return (Criteria) this;
        }

        public Criteria andSpecialityclassificationIdNotIn(List<Integer> values) {
            addCriterion("specialityclassification_id not in", values, "specialityclassificationId");
            return (Criteria) this;
        }

        public Criteria andSpecialityclassificationIdBetween(Integer value1, Integer value2) {
            addCriterion("specialityclassification_id between", value1, value2, "specialityclassificationId");
            return (Criteria) this;
        }

        public Criteria andSpecialityclassificationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("specialityclassification_id not between", value1, value2, "specialityclassificationId");
            return (Criteria) this;
        }

        public Criteria andSpecialityIdIsNull() {
            addCriterion("speciality_id is null");
            return (Criteria) this;
        }

        public Criteria andSpecialityIdIsNotNull() {
            addCriterion("speciality_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialityIdEqualTo(Integer value) {
            addCriterion("speciality_id =", value, "specialityId");
            return (Criteria) this;
        }

        public Criteria andSpecialityIdNotEqualTo(Integer value) {
            addCriterion("speciality_id <>", value, "specialityId");
            return (Criteria) this;
        }

        public Criteria andSpecialityIdGreaterThan(Integer value) {
            addCriterion("speciality_id >", value, "specialityId");
            return (Criteria) this;
        }

        public Criteria andSpecialityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("speciality_id >=", value, "specialityId");
            return (Criteria) this;
        }

        public Criteria andSpecialityIdLessThan(Integer value) {
            addCriterion("speciality_id <", value, "specialityId");
            return (Criteria) this;
        }

        public Criteria andSpecialityIdLessThanOrEqualTo(Integer value) {
            addCriterion("speciality_id <=", value, "specialityId");
            return (Criteria) this;
        }

        public Criteria andSpecialityIdIn(List<Integer> values) {
            addCriterion("speciality_id in", values, "specialityId");
            return (Criteria) this;
        }

        public Criteria andSpecialityIdNotIn(List<Integer> values) {
            addCriterion("speciality_id not in", values, "specialityId");
            return (Criteria) this;
        }

        public Criteria andSpecialityIdBetween(Integer value1, Integer value2) {
            addCriterion("speciality_id between", value1, value2, "specialityId");
            return (Criteria) this;
        }

        public Criteria andSpecialityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("speciality_id not between", value1, value2, "specialityId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("department_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("department_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(Integer value) {
            addCriterion("department_id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(Integer value) {
            addCriterion("department_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(Integer value) {
            addCriterion("department_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("department_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(Integer value) {
            addCriterion("department_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("department_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<Integer> values) {
            addCriterion("department_id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<Integer> values) {
            addCriterion("department_id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(Integer value1, Integer value2) {
            addCriterion("department_id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("department_id not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentheadIsNull() {
            addCriterion("departmenthead is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentheadIsNotNull() {
            addCriterion("departmenthead is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentheadEqualTo(String value) {
            addCriterion("departmenthead =", value, "departmenthead");
            return (Criteria) this;
        }

        public Criteria andDepartmentheadNotEqualTo(String value) {
            addCriterion("departmenthead <>", value, "departmenthead");
            return (Criteria) this;
        }

        public Criteria andDepartmentheadGreaterThan(String value) {
            addCriterion("departmenthead >", value, "departmenthead");
            return (Criteria) this;
        }

        public Criteria andDepartmentheadGreaterThanOrEqualTo(String value) {
            addCriterion("departmenthead >=", value, "departmenthead");
            return (Criteria) this;
        }

        public Criteria andDepartmentheadLessThan(String value) {
            addCriterion("departmenthead <", value, "departmenthead");
            return (Criteria) this;
        }

        public Criteria andDepartmentheadLessThanOrEqualTo(String value) {
            addCriterion("departmenthead <=", value, "departmenthead");
            return (Criteria) this;
        }

        public Criteria andDepartmentheadLike(String value) {
            addCriterion("departmenthead like", value, "departmenthead");
            return (Criteria) this;
        }

        public Criteria andDepartmentheadNotLike(String value) {
            addCriterion("departmenthead not like", value, "departmenthead");
            return (Criteria) this;
        }

        public Criteria andDepartmentheadIn(List<String> values) {
            addCriterion("departmenthead in", values, "departmenthead");
            return (Criteria) this;
        }

        public Criteria andDepartmentheadNotIn(List<String> values) {
            addCriterion("departmenthead not in", values, "departmenthead");
            return (Criteria) this;
        }

        public Criteria andDepartmentheadBetween(String value1, String value2) {
            addCriterion("departmenthead between", value1, value2, "departmenthead");
            return (Criteria) this;
        }

        public Criteria andDepartmentheadNotBetween(String value1, String value2) {
            addCriterion("departmenthead not between", value1, value2, "departmenthead");
            return (Criteria) this;
        }

        public Criteria andSpecialityprincipalIsNull() {
            addCriterion("specialityprincipal is null");
            return (Criteria) this;
        }

        public Criteria andSpecialityprincipalIsNotNull() {
            addCriterion("specialityprincipal is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialityprincipalEqualTo(String value) {
            addCriterion("specialityprincipal =", value, "specialityprincipal");
            return (Criteria) this;
        }

        public Criteria andSpecialityprincipalNotEqualTo(String value) {
            addCriterion("specialityprincipal <>", value, "specialityprincipal");
            return (Criteria) this;
        }

        public Criteria andSpecialityprincipalGreaterThan(String value) {
            addCriterion("specialityprincipal >", value, "specialityprincipal");
            return (Criteria) this;
        }

        public Criteria andSpecialityprincipalGreaterThanOrEqualTo(String value) {
            addCriterion("specialityprincipal >=", value, "specialityprincipal");
            return (Criteria) this;
        }

        public Criteria andSpecialityprincipalLessThan(String value) {
            addCriterion("specialityprincipal <", value, "specialityprincipal");
            return (Criteria) this;
        }

        public Criteria andSpecialityprincipalLessThanOrEqualTo(String value) {
            addCriterion("specialityprincipal <=", value, "specialityprincipal");
            return (Criteria) this;
        }

        public Criteria andSpecialityprincipalLike(String value) {
            addCriterion("specialityprincipal like", value, "specialityprincipal");
            return (Criteria) this;
        }

        public Criteria andSpecialityprincipalNotLike(String value) {
            addCriterion("specialityprincipal not like", value, "specialityprincipal");
            return (Criteria) this;
        }

        public Criteria andSpecialityprincipalIn(List<String> values) {
            addCriterion("specialityprincipal in", values, "specialityprincipal");
            return (Criteria) this;
        }

        public Criteria andSpecialityprincipalNotIn(List<String> values) {
            addCriterion("specialityprincipal not in", values, "specialityprincipal");
            return (Criteria) this;
        }

        public Criteria andSpecialityprincipalBetween(String value1, String value2) {
            addCriterion("specialityprincipal between", value1, value2, "specialityprincipal");
            return (Criteria) this;
        }

        public Criteria andSpecialityprincipalNotBetween(String value1, String value2) {
            addCriterion("specialityprincipal not between", value1, value2, "specialityprincipal");
            return (Criteria) this;
        }

        public Criteria andReviewerIsNull() {
            addCriterion("reviewer is null");
            return (Criteria) this;
        }

        public Criteria andReviewerIsNotNull() {
            addCriterion("reviewer is not null");
            return (Criteria) this;
        }

        public Criteria andReviewerEqualTo(String value) {
            addCriterion("reviewer =", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotEqualTo(String value) {
            addCriterion("reviewer <>", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerGreaterThan(String value) {
            addCriterion("reviewer >", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerGreaterThanOrEqualTo(String value) {
            addCriterion("reviewer >=", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerLessThan(String value) {
            addCriterion("reviewer <", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerLessThanOrEqualTo(String value) {
            addCriterion("reviewer <=", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerLike(String value) {
            addCriterion("reviewer like", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotLike(String value) {
            addCriterion("reviewer not like", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerIn(List<String> values) {
            addCriterion("reviewer in", values, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotIn(List<String> values) {
            addCriterion("reviewer not in", values, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerBetween(String value1, String value2) {
            addCriterion("reviewer between", value1, value2, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotBetween(String value1, String value2) {
            addCriterion("reviewer not between", value1, value2, "reviewer");
            return (Criteria) this;
        }

        public Criteria andPresidentIsNull() {
            addCriterion("president is null");
            return (Criteria) this;
        }

        public Criteria andPresidentIsNotNull() {
            addCriterion("president is not null");
            return (Criteria) this;
        }

        public Criteria andPresidentEqualTo(String value) {
            addCriterion("president =", value, "president");
            return (Criteria) this;
        }

        public Criteria andPresidentNotEqualTo(String value) {
            addCriterion("president <>", value, "president");
            return (Criteria) this;
        }

        public Criteria andPresidentGreaterThan(String value) {
            addCriterion("president >", value, "president");
            return (Criteria) this;
        }

        public Criteria andPresidentGreaterThanOrEqualTo(String value) {
            addCriterion("president >=", value, "president");
            return (Criteria) this;
        }

        public Criteria andPresidentLessThan(String value) {
            addCriterion("president <", value, "president");
            return (Criteria) this;
        }

        public Criteria andPresidentLessThanOrEqualTo(String value) {
            addCriterion("president <=", value, "president");
            return (Criteria) this;
        }

        public Criteria andPresidentLike(String value) {
            addCriterion("president like", value, "president");
            return (Criteria) this;
        }

        public Criteria andPresidentNotLike(String value) {
            addCriterion("president not like", value, "president");
            return (Criteria) this;
        }

        public Criteria andPresidentIn(List<String> values) {
            addCriterion("president in", values, "president");
            return (Criteria) this;
        }

        public Criteria andPresidentNotIn(List<String> values) {
            addCriterion("president not in", values, "president");
            return (Criteria) this;
        }

        public Criteria andPresidentBetween(String value1, String value2) {
            addCriterion("president between", value1, value2, "president");
            return (Criteria) this;
        }

        public Criteria andPresidentNotBetween(String value1, String value2) {
            addCriterion("president not between", value1, value2, "president");
            return (Criteria) this;
        }

        public Criteria andIscompletedIsNull() {
            addCriterion("iscompleted is null");
            return (Criteria) this;
        }

        public Criteria andIscompletedIsNotNull() {
            addCriterion("iscompleted is not null");
            return (Criteria) this;
        }

        public Criteria andIscompletedEqualTo(Integer value) {
            addCriterion("iscompleted =", value, "iscompleted");
            return (Criteria) this;
        }

        public Criteria andIscompletedNotEqualTo(Integer value) {
            addCriterion("iscompleted <>", value, "iscompleted");
            return (Criteria) this;
        }

        public Criteria andIscompletedGreaterThan(Integer value) {
            addCriterion("iscompleted >", value, "iscompleted");
            return (Criteria) this;
        }

        public Criteria andIscompletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("iscompleted >=", value, "iscompleted");
            return (Criteria) this;
        }

        public Criteria andIscompletedLessThan(Integer value) {
            addCriterion("iscompleted <", value, "iscompleted");
            return (Criteria) this;
        }

        public Criteria andIscompletedLessThanOrEqualTo(Integer value) {
            addCriterion("iscompleted <=", value, "iscompleted");
            return (Criteria) this;
        }

        public Criteria andIscompletedIn(List<Integer> values) {
            addCriterion("iscompleted in", values, "iscompleted");
            return (Criteria) this;
        }

        public Criteria andIscompletedNotIn(List<Integer> values) {
            addCriterion("iscompleted not in", values, "iscompleted");
            return (Criteria) this;
        }

        public Criteria andIscompletedBetween(Integer value1, Integer value2) {
            addCriterion("iscompleted between", value1, value2, "iscompleted");
            return (Criteria) this;
        }

        public Criteria andIscompletedNotBetween(Integer value1, Integer value2) {
            addCriterion("iscompleted not between", value1, value2, "iscompleted");
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