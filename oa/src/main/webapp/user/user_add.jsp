<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<form action="" id="userAddForm">
<input type="submit" id="userAddSubmitId">
    <input type="reset">
    <br>
用户名称：<input name="userName" ><br>
登录账号 ：<input name="userId" id="userAddUniqueId"><br>
登录密码 ：<input name="userPassword"><br>
用户头像：<input name="userPhoto"><br>
登录次数：<input name="userLoginCount"><br>
最后的登录时间：<input name="userLastLoginTime"><br>
最后的登录IP：<input name="userLastLoginIp"><br>
是否锁定：<select name="userLock">
       <option value="1">锁定</option>
       <option value="0">未锁定</option>
    </select><br>
</form>
