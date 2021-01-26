var info = {
    //公司名
    companyName:"成都炫丽阳光网络科技有限公司",
    //公司简称
    comShortName:"炫丽阳光",
    //地址
    address:"四川省成都市锦江区静渝路48号1栋17层1716",
    //电话
    tel:"028-85553797",
    //备案号
    webNum:"蜀ICP备2020030260号-1",
    //网站名称
    webName:"七彩阳光",
    //时间
    webYear:"©2020",
}

// name='comShortName' name='address'    name='tel' name='webNum'  name='webName'
document.title = info.webName;
$(function () {
    var compnayNameDom = document.getElementsByName("companyName");
    for(var i = 0;i<compnayNameDom.length;i++){
        compnayNameDom[i].innerText = info.companyName;
    }

    var comShortNameDom = document.getElementsByName("comShortName");
    for(var i = 0;i<comShortNameDom.length;i++){
        comShortNameDom[i].innerText = info.comShortName;
    }

    var addressDom = document.getElementsByName("address");
    for(var i = 0;i<addressDom.length;i++){
        addressDom[i].innerText = info.address;
    }


    var telDom = document.getElementsByName("tel");
    for(var i = 0;i<telDom.length;i++){
        telDom[i].innerText = info.tel;
    }



    var webNumDom = document.getElementsByName("webNum");
    for(var i = 0;i<webNumDom.length;i++){
        webNumDom[i].innerText = info.webNum;
    }


    var webNameDom = document.getElementsByName("webName");
    for(var i = 0;i<webNameDom.length;i++){
        console.log(info.webName)
        webNameDom[i].innerText = info.webName;
    }
})

