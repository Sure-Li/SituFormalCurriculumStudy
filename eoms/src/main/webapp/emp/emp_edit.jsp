<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="EmpServlet?empAction=doUpdate" method ="post">
<%-- ${empEdit} --%>
<input type="hidden" name="empRowIDEdit" value="${empEdit.rowId}">
员工部门ID：<input name="empDepIdEdit" value="${empEdit.empDepId}">
员工姓名：<input name="empNameEdit" value="${empEdit.empName}"/><br>
员工id:<input name = "empIdEdit" value="${empEdit.empId}"/><br>
员工密码:<input name = "empPasswordEdit"value="${empEdit.empPassword}"/><br>
员工入职日期:<input name = "empJoinTimeEdit"value="${empEdit.empJoinTime}"/><br>
员工等级:
<select name ="empLevelEdit" >
<option  value="1" ${empEdit.empLevel==1?"selected='selected'":""}>1</option>
<option value="2" ${empEdit.empLevel==2?"selected='selected'":""}>2</option>
<option  value="3" ${empEdit.empLevel==3?"selected='selected'":""}>3</option>
</select>
<input type="submit" value = "tijoao " />
<input type="reset"  value = "chongzhi "/>
</form>

</body>
</html>