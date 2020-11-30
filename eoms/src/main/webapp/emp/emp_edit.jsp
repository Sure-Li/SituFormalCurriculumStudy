<%@page import="com.situ.eoms.pojo.Employee"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.HashSet"%>
<%@page import="java.util.Set"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
Object obj = request.getAttribute("empEdit");
Employee employeeGet =null;
if(obj!=null){
    employeeGet = (Employee)obj;
}

%>
<form action="EmpServlet?empAction=doUpdate" method ="post">
<!-- get 方式速度快 缺点 不安全 有大小限制 -->
<!-- post 将表单数据做成一个数据块进行提交，速度稍慢，安全，大小无限制 -->
员工部门ID：<input name="empDepIdEdit" value="<%=employeeGet.getEmpDepId()%>">
员工姓名：<input name="empNameEdit" value="<%=employeeGet.getEmpName()%>"/><br>
员工id:<input name = "empIdEdit" value="<%=employeeGet.getEmpId()%>"/><br>
员工密码:<input name = "empPasswordEdit"value="<%=employeeGet.getEmpPassword()%>"/><br>
员工入职日期:<input name = "empJoinTimeEdit"value="<%=employeeGet.getEmpJoinTime()%>"/><br>
员工等级:<input name = "empLevelEdit"value="<%=employeeGet.getEmpLevel()%>">
<input type="submit" value = "tijoao " />
<input type="reset"  value = "chongzhi "/>
</form>

</body>
</html>