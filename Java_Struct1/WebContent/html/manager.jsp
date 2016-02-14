<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html"%>
<%@taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean"%>
<%@taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Manager</title>
<link href="<%=request.getContextPath() %>/html/style/common.css" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath() %>/html/style/manager.css" rel="stylesheet" type="text/css" />
<script src="<%=request.getContextPath() %>/html/script/jquery-1.11.3.min.js"></script>
<script src="<%=request.getContextPath() %>/html/script/common.js"></script>
<script src="<%=request.getContextPath() %>/html/script/manager.js"></script>
<script language="text/javascript">
//<!-- 

//-->
</script>
</head>
<body>
<!--container start-->
<div id="container">
	<!--Header start-->
　　<div id="Header">
		<div id="menu">
   			<ul>
      			<li><a href="javascript:gotoNext('index.do');">Top</a></li>
  				<li class="menuDiv"></li>
  				<li><a href="javascript:gotoNext('index.do');">会社概要</a></li>
  				<li class="menuDiv"></li>
  				<li><a href="javascript:void(0);">Manage</a></li>
				<li class="menuDiv"></li>
  				<li><a href="javascript:gotoNext('register.do');">Register</a></li>
				<li class="menuDiv"></li>
  				<li>
  					<a href="#" onclick="showLogin();return;"><label id="menu_login">
  						<logic:equal name="reply" property="loginFlg" value="true">LogOut</logic:equal>
  						<logic:equal name="reply" property="loginFlg" value="false">Login</logic:equal>
  					</label></a>
  				</li>
   			</ul>
  		</div>
　　</div>
	<!--Header end-->
	
	<!-- banner start -->
	<div id="banner">
		
	</div>

	<!-- banner end -->
	
	<!--PageBody start-->
　　<div id="PageBody">
		<html:form action="manager.do" method="poset">
			<div id="slt_div">
				<label>ID:&nbsp;</label>
				<html:text property="titleId" size="16" maxlength="8" />
				<label>&nbsp;种类:&nbsp;</label>
				<html:select property="fileType" style="width: 180px;" >
					<html:option value="B">&nbsp;</html:option>
					<html:option value="J">Java</html:option>
					<html:option value="C">C/C++</html:option>
					<html:option value="S">Shell</html:option>
					<html:option value="P">Perl</html:option>
					<html:option value="O">Oracle</html:option>
				</html:select>
				<label>&nbsp;状态:&nbsp;</label>
				<html:select property="status" style="width: 180px;" >
					<html:option value="B">&nbsp;</html:option>
					<html:option value="J">入力(ENTRY)</html:option>
					<html:option value="S">开始(START)</html:option>
					<html:option value="W">等待(WAITING)</html:option>
					<html:option value="C">确认(COMERED)</html:option>
					<html:option value="D">取消(CANCEL)</html:option>
				</html:select>
				&nbsp;
				&nbsp;
				&nbsp;
				&nbsp;
				<html:button property="queryBtn" value="检查"/>
				&nbsp;
				&nbsp;
				<html:button property="creatBtn" value="新规"/>
			</div>
			<div id="content_div">
				<table >
					<tr>
						<th >选择</th>
						<th >Q / A</th>
						<th >タイトル</th>
						<th >コンテンツ</th>
						<th >ファイル</th>
						<th >ステータス</th>
						<th >更新时间</th>
					</tr>
					
					<logic:notEmpty name="reply" property="infoList">
						<logic:iterate id="titleInfo" name="reply" property="infoList"> 
							<tr>
								<!-- 选择 -->
								<td class="content1"><html:radio property="selectedTitleId" value="${titleInfo.titleId}"/></td>
								<!-- QA -->
								<td class="content2">
									<logic:notEmpty name="titleInfo" property="userQ">
										<lable>Q:</lable><br/>
										<a href="javascript:showBusiness('${titleInfo.titleId}');"><bean:write name="titleInfo" property="userQ"/></a><br/>
									</logic:notEmpty>
									<logic:notEmpty name="titleInfo" property="userA">
										<lable>A:</lable><br/>
										<a href="javascript:showBusiness('${titleInfo.titleId}');"><bean:write name="titleInfo" property="userA"/></a>
									</logic:notEmpty>
								</td>
								<!-- タイトル -->
								<td class="content3"><a href="javascript:showBusiness('${titleInfo.titleId}');"><bean:write name="titleInfo" property="title"/></a></td>
								<!-- コンテンツ -->
								<td class="content4"><a href="javascript:showBusiness('${titleInfo.titleId}');"><bean:write name="titleInfo" property="content"/></a></td>
								<!-- ファイル-->
								<td class="content5">
									<logic:notEmpty name="titleInfo" property="fileNames">
										<logic:iterate id="fileName" name="titleInfo" property="fileNames">
											<a href="javascript:fileDL('${fileName}');"><bean:write name="fileName"/></a>&nbsp;<br/>
										</logic:iterate>
									</logic:notEmpty>
								</td>
								<!-- ステータス -->
								<td class="content6"><a href="javascript:showBusiness('${titleInfo.titleId}');"><bean:write name="titleInfo" property="status"/></a></td>
								<!-- 更新时间 -->
								<td class="content7">
									<a href="javascript:showBusiness('${titleInfo.titleId}');"><bean:write name="titleInfo" property="updateYMD"/></a><br/>
									<a href="javascript:showBusiness('${titleInfo.titleId}');"><bean:write name="titleInfo" property="updateHMS"/></a>
								</td>
							</tr>
						</logic:iterate>
					</logic:notEmpty>
				</table>
			</div>
		
		<!-- Hidden -->
		<html:hidden property="actionId" value="1"/>	
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