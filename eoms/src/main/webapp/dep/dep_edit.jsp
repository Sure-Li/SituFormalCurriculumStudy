<%@page import="com.situ.eoms.pojo.Department"%>
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
Object obj = request.getAttribute("depEdit");
Department department =null;
if(obj!=null){
	department = (Department)obj;
	System.out.print("department------"+department.toString());
}
%>
<form action="DepServlet?depAction=doUpdate" method ="post">
<!-- get 方式速度快 缺点 不安全 有大小限制 -->
<!-- post 将表单数据做成一个数据块进行提交，速度稍慢，安全，大小无限制 -->
<input type="hidden" name="rowIdEdit" value="<%=department.getRowId()%>">
部门id:<input name = "depIdEdit"value="<%=department.getDepId()%>"/><br>
部门名称：<input name="depNameEdit" value="<%=department.getDepName() %>"/><br>
部门简介：<input type="text" name="depInfoEdit"value="<%=department.getDepInfo() %>"/><br>
<input type="submit" value = "tijoao " />
<input type="reset"  value = "chongzhi "/>
</form>

</body>
</html>