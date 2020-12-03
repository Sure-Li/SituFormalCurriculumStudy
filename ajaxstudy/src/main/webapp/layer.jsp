<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<input type="button" value="111" id="b1">
<input type="button" value="222" id="b2">
<input type="button" value="新增" id="b3">
</body>
<script type="text/javascript" src="asset\js\jQuery\jquery-3.4.1.js"></script>
<script type="text/javascript" src="asset\js\layer\layer.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$('#b1').on('click',function(){
		layer.msg("hello word");
	});
	$('#b2').on('click',function(){
        var index = layer.open(
        {
        	type:3
        }		
        );
        //模拟关闭
        window.setTimeout(function(){
        	layer.close(index);
        },1000);
    });
	var form='学生编号：<input name="stuNo" id="stuNo"/> <span id="stuNoSpan"></span><br> 学生名称：<input name="stuName"/><br>学生年龄：<input name="stuAge" /><br>学生头像：<input type="file" name="stuImage" id="stuImageUpload"/><br><input type="hidden" name="stuHid" id="stuHidId"><input type="submit" id="stuSubmit">';
	$('#b3').on('click',function(){
        var index = layer.open(
                {
                    type:1,
                    title:'学生新增',
                    offset:['100px','500px'],
                    area:['500px','500px'],
                    content:form
                }       
                );
    });
});
</script>
</html>