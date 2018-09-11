package edu.njxzc.tcs.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andCoursidIsNull() {
            addCriterion("coursid is null");
            return (Criteria) this;
        }

        public Criteria andCoursidIsNotNull() {
            addCriterion("coursid is not null");
            return (Criteria) this;
        }

        public Criteria andCoursidEqualTo(Integer value) {
            addCriterion("coursid =", value, "coursid");
            return (Criteria) this;
        }

        public Criteria andCoursidNotEqualTo(Integer value) {
            addCriterion("coursid <>", value, "coursid");
            return (Criteria) this;
        }

        public Criteria andCoursidGreaterThan(Integer value) {
            addCriterion("coursid >", value, "coursid");
            return (Criteria) this;
        }

        public Criteria andCoursidGreaterThanOrEqualTo(Integer value) {
            addCriterion("coursid >=", value, "coursid");
            return (Criteria) this;
        }

        public Criteria andCoursidLessThan(Integer value) {
            addCriterion("coursid <", value, "coursid");
            return (Criteria) this;
        }

        public Criteria andCoursidLessThanOrEqualTo(Integer value) {
            addCriterion("coursid <=", value, "coursid");
            return (Criteria) this;
        }

        public Criteria andCoursidIn(List<Integer> values) {
            addCriterion("coursid in", values, "coursid");
            return (Criteria) this;
        }

        public Criteria andCoursidNotIn(List<Integer> values) {
            addCriterion("coursid not in", values, "coursid");
            return (Criteria) this;
        }

        public Criteria andCoursidBetween(Integer value1, Integer value2) {
            addCriterion("coursid between", value1, value2, "coursid");
            return (Criteria) this;
        }

        public Criteria andCoursidNotBetween(Integer value1, Integer value2) {
            addCriterion("coursid not between", value1, value2, "coursid");
            return (Criteria) this;
        }

        public Criteria andCoursecodeIsNull() {
            addCriterion("coursecode is null");
            return (Criteria) this;
        }

        public Criteria andCoursecodeIsNotNull() {
            addCriterion("coursecode is not null");
            return (Criteria) this;
        }

        public Criteria andCoursecodeEqualTo(String value) {
            addCriterion("coursecode =", value, "coursecode");
            return (Criteria) this;
        }

        public Criteria andCoursecodeNotEqualTo(String value) {
            addCriterion("coursecode <>", value, "coursecode");
            return (Criteria) this;
        }

        public Criteria andCoursecodeGreaterThan(String value) {
            addCriterion("coursecode >", value, "coursecode");
            return (Criteria) this;
        }

        public Criteria andCoursecodeGreaterThanOrEqualTo(String value) {
            addCriterion("coursecode >=", value, "coursecode");
            return (Criteria) this;
        }

        public Criteria andCoursecodeLessThan(String value) {
            addCriterion("coursecode <", value, "coursecode");
            return (Criteria) this;
        }

        public Criteria andCoursecodeLessThanOrEqualTo(String value) {
            addCriterion("coursecode <=", value, "coursecode");
            return (Criteria) this;
        }

        public Criteria andCoursecodeLike(String value) {
            addCriterion("coursecode like", value, "coursecode");
            return (Criteria) this;
        }

        public Criteria andCoursecodeNotLike(String value) {
            addCriterion("coursecode not like", value, "coursecode");
            return (Criteria) this;
        }

        public Criteria andCoursecodeIn(List<String> values) {
            addCriterion("coursecode in", values, "coursecode");
            return (Criteria) this;
        }

        public Criteria andCoursecodeNotIn(List<String> values) {
            addCriterion("coursecode not in", values, "coursecode");
            return (Criteria) this;
        }

        public Criteria andCoursecodeBetween(String value1, String value2) {
            addCriterion("coursecode between", value1, value2, "coursecode");
            return (Criteria) this;
        }

        public Criteria andCoursecodeNotBetween(String value1, String value2) {
            addCriterion("coursecode not between", value1, value2, "coursecode");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNull() {
            addCriterion("coursename is null");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNotNull() {
            addCriterion("coursename is not null");
            return (Criteria) this;
        }

        public Criteria andCoursenameEqualTo(String value) {
            addCriterion("coursename =", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotEqualTo(String value) {
            addCriterion("coursename <>", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThan(String value) {
            addCriterion("coursename >", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThanOrEqualTo(String value) {
            addCriterion("coursename >=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThan(String value) {
            addCriterion("coursename <", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThanOrEqualTo(String value) {
            addCriterion("coursename <=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLike(String value) {
            addCriterion("coursename like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotLike(String value) {
            addCriterion("coursename not like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameIn(List<String> values) {
            addCriterion("coursename in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotIn(List<String> values) {
            addCriterion("coursename not in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameBetween(String value1, String value2) {
            addCriterion("coursename between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotBetween(String value1, String value2) {
            addCriterion("coursename not between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andCourseenglishnameIsNull() {
            addCriterion("courseenglishname is null");
            return (Criteria) this;
        }

        public Criteria andCourseenglishnameIsNotNull() {
            addCriterion("courseenglishname is not null");
            return (Criteria) this;
        }

        public Criteria andCourseenglishnameEqualTo(String value) {
            addCriterion("courseenglishname =", value, "courseenglishname");
            return (Criteria) this;
        }

        public Criteria andCourseenglishnameNotEqualTo(String value) {
            addCriterion("courseenglishname <>", value, "courseenglishname");
            return (Criteria) this;
        }

        public Criteria andCourseenglishnameGreaterThan(String value) {
            addCriterion("courseenglishname >", value, "courseenglishname");
            return (Criteria) this;
        }

        public Criteria andCourseenglishnameGreaterThanOrEqualTo(String value) {
            addCriterion("courseenglishname >=", value, "courseenglishname");
            return (Criteria) this;
        }

        public Criteria andCourseenglishnameLessThan(String value) {
            addCriterion("courseenglishname <", value, "courseenglishname");
            return (Criteria) this;
        }

        public Criteria andCourseenglishnameLessThanOrEqualTo(String value) {
            addCriterion("courseenglishname <=", value, "courseenglishname");
            return (Criteria) this;
        }

        public Criteria andCourseenglishnameLike(String value) {
            addCriterion("courseenglishname like", value, "courseenglishname");
            return (Criteria) this;
        }

        public Criteria andCourseenglishnameNotLike(String value) {
            addCriterion("courseenglishname not like", value, "courseenglishname");
            return (Criteria) this;
        }

        public Criteria andCourseenglishnameIn(List<String> values) {
            addCriterion("courseenglishname in", values, "courseenglishname");
            return (Criteria) this;
        }

        public Criteria andCourseenglishnameNotIn(List<String> values) {
            addCriterion("courseenglishname not in", values, "courseenglishname");
            return (Criteria) this;
        }

        public Criteria andCourseenglishnameBetween(String value1, String value2) {
            addCriterion("courseenglishname between", value1, value2, "courseenglishname");
            return (Criteria) this;
        }

        public Criteria andCourseenglishnameNotBetween(String value1, String value2) {
            addCriterion("courseenglishname not between", value1, value2, "courseenglishname");
            return (Criteria) this;
        }

        public Criteria andCourseclassificationIdIsNull() {
            addCriterion("courseclassification_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseclassificationIdIsNotNull() {
            addCriterion("courseclassification_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseclassificationIdEqualTo(Integer value) {
            addCriterion("courseclassification_id =", value, "courseclassificationId");
            return (Criteria) this;
        }

        public Criteria andCourseclassificationIdNotEqualTo(Integer value) {
            addCriterion("courseclassification_id <>", value, "courseclassificationId");
            return (Criteria) this;
        }

        public Criteria andCourseclassificationIdGreaterThan(Integer value) {
            addCriterion("courseclassification_id >", value, "courseclassificationId");
            return (Criteria) this;
        }

        public Criteria andCourseclassificationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("courseclassification_id >=", value, "courseclassificationId");
            return (Criteria) this;
        }

        public Criteria andCourseclassificationIdLessThan(Integer value) {
            addCriterion("courseclassification_id <", value, "courseclassificationId");
            return (Criteria) this;
        }

        public Criteria andCourseclassificationIdLessThanOrEqualTo(Integer value) {
            addCriterion("courseclassification_id <=", value, "courseclassificationId");
            return (Criteria) this;
        }

        public Criteria andCourseclassificationIdIn(List<Integer> values) {
            addCriterion("courseclassification_id in", values, "courseclassificationId");
            return (Criteria) this;
        }

        public Criteria andCourseclassificationIdNotIn(List<Integer> values) {
            addCriterion("courseclassification_id not in", values, "courseclassificationId");
            return (Criteria) this;
        }

        public Criteria andCourseclassificationIdBetween(Integer value1, Integer value2) {
            addCriterion("courseclassification_id between", value1, value2, "courseclassificationId");
            return (Criteria) this;
        }

        public Criteria andCourseclassificationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("courseclassification_id not between", value1, value2, "courseclassificationId");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassificationIdIsNull() {
            addCriterion("childcourseclassification_id is null");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassificationIdIsNotNull() {
            addCriterion("childcourseclassification_id is not null");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassificationIdEqualTo(Integer value) {
            addCriterion("childcourseclassification_id =", value, "childcourseclassificationId");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassificationIdNotEqualTo(Integer value) {
            addCriterion("childcourseclassification_id <>", value, "childcourseclassificationId");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassificationIdGreaterThan(Integer value) {
            addCriterion("childcourseclassification_id >", value, "childcourseclassificationId");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassificationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("childcourseclassification_id >=", value, "childcourseclassificationId");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassificationIdLessThan(Integer value) {
            addCriterion("childcourseclassification_id <", value, "childcourseclassificationId");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassificationIdLessThanOrEqualTo(Integer value) {
            addCriterion("childcourseclassification_id <=", value, "childcourseclassificationId");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassificationIdIn(List<Integer> values) {
            addCriterion("childcourseclassification_id in", values, "childcourseclassificationId");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassificationIdNotIn(List<Integer> values) {
            addCriterion("childcourseclassification_id not in", values, "childcourseclassificationId");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassificationIdBetween(Integer value1, Integer value2) {
            addCriterion("childcourseclassification_id between", value1, value2, "childcourseclassificationId");
            return (Criteria) this;
        }

        public Criteria andChildcourseclassificationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("childcourseclassification_id not between", value1, value2, "childcourseclassificationId");
            return (Criteria) this;
        }

        public Criteria andEngineercourseclassificationIdIsNull() {
            addCriterion("engineercourseclassification_id is null");
            return (Criteria) this;
        }

        public Criteria andEngineercourseclassificationIdIsNotNull() {
            addCriterion("engineercourseclassification_id is not null");
            return (Criteria) this;
        }

        public Criteria andEngineercourseclassificationIdEqualTo(Integer value) {
            addCriterion("engineercourseclassification_id =", value, "engineercourseclassificationId");
            return (Criteria) this;
        }

        public Criteria andEngineercourseclassificationIdNotEqualTo(Integer value) {
            addCriterion("engineercourseclassification_id <>", value, "engineercourseclassificationId");
            return (Criteria) this;
        }

        public Criteria andEngineercourseclassificationIdGreaterThan(Integer value) {
            addCriterion("engineercourseclassification_id >", value, "engineercourseclassificationId");
            return (Criteria) this;
        }

        public Criteria andEngineercourseclassificationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("engineercourseclassification_id >=", value, "engineercourseclassificationId");
            return (Criteria) this;
        }

        public Criteria andEngineercourseclassificationIdLessThan(Integer value) {
            addCriterion("engineercourseclassification_id <", value, "engineercourseclassificationId");
            return (Criteria) this;
        }

        public Criteria andEngineercourseclassificationIdLessThanOrEqualTo(Integer value) {
            addCriterion("engineercourseclassification_id <=", value, "engineercourseclassificationId");
            return (Criteria) this;
        }

        public Criteria andEngineercourseclassificationIdIn(List<Integer> values) {
            addCriterion("engineercourseclassification_id in", values, "engineercourseclassificationId");
            return (Criteria) this;
        }

        public Criteria andEngineercourseclassificationIdNotIn(List<Integer> values) {
            addCriterion("engineercourseclassification_id not in", values, "engineercourseclassificationId");
            return (Criteria) this;
        }

        public Criteria andEngineercourseclassificationIdBetween(Integer value1, Integer value2) {
            addCriterion("engineercourseclassification_id between", value1, value2, "engineercourseclassificationId");
            return (Criteria) this;
        }

        public Criteria andEngineercourseclassificationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("engineercourseclassification_id not between", value1, value2, "engineercourseclassificationId");
            return (Criteria) this;
        }

        public Criteria andTeachingcourseclassificationIdIsNull() {
            addCriterion("teachingcourseclassification_id is null");
            return (Criteria) this;
        }

        public Criteria andTeachingcourseclassificationIdIsNotNull() {
            addCriterion("teachingcourseclassification_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeachingcourseclassificationIdEqualTo(Integer value) {
            addCriterion("teachingcourseclassification_id =", value, "teachingcourseclassificationId");
            return (Criteria) this;
        }

        public Criteria andTeachingcourseclassificationIdNotEqualTo(Integer value) {
            addCriterion("teachingcourseclassification_id <>", value, "teachingcourseclassificationId");
            return (Criteria) this;
        }

        public Criteria andTeachingcourseclassificationIdGreaterThan(Integer value) {
            addCriterion("teachingcourseclassification_id >", value, "teachingcourseclassificationId");
            return (Criteria) this;
        }

        public Criteria andTeachingcourseclassificationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("teachingcourseclassification_id >=", value, "teachingcourseclassificationId");
            return (Criteria) this;
        }

        public Criteria andTeachingcourseclassificationIdLessThan(Integer value) {
            addCriterion("teachingcourseclassification_id <", value, "teachingcourseclassificationId");
            return (Criteria) this;
        }

        public Criteria andTeachingcourseclassificationIdLessThanOrEqualTo(Integer value) {
            addCriterion("teachingcourseclassification_id <=", value, "teachingcourseclassificationId");
            return (Criteria) this;
        }

        public Criteria andTeachingcourseclassificationIdIn(List<Integer> values) {
            addCriterion("teachingcourseclassification_id in", values, "teachingcourseclassificationId");
            return (Criteria) this;
        }

        public Criteria andTeachingcourseclassificationIdNotIn(List<Integer> values) {
            addCriterion("teachingcourseclassification_id not in", values, "teachingcourseclassificationId");
            return (Criteria) this;
        }

        public Criteria andTeachingcourseclassificationIdBetween(Integer value1, Integer value2) {
            addCriterion("teachingcourseclassification_id between", value1, value2, "teachingcourseclassificationId");
            return (Criteria) this;
        }

        public Criteria andTeachingcourseclassificationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("teachingcourseclassification_id not between", value1, value2, "teachingcourseclassificationId");
            return (Criteria) this;
        }

        public Criteria andIsmajorIsNull() {
            addCriterion("ismajor is null");
            return (Criteria) this;
        }

        public Criteria andIsmajorIsNotNull() {
            addCriterion("ismajor is not null");
            return (Criteria) this;
        }

        public Criteria andIsmajorEqualTo(Integer value) {
            addCriterion("ismajor =", value, "ismajor");
            return (Criteria) this;
        }

        public Criteria andIsmajorNotEqualTo(Integer value) {
            addCriterion("ismajor <>", value, "ismajor");
            return (Criteria) this;
        }

        public Criteria andIsmajorGreaterThan(Integer value) {
            addCriterion("ismajor >", value, "ismajor");
            return (Criteria) this;
        }

        public Criteria andIsmajorGreaterThanOrEqualTo(Integer value) {
            addCriterion("ismajor >=", value, "ismajor");
            return (Criteria) this;
        }

        public Criteria andIsmajorLessThan(Integer value) {
            addCriterion("ismajor <", value, "ismajor");
            return (Criteria) this;
        }

        public Criteria andIsmajorLessThanOrEqualTo(Integer value) {
            addCriterion("ismajor <=", value, "ismajor");
            return (Criteria) this;
        }

        public Criteria andIsmajorIn(List<Integer> values) {
            addCriterion("ismajor in", values, "ismajor");
            return (Criteria) this;
        }

        public Criteria andIsmajorNotIn(List<Integer> values) {
            addCriterion("ismajor not in", values, "ismajor");
            return (Criteria) this;
        }

        public Criteria andIsmajorBetween(Integer value1, Integer value2) {
            addCriterion("ismajor between", value1, value2, "ismajor");
            return (Criteria) this;
        }

        public Criteria andIsmajorNotBetween(Integer value1, Integer value2) {
            addCriterion("ismajor not between", value1, value2, "ismajor");
            return (Criteria) this;
        }

        public Criteria andIsbilingualIsNull() {
            addCriterion("isBilingual is null");
            return (Criteria) this;
        }

        public Criteria andIsbilingualIsNotNull() {
            addCriterion("isBilingual is not null");
            return (Criteria) this;
        }

        public Criteria andIsbilingualEqualTo(Integer value) {
            addCriterion("isBilingual =", value, "isbilingual");
            return (Criteria) this;
        }

        public Criteria andIsbilingualNotEqualTo(Integer value) {
            addCriterion("isBilingual <>", value, "isbilingual");
            return (Criteria) this;
        }

        public Criteria andIsbilingualGreaterThan(Integer value) {
            addCriterion("isBilingual >", value, "isbilingual");
            return (Criteria) this;
        }

        public Criteria andIsbilingualGreaterThanOrEqualTo(Integer value) {
            addCriterion("isBilingual >=", value, "isbilingual");
            return (Criteria) this;
        }

        public Criteria andIsbilingualLessThan(Integer value) {
            addCriterion("isBilingual <", value, "isbilingual");
            return (Criteria) this;
        }

        public Criteria andIsbilingualLessThanOrEqualTo(Integer value) {
            addCriterion("isBilingual <=", value, "isbilingual");
            return (Criteria) this;
        }

        public Criteria andIsbilingualIn(List<Integer> values) {
            addCriterion("isBilingual in", values, "isbilingual");
            return (Criteria) this;
        }

        public Criteria andIsbilingualNotIn(List<Integer> values) {
            addCriterion("isBilingual not in", values, "isbilingual");
            return (Criteria) this;
        }

        public Criteria andIsbilingualBetween(Integer value1, Integer value2) {
            addCriterion("isBilingual between", value1, value2, "isbilingual");
            return (Criteria) this;
        }

        public Criteria andIsbilingualNotBetween(Integer value1, Integer value2) {
            addCriterion("isBilingual not between", value1, value2, "isbilingual");
            return (Criteria) this;
        }

        public Criteria andIsenglishIsNull() {
            addCriterion("isEnglish is null");
            return (Criteria) this;
        }

        public Criteria andIsenglishIsNotNull() {
            addCriterion("isEnglish is not null");
            return (Criteria) this;
        }

        public Criteria andIsenglishEqualTo(Integer value) {
            addCriterion("isEnglish =", value, "isenglish");
            return (Criteria) this;
        }

        public Criteria andIsenglishNotEqualTo(Integer value) {
            addCriterion("isEnglish <>", value, "isenglish");
            return (Criteria) this;
        }

        public Criteria andIsenglishGreaterThan(Integer value) {
            addCriterion("isEnglish >", value, "isenglish");
            return (Criteria) this;
        }

        public Criteria andIsenglishGreaterThanOrEqualTo(Integer value) {
            addCriterion("isEnglish >=", value, "isenglish");
            return (Criteria) this;
        }

        public Criteria andIsenglishLessThan(Integer value) {
            addCriterion("isEnglish <", value, "isenglish");
            return (Criteria) this;
        }

        public Criteria andIsenglishLessThanOrEqualTo(Integer value) {
            addCriterion("isEnglish <=", value, "isenglish");
            return (Criteria) this;
        }

        public Criteria andIsenglishIn(List<Integer> values) {
            addCriterion("isEnglish in", values, "isenglish");
            return (Criteria) this;
        }

        public Criteria andIsenglishNotIn(List<Integer> values) {
            addCriterion("isEnglish not in", values, "isenglish");
            return (Criteria) this;
        }

        public Criteria andIsenglishBetween(Integer value1, Integer value2) {
            addCriterion("isEnglish between", value1, value2, "isenglish");
            return (Criteria) this;
        }

        public Criteria andIsenglishNotBetween(Integer value1, Integer value2) {
            addCriterion("isEnglish not between", value1, value2, "isenglish");
            return (Criteria) this;
        }

        public Criteria andIsindustryIsNull() {
            addCriterion("isIndustry is null");
            return (Criteria) this;
        }

        public Criteria andIsindustryIsNotNull() {
            addCriterion("isIndustry is not null");
            return (Criteria) this;
        }

        public Criteria andIsindustryEqualTo(Integer value) {
            addCriterion("isIndustry =", value, "isindustry");
            return (Criteria) this;
        }

        public Criteria andIsindustryNotEqualTo(Integer value) {
            addCriterion("isIndustry <>", value, "isindustry");
            return (Criteria) this;
        }

        public Criteria andIsindustryGreaterThan(Integer value) {
            addCriterion("isIndustry >", value, "isindustry");
            return (Criteria) this;
        }

        public Criteria andIsindustryGreaterThanOrEqualTo(Integer value) {
            addCriterion("isIndustry >=", value, "isindustry");
            return (Criteria) this;
        }

        public Criteria andIsindustryLessThan(Integer value) {
            addCriterion("isIndustry <", value, "isindustry");
            return (Criteria) this;
        }

        public Criteria andIsindustryLessThanOrEqualTo(Integer value) {
            addCriterion("isIndustry <=", value, "isindustry");
            return (Criteria) this;
        }

        public Criteria andIsindustryIn(List<Integer> values) {
            addCriterion("isIndustry in", values, "isindustry");
            return (Criteria) this;
        }

        public Criteria andIsindustryNotIn(List<Integer> values) {
            addCriterion("isIndustry not in", values, "isindustry");
            return (Criteria) this;
        }

        public Criteria andIsindustryBetween(Integer value1, Integer value2) {
            addCriterion("isIndustry between", value1, value2, "isindustry");
            return (Criteria) this;
        }

        public Criteria andIsindustryNotBetween(Integer value1, Integer value2) {
            addCriterion("isIndustry not between", value1, value2, "isindustry");
            return (Criteria) this;
        }

        public Criteria andIsinternationalIsNull() {
            addCriterion("isInternational is null");
            return (Criteria) this;
        }

        public Criteria andIsinternationalIsNotNull() {
            addCriterion("isInternational is not null");
            return (Criteria) this;
        }

        public Criteria andIsinternationalEqualTo(Integer value) {
            addCriterion("isInternational =", value, "isinternational");
            return (Criteria) this;
        }

        public Criteria andIsinternationalNotEqualTo(Integer value) {
            addCriterion("isInternational <>", value, "isinternational");
            return (Criteria) this;
        }

        public Criteria andIsinternationalGreaterThan(Integer value) {
            addCriterion("isInternational >", value, "isinternational");
            return (Criteria) this;
        }

        public Criteria andIsinternationalGreaterThanOrEqualTo(Integer value) {
            addCriterion("isInternational >=", value, "isinternational");
            return (Criteria) this;
        }

        public Criteria andIsinternationalLessThan(Integer value) {
            addCriterion("isInternational <", value, "isinternational");
            return (Criteria) this;
        }

        public Criteria andIsinternationalLessThanOrEqualTo(Integer value) {
            addCriterion("isInternational <=", value, "isinternational");
            return (Criteria) this;
        }

        public Criteria andIsinternationalIn(List<Integer> values) {
            addCriterion("isInternational in", values, "isinternational");
            return (Criteria) this;
        }

        public Criteria andIsinternationalNotIn(List<Integer> values) {
            addCriterion("isInternational not in", values, "isinternational");
            return (Criteria) this;
        }

        public Criteria andIsinternationalBetween(Integer value1, Integer value2) {
            addCriterion("isInternational between", value1, value2, "isinternational");
            return (Criteria) this;
        }

        public Criteria andIsinternationalNotBetween(Integer value1, Integer value2) {
            addCriterion("isInternational not between", value1, value2, "isinternational");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIsNull() {
            addCriterion("coursetype is null");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIsNotNull() {
            addCriterion("coursetype is not null");
            return (Criteria) this;
        }

        public Criteria andCoursetypeEqualTo(Integer value) {
            addCriterion("coursetype =", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotEqualTo(Integer value) {
            addCriterion("coursetype <>", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeGreaterThan(Integer value) {
            addCriterion("coursetype >", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("coursetype >=", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeLessThan(Integer value) {
            addCriterion("coursetype <", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeLessThanOrEqualTo(Integer value) {
            addCriterion("coursetype <=", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIn(List<Integer> values) {
            addCriterion("coursetype in", values, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotIn(List<Integer> values) {
            addCriterion("coursetype not in", values, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeBetween(Integer value1, Integer value2) {
            addCriterion("coursetype between", value1, value2, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("coursetype not between", value1, value2, "coursetype");
            return (Criteria) this;
        }

        public Criteria andTotalcreditIsNull() {
            addCriterion("totalcredit is null");
            return (Criteria) this;
        }

        public Criteria andTotalcreditIsNotNull() {
            addCriterion("totalcredit is not null");
            return (Criteria) this;
        }

        public Criteria andTotalcreditEqualTo(Float value) {
            addCriterion("totalcredit =", value, "totalcredit");
            return (Criteria) this;
        }

        public Criteria andTotalcreditNotEqualTo(Float value) {
            addCriterion("totalcredit <>", value, "totalcredit");
            return (Criteria) this;
        }

        public Criteria andTotalcreditGreaterThan(Float value) {
            addCriterion("totalcredit >", value, "totalcredit");
            return (Criteria) this;
        }

        public Criteria andTotalcreditGreaterThanOrEqualTo(Float value) {
            addCriterion("totalcredit >=", value, "totalcredit");
            return (Criteria) this;
        }

        public Criteria andTotalcreditLessThan(Float value) {
            addCriterion("totalcredit <", value, "totalcredit");
            return (Criteria) this;
        }

        public Criteria andTotalcreditLessThanOrEqualTo(Float value) {
            addCriterion("totalcredit <=", value, "totalcredit");
            return (Criteria) this;
        }

        public Criteria andTotalcreditIn(List<Float> values) {
            addCriterion("totalcredit in", values, "totalcredit");
            return (Criteria) this;
        }

        public Criteria andTotalcreditNotIn(List<Float> values) {
            addCriterion("totalcredit not in", values, "totalcredit");
            return (Criteria) this;
        }

        public Criteria andTotalcreditBetween(Float value1, Float value2) {
            addCriterion("totalcredit between", value1, value2, "totalcredit");
            return (Criteria) this;
        }

        public Criteria andTotalcreditNotBetween(Float value1, Float value2) {
            addCriterion("totalcredit not between", value1, value2, "totalcredit");
            return (Criteria) this;
        }

        public Criteria andTheorycreditIsNull() {
            addCriterion("theorycredit is null");
            return (Criteria) this;
        }

        public Criteria andTheorycreditIsNotNull() {
            addCriterion("theorycredit is not null");
            return (Criteria) this;
        }

        public Criteria andTheorycreditEqualTo(Float value) {
            addCriterion("theorycredit =", value, "theorycredit");
            return (Criteria) this;
        }

        public Criteria andTheorycreditNotEqualTo(Float value) {
            addCriterion("theorycredit <>", value, "theorycredit");
            return (Criteria) this;
        }

        public Criteria andTheorycreditGreaterThan(Float value) {
            addCriterion("theorycredit >", value, "theorycredit");
            return (Criteria) this;
        }

        public Criteria andTheorycreditGreaterThanOrEqualTo(Float value) {
            addCriterion("theorycredit >=", value, "theorycredit");
            return (Criteria) this;
        }

        public Criteria andTheorycreditLessThan(Float value) {
            addCriterion("theorycredit <", value, "theorycredit");
            return (Criteria) this;
        }

        public Criteria andTheorycreditLessThanOrEqualTo(Float value) {
            addCriterion("theorycredit <=", value, "theorycredit");
            return (Criteria) this;
        }

        public Criteria andTheorycreditIn(List<Float> values) {
            addCriterion("theorycredit in", values, "theorycredit");
            return (Criteria) this;
        }

        public Criteria andTheorycreditNotIn(List<Float> values) {
            addCriterion("theorycredit not in", values, "theorycredit");
            return (Criteria) this;
        }

        public Criteria andTheorycreditBetween(Float value1, Float value2) {
            addCriterion("theorycredit between", value1, value2, "theorycredit");
            return (Criteria) this;
        }

        public Criteria andTheorycreditNotBetween(Float value1, Float value2) {
            addCriterion("theorycredit not between", value1, value2, "theorycredit");
            return (Criteria) this;
        }

        public Criteria andPracticalcreditIsNull() {
            addCriterion("practicalcredit is null");
            return (Criteria) this;
        }

        public Criteria andPracticalcreditIsNotNull() {
            addCriterion("practicalcredit is not null");
            return (Criteria) this;
        }

        public Criteria andPracticalcreditEqualTo(Float value) {
            addCriterion("practicalcredit =", value, "practicalcredit");
            return (Criteria) this;
        }

        public Criteria andPracticalcreditNotEqualTo(Float value) {
            addCriterion("practicalcredit <>", value, "practicalcredit");
            return (Criteria) this;
        }

        public Criteria andPracticalcreditGreaterThan(Float value) {
            addCriterion("practicalcredit >", value, "practicalcredit");
            return (Criteria) this;
        }

        public Criteria andPracticalcreditGreaterThanOrEqualTo(Float value) {
            addCriterion("practicalcredit >=", value, "practicalcredit");
            return (Criteria) this;
        }

        public Criteria andPracticalcreditLessThan(Float value) {
            addCriterion("practicalcredit <", value, "practicalcredit");
            return (Criteria) this;
        }

        public Criteria andPracticalcreditLessThanOrEqualTo(Float value) {
            addCriterion("practicalcredit <=", value, "practicalcredit");
            return (Criteria) this;
        }

        public Criteria andPracticalcreditIn(List<Float> values) {
            addCriterion("practicalcredit in", values, "practicalcredit");
            return (Criteria) this;
        }

        public Criteria andPracticalcreditNotIn(List<Float> values) {
            addCriterion("practicalcredit not in", values, "practicalcredit");
            return (Criteria) this;
        }

        public Criteria andPracticalcreditBetween(Float value1, Float value2) {
            addCriterion("practicalcredit between", value1, value2, "practicalcredit");
            return (Criteria) this;
        }

        public Criteria andPracticalcreditNotBetween(Float value1, Float value2) {
            addCriterion("practicalcredit not between", value1, value2, "practicalcredit");
            return (Criteria) this;
        }

        public Criteria andTermIsNull() {
            addCriterion("term is null");
            return (Criteria) this;
        }

        public Criteria andTermIsNotNull() {
            addCriterion("term is not null");
            return (Criteria) this;
        }

        public Criteria andTermEqualTo(Integer value) {
            addCriterion("term =", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotEqualTo(Integer value) {
            addCriterion("term <>", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThan(Integer value) {
            addCriterion("term >", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThanOrEqualTo(Integer value) {
            addCriterion("term >=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThan(Integer value) {
            addCriterion("term <", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThanOrEqualTo(Integer value) {
            addCriterion("term <=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermIn(List<Integer> values) {
            addCriterion("term in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotIn(List<Integer> values) {
            addCriterion("term not in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermBetween(Integer value1, Integer value2) {
            addCriterion("term between", value1, value2, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotBetween(Integer value1, Integer value2) {
            addCriterion("term not between", value1, value2, "term");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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