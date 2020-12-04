<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<form id="clazzForm" class="clazzFormClass">
<input type="hidden" name="clazzRowIdEdit" id="clazzRowIdEdit" value="${clazzGet.rowId}"/>
班级名称：<input name="clazzName" id="clazzNameId" value="${clazzGet.clazzName}"/><span id="clazzNameSpan"></span><br>
班级学生数量:<input name = "clazzStudentNumberEdit" value="${clazzGet.classStudentNumber}"/><br>
班级简介:<input name = "clazzInfoEdit" value="${clazzGet.clazzInfo}"/><br>
<input type="submit" id="clazzEditSubmitid" value = "tijoao " />
<input type="reset"  value = "chongzhi "/>
</form>