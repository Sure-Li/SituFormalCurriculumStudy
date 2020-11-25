<%@page import="com.situ.lession02.student.pojo.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="student_add.jsp" class="add" style="float: right">新增</a>
	<table class="mainTable">
	   <tr>
            <td>学生ID<td/>
            <td>学生姓名<td/>
            <td>学生年龄<td/>
            <td>操作<td/>
        <tr/>
	   <% 
	   Object obj = request.getAttribute("studentlist");
	   if(obj!=null){
		   List<Student> getStudentList = (List<Student>)obj;
		   if(getStudentList!=null&&getStudentList.size()>0){
			   for(Student student:getStudentList){%>
				   <tr>
				    <td><%= student.getRow_id() %><td/>
		            <td><%= student.getStuName() %><td/>
		            <td><%= student.getStuAge() %><td/>
		            <td>
		            <a href ="javaScript: ">删除</a><a href ="javaScript: ">修改</a>
		            <td/>
		            <tr/>
					   <%}
		   }
	   }
	   %>
</table>
</body>
</html>