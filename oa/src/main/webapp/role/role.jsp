<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<body>
<a href="javaScript:;" class="roleAdd" style="float: right" id="roleAddid">新增</a>
    <table  class="roleTbale">
       <tr>
           <!--  <td>班级ID</td> -->
            <td>角色类型</td>
            <td>角色名称</td>
             <td>角色信息</td>
            <td>操作</td>
        </tr>
        <tbody id="roleTbody"></tbody>
        </table>
</body>
<script type="text/javascript">
$(document).ready(function(){
	//绑定删除
	$(document).off('click','#deleteRoleId').on('click','#deleteRoleId',function(){
		 var rowId = $(this).data('roleDeleteId');
	       console.log(rowId); 
	        var href = $(this).attr('href');
	       console.log(href);
	       layer.alert('',{
               icon:2,
               area:['200px','200px'],
               title:'删除确认',
               content:'您确定要删除这条记录吗？',
               closeBtn:1},
               function(index){
                   $.ajax({
                       url:href,
                       method:'post',
                       data:{rowId,rowId},
                       success:function(result){
                           console.log(result);
                           InitFormdata(); 
                        } 
                    }); 
                   layer.close(index);
               });
	       return false;
	});
	//绑定修改
    $(document).off('click','#editRoleId').on('click','#editRoleId',function(){
       var rowId = $(this).data('roleEditId');
       console.log(rowId); 
       var href = $(this).attr('href');
       console.log(href);
       $.ajax({
           url:'RoleServlet?action=goEdit',
               success:function(htmlData){
                   layer.open({
                       type:1,
                       title:'角色新增',
                       area:['500px','300px'],
                       content:htmlData
                   });
                   $.ajax({
                       url:href,
                       dataType:'json',
                       method:'post',
                       data:{rowId,rowId},
                           success:function(htmlData){
                               //开始解析数据 并对数据赋值
                               console.log(htmlData);
                               $('#roleTypeEditId').val(htmlData.roleType);
                               $('#roleNameEditId').val(htmlData.roleName);
                               $('#roleInfoEditId').val(htmlData.roleInfo);
                               $('#roleRowIdHidden').val(htmlData.rowId);
                           }
                   });
               }
       });
       return false;
    });
    $(document).off('click','#roleEditSubmitId').on('click','#roleEditSubmitId',function(){
    	console.log("role修改提交触发");
        $.ajax({
            url:'RoleServlet?action=doEdit',
            method:'post',
            data:$('#roleEditForm').serialize(),
            success:function(result){
                console.log(result);
                layer.close(layer.index);
                 InitFormdata();
            }
        });
        return false;
    });
	
    InitFormdata();
    function InitFormdata(){
    	$.ajax({
            url:'RoleServlet?action=list',
            dataType:'json',
            success:function(htmlData){
                console.log(htmlData);
                //开始解析数据
                $('#roleTbody').html('');
                 $.each(htmlData,function(index,obj){
                	 console.log('obj.roleType: '+obj.roleType);
                	 var roleTypeResult = 'null';
                	 if(obj.roleType==1){
                		 roleTypeResult = '超级角色';
                	 }else if(obj.roleType==0){
                		 roleTypeResult='普通角色';
                	 }
                    console.log(obj);
                    console.log(obj.rowId);
                    var tr = $("<tr/>");
                    
                    tr.append($("<td/>").text(roleTypeResult)).append($("<td/>").text(obj.roleName)).append($("<td/>").text(obj.roleInfo)).append($("<td/>").append($( "<a href='RoleServlet?action=edit' id='editRoleId' />").data("roleEditId",obj.rowId).text("修改")).append($( "<a href='RoleServlet?action=delete' id='deleteRoleId' />").data("roleDeleteId",obj.rowId).text("删除")));
                    $('#roleTbody').append(tr);
                }); 
            }
        });     
    };
  
    $('#roleAddid').off('click').on('click',function(){
        $.ajax({
            url:'RoleServlet?action=addform',
                success:function(htmlData){
                    layer.open({
                        type:1,
                        title:'角色新增',
                        area:['500px','300px'],
                        content:htmlData
                    });
                }
        });
        return false;
    });
    $(document).off('click','#roleAddSubmitId').on('click','#roleAddSubmitId',function(){
    	console.log("role新增提交触发");
    	$.ajax({
            url:'RoleServlet?action=doAdd',
            method:'post',
            data:$('#roleAddForm').serialize(),
            success:function(result){
            	console.log(result);
            	layer.close(layer.index);
            	 InitFormdata();
            }
        });
    	return false;
    });
});

</script>