<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- test。jsp--target。jsp -->
	<!-- test。jsp-testServlet-target。jsp -->
	<a href="TestServlet">转发结果页面</a>
	<a href="TestServlet1">重定向结果页面</a>
	<!-- 转发 重定向的区别 -->
	<!-- 重定向 抛弃原来的request和response对象 重新生成 重新连接 -->
	<!-- 转发是进新页面时拿着原来的request和response对象 -->
</body>
</html>