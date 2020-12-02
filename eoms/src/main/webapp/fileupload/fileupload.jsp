<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="POST" enctype="multipart/form-data" action="../UploaderServlet">
    学生名称：<input name="stuName">
    学生头像: <input type="file" name="stuImage"><br/>
  <!--   Notes about the file: <input type="text" name="note"><br/> -->
  <br/>
  <input type="submit" value="Press"> to upload the file!
  <br>
  图片<img src="file/1606876814385.png">
</form>
</body>
</html>