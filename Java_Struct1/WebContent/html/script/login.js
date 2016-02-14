/********************************************************
 * login.js
 ********************************************************/
$(document).ready(function(){
	//Login Button
	$("input[name='LoginBtn']").click(function(){
		var actinon="login.do";
		var params="";
		params+="actionId=2";
		params+="&name="+$("input[name='name']").val();
		params+="&pwd="+$("input[name='pwd']").val();
		params+="&actionName="+$("input[name='actionName']").val();

		var rs= getAjaxRS(actinon,params);
		if(rs.loginFlg==1){
			var mfather=window.dialogArguments; 
			mfather.document.getElementById('menu_login').innerHTML="LogOut";
			window.close();
		}else{
			alert("error...");
		}
		
	});
	
	//Close Button
	$("input[name='CloseBtn']").click(function(){
		window.close();
	});
});

