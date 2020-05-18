$(document).ready(function() {

    var playId = getQueryVariable("playId")
    $("#player").attr("src","video/"+playId+".mp4")
    $("#owl-demo").owlCarousel({
        autoPlay: 3000,
        items : 5,
        itemsDesktop : [1199,4],
        itemsDesktopSmall : [979,4]
    });
    ininMorList();

    // Player.prototype.options_.userActions.doubleClick = false;
    var player = videojs('example_video_1',{
        // muted: false,
        controls : true,
        loop : true,
        autoplay:true,
        preload:'auto',
        example_option:true,
        controlBar: {
            progressControl: false,
            remainingTimeDisplay:false,
            playToggle:false,
            fullscreenToggle:false,




        }
        // 更多配置.....
    });







});




function ininMorList() {
    var morListhtml = "";
    $.each(morListData, function (r) {
        morListhtml += "<div class=\"col-md-4\">" +
            "<div class=\"wrap-vid\">" +
            "<div class=\"zoom-container\">" +
            "<div class=\"zoom-caption\">" +
            "<span>"+morListData[r].stu+"</span>" +
            "<a href=\"single.html?playId="+radioList[r].rid+"\">" +
            "<i class=\"fa fa-play-circle-o fa-5x\" style=\"color: #fff\"></i>" +
            "</a>" +
            "<p>"+morListData[r].title+"</p>" +
            "</div>" +
            "<img src=\""+morListData[r].address+"\" />" +
            "</div>" +
            "<h3 class=\"vid-name\"><a href=\"#\">"+morListData[r].desc+" </a></h3>" +
            "<div class=\"info\">" +
            // "<h5>By <a href=\"#\">Kelvin</a></h5>" +
            // "<span><i class=\"fa fa-calendar\"></i>25/3/2015</span> " +
            "<span><i class=\"fa fa-heart\"></i>"+morListData[r].likes+"</span>" +
            "</div>" +
            "</div>" +
            "</div>"
    })
    $("#morList").html(morListhtml);

}

var talkRoomMsg ="   <span class=\"unames\">管理员:</span>\n" +
    "                                    <span class=\"messages\">欢迎进入本房间</span>";

$("#talkRoomDom").html(talkRoomMsg);
