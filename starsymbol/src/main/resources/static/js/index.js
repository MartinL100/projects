var txtId;

$.post(
    "/getHotTxt"
    ,function (r) {
        var module_01="<ul>";
        var module_02="<ul>";
        var module_03="<ul>";
        $.each(r,function (temp) {
            var txtBean=r[temp];
            var tempHtml="<li><a target='_blank' href='page/title.html?txtId="+txtBean.txtId+"' class='my-title' title='"+txtBean.title+"'>"+txtBean.title+"</a></li>";
            switch (txtBean.txtType) {
                case "01":
                    module_01+=tempHtml;
                    break;
                case "02":
                    module_02+=tempHtml;
                    break;
                case "03":
                    module_03+=tempHtml;
                    break;
            }
        })
         module_01+="</ul>";
         module_02+="</ul>";
         module_03+="</ul>";
         $("#md_01").html(module_01);
        $("#md_02").html(module_02);
        $("#md_03").html(module_03);
    }
)
