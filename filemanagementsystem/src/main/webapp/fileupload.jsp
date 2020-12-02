<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="text-align: center;">
<form method="POST" enctype="multipart/form-data" action="FileUpDownLoadServlet?fileAction=upload">
  要提交的文件: <input type="file" name="fileUpload"><br/>
  <br/>
  <input type="submit" value="确认提交文件"> 
  <br>
</form>

</body>
</html>