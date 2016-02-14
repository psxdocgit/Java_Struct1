<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html"%>
<%@taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean"%>
<%@taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
<link href="<%=request.getContextPath() %>/html/style/login.css" rel="stylesheet" type="text/css" />
<script src="<%=request.getContextPath() %>/html/script/jquery-1.11.3.min.js"></script>
<script src="<%=request.getContextPath() %>/html/script/common.js"></script>
<script src="<%=request.getContextPath() %>/html/script/login.js"></script>
<script language="text/javascript">
</script>
</head>
<body>
<form name="login" action="login">
<!--container start-->
	<div id="head"></div>	
	<div id="login">
		<div class="margin10">
			<input type="text" size="39" maxlength="16" name="name" />
		</div>
		<div class="margin10">
			<input type="password" size="40" maxlength="16" name="pwd" />
		</div>
		<div class="right">
			<table width="100%">
				<tr>
					<td width="50%"></td>
					<td width="25%"><input type="button" name="LoginBtn" value="Login" /></td>
					<td width="25%"><input type="button" name="CloseBtn" value="Close" /></td>
				</tr>
			</table>
		</div>
	</div>
<!--container end-->
<input type="hidden" name="actionName" value="login">
</form>
</body>
</html>