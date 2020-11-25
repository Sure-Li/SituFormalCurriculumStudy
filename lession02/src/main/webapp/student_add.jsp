<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- <form action="StuDao.jsp" method ="post"> -->
<form action="StudentAddServlet" method ="post">
<!-- get 方式速度快 缺点 不安全 有大小限制 -->
<!-- post 将表单数据做成一个数据块进行提交，速度稍慢，安全，大小无限制 -->
姓名：<input name="stuName"/>
密码:<input name = "stuAge"/>
<input type="submit" value = "tijoao " />
<input type="reset"  value = "chongzhi "/>
</form>

</body>
</html>