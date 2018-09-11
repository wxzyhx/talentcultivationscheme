package edu.njxzc.tcs.util;

/**
 * Created by Administrator on 15-9-6.
 */
public class CommonParamUtils {
	// 用户推出原因
	public static final String LOGOUT_REASON_USERSELF = "用户主动退出！";
	public static final String LOGOUT_REASON_SERVERCLOSE = "服务器关闭！";
	public static final String LOGOUT_REASON_KICKOUT = "系统踢人！";

	// 数据可用和不可用定义
	public static final int DATA_USEABLE = 1;
	public static final String DATA_USEABLE_NAME = "可用";
	public static final int DATA_DISABLE = 0;
	public static final String DATA_DISABLE_NAME = "不可用";
	public static final int DATA_REFUSE = 2;
	public static final String DATA_REFUSE_NAME = "审核不通过";
	public static final int DATA_SHELL_USEABLE = 2;
	public static final String DATA_SHELL_USEABLE_NAME = "上架";

	// 站内信息阅读标志
	public static final Integer READ = 1;
	public static final String READ_NAME = "已读";
	public static final Integer UNREAD = 0;
	public static final String UNREAD_NAME = "不可读";

	public static String getDataUseableName(int dataStatus) {
		if (dataStatus == DATA_USEABLE) {
			return DATA_USEABLE_NAME;
		} else {
			return DATA_DISABLE_NAME;
		}
	}

	public static String getDataUseableRadio(int dataStatus, String labelName) {
		if (dataStatus == DATA_USEABLE) {
			return "<input type=\"radio\" name=\"" + labelName + "\" value=\"" + DATA_USEABLE
					+ "\" checked=\"checked\" />" + DATA_USEABLE_NAME + "\n" + "<input type=\"radio\" name=\""
					+ labelName + "\" value=\"" + DATA_DISABLE + "\" />" + DATA_DISABLE_NAME;
		} else {
			return "<input type=\"radio\" name=\"" + labelName + "\" value=\"" + DATA_USEABLE + "\"/>"
					+ DATA_USEABLE_NAME + "\n" + "<input type=\"radio\" name=\"" + labelName + "\" value=\""
					+ DATA_DISABLE + "\" checked=\"checked\" />" + DATA_DISABLE_NAME;
		}
	}

	public static final String DATE_USERABLE_OPTION = "<option value=\"\" selected=\"selected\">==请选择==</option>"
			+ "<option value=\"1\">可用</option>" + "<option value=\"0\">不可用</option>";

	// 模块管理查询页面select：状态
	public static final String getModuleSearchSelectStatus() {
		return "<select name=\"useFlag\" id=\"useFlag\" class=\"tab-order\"\n" + " style=\"width: 80%\">\n"
				+ "                            <option value=\"\">全选</option>\n"
				+ "                            <option value=\"1\">启用</option>\n"
				+ "                            <option value=\"0\">禁用</option>\n" + "                        </select>";
	}

	// 模块管理查询页面select：工作流
	public static final String getModuleSearchSelectWorlFlow() {
		return "<select name=\"workFlow\" class=\"tab-order\" id=\"workFlow\" style=\"width: 80%\">\n"
				+ "                            <option value=\"\">全选</option>\n"
				+ "                            <option value=\"1\">是</option>\n"
				+ "                            <option value=\"0\">否</option>\n" + "                        </select>";
	}

	// 系统是不是需要进行操作后提示
	public static final int TIP_HASTIP = 1;// 提示
	public static final int TIP_NOTIP = 0;// 不提示

	// 操作成功和失败数据
	public static final boolean OP_SUCCESS = true;// 操作成功
	public static final boolean OP_FAILED = false;// 操作失败
	public static final String OP_NameMessage = "角色名称已经存在,请更换!";// 姓名重复
	public static final String OP_SUCCESSMessage = "操作成功!";
	public static final String OP_FAILEDMessage = "操作失败!";
	// 用户会话定义
	public static final String LOGIN_USER_SESSION_NAME = "LOGIN_USER_SESSION_NAME";

	// 新增用户绑定角色使用session
	public static final String ADD_USER_ROLE_SESSION_NAME = "ADD_USER_ROLE_SESSION_NAME";

	// 商户登录会话定义
	public static final String LOGIN_MERCH_SESSION_NAME = "LOGIN_MERCH_SESSION_NAME";

	// 商户图片验证会话定义
	public static final String LOGIN_MERCH_PICNUM_SESSION_NAME = "LOGIN_MERCH_PICNUM_SESSION_NAME";

	// 商户注册手机号码会话定义
	public static final String ADD_MERCH_PHONENUM_SESSION_NAME = "ADD_MERCH_PHONENUM_SESSION_NAME";

	// 订单状态定义
	public static final Integer CAT_STATUS_WAIT = 1;
	public static final String CAT_STATUS_WAIT_STR = "1";
	public static final String CAT_STATUS_WAIT_NAME = "待消费订单";
	public static final Integer CAT_STATUS_WAITPAY = 3;
	public static final String CAT_STATUS_WAITPAY_STR = "3";
	public static final String CAT_STATUS_WAITPAY_NAME = "待下订订单";
	public static final Integer CAT_STATUS_HISTORY = 5;
	public static final String CAT_STATUS_HISTORY_STR = "5";
	public static final String CAT_STATUS_HISTORY_NAME = "已消费订单";
	public static final Integer CAT_STATUS_UNSUBMIT = 7;
	public static final String CAT_STATUS_UNSUBMIT_STR = "7";
	public static final String CAT_STATUS_UNSUBMIT_NAME = "未提交订单";
	public static final Integer CAT_STATUS_CANCEL = 9;
	public static final String CAT_STATUS_CANCEL_STR = "9";
	public static final String CAT_STATUS_CANCEL_NAME = "已取消订单";

	public static final String CAT_STATUS_OPTION = "<option value=\"\" selected=\"selected\">==请选择==</option>"
			+ "<option value=\"1\">待消费订单</option>" + "<option value=\"3\">待下订订单</option>"
			+ "<option value=\"5\">已消费订单</option>" + "<option value=\"7\">未提交订单</option>"
			+ "<option value=\"9\">已取消订单</option>";
	// 订单类型定义
	public static final Integer CAT_TYPE_INSTORE = 1;
	public static final String CAT_TYPE_INSTORE_NAME = "在店消费";
	public static final Integer CAT_TYPE_APPOINTMENT = 2;
	public static final String CAT_TYPE_APPOINTMENT_NAME = "预约消费";

	// 支付模式
	public static final Integer PAY_MODE_ALIPAY = 1;
	public static final String PAY_MODE_ALIPAY_CODE = "alipay";
	public static final String PAY_MODE_ALIPAY_NAME = "支付宝支付";// 支付宝手机支付
	public static final Integer PAY_MODE_UPACP = 2;
	public static final String PAY_MODE_UPACP_CODE = "upacp";
	public static final String PAY_MODE_UPACP_NAME = "银联支付";// 银联全渠道支付
	public static final Integer PAY_MODE_WX_PUB = 3;
	public static final String PAY_MODE_WX_PUB_CODE = "wx_pub";
	public static final String PAY_MODE_WX_PUB_NAME = "微信支付";// 微信公众号支付

	// 会员支付方式
	public static final Integer CAT_PAY_MONEY_MODE = 1;
	public static final String CAT_PAY_MONEY_MODE_NAME = "现金支付";
	public static final Integer CAT_PAY_BANK_MODE = 2;
	public static final String CAT_PAY_BANK_MODE_NAME = "网上支付";

	// 预约消费是否支付定金
	public static final Integer CAT_EARNEST_PAY = 1;
	public static final String CAT_EARNEST_PAY_NAME = "支付定金";
	public static final Integer NO_CAT_EARNEST_PAY = 0;
	public static final String NO_CAT_EARNEST_PAY_NAME = "不支付定金";

	public static final String CAT_TYPE_OPTION = "<option value=\"\" selected=\"selected\">==请选择==</option>"
			+ "<option value=\"1\">在店消费</option>" + "<option value=\"2\">预约消费</option>";

	// 商品评价定义
	public static final int PRODUCT_ISCOMMENT_YES = 1;
	public static final String PRODUCT_ISCOMMENT_YES_NAME = "已评价";
	public static final int PRODUCT_ISCOMMENT_NO = 2;
	public static final String PRODUCT_ISCOMMENT_NO_NAME = "未评价";

	public static final String PRODUCT_ISCOMMENT_OPTION = "<option value=\"\" selected=\"selected\">==请选择==</option>"
			+ "<option value=\"1\">已评价</option>" + "<option value=\"2\">未评价</option>";
	// 商品回复定义
	public static final int PRODUCT_ISREPAY_YES = 1;
	public static final String PRODUCT_ISREPAY_YES_NAME = "已回复";
	public static final int PRODUCT_ISREPAY_NO = 2;
	public static final String PRODUCT_ISREPAY_NO_NAME = "未回复";

	public static final String PRODUCT_ISREPAY_OPTION = "<option value=\"\" selected=\"selected\">==请选择==</option>"
			+ "<option value=\"1\">已回复</option>" + "<option value=\"2\">未回复</option>";

	// 商户审核状态定义
	public static final String MERCH_AUDIT_STATUS_OPTION = "<select class=\"tab-order\"\n"
			+ "    name=\"auditStatus\" id=\"auditStatus\" style=\"width: 80%\">\n"
			+ "    <option value=\"\">全选</option>\n" + "    <option value=\"0\">待审核</option>\n"
			+ "    <option value=\"1\">已审核</option>\n" + "    </select>";

	// 商户审核结果
	public static final String MERCH_AUDIT_RES_OPTION = "<select class=\"tab-order\"\n"
			+ "    name=\"auditRes\" id=\"auditRes\" style=\"width: 80%\">\n" + "    <option value=\"\">全选</option>\n"
			+ "    <option value=\"0\">未审核</option>\n" + "    <option value=\"1\">审核通过</option>\n"
			+ "    <option value=\"2\">审核未通过</option>\n" + "    </select>";
	// 商户审核结果定义
	// 审核成功
	public static final Integer MERCH_AUDIT_RES_SUCCESS = 1;
	// 审核失败
	public static final Integer MERCH_AUDIT_RES_FAIL = 2;
	// 待审核
	public static final Integer MERCH_AUDIT_RES_READY = 0;
	// 银行卡类型定义
	public static final Integer ACCOUNT_TYPE_DEBIT = 1;
	public static final String ACCOUNT_TYPE_DEBIT_NAME = "借记卡";
	public static final Integer ACCOUNT_TYPE_CREDIT = 2;
	public static final String ACCOUNT_TYPE_CREDIT_NAME = "信用卡";

	public static final String ACCOUNT_TYPE_OPTION = "<option value=\"\" selected=\"selected\">==请选择==</option>"
			+ "<option value=\"1\">借记卡</option>" + "<option value=\"2\">信用卡</option>";

	public static String getAccountType(Integer dataStatus) {
		String str = "";
		if (dataStatus.equals(ACCOUNT_TYPE_DEBIT)) {
			str = "<option value=\"" + ACCOUNT_TYPE_DEBIT + "\" checked=\"checked\" />" + ACCOUNT_TYPE_DEBIT_NAME + "\n"
					+ "<option value=\"" + ACCOUNT_TYPE_CREDIT + "\" />" + ACCOUNT_TYPE_CREDIT_NAME;
		} else if (dataStatus.equals(ACCOUNT_TYPE_CREDIT)) {
			str = "<option value=\"" + ACCOUNT_TYPE_CREDIT + "\"/>" + ACCOUNT_TYPE_CREDIT_NAME + "\n"
					+ "<option value=\"" + ACCOUNT_TYPE_DEBIT + "\" checked=\"checked\" />" + ACCOUNT_TYPE_DEBIT_NAME;
		}
		return str;
	}

	// 排序方式
	public static final String PRODUCT_SORT_BY = "<option value=\"\" selected=\"selected\">==请选择==</option>"
			+ "<option value=\"0\">上架时间</option>" + "<option value=\"1\">人气</option><option value=\"2\">菜品评分</option>";
	// 商品状态
	public static final String PRODUCT_STATUS = "<option value=\"\" selected=\"selected\">==全部==</option>"
			+ "<option value=\"0\">禁用</option>" + "<option value=\"1\">未上架</option><option value=\"2\">已上架</option>";
	// app获取商户商品图片url路径
	public static final String APP_IMAGE_URL = "http://139.196.21.11:8080/bdAttach/downloadAttach.do?att_id=";
	// app获取广告首页引导页图片url路径
	public static final String APP_ADVERIMAGE_URL = "http://139.196.21.11:8080/h5SysMng/set/downloadCsAttach.do?cs_att_id=";
	// app所属平台名称
	// Android
	public static final String APP_APK = "Android";
	// IOS
	public static final String APP_IPA = "IOS";
	// 欢迎图片的说明
	public static final String WELCOME_IMAGE = "welcome_image";
	
	// 系统管理员用户id(不变)
	public static final long ADMIN_USER_ID = 1;
	// 系统管理员角色id(不变)
	public static final long ADMIN_ROLE_ID = 21400;

}
