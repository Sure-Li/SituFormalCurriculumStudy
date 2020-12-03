<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<base href="http://localhost:8080/ajaxstudy/">
<link rel="stylesheet" href="asset\js\uploadify\uploadifive.css">
</head>
<body>
<form id="stuForm">
    学生编号：<input name="stuNo" id="stuNo"/> <span id="stuNoSpan"></span><br>
    学生名称：<input name="stuName"/><br>
    学生年龄：<input name="stuAge" /><br>
    学生头像：<input type="file" name="stuImage" id="stuImageUpload"/><br>
    <input type="hidden" name="stuHid" id="stuHidId">
    <input type="submit" id="stuSubmit">
</form>
</body>
<script type="text/javascript" src="asset\js\jQuery\jquery-3.4.1.js"></script>
<script type="text/javascript" src="asset\js\uploadify\jquery.uploadifive.js"></script>
<script type="text/javascript" src="asset\js\layer\layer.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	//绑定ajax文件上传功能
	$('#stuImageUpload').uploadifive({
        'auto'             : true,
        /* 'checkScript'      : 'check-exists.php',//检测是否存在的url */
        'fileType'         : 'image/*',//上传文件类型
        'fileObjName'     : 'stuImage', 
        'formData'         : {
         //上传提交时的额外数据
                             },
        /* 'queueID'          : 'queue', */
        'uploadScript'     : 'StuUploadServlet',//上传的url
        'onUploadFile' : function(){
        	var index = layer.open(
        	        {
        	            type:3
        	        }       
        	        );
        },
        'onUploadComplete' : function(file, data) {//上传成功后的回调
        	console.log(data);
            $('#stuHidId').val(data);
            var index = layer.open(
                    {
                        type:3
                    }       
                    );
        	}
    });
});
</script>
</html>