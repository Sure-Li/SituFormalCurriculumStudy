<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
    .red{
    color: red;
    }
    .green{
    color: green;
    }
</style>
</head>
<body>
<form id="stuForm">
    学生编号：<input name="stuNo" id="stuNo"/> <span id="stuNoSpan"></span><br>
    学生名称：<input name="stuName"/><br>
    学生年龄：<input name="stuAge" /><br>
    <input type="submit" id="stuSubmit">
</form>
</body>
<script type="text/javascript" src="asset\js\jQuery\jquery-3.4.1.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$('#stuSubmit').off('click').on('click',function(){
		console.log("提交点击事件绑定成功");
		$.ajax({
			url:"StuAddServlet",
			method:'post',
			data:$('#stuForm').serialize(),
		   success:function(result){
			   console.log("getResponse： "+result);
		}
		});
		return false;//屏蔽原来动作
	})
	$('#stuNo').off('blur').on('blur',function(){
		console.log("脱离光标事件绑定成功");
		var val=$(this).val();
		if(val!=null&&val!=''){
			console.log("stuNo内部有值");
			console.log(val);
			/* 准备发起ajax请求 向后台查询 看编号是否可以使用 */
			$.ajax({
				url:'StuCkeckNoServlet',//请求的url
				method:'post',
				data:{"stuNo":val},//请求时携带的数据 JSOM{"k":v,"K":v}
				success:function(result){//ajax响应成功（2000）后的回调函数
					console.log("getResponse： "+result);
				    if("1"==result){
				    	$('#stuNoSpan').removeClass('green').addClass('red').text("已经被使用");
				    	//将光标强制拉回 注意 必须只有一个抢光标
				    	$('#stuNo').focus();
				    }else{
				    	$('#stuNoSpan').removeClass('red').addClass('green').text("可以使用");
				    }
				
				}
			});
		}
	})
})
</script>
</html>