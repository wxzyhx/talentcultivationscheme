package edu.njxzc.tcs.util.basicutils;

public class CommonParamUtils {
	
	//课程类型定义course_type
	public static final Integer REQUIRED_COURSE = 1;
	public static final String REQUIRED_COURSE_NAME = "必修";
	public static final Integer OPTIONAL_COURSE = 2;
	public static final String OPTIONAL_COURSE_NAME = "选修";
	
	//课程考核方式course_check_method
	public static final Integer FORMAL_EXAM = 1;
	public static final String FORMAL_EXAM_NAME = "考试";
	public static final Integer INFORMAL_EXAM = 2;
	public static final String INFORMAL_EXAM_NAME = "考查";
	
	public static final String COURSE_TYPE_OPTION = "<option value=\"\" selected=\"selected\">==请选择==</option>"
			+ "<option value=\"1\">必修</option>" + "<option value=\"2\">选修</option>";

	public static String getCourseTypeRadio(int coursetype, String labelName) {
		if (coursetype == REQUIRED_COURSE) {
			return "<input type=\"radio\" name=\"" + labelName + "\" value=\"" + REQUIRED_COURSE
					+ "\" checked=\"checked\" />" + REQUIRED_COURSE_NAME + "\n" + "<input type=\"radio\" name=\""
					+ labelName + "\" value=\"" + OPTIONAL_COURSE + "\" />" + OPTIONAL_COURSE_NAME;
		} else {
			return "<input type=\"radio\" name=\"" + labelName + "\" value=\"" + REQUIRED_COURSE + "\"/>"
					+ REQUIRED_COURSE_NAME + "\n" + "<input type=\"radio\" name=\"" + labelName + "\" value=\""
					+ OPTIONAL_COURSE + "\" checked=\"checked\" />" + OPTIONAL_COURSE_NAME;
		}
	}
}
