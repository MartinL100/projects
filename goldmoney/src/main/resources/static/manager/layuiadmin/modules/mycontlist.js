/**

 @Name 文章列表管理
 @Author：martingcong
    
 */


layui.define(['table', 'form'], function(exports){
  var $ = layui.$
  ,table = layui.table
  ,form = layui.form;

  //文章管理
  table.render({
    elem: '#LAY-app-content-list'
    ,url: "/manager/getTxtList" //接口
    ,cols: [[
      {type: 'checkbox', fixed: 'left'}
      ,{field: 'txtId', width: 100, title: '文章编号', sort: true}
      ,{field: 'txtTypeDesc', title: '文章分类', minWidth: 100}
      ,{field: 'title', title: '文章标题'}
      ,{field: 'lstModTime', title: '上传时间', sort: true}
      ,{field: 'txtLevelDesc', title: '文章状态'}
      ,{title: '操作', minWidth: 150, align: 'center', fixed: 'right', toolbar: '#table-content-list'}
    ]]
    ,page: true
    ,limit: 10
    ,limits: [10, 15, 20, 25, 30]
    ,text: '对不起，加载出现异常！'
  });
  
  //监听工具条
  table.on('tool(LAY-app-content-list)', function(obj){
    var data = obj.data;
    if(obj.event === 'del'){
      layer.confirm('确定将文章从封面移除吗？', function(index){
        data.txtLevel="01";
        $.post(
            "/manager/updateTxtLv"
            ,data
            ,function () {
              table.reload('LAY-app-content-list');
              layer.close(index);
            }
        )
      });
    } else if(obj.event === 'edit'){
      layer.confirm('确定将此文章上传到封面？', function(index){
        data.txtLevel="02";
        $.post(
            "/manager/updateTxtLv"
            ,data
            ,function () {
              table.reload('LAY-app-content-list', {
                where: ""
              });
              layer.close(index);
            }
        )
      });
    }
  });

  //分类管理
  table.render({
    elem: '#LAY-app-content-tags'
    ,url: layui.setter.base + 'json/content/tags.js' //模拟接口
    ,cols: [[
      {type: 'numbers', fixed: 'left'}
      ,{field: 'id', width: 100, title: 'ID', sort: true}
      ,{field: 'tags', title: '分类名', minWidth: 100}
      ,{title: '操作', width: 150, align: 'center', fixed: 'right', toolbar: '#layuiadmin-app-cont-tagsbar'}
    ]]
    ,text: '对不起，加载出现异常！'
  });
  
  //监听工具条
  table.on('tool(LAY-app-content-tags)', function(obj){
    var data = obj.data;
    if(obj.event === 'del'){
      layer.confirm('确定删除此分类？', function(index){
        obj.del();
        layer.close(index);
      });
    } else if(obj.event === 'edit'){
      var tr = $(obj.tr);
      layer.open({
        type: 2
        ,title: '编辑分类'
        ,content: '../../../views/app/content/tagsform.html?id='+ data.id
        ,area: ['450px', '200px']
        ,btn: ['确定', '取消']
        ,yes: function(index, layero){
          //获取iframe元素的值
          var othis = layero.find('iframe').contents().find("#layuiadmin-app-form-tags")
          ,tags = othis.find('input[name="tags"]').val();
          
          if(!tags.replace(/\s/g, '')) return;
          
          obj.update({
            tags: tags
          });
          layer.close(index);
        }
        ,success: function(layero, index){
          //给iframe元素赋值
          var othis = layero.find('iframe').contents().find("#layuiadmin-app-form-tags").click();
          othis.find('input[name="tags"]').val(data.tags);
        }
      });
    }
  });

  //评论管理
  table.render({
    elem: '#LAY-app-content-comm'
    ,url: layui.setter.base + 'json/content/comment.js' //模拟接口
    ,cols: [[
      {type: 'checkbox', fixed: 'left'}
      ,{field: 'id', width: 100, title: 'ID', sort: true}
      ,{field: 'reviewers', title: '评论者', minWidth: 100}
      ,{field: 'content', title: '评论内容', minWidth: 100}
      ,{field: 'commtime', title: '评论时间', minWidth: 100, sort: true}
      ,{title: '操作', width: 150, align: 'center', fixed: 'right', toolbar: '#table-content-com'}
    ]]
    ,page: true
    ,limit: 10
    ,limits: [10, 15, 20, 25, 30]
    ,text: '对不起，加载出现异常！'
  });
  
  //监听工具条
  table.on('tool(LAY-app-content-comm)', function(obj){
    var data = obj.data;
    if(obj.event === 'del'){
      layer.confirm('确定删除此条评论？', function(index){
        obj.del();
        layer.close(index);
      });
    } else if(obj.event === 'edit') {
      layer.open({
        type: 2
        ,title: '编辑评论'
        ,content: '../../../views/app/content/contform.html'
        ,area: ['450px', '300px']
        ,btn: ['确定', '取消']
        ,yes: function(index, layero){
          var iframeWindow = window['layui-layer-iframe'+ index]
          ,submitID = 'layuiadmin-app-comm-submit'
          ,submit = layero.find('iframe').contents().find('#'+ submitID);

          //监听提交
          iframeWindow.layui.form.on('submit('+ submitID +')', function(data){
            var field = data.field; //获取提交的字段
            
            //提交 Ajax 成功后，静态更新表格中的数据
            //$.ajax({});
            table.reload('LAY-app-content-comm'); //数据刷新
            layer.close(index); //关闭弹层
          });  
          
          submit.trigger('click');
        }
        ,success: function(layero, index){
          
        }
      });
    }
  });

  exports('mycontlist', {})
});