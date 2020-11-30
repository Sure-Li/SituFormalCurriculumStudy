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
Object obj = request.getAttribute("depIdSet");
Set<Long> resultSet = new HashSet<Long>();
if(obj!=null){
    String[] result  = obj.toString().split(",");
    for(String s:result){
        resultSet.add(Long.parseLong(s));
    }
}

%>
<form action="EmpServlet?empAction=add" method ="post">
<!-- get 方式速度快 缺点 不安全 有大小限制 -->
<!-- post 将表单数据做成一个数据块进行提交，速度稍慢，安全，大小无限制 -->
员工部门ID：<select name="empDepId">
                <%
                Iterator it = resultSet.iterator();
                while(it.hasNext()){
                    Long EmpId = Long.parseLong(it.next().toString());
                %>
                    <option value="<%=EmpId%>"><%=EmpId%></option>
                <%}
                %>
</select><br>
员工姓名：<input name="empName"/><br>
员工id:<input name = "empId"/><br>
员工密码:<input name = "empPassword"/><br>
员工入职日期:<input name = "empJoinTime"/><br>
员工等级:<select name="empLevel">
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
</select><br>

<input type="submit" value = "tijoao " />
<input type="reset"  value = "chongzhi "/>
</form>

</body>
</html>