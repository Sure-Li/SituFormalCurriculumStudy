<%@page import="com.situ.eoms.pojo.Department"%>
<%@page import="com.situ.eoms.pojo.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="dep/dep_add.jsp" class="add" style="float: right">新增</a>
    <table class="mainTable" id="depTable">
       <tr>
            <th>部门主键序号</th>
            <th>部门ID</th>
            <th>部门名称</th>
            <th>员工数量</th>
            <th>部门简介</th>
            <th>操作</th>
        </tr>
       <% 
       Object obj = request.getAttribute("depList");
       if(obj!=null){
    	   List<Department> getEmpList = (List<Department>)obj;
           if(getEmpList!=null&&getEmpList.size()>0){
               for(Department department:getEmpList){%>
                   <tr>
                    <td><%= department.getRowId() %></td>
                    <td><%= department.getDepId() %></td>
                    <td><%= department.getDepName() %></td>
                    <td><%= department.getDepEmpNumber() %></td>
                    <td><%= department.getDepInfo() %></td>
                    <td>
                    <a href ="javaScript:" class="delete"data-id=<%= department.getRowId() %>>删除</a><a href ="DepServlet?depAction=goUpdate&rowId=<%= department.getRowId() %> ">修改</a>
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
    $("#depTable").off('click','.delete').on('click','.delete',function(){
        var id = $(this).data('id');
        console.log(id);
        if(confirm("请确认是否删除")){
            //使用js发起url请求
            window.location.href="DepServlet?delName="+id+"&depAction=delete";
        }else{
            console.log("BBB");
        }
    })
});
</script>
</html>