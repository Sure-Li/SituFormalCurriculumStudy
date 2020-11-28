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
Object obj = request.getAttribute("clazzIdSet");
Set<Long> resultSet = new HashSet<Long>();
if(obj!=null){
	String[] result  = obj.toString().split(",");
	for(String s:result){
		resultSet.add(Long.parseLong(s));
	}
}

%>
<!-- <form action="StuDao.jsp" method ="post"> -->
<form action="StudentAddServlet" method ="post">
<!-- get 方式速度快 缺点 不安全 有大小限制 -->
<!-- post 将表单数据做成一个数据块进行提交，速度稍慢，安全，大小无限制 -->
学生班级ID：<select name="StuClassId">
                <%
                Iterator it = resultSet.iterator();
                while(it.hasNext()){
                	Long clazzId = Long.parseLong(it.next().toString());
                %>
                	<option value="<%=clazzId%>"><%=clazzId%></option>
                <%}
                %>
</select>
姓名：<input name="stuName"/>
年龄:<input name = "stuAge"/>
账号id:<input name = "stuCode"/>
账号密码:<input name = "stuPassword"/>
账号生日:<input name = "stuBirthday"/>
<input type="submit" value = "tijoao " />
<input type="reset"  value = "chongzhi "/>
</form>

</body>
</html>