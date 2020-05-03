var message="本店物美价廉，优惠多多！"
function msgInfo(num,element,mes) {
    var url = "msgInfo.html?watch="+watchdata[num-1]+"&zan="+zandata[num-1]+"&id="+num+"&mes="+mes;
    message=mes;
    window.open(url)
}

var watchdata = [100,200,300,430,20,0,0,0,0]//----------------------在看
var zandata = [11,22,29,30,0,0,0,0,0]//----------------------------点赞


function watch(num,element) {
    var tem = watchdata[num-1]+1;
    watchdata[num-1] = tem;
    element.innerText= "在看("+ tem+")";

}


function zan(num,element) {
    var tem = zandata[num-1]+1;
    zandata[num-1] = tem;
    element.innerText= "点赞("+ tem+")";
}


var newNode = 6 //======================从第六个开始为新增


function addMsg(data) {

    var htmlstr = "<div class=\"media-body\">\n" +
        "            <a href=\"javascript:;\" class=\"media-left\" style=\"float: left;\">\n" +
        "                <img src=\"../images/mansmall.jpg\" height=\"46px\" width=\"46px\">\n" +
        "            </a>\n" +
        "            <div class=\"pad-btm\">\n" +
        "                <p class=\"fontColor\"><a href=\"javascript:;\">游客</a></p>\n" +
        "                \n" +
        "                <p class=\"fontColor\">平台认证：未通过</p>\n" +
        "                <!--此处可添加各种信息-->\n" +
        "                <p class=\"min-font\">\n" +
        "              <span class=\"layui-breadcrumb\" lay-separator=\"-\">\n" +
        "                <a href=\"javascript:;\" class=\"layui-icon layui-icon-cellphone\"></a>\n" +
        "                \n" +
        "                <a href=\"javascript:;\">刚刚</a>\n" +
        "              </span>\n" +
        "                </p>\n" +
        "            </div>\n" +
        "            <p class=\"message-text\">"+data.desc+"</p>\n" +
        "\n" +
        "            <div class=\"cbat-bar\">\n" +
        "                <div class=\"cbat-bar-3\" style=\"margin-left: 5%\" onclick=\"watch("+newNode+",this)\">在看(0)</div>\n" +
        "                <div class=\"cbat-bar-3\" onclick=\"msgInfo("+newNode+",this,'"+data.desc+"')\">评论(0)</div>\n" +
        "                <div class=\"cbat-bar-3\" onclick=\"zan("+newNode+",this)\">点赞(0)</div>\n" +
        "            </div>\n" +
        "\n" +
        "        </div>";
    newNode++;

    $("#newMsg").prepend(htmlstr)

    $("#descdom").val("")

}
function jump(a) {
    window.location.href=a
}