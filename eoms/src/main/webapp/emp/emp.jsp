<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="EmpServlet?empAction=beforAdd" class="add" style="float: right">新增</a>
    <table class="mainTable" id="empTable">
   
       <tr>
            <th>员工主键序号</th>
            <th>员工部门</th>
            <th>员工ID</th>
            <th>员工姓名</th>
            <th>员工等级</th>
            <th>员工入职时间</th>
            <th>操作</th>
        </tr>
         <c:if test="${!empty empList}">
        <c:forEach items="${empList}" var="emp">
                    <tr>
                    <td>${emp.rowId}</td>
                    <td>${emp.empDepName}</td>
                    <td>${emp.empId}</td>
                    <td>${emp.empName}</td>
                    <td>${emp.empLevel}</td>
                    <td>${emp.empJoinTime}</td>
                    <td>
                    <a href ="javaScript:" class="delete"data-id="${emp.rowId}">删除</a><a href ="EmpServlet?empAction=goUpdate&rowId=${emp.rowId}">修改</a>
                    <%-- StudentDelServlet?delName=<%= student.getRow_id() %> --%>
                    </td>
                    </tr>
        </c:forEach>
        </c:if>
</table>
</body>
<script type="text/javascript" src="js\jQuery\jquery-3.4.1.js"></script>
<script type="text/javascript">
$(document).ready(function() {
    $("#empTable").off('click','.delete').on('click','.delete',function(){
        var id = $(this).data('id');
        console.log(id);
        if(confirm("请确认是否删除")){
            //使用js发起url请求
            window.location.href="EmpServlet?delName="+id+"&empAction=delete";
        }else{
            console.log("BBB");
        }
    })
});
</script>
</html>