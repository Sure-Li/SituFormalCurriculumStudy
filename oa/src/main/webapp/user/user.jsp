<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<body>
<a href="javaScript:;" class="userAdd" style="float: right" id="userAddId">新增</a>
    <table  class="userTbale">
       <tr>
            <td>用户名称</td>
            <td>登录账号</td>
             <td>用户头像</td>
             <td>登录次数</td>
             <td>最后的登录时间</td>
             <td>最后的登录IP</td>
             <td>是否锁定</td>
            <td>操作</td>
        </tr>
        <tbody id="userTbody"></tbody>
        </table>
</body>
<script type="text/javascript">
$(document).ready(function(){
    //绑定删除
    $(document).off('click','#deleteUserId').on('click','#deleteUserId',function(){
         var rowId = $(this).data('userDeleteId');
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
    $(document).off('click','#editUserId').on('click','#editUserId',function(){
       var rowId = $(this).data('userEditId');
       console.log(rowId); 
       var href = $(this).attr('href');
       console.log(href);
       $.ajax({
           url:'UserServlet?action=goEdit',
               success:function(htmlData){
                   layer.open({
                       type:1,
                       title:'用户修改',
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
                               $('#rowIdUserEditId').val(htmlData.rowId)
                               $('#userNameUserEditid').val(htmlData.userName);
                               $('#userEditUniqueId').val(htmlData.userId);
                               $('#userPasswordUserEditId').val(htmlData.userPassword);
                               $('#userPhotoUserEditId').val(htmlData.userPhoto);
                               $('#userLoginCountUserEditId').val(htmlData.userLoginCount);
                               $('#userLastLoginTimeUserEditId').val(htmlData.userLastLoginTime);
                               $('#userLastLoginIpUserEditId').val(htmlData.userLastLoginIp);
                               $('#userLockUserEditId').val(htmlData.userLock);
                           }
                   });
               }
       });
       return false;
    });
    $(document).off('click','#userEditSubmitId').on('click','#userEditSubmitId',function(){
        console.log("user修改提交触发");
        $.ajax({
            url:'UserServlet?action=doEdit',
            method:'post',
            data:$('#userEditForm').serialize(),
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
            url:'UserServlet?action=list',
            dataType:'json',
            success:function(htmlData){
                console.log(htmlData);
                //开始解析数据
                $('#userTbody').html('');
                 $.each(htmlData,function(index,obj){
                    console.log(obj);
                    console.log(obj.userLock);
                    var isLock = '';
                    if(obj.userLock==1){
                    	isLock='锁定';
                    }else{
                    	isLock='未锁定';
                    }
                    var tr = $("<tr/>");
                    
                    tr.append($("<td/>").text(obj.userName)).append($("<td/>").text(obj.userId)).append($("<td/>").text(obj.userPhoto)).append($("<td/>").text(obj.userLoginCount)).append($("<td/>").text(obj.userLastLoginTime)).append($("<td/>").text(obj.userLastLoginIp)).append($("<td/>").text(isLock)).append($("<td/>").append($( "<a href='UserServlet?action=edit' id='editUserId' />").data("userEditId",obj.rowId).text("修改")).append($( "<a href='UserServlet?action=delete' id='deleteUserId' />").data("userDeleteId",obj.rowId).text("删除")));
                    $('#userTbody').append(tr); 
                }); 
            }
        });     
    };
  
    $('#userAddId').off('click').on('click',function(){
        $.ajax({
            url:'UserServlet?action=addform',
                success:function(htmlData){
                    layer.open({
                        type:1,
                        title:'用户新增',
                        area:['500px','300px'],
                        content:htmlData
                    });
                    $.ajax({
                        url:'UserServlet?action=getRole',
                        dataType:'json',
                        method:'post',
                            success:function(htmlData){
                                //开始解析数据 并对数据赋值
                                console.log(htmlData);
                                $('#userAddForm').append("用户角色：");
                                $.each(htmlData,function(htmlData,role){
                                    console.log(role);
                                    $('#userAddForm').append(role).append($("<input type='checkbox' name='userRole'>"));
                                }); 
                            }
                    });
                }
        });
        return false;
    });
    $(document).off('click','#userAddSubmitId').on('click','#userAddSubmitId',function(){
        console.log("user新增提交触发");
        $.ajax({
            url:'UserServlet?action=doAdd',
            method:'post',
            data:$('#userAddForm').serialize(),
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