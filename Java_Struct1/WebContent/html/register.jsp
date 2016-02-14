<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html"%>
<%@taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean"%>
<%@taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
<link href="<%=request.getContextPath() %>/html/style/common.css" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath() %>/html/style/register.css" rel="stylesheet" type="text/css" />
<script src="<%=request.getContextPath() %>/html/script/jquery-1.11.3.min.js"></script>
<script src="<%=request.getContextPath() %>/html/script/common.js"></script>
<script language="text/javascript">
	var actionFlg='<bean:write name="reply" property="forward"/>';
</script>
</head>
<body>
<!--container start-->
<div id="container">
	<!--Header start-->
　　<div id="Header">
		<div id="menu">
   			<ul>
      			<li><a href="#">お問い合わせ</a></li>
  				<li class="menuDiv"></li>
  				<li><a href="#">会社概要</a></li>
  				<li class="menuDiv"></li>
  				<li><a href="#">サービス概要</a></li>
				<li class="menuDiv"></li>
  				<li><a href="javascript:void(0);">Register</a></li>
				<li class="menuDiv"></li>
  				<li><a href="#" onclick="showLogin();return;"><label id="menu_login">Login</label></a></li>
   			</ul>
  		</div>
　　</div>
	<!--Header end-->
	
	<!-- banner start -->
	<div id="banner">
		
	</div>

	<div id="bannerimage">
		<img src="<%=request.getContextPath() %>/html/images/business1.png" />
	</div>
	<!-- banner end -->
	
	<!--PageBody start-->
　　<div id="PageBody">
		<html:form action="register.do">
			<H2></H2><bean:message key='register.title' /></H2>
			
			<div id="register">
				<table id="_talbe" >
					<tr class="left">
						<td class="leftlable"><bean:message key='label.register.name' /></td>
						<td><html:text property="name" /></td>
					</tr>
					<tr class="left">
						<td class="leftlable"><bean:message key='label.register.password' /></td>
						<td><html:text property="pwd" /></td>
					</tr>
					<tr class="left">
						<td class="leftlable"><bean:message key='label.register.rank' /></td>
						<td><html:text property="rank" /></td>
					</tr>
					<tr>
						<td><html:button property="register" value="Regist" /> </td>
						<td><html:button property="register" value='clear' />  </td>
					</tr>
				</table>
			</div>
		</html:form>
　　</div>
	<!--PageBody end-->

	<!--Footer start-->
　　<div id="Footer">
		<p class="textmodai2">
			
		</p>
		<p class="textmodai2">
			Copyright (c)  Rights Reserved
		</p>
　　</div>
	<!--Footer end-->
</div>
<!--container end-->
</body>
</html>