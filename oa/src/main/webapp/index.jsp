<%@page import="com.siti.oa.user.pojo.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>管理首页</title>
<link rel="stylesheet" type="text/css" href="asset\css\index.css">
</head>
<body>
<div class="container">
	<div class = "div1">
	<ul>
	<li><a href = "IndexServlet?action=role" id="roleManagerId">角色管理 </a></li>
	<li><a href = "IndexServlet?action=user" id="userManagentId">用户管理</a></li>
	</ul>
	</div>
	
	<div class = "div2"><h3>OA管理系统</h3></div>
	
	<div class = "div3" id="mainDiv" >
	<%
	Object obj = session.getAttribute("LoginUser");
	if(obj!=null){
	    User user = (User)obj;
	    %>
	    <%=user.getUserName() %>
	    
	    <a href="javaScript: exitLogin()">退出</a>
	<%}
	%>
	</div>
</div>
</body>
<script type="text/javascript" src="asset\js\jQuery\jquery-3.4.1.js"></script>
<script type="text/javascript" src="asset\js\layer\layer.js"></script>
<script type="text/javascript">
$(document).ready(function(){
    $('#roleManagerId').off('click').on('click',function(){
        var href = $(this).attr('href');
        console.log(href);
        $.ajax({
            url:href,
            method:'post',
            success:function(htmlData){
                $('#mainDiv').html(htmlData);
            }
        });
        return false;
    });
    $('#userManagentId').off('click').on('click',function(){
        var href = $(this).attr('href');
        console.log(href);
        $.ajax({
            url:href,
            method:'post',
            success:function(htmlData){
                $('#mainDiv').html(htmlData);
            }
        });
        return false;
    });
});
</script>
</html>