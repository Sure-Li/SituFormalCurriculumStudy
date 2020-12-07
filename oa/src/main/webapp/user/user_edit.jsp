<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<form action="" id="userAddForm">
<input type="submit" id="userEditSubmitId">
    <input type="reset">
    <br>
    <input type="hidden" id="rowIdUserEdit">
用户名称：<input name="userNameUserEdit" id="userNameUserEditid"><br>
登录账号 ：<input name="userIdUserEdit" id="userEditUniqueId"><br>
登录密码 ：<input name="userPasswordUserEdit" id="userPasswordUserEditId"><br>
用户头像：<input name="userPhotoUserEdit" id="userPhotoUserEditId"><br>
登录次数：<input name="userLoginCountUserEdit" id="userLoginCountUserEditId"><br>
最后的登录时间：<input name="userLastLoginTimeUserEdit" id="userLastLoginTimeUserEditId"><br>
最后的登录IP：<input name="userLastLoginIpUserEdit" id="userLastLoginIpUserEditId"><br>
是否锁定：<select name="userLockUserEdit" id="userLockUserEditId">
       <option value="1">锁定</option>
       <option value="0">未锁定</option>
    </select><br>
</form>
用户角色：<tbody id="userAddTbody"></tbody>