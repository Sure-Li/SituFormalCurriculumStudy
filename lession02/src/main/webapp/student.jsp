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
<a href="StudentBeforeAddServlet" class="add" style="float: right">新增</a>
	<table class="mainTable" id="studentTable">
	   <tr>
            <th>学生ID</th>
            <th>学生班级ID</th>
            <th>学生账号ID</th>
            <th>学生账号密码</th>
            <th>学生姓名</th>
            <th>学生年龄</th>
            <th>学生生日</th>
            <th>操作</th>
        </tr>
	   <% 
	   Object obj = request.getAttribute("studentlist");
	   if(obj!=null){
		   List<Student> getStudentList = (List<Student>)obj;
		   if(getStudentList!=null&&getStudentList.size()>0){
			   for(Student student:getStudentList){%>
				   <tr>
				    <td><%= student.getRow_id() %></td>
				    <td><%= student.getClazzId() %></td>
				    <td><%= student.getStuCode() %></td>
				    <td><%= student.getStuPassword() %></td>
		            <td><%= student.getStuName() %></td>
		            <td><%= student.getStuAge() %></td>
		            <td><%= student.getStuBirthday() %></td>
		            <td>
		            <a href ="javaScript:" class="delete"data-id=<%= student.getRow_id() %>>删除</a><a href ="StudentGoEditServlet?rowId=<%= student.getRow_id() %> ">修改</a>
		            <%-- StudentDelServlet?delName=<%= student.getRow_id() %> --%>
		            </td>
		            </tr>
					   <%}
		   }
	   }
	   %>
</table>
</body>
<script type="text/javascript" src="js\jQuery\jquery-3.4.1.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	$("#studentTable").off('click','.delete').on('click','.delete',function(){
		var id = $(this).data('id');
		console.log(id);
		if(confirm("请确认是否删除")){
		    //使用js发起url请求
			window.location.href="StudentDelServlet?delName="+id;
		}else{
			console.log("BBB");
		}
	})
});
</script>
</html>