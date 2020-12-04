<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>班级管理系统</title>
</head>
<style type="text/css">
    .red{
    color: red;
    }
    .green{
    color: green;
    }
</style>
<body>
<a href="javaScript:;" class="add" style="float: right" id="addid">新增</a>
    <table  class="classTbale">
       <tr>
           <!--  <td>班级ID</td> -->
            <td>班级名称</td>
            <td>班级学生数量</td>
             <td>班级简介</td>
            <td>操作</td>
        </tr>
        <tbody id="clazzTbody"></tbody>
        </table>
</body>
<script type="text/javascript" src="asset\js\jQuery\jquery-3.4.1.js"></script>
<script type="text/javascript" src="asset\js\layer\layer.js"></script>
<script type="text/javascript" src="asset\js\page\clazz.js"></script>
</html>