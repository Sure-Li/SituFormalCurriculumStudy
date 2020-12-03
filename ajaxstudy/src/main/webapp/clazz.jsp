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
<script type="text/javascript">
$(document).ready(function(){
	 $(document).off('click','#clazzSubmitid').on('click','#clazzSubmitid',function(){
	        console.log("提交点击事件绑定成功");
	        $.ajax({
	            url:"ClazzServlet?action=add",
	            method:'post',
	            data:$('#clazzForm').serialize(),
	           success:function(result){
	               console.log("getResponse： "+result);
	               layer.close(layer.index);
	               initFormData();
	        }
	        });
	        return false;//屏蔽原来动作
	    });
	    $(document).off('blur','#clazzNameId').on('blur','#clazzNameId',function(){
	        console.log("脱离光标事件绑定成功");
	        var val=$(this).val();
	        if(val!=null&&val!=''){
	            console.log("clazzName内部有值");
	            console.log(val);
	            /* 准备发起ajax请求 向后台查询 看编号是否可以使用 */
	            $.ajax({
	                url:'ClazzServlet?action=check',//请求的url
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
	    });
	    $(document).off('click','#clazzEditId').on('click','#clazzEditId',function(){
	    	console.log($(this).attr('data-editId'));
	        $.ajax({
	            url:"ClazzServlet?action=edit&rowId="+$(this).attr('data-editId'),
	                success:function(htmlData){
	                    layer.open({
	                        type:1,
	                        title:'班级修改',
	                        area:['500px','300px'],
	                        content:htmlData
	                    });
	                }
	        });
	    });
	    $(document).off('click','#clazzDeleteId').on('click','#clazzDeleteId',function(){
	    	var deleteRowID = $(this).attr('data-deleteId');
            layer.alert('',{
                icon:2,title:'删除确认',content:'您确定要删除这条记录吗？',closeBtn:1},function(index){
                	console.log(deleteRowID); 
                	$.ajax({
                         url:"ClazzServlet?action=delete&rowId="+deleteRowID,
                            success:function(result){
                                console.log("getResponse： "+result);
                                initFormData();
                            } 
                    });
                    layer.close(index);
                });
           
        });
	    $(document).off('click','#clazzEditSubmitid').on('click','#clazzEditSubmitid',function(){
            console.log("提交点击事件绑定成功");
            $.ajax({
                url:"ClazzServlet?action=doEdit&rowId="+$('#clazzRowIdEdit').val(),
                method:'post',
                data:$('#clazzForm').serialize(),
               success:function(result){
                   console.log("getResponse： "+result);
                   layer.close(layer.index);
                   initFormData();
            }
            });
            return false;//屏蔽原来动作
        });
	initFormData();
    function initFormData(){
    	$.ajax({
    		url:'ClazzServlet?action=list',
    		success:function(htmlData){
    			console.log(htmlData);
    			/* layer.open({
    				type:1,
    				title:"date",
    				area:['500px','500px'],
    				content:htmlData
    			}); */
    			$('#clazzTbody').html(htmlData);
    		}
    	});
    }
    $('#addid').off('click').on('click',function(){
    	$.ajax({
    		url:'ClazzServlet?action=addform',
    			success:function(htmlData){
    				layer.open({
    					type:1,
    					title:'班级新增',
    					area:['500px','300px'],
    					content:htmlData
    				});
    			}
    	});
    });
    
});
</script>
</html>