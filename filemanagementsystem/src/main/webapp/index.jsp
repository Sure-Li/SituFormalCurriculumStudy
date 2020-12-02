<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>文件管理系统</title>
</head>
<body>
<div style="text-align: center">
<h1>文件管理系统</h1>
</div>
<div style="text-align: center">
<a href="fileupload.jsp" style="position: absolute;right: 100px;">文件上传</a>
<br>
<table style="width: 100%;">
<tr>
<th>文件名称</th><th>最后修改时间</th><th>类型</th><th>大小</th><th>操作</th>
</tr>
<c:if test="${!empty findAllList}">
        <c:forEach items="${findAllList}" var="file">
                    <input type="hidden" value="${file.rowId}">
                    <tr>
                    <td>${file.fileName}</td>
                    <td>${file.fileLastModefy}</td>
                    <td>${file.fileType}</td>
                    <td>${file.fileSize}<font> KB</font></td>
                    <td>
                    <a href ="FileUpDownLoadServlet?fileAction=download&rowId=${file.rowId}">下载</a>
                    <%-- StudentDelServlet?delName=<%= student.getRow_id() %> --%>
                    </td>
                    </tr>
        </c:forEach>
        </c:if>
</table>
</div>
</body>
</html>