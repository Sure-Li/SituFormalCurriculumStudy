<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="DepServlet?depAction=doUpdate" method ="post">

<input type="hidden" name="rowIdEdit" value="${depEdit.rowId}">
部门id:<input name = "depIdEdit"value="${depEdit.depId}"/><br>
部门名称：<input name="depNameEdit" value="${depEdit.depName}"/><br>
部门简介：<input type="text" name="depInfoEdit"value="${depEdit.depInfo}"/><br>
<input type="submit" value = "tijoao " />
<input type="reset"  value = "chongzhi "/>
</form>

</body>
</html>