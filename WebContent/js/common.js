var PAGESIZE = 10;

var urlRootContext = (function () {
    var strPath = window.document.location.pathname;
    var postPath = strPath.substring(0, strPath.substr(1).indexOf('/') + 1);
    return postPath;
})();

// 清空添加表单
	 function formReset() {
		$(':input')
//		 .not(':button, :submit, :reset, :hidden')
		 .val('')
//	     .removeAttr('checked')
//	     .removeAttr('selected');   
	}
 
	 /*js对于后台返回long（毫秒）时间的转化处理 */
	 function date(date){
	 	console.log(date);
	 	var d = new Date(parseInt(date));
	 	console.log(d);
	 	var year = d.getFullYear();
	 	var month = d.getMonth()+1;
	 	var day = d.getDate();
	 	month=month<10?"0"+month:month
	 	day=day<10?"0"+day:day
	 	return year+"-"+month+"-"+day;
	 }
	 /*对于时间的处理，返回year*/
	 function dateYear(date){
	 	var d = new Date(parseInt(date));
	 	var year = d.getFullYear();
	 	return year;
	 }

	 /*对于时间的处理，返回到month*/
	 function dateMonth(date){
	 	var d = new Date(parseInt(date));
	 	var year = d.getFullYear();
	 	var month=d.getMonth()+1;
	 	month=month<10?"0"+month:month
	 	return year+"-"+month;
	 }
	 
	 //分页选项
	 var PAGESIZE = 10;
	    var options = {
	        currentPage: 1,  //当前页数
	        totalPages: 1,  //总页数，这里只是暂时的，后头会根据查出来的条件进行更改
	        size:"normal",
	        bootstrapMajorVersion: 3,
	        alignment:"center",
	        itemTexts: function (type, page, current) {
	            switch (type) {
	                case "first":
	                    return "第一页";
	                case "prev":
	                    return "前一页";
	                case "next":
	                    return "后一页";
	                case "last":
	                    return "最后页";
	                case "page":
	                    return  page;
	            }
	        },
	        onPageClicked: function (e, originalEvent, type, page) {
	            var userName = $("#textInput").val(); //取内容
	            buildTable(userName,page,PAGESIZE);//默认每页最多10条
	        }
	    }

	function judgeNavigator(){
	    	if(navigator.userAgent.indexOf("Firefox")<0 & navigator.userAgent.indexOf("Chrome")<0){
	    		alert('尊敬的用户，目前本系统只支持Chrome和Firefox浏览器,请下载这两种浏览器中的一种！'); 
	    		return false;
	    	}
	    	else {
	    		return true;		
	    	}
	 }
