<%@page import="com.situ.lession02.clazz.pojo.Clazz"%>
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
<a href="clazz_add.jsp" class="add" style="float: right">新增</a>
    <table  class="classTbale">
       <tr>
            <td>班级ID</td>
            <td>班级名称</td>
            <td>班级学生数量</td>
             <td>班级简介</td>
            <td>操作</td>
        </tr>
       
       <% 
       Object obj = request.getAttribute("clazzlist");
       if(obj!=null){
           List<Clazz> getClazzList = (List<Clazz>)obj;
           if(getClazzList!=null&&getClazzList.size()>0){
               for(Clazz clazz:getClazzList){%>
                   <tr>
                    <td><%= clazz.getRowId() %></td>
                    <td><%= clazz.getClazzName() %></td>
                    <td><%= clazz.getClassStudentNumber() %></td>
                    <td><%= clazz.getClazzInfo() %></td>
                    <td>
                    <a href ="javaScript:" class="deleteClazz" data-id="<%= clazz.getRowId() %>">删除</a><a href ="ClazzGoEditServlet?rowId=<%= clazz.getRowId()   %>">修改</a>
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
$('document').ready(function(){
	$('.classTbale').off('click','.deleteClazz').on('click','.deleteClazz',function(){
		var id = $(this).data('id'); 
		console.log(id);
		if(confirm("是否删除此班级？"))
		{
			  window.location.href="ClazzDelServlet?delName="+id;	
		}
	});
});
</script>

</html>