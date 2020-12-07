/**
 * role角色的js文件
 */
/* 初始页面数据绑定*/
 initRoleFormData();
    function initFormData(){
        $.ajax({
            url:'RoleServlet?action=list',
            dataType:'json',
            success:function(htmlData){
                console.log(htmlData);
                //开始解析数据
               /* $.each(htmlData,function(index,obj){
                    console.log(obj);
                    var tr = $("<tr/>");
                    tr.append($("<td/>").text(obj.clazzName)).append($("<td/>").text(obj.classStudentNumber)).append($("<td/>").text(obj.clazzInfo)).append($("<td/>").append($( "<a href='javaScript:;' class='editA' />").data("editId",obj.rowId).text("修改")).append($( "<a href='javaScript:;' class='deleteA' />").data("deleteId",obj.rowId).text("删除")));
                    $('#clazzTbody').append(tr);
                });*/
            }
        });
    }