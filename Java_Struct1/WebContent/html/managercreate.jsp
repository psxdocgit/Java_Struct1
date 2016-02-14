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
	<html:form action="managercreate.do" enctype="multipart/form-data" method="post">
	<div id="popcontend" style="text-align:center;">
			<table class="mtalbe">
				<tr>
					<td style="word-break:break-all;">
						<logic:messagesPresent message="true">
						    <html:messages id="aMsg" message="true">
						        <logic:present name="aMsg">
						            <!-- Messages -->
						            <div class="messages">
						                <bean:write name="aMsg" filter="false" />
						            </div>
						        </logic:present>
						    </html:messages>
						</logic:messagesPresent>
					</td>
				</tr>
			</table>
			<table class="mtalbe">
				<!-- 登入主题 -->
				<tr>
					<th id="th1" colspan="2">登入</th>
				</tr>
				<!-- 主题 -->
				<tr>
					<td class="left">主<br/>题 </td>
					<td class="right">
						<html:text property="title" size="32" maxlength="24" />
					</td>
				</tr>
				<!-- 内容 -->
				<tr>
					<td class="left">内<br/>容 </td>
					<td class="right">
						<html:textarea cols="28" rows="8" property="content" />
					</td>
				</tr>
				<!-- 紧急度 -->
				<tr>
					<td class="left">紧<br/>急<br/>度 </td>
					<td class="right">
						&nbsp;&nbsp;
						<label>底 </label><html:radio property="urgency" value="1" />
						<label>中 </label><html:radio property="urgency" value="2" />
						<label>高 </label><html:radio property="urgency" value="3" />
					</td>
				</tr>
				<!-- 类型<多选框> -->
				<tr>
					<td class="left">类<br/>型</td>
					<td class="right">
						&nbsp;&nbsp;<html:multibox property="types" value="1"/><label>Java1 </label><br/>
						&nbsp;&nbsp;<html:multibox property="types" value="2"/><label>Java2 </label><br/>
						&nbsp;&nbsp;<html:multibox property="types" value="3"/><label>Java3 </label><br/>
						&nbsp;&nbsp;<html:multibox property="types" value="4"/><label>Java4 </label>
					</td>
				</tr>
				<!-- 分数<下拉列表> -->
				<tr>
					<td class="left">分<br/>数</td>
					<td class="right">
						<html:select property="fraction" style="width: 180px;">
							<html:option value= "0">&nbsp;</html:option>
							<html:option value= "1">&nbsp;01</html:option>
							<html:option value= "2">&nbsp;02</html:option>
							<html:option value= "3">&nbsp;03</html:option>
							<html:option value= "4">&nbsp;04</html:option>
							<html:option value= "5">&nbsp;05</html:option>
							<html:option value= "6">&nbsp;06</html:option>
							<html:option value= "7">&nbsp;07</html:option>
							<html:option value= "8">&nbsp;08</html:option>
							<html:option value= "9">&nbsp;09</html:option>
							<html:option value="10">&nbsp;10</html:option>						
						</html:select>
					</td>
				</tr>
				<!-- 上传文件<多文件> -->
				<tr>
					<td class="left">上<br/>传<br/>文<br/>件 </td>
					<td class="right">
						
						&nbsp;&nbsp;<html:file property="uploadFile[0]" style="width:240px;" /><br/>
						&nbsp;&nbsp;<html:file property="uploadFile[1]" style="width:240px;" /><br/>
						
						
					</td>
				</tr>
				<!-- 按钮 -->
				<tr>
					<td>
						<html:button property="closeBtn" onclick="javascript:self.close();" value="Close"/>
					</td>
					<td>
						<html:button property="queryBtn" onclick="javascript:jQSubmit();" value="Query"/>
					</td>
				</tr>	
			</table>
			
			<!-- Hidden -->
			<html:hidden property="actionId" value="1"/>	
		
	　　</div>
		<!--PageBody end-->
		</html:form>
</div>
<!--container end-->
</body>
</html>