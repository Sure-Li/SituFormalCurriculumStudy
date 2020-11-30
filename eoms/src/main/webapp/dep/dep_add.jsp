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
<form action="../DepServlet?depAction=add" method ="post">
<!-- get 方式速度快 缺点 不安全 有大小限制 -->
<!-- post 将表单数据做成一个数据块进行提交，速度稍慢，安全，大小无限制 -->

部门id:<input name = "depId"/><br>
部门名称：<input name="depName"/><br>
部门简介：<input type="text" name="depInfo"/><br>

<input type="submit" value = "tijoao " />
<input type="reset"  value = "chongzhi "/>
</form>

</body>
</html>