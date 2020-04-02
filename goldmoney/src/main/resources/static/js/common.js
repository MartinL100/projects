

// var _hmt = _hmt || [];
// (function() {
//     var hm = document.createElement("script");
//     hm.src = "https://hm.baidu.com/hm.js?ffdf6ba810ad5830da6f20eb4e50965d";
//     var s = document.getElementsByTagName("script")[0];
//     s.parentNode.insertBefore(hm, s);
// })();



var _hmt = _hmt || [];
(function() {
    var hm = document.createElement("script");
    hm.src = "https://hm.baidu.com/hm.js?f53b4a9576d8c8b747db39ad2d2cbc5d";
    var s = document.getElementsByTagName("script")[0];
    s.parentNode.insertBefore(hm, s);
})();



function alertMsg() {
    if ($('#nb_invite_ok').length > 0) {
        $('#nb_invite_ok').click();
    }
}




$(".shangqiao").click(function () {
    // alertMsg()
    window.open("http://p.qiao.baidu.com/cps/chat?siteId=14912085&userId=27882399", 'windowForBridgeIM',
        'left=200,top=100,width=800,height=580,location=no,resizable=yes,status=no,toolbar=no,menubar=no')
})

$(".footer-left ul li").click(function () {
    window.open("http://p.qiao.baidu.com/cps/chat?siteId=14912085&userId=27882399", 'windowForBridgeIM',
        'left=200,top=100,width=800,height=580,location=no,resizable=yes,status=no,toolbar=no,menubar=no')
})



