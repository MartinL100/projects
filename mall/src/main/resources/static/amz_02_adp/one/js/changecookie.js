
function getCookie(cname) {
    // var name = cname + "=";
    // var decodedCookie = decodeURIComponent(document.cookie);
    // var ca = decodedCookie.split(';');
    // for(var i = 0; i <ca.length; i++) {
    //     var c = ca[i];
    //     while (c.charAt(0) == ' ') {
    //         c = c.substring(1);
    //     }
    //     if (c.indexOf(name) == 0) {
    //         return c.substring(name.length, c.length);
    //     }
    // }
    var arrStr = document.cookie.split("; ");
    for (var i = 0; i < arrStr.length; i++) {
        var temp = arrStr[i].split("=");
        if (temp[0] == cname){
            return decodeURI(temp[1]);
        }
    }

    return "";
}

function setCookie(cname, cvalue, exdays) {
    var d = new Date();
    d.setTime(d.getTime() + (exdays*24*60*60*1000));
    var expires = "expires="+ d.toUTCString();
    document.cookie = cname + "=" + cvalue + ";" + expires + ";path=/";
}

function getcar() {
    var str=getCookie("car");
    var str1=getCookie("car");
    var oldjson;
    if (str=="undefined"||str==''||str=="[object Object]"||str=='[null]'
){
        oldjson='not'
    } else{
        oldjson=JSON.parse(str);
        // setCookie("car",str,30);
    }

    return oldjson;
}

/**
 * 修改购物车数据
 * @param json
 */
function changecar(json) {
    var str=getCookie("car");
    var oldjson;
    if (str=="undefined"||str==''||str=="[object Object]"||str=='[null]'
){
        setCookie("car","["+JSON.stringify(json)+"]",30);
        return;
    } else{
        oldjson=JSON.parse(str);
    }
        var count=0//商品是否已存在
        for (var i in oldjson) {
            if (oldjson[i].name ==json.name) {
                count++;
                oldjson[i].num=parseInt( json.num)+parseInt( oldjson[i].num);
                if ( oldjson[i].num <= 1) {
                    // delete json[key].num ;
                    oldjson.splice(i, 1);
                }
            }
        }
        if (count==0){//不存在添加到购物车
            oldjson.push(json)
        }



    setCookie("car",JSON.stringify(oldjson),30)
}

/**
 * 直接在修改购物车中修改
 * @param json
 */
function changeincar(json) {
    var str=getCookie("car");
    var oldjson;
    if (str=="undefined"||str==''||str=="[object Object]"||str=='[null]'
){
        setCookie("car","["+JSON.stringify(json)+"]",30);
        return;
    } else{
        oldjson=JSON.parse(str);
    }

    for (var key in json) {
        var count=0//商品是否已存在
        for (var i in oldjson) {
            if (oldjson[i].name ==json[key].name) {
                count=1;
                oldjson[i].num=json[key].num;
                if (json[key].name <= 1) {
                    // delete json[key].num ;
                    oldjson.splice(i, 1);
                }
            }
        }
        if (count==0){//不存在添加到购物车
            oldjson.push(json[key])
        }

    }

    setCookie("car",JSON.stringify(oldjson),30)

}
/**
 * 成交金额
 * @param json
 */
function getdeal() {
    var result={'dealnum':0,'money':0};
    var str=getCookie("car");
    var oldjson;
    if (str=="undefined"||str==''||str=="[object Object]"||str=='[null]'
){
        return result;
    } else{
        oldjson=JSON.parse(str);
    }
    var dealnum=0;
    var money=0;
    for (var key in oldjson) {
        result.dealnum=result.dealnum+parseInt(oldjson[key].num);
        result.money= +result.money+(oldjson[key].price*oldjson[key].num);
    }
    return result;

}



function login(name,password) {
    var userjson=getCookie('userinfo')

    if (userjson=="undefined"||userjson==''||userjson=="[object Object]"){
        return '用户名或密码错误'
    } else{
        userjson=JSON.parse(userjson);
    }

    // var userjson=JSON.parse(str);
    if(userjson.name!=name ){
        return '用户名或密码错误'
    }else if(userjson.password!=password){
        return '密码错误'
    }
    setCookie("islogin","is",30)
    return 'pass'
}

function register(name,password) {

    var  json ={
        'name':name,'password':password
    }
    // dataStr=JSON.stringify(json)
    setCookie('userinfo',JSON.stringify(json),30)
    return true;
}
function checklogin() {
    var str=getCookie("islogin");
    if (str=='is'){
        var userjson=getCookie("userinfo")
        if (userjson=="undefined"||userjson==''||userjson=="[object Object]"){
            return ''
        } else{
            return JSON.parse(userjson).name;
        }
    }
    return "not";
}
function quit() {
    setCookie("islogin","not",30);
}

function geren() {
    if(checklogin()=='not'){
        window.location.href="login.html"
    }else{
        window.location.href="information.html"
    }
}


function gocar() {
    if(checklogin()=='not'){
        window.location.href="login.html"
    }else{
        window.location.href="shopcart.html"
    }

}

function buy(id){
    window.location.href="pay.html?id="+id;
}

function delcar(id) {

    var str=getCookie("car");
    var oldjson;
    if (str=="undefined"||str==''||str=="[object Object]"||str=='[null]'
){
        return ;
    } else{
        oldjson=JSON.parse(str);
    }

    for (var i in oldjson){
        if(oldjson[i].id==id){
            oldjson.splice(i, 1);
            setCookie("car",JSON.stringify(oldjson),30)
            return "ok"
        }
    }
return 'no';

}



