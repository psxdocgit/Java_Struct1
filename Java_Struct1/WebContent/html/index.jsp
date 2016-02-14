<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html"%>
<%@taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean"%>
<%@taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
<link href="<%=request.getContextPath() %>/html/style/common.css" rel="stylesheet" type="text/css" />
<script src="<%=request.getContextPath() %>/html/script/jquery-1.11.3.min.js"></script>
<script src="<%=request.getContextPath() %>/html/script/common.js"></script>
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
  				<li><a href="javascript:gotoNext('manager.do');">Manage</a></li>
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

	<div id="bannerimage">
		<img src="<%=request.getContextPath() %>/html/images/business1.png" />
	</div>
	<!-- banner end -->
	
	<!--PageBody start-->
　　<div id="PageBody">
		<!--Sidebar-->
　　　　<div id="Sidebar">
			<div class="textmodai">
				<p class="textmodai1">ご不明な点・ご質問等<br />お気軽にお問い合わせ下さい</p>
				<p class="textmodai2">
					<input type="image" src="<%=request.getContextPath() %>/html/images/con_btn_on.gif" onclick="location.href='#';" onmousemove="this.src='<%=request.getContextPath() %>/html/images/con_btn_on.gif'" onmouseout="this.src='<%=request.getContextPath() %>/html/images/con_btn_on.gif'" />
				</p>	
			</div>
			<div id="navsite">
				<h2>メニュー</h2>
				<ul id="navsite">
					<li><a href="#">ホーム</a></li>
					<li><a href="#">ごあいさつ</a></li>
					<li><a href="#">サービス概要</a></li>
					<li><a href="#">会社概要</a></li>
				</ul>
			</div>
　　　　</div>
		<!--MainBody-->
　　　　<div id="MainBody">
			<h2>Oracle10g实现只读表的N种方法 </h2>
			<P class="leftP">
				有时为了提高数据的安全性，我们需要把一个或多个表设置为只读，即不允许对其执行任何 DML(Insert, Update, Delete) 操作。<br/>
				在Oracle11g中实现只读表非常简单，只需要执行alter table ... read only;语句即可；但是在11g之前的版本，“只读”只对数据库和表空间有效，如果我们要实现一个只读表，只能通过其他办法。<br/>
				下面就介绍在Oracle10g中实现只读表的几种常用方法。<br/>
				<strong>测试环境</strong><br/>
				SQL> select * from v$version;<br/>
				<br/>
				<strong>方法一：授予Select权限</strong><br/>
				SQL> grant select on hoegh to scott;<br/>
				<br/>
				<strong>方法二： 触发器</strong><br/>
				 SQL> CREATE OR REPLACE TRIGGER HOEGH_TRG<br/>
                 BEFORE DELETE OR INSERT OR UPDATE<br/>
                 ON HOEGH<br/>
                 REFERENCING NEW AS NEW OLD AS OLD<br/>
                 FOR EACH ROW<br/>
                 DECLARE<br/>
                 BEGIN<br/>
                 RAISE_APPLICATION_ERROR (-20001, 'Table is read only table.');<br/>
                 END;<br/>
                 /<br/>
                 <br/>
               <strong>方法三：检查约束</strong><br/>
               ALTER TABLE HOEGH ADD CONSTRAINT READ_ONLY_CONST CHECK(0=0) DISABLE VALIDATE;<br/>
               <br/>
               <strong>方法四：只读表空间</strong><br/>
               alter tablespace users read only;<br/>
			</P>
			<p>
				<img src="<%=request.getContextPath() %>/html/images/kako.png"/><br/>
			</p>
			<h2>一步一个脚印</h2>
			<p>
				蜗牛不相信自己的缓慢，一步一个脚印的向自己的目标爬行，终于到达了自己的目的地，<br/>
				水滴不相信自己的脆弱，日复一日，年复一年，一步一个脚印的撞击石块，终于造就了水滴石穿的奇迹，<br/>
				蚕蛹不相信坚硬的外壳，一步一个脚印，每天努力一点，终于获得了破茧重生的光明，<br/>
				在生活中，也许你没有一个好的开始，但只要你一步一个脚印，每天努力一点，你终会获得成功。<br/>
			</p>
　　　　</div>
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