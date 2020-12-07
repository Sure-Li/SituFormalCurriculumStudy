<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<form action=""  id="roleEditForm">
<input type="hidden" name="rowId" id="roleRowIdHidden">
    角色类型 :<select name="roleType" id="roleTypeEditId">
       <option value="1">超级角色</option>
       <option value="0">普通角色</option>
    </select>
    <br>
    角色名称 :<input name="roleName" id="roleNameEditId">
    <br>
    角色信息 :<textarea name="roleInfo" rows="" cols="" id="roleInfoEditId">
    </textarea>
    <br>
    <input type="submit" id="roleEditSubmitId">
    <input type="reset">
</form>
