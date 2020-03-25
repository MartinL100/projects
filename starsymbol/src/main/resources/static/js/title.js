var data={};
function getQueryVariable(variable)
{
    var query = window.location.search.substring(1);
    var vars = query.split("&");
    for (var i=0;i<vars.length;i++) {
        var pair = vars[i].split("=");
        if(pair[0] == variable){return pair[1];}
    }
    return(false);
}



var txtId = getQueryVariable('txtId');
data.txtId = txtId;
$.post(
    "/getTxt"
    ,data
    ,function (r) {
        $("#title").text(r.title);
        $("#content").html(r.content);
    }
)