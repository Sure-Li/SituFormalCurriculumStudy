<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户登录页面</title>
<%@ include file="/base.jsp"%>
</head>
<body style="text-align: center;">
	<form action="EmpDoLoginServlet" method="post">
		<h1>
			<%
Object obj = request.getAttribute("loginInfo");
if(obj!=null){%>
			<%=obj.toString() %>
			<%}
%>
		</h1>
		用户名称：<input type="text" name="empId"><br> 用户密码：<input type="password" name="empPassword"><br> 
		自动登录<input type="checkbox" name="isAtuoLogin"> <br>
		<input type="submit" value="登录"> <input type="reset">
	</form>
</body>
</html>