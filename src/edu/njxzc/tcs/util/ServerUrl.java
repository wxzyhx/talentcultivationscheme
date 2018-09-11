package edu.njxzc.tcs.util;

/**
 * excel 文件导出转接地址
 * 
 * @author by
 *
 */
public interface ServerUrl {
	// 结算管理跳转地址
	final String SETTLEMENT_URL = "/pcykat/platformpc/ExcelPcExport/settlementExcelExport.do";
	// 根据订单编号查找订单地址
	final String QUERYORDERBYNO = "/pcykat/platformpc/SettlementController/queryOrderByNo.do";
	//新增结算
	final String ADDSETTLEMENT = "/pcykat/platformpc/SettlementController/addSettlement.do";

}
