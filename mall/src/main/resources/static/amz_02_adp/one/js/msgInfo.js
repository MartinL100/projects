

function getParamFomUrl(name) {
    var reg = new RegExp("(^|&)"+name+"=([^&]*)(&|$)");
    var r = window.location.search.substring(1).match(reg);
    if(r!=null){
        return unescape(r[2]);
    }
    return null;
}



function init() {
    var msg_id = getParamFomUrl("id");
    var watch = getParamFomUrl("watch");
    var zan = getParamFomUrl("zan");
    $("#watch").text("在看("+watch+")");
    $("#zan").text("在看("+zan+")");
    // $("#mestext").text(message);
}

$(function () {
    init();
})



function sendMsg(data) {
    var msg = data.desc;
    var htmstr = "<div class=\"cbat-msg-content\">\n" +
        "                游客857：" +msg+
        "            </div>";
    $("#cbat-msg-box-dom").append(htmstr)

}
function formatterDate(date) {
    var day = date.getDate() > 9 ? date.getDate() : "0" + date.getDate();
    var month = (date.getMonth() + 1) > 9 ? (date.getMonth() + 1) : "0"
        + (date.getMonth() + 1);
    return date.getFullYear() + '-' + month + '-' + day+'';
};

