/********************************************************
 * manager.js
 ********************************************************/
$(document).ready(function(){
	//提交
	$("input[name='queryBtn']").click(function(){
		if( btnFlg){
			alert("already clicked!");
			return;
		}
		
		btnFlg=true;
		$("form").actionId=3;
		$("form").submit();
	});
	//新规
	$("input[name='creatBtn']").click(function(){
		if( btnFlg){
			alert("already clicked!");
			return;
		}
		//对话框
		showCreat();
		
	});
	
});


/********************************************************
 * showCreat()
 ********************************************************/
function showCreat(){
		var sFeatures="";
		sFeatures += "height=500px"		//对话框高度
		sFeatures += ",width=480px"			//对话框宽度
		sFeatures += ",status=no"
		sFeatures += ",help=no"
		sFeatures += ",resizable=no"			//是否可被改变大小
		sFeatures += ",scroll=no"				//指明对话框是否显示滚动条
		sFeatures += ",location=no"				//地址栏是否可见 
		sFeatures += ",menubar=no"				//菜单栏是否可见 
		sFeatures += ",titlebar=no"				//窗口题目栏是否可见
		sFeatures += ",toolbar=no"				//窗口题目栏是否可见
		sFeatures += ",depended=yes"			//父窗口同时关闭 
		sFeatures += ",alwaysRaised=yes"		//窗口悬浮在所有窗口之上 
		sFeatures += ",directories=no"			//Nav2和3的目录栏是否可见 

		//dailog
		var chair=window.open('managercreate.do?actionId=3','create',sFeatures);
		chair.focus();
}

/********************************************************
 * showBusiness()
 ********************************************************/
function showBusiness(supportId){
	//check
	var selectedTitleId =$("input[name='selectedTitleId']:checked").val();
	if(supportId!=selectedTitleId){
		alert("*****************"+selectedTitleId+"******");
		return;
	}
		var sFeatures="";
		sFeatures += "height=500px"		//对话框高度
		sFeatures += ",width=480px"			//对话框宽度
		sFeatures += ",status=no"
		sFeatures += ",help=no"
		sFeatures += ",resizable=no"			//是否可被改变大小
		sFeatures += ",scroll=no"				//指明对话框是否显示滚动条
		sFeatures += ",location=no"				//地址栏是否可见 
		sFeatures += ",menubar=no"				//菜单栏是否可见 
		sFeatures += ",titlebar=no"				//窗口题目栏是否可见
		sFeatures += ",toolbar=no"				//窗口题目栏是否可见
		sFeatures += ",depended=yes"			//父窗口同时关闭 
		sFeatures += ",alwaysRaised=yes"		//窗口悬浮在所有窗口之上 
		sFeatures += ",directories=no"			//Nav2和3的目录栏是否可见 

		var url="managerbusiness.do?actionId=3";
		url +="&supportId="+supportId;
		//dailog
		var chair=window.open(url,'business',sFeatures);
		chair.focus();
}
