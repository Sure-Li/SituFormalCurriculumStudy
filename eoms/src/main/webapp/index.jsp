<%@page import="com.situ.eoms.util.EmpUtil"%>
<%@page import="com.situ.eoms.pojo.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>员工管理首页</title>
<%@ include file="/base.jsp" %>
<link rel="stylesheet" type="text/css" href="css/index.css">
</head>
<body>
<div class = "div1">
<ul>
<li><a href = "DepServlet?depAction=select" target="mainFrame">部门管理 </a></li>
<li><a href = "EmpServlet?empAction=select" target="mainFrame">员工管理</a></li>
</ul>
</div>
<div class = "div2">
<h3>EOMS管理系统</h3>
<span class="loginFinishSpan">
<%
Object obj = session.getAttribute(EmpUtil.LOGIN_STUDENT);
if(obj!=null){
    Employee employee = (Employee)obj;
    %>
    <%=employee.getEmpName() %>
    
    <a href="javaScript: exitLogin()">退出</a>
<%}
%>
</span>
</div>
<div class = "div3" >
<iframe name = "mainFrame" class = "main">
</iframe>
</div>
</body>
<script type="text/javascript">
    function exitLogin(){
        console.log(11111);
        window.location.href="emp/emp_login.jsp"; 
        <%
        //将session中信息清除掉
        session.setAttribute(EmpUtil.LOGIN_STUDENT, null);
        %>
    }
   
    </script>
</html>