<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <c:if test="${!empty clazzList}">
        <c:forEach items="${clazzList}" var="clazz">
                    <tr>
                    <td>${clazz.rowId}</td>
                    <td>${clazz.clazzName}</td>
                    <td>${clazz.classStudentNumber}</td>
                    <td>${clazz.clazzInfo}</td>
                    <td>
                    <a href ="javaScript:" class="delete"data-id="${emp.rowId}">删除</a><a href ="EmpServlet?empAction=goUpdate&rowId=${emp.rowId}">修改</a>
                    <%-- StudentDelServlet?delName=<%= student.getRow_id() %> --%>
                    </td>
                    </tr>
</c:forEach>
</c:if>