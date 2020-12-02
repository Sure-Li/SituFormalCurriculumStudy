<%@page import="java.util.ArrayList"%>
<%@page import="com.situ.lession02.student.pojo.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>
</head>
<body>
<%
List<Integer> test= new ArrayList <Integer>();
test.add(1);
test.add(2);
test.add(3);
request.setAttribute("list", test);
Integer.parseInt("1");
%>
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
        <c:if test="${!empty studentlist}">
        <c:forEach items="${studentlist}" var="student">
        <tr>
	        <td>
	        ${student.row_id}
	        </td>
	        <td>
	        ${student.stuName}
	        </td>
	        <td>
	        ${student.stuAge}
	        </td>
	   </tr>
        
        </c:forEach>
        </c:if>
</table>
${list.contains(Integer.parseInt("1"))} 
<input type="checkbox" name="userLike" value="1" ${list.contains(Integer.parseInt('1'))?"checked='checked'":""}>读书
<input type="checkbox" name="userLike" value="2" checked="${list.contains(Integer.parseInt('2'))}?'checked':'false' ">2
<input type="checkbox" name="userLike" value="3" checked="${list.contains(Integer.parseInt('3'))}?'checked':'' ">3
<input type="checkbox" name="userLike" value="4" checked="${list.contains(Integer.parseInt('4'))}?'checked':'' ">4
<input type="checkbox" name="userLike" value="5" checked="${list.contains(Integer.parseInt('5'))}?'checked':'' ">5
<input type="checkbox" name="userLike" value="6" checked="${list.contains(Integer.parseInt('6'))}?'checked':'' ">6
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