<%@page import="com.situ.lession02.clazz.pojo.Clazz"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="ClazzDoEditServlet" method ="post">
<!-- get 方式速度快 缺点 不安全 有大小限制 -->
<!-- post 将表单数据做成一个数据块进行提交，速度稍慢，安全，大小无限制 -->
<%
    Object obj = request.getAttribute("clazzEdit");
    Clazz clazzEdit = null;
    if(obj!=null){
    	clazzEdit = (Clazz)obj;
    }
    System.out.println(clazzEdit);
%>
<input type="hidden" name="clazzIdEdit" value="<%=clazzEdit.getRowId()%>"/>
班级名称：<input name="clazzNameEdit" value="<%=clazzEdit.getClazzName()%>" />
班级学生数量:<input name = "clazzStudentNumberEdit" value="<%=clazzEdit.getClassStudentNumber()%>"/>
班级简介:<input name = "clazzInfoEdit" value="<%=clazzEdit.getClazzInfo()%>"/>
<input type="submit" value = "tijoao " />
<input type="reset"  value = "chongzhi "/>
</form>
</body>
</html>