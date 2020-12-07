<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<form action="" id="roleAddForm">
	角色类型 :<select name="roleType">
	   <option value="1">超级角色</option>
	   <option value="0">普通角色</option>
	</select>
	<br>
	角色名称 :<input name="roleName">
	<br>
	角色信息 :<textarea name="roleInfo" rows="" cols="">
    </textarea>
    <br>
	<input type="submit" id="roleAddSubmitId">
	<input type="reset">
</form>
