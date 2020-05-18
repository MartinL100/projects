$(document).ready(function () {
    initRadioList();
    initLunBo();
    $("#owl-demo").owlCarousel({
        autoPlay: 3000,
        items : 3,
        itemsDesktop : [1199,4],
        itemsDesktopSmall : [979,4]
    });
})





$("#welcome").text(welcome)







function initRadioList(){
    var radioListHtml = "";
    $.each(radioList,function (r) {
        radioListHtml+="<div class=\"col-md-4\">\n" +
            "<div class=\"wrap-vid\">\n" +
            "<div class=\"zoom-container\">\n" +
            "<div class=\"zoom-caption\">\n" +
            "<span>"+radioList[r].stu+"</span>\n" +
            "<a href='single.html?playId="+radioList[r].rid+"'>\n" +
            "<i class=\"fa fa-play-circle-o fa-5x\" style=\"color: #fff\"></i>\n" +
            "</a>\n" +
            "<p>"+radioList[r].title+"</p>\n" +
            "</div>\n" +
            "<img src='"+radioList[r].address+"'/>\n" +
            "</div>\n" +
            "<h3 class=\"vid-name\"><a href=\"#\">"+radioList[r].desc+"</a></h3>\n" +
            "<div class=\"info\">\n" +
            // "<h5>By <a href=\"#\">Kelvin</a></h5>\n" +
            // "<span><i class=\"fa fa-calendar\"></i>25/3/2015</span>\n" +
            "<span><i class=\"fa fa-heart\"></i>"+radioList[r].likes+"</span>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>"
    })
    $("#radioList").html(radioListHtml);
}



function initLunBo(){
    var lunBoHtml="";
    $.each(lunBo,function(r){
        lunBoHtml+=
            "<div class=\"item\">"+
            "<div class=\"zoom-container\">"+
            "<div class=\"zoom-caption\">"+
            "<span>"+lunBo[r].stu+"</span>"+
            "<a href=\"single.html?playId="+lunBo[r].rid+"\">"+
            "<i class=\"fa fa-play-circle-o fa-5x\" style=\"color: #fff\"></i>"+
            "</a><p>"+lunBo[r].title+"</p></div><img src=\""+lunBo[r].address+"\" /></div></div>";

    })
    $("#owl-demo").html(lunBoHtml);
}
