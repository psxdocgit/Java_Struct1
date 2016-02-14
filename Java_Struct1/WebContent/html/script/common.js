/********************************************************
 * common.js
 ********************************************************/

/********************************************************
 * Variable
 ********************************************************/
var btnFlg=false;

/********************************************************
 * jQSubmit
 ********************************************************/

function jQSubmit(name){
	alert("**********");
	if( btnFlg){
		alert("already clicked!");
		return;
	}
	btnFlg=true;
	
	var tag="form";
	if(name!=undefined){
		tag += "[name='"+name.trim+"']";
	}		
	
	$("input[name='actionId']").val(1);
	$(tag).submit();
}

/********************************************************
 * gotoNext
 ********************************************************/
function gotoNext(action){
	if( btnFlg){
		alert("already clicked!");
		return;
	}
	
	var rs=confirm("Go Next!");
	if(!rs){
		return ;
	}
	btnFlg=true;
	window.location.href=(action+"?actionId=3");	
	
}

/********************************************************
 * login
 ********************************************************/
function showLogin(){
	if( btnFlg){
		alert("already clicked!");
	}
	btnFlg=true;
	
	if($("#menu_login").html().match("Login")){
		var sFeatures="";
		sFeatures += "dialogHeight:200px;"		//对话框高度
		sFeatures += "dialogWidth:350px;"		//对话框宽度
		sFeatures += "status:no;"
		sFeatures += "help:no;"
		sFeatures += "resizable:no;"			//是否可被改变大小
		sFeatures += "scroll:no;"				//指明对话框是否显示滚动条
		sFeatures += "location:no;"				//地址栏是否可见 
		sFeatures += "menubar:no;"				//菜单栏是否可见 
		sFeatures += "titlebar:no;"				//窗口题目栏是否可见
		sFeatures += "toolbar:no;"				//窗口题目栏是否可见
		//set Flg
		btnFlg=false;	
		//dailog
		window.showModalDialog('login.do?actionId=3', window,sFeatures);
	}else{
		var rs=confirm("是否Logout!");
		if(!rs){
			return ;
		}
		//LogOut
		var actinon="login.do";
		var params="";
		params+="actionId=2";
		btnFlg=false;
		var rs= getAjaxRS(actinon,params);
		try{
			if(rs.loginFlg==0){
				document.getElementById('menu_login').innerHTML="Login";
			}else{
				alert("error...");
			}
		}catch(e){
			alert("error...");
		}
	}
}

/*******************************************
 * take result by ajax
 *******************************************/
function getAjaxRS(actinon,params){
		
		if(btnFlg){
			alert("already clicked!");
			return;
		}
		btnFlg=true;
		var ajaxJson=null;
		
		$.ajax({
			url:actinon+"?"+params,
			data:{"actionType":"1"},
			type:"post",
			async:false,
			dataType:"json",
			error:function(){
				ajaxJson = null;
			},
			success:function(data){
				ajaxJson = data;
			}
		});
		
		btnFlg=false;
		return ajaxJson;
}

/*******************************************
 * fileDL()
 *******************************************/
function fileDL(fileId){
	alert(fileId);
}
