<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style type="text/css">
    .red{
    color: red;
    }
    .green{
    color: green;
    }
</style>
<body> -->
<form id="clazzForm">
班级名称：<input name="clazzName" id="clazzNameId"/><span id="clazzNameSpan"></span><br>
班级学生数量:<input name = "clazzStudentNumber"/><br>
班级简介:<input name = "clazzInfo"/><br>
<input type="submit" id="clazzSubmitid" value = "tijoao " />
<input type="reset"  value = "chongzhi "/>
</form>
<!-- </body>
<script type="text/javascript" src="../asset\js\jQuery\jquery-3.4.1.js"></script>
<script type="text/javascript">
$(document).ready(function(){
    $('#clazzSubmitid').off('click').on('click',function(){
        console.log("提交点击事件绑定成功");
        $.ajax({
            url:"../ClazzServlet?action=add",
            method:'post',
            data:$('#clazzForm').serialize(),
           success:function(result){
               console.log("getResponse： "+result);
        }
        });
        return false;//屏蔽原来动作
    })
    $('#clazzNameId').off('blur').on('blur',function(){
        console.log("脱离光标事件绑定成功");
        var val=$(this).val();
        if(val!=null&&val!=''){
            console.log("clazzName内部有值");
            console.log(val);
            /* 准备发起ajax请求 向后台查询 看编号是否可以使用 */
            $.ajax({
                url:'../ClazzServlet?action=check',//请求的url
                method:'post',
                data:{"clazzName":val},//请求时携带的数据 JSOM{"k":v,"K":v}
                success:function(result){//ajax响应成功（2000）后的回调函数
                    console.log("getResponse： "+result);
                    if("1"==result){
                        $('#clazzNameSpan').removeClass('green').addClass('red').text("已经被使用");
                        //将光标强制拉回 注意 必须只有一个抢光标
                        $('#clazzNameId').focus();
                    }else{
                        $('#clazzNameSpan').removeClass('red').addClass('green').text("可以使用");
                    }
                
                }
            });
        }
    })
});
</script>
</html> -->