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
        <tbody id="clazzTbody"></tbody>
        </table>
</body>
<script type="text/javascript" src="asset\js\jQuery\jquery-3.4.1.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	initFormData();
    function initFormData(){
    	$.ajax({
    		url:'ClazzServlet?action=list',
    		success:function(htmlData){
    			console.log(htmlData);
    			$('#clazzTbody').html(htmlData);
    		}
    	});
    }
});
</script>
</html>