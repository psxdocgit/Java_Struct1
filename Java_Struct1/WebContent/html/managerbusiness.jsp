<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html"%>
<%@taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean"%>
<%@taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ManagerCreate</title>
<link href="<%=request.getContextPath() %>/html/style/common.css" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath() %>/html/style/managercreate.css" rel="stylesheet" type="text/css" />
<script src="<%=request.getContextPath() %>/html/script/jquery-1.11.3.min.js"></script>
<script src="<%=request.getContextPath() %>/html/script/common.js"></script>
<script language="javascript">

function winclose(){
	if( opener != null ){
		$("form",opener.document).submit();
	}
	self.close();
}
</script>
</head>
<body>
<!--container start-->
<div id="container">	
	<!--PageBody start-->
	<html:form action="managerbusiness.do" enctype="multipart/form-data" method="post">
		MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
	</html:form>
</div>
<!--container end-->
</body>
</html>