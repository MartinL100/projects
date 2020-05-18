var welcome="欢迎来到名人名兰";
var playIng = "直播中";
var rest = "主播休息中";
/**
 * stu 主播状态
 * title 标题
 * address 图片地址
 * des  描述
 * like 赞
 */
var  radioList = [
    {stu:playIng,title:'门叔',address:"images/27.jpg",desc:'谢谢你这么优秀还关注我',likes:'238',rid:'11'},
    {stu:playIng,title:'扶苏苏#',address:"images/11.jpg",desc:'咕嘟咕嘟嘟嘟、biu',likes:'783',rid:'9'},
    {stu:playIng,title:'皮香香',address:'images/30.jpg',desc:'热爱生活',likes:'872',rid:'14'},
    {stu:playIng,title:'王二户外',address:'images/35.jpg',desc:'谢谢关注',likes:'263',rid:'18'},
    {stu:playIng,title:'🎵半仙儿',address:'images/14.jpg',desc:'月半弯',likes:'298',rid:'6'},
    {stu:playIng,title:'你的木子',address:'images/15.jpg',desc:'木子李',likes:'195',rid:'7'},
    {stu:playIng,title:'小橙子',address:'images/16.jpg',desc:'承蒙厚爱，万分感激',likes:'698',rid:'8'},
    {stu:playIng,title:'渔小鱼',address:'images/29.jpg',desc:'快乐随我行、',likes:'158',rid:'13'},
    {stu:playIng,title:'颖儿@',address:'images/34.jpg',desc:'世界那么大，我想去看看！',likes:'553',rid:'17'},

];

var lunBo = [
    {stu:playIng,title:'夏小婉、',address:'images/10.jpg',rid:'2'},
    {stu:playIng,title:'苏西儿～lucky',address:'images/11.jpg',rid:'3'},
    {stu:playIng,title:'小念念@',address:'images/26.jpg',rid:'4'},
    // {stu:playIng,title:'标题a4',address:'images/4.jpg',rid:'v9'},
    // {stu:playIng,title:'标题a5',address:'images/2.jpg',rid:'v9'},
    // {stu:playIng,title:'标题a6',address:'images/2.jpg',rid:'v9'},
]

/**
 * stu 主播状态
 * title 标题
 * address 图片地址
 * des  描述
 * like 赞
 */

var morListData = [
    {stu:playIng,title:'门叔',address:"images/27.jpg",desc:'谢谢你这么优秀还关注我',likes:'238',rid:'11'},
    {stu:playIng,title:'扶苏苏#',address:"images/11.jpg",desc:'咕嘟咕嘟嘟嘟、biu',likes:'783',rid:'9'},
    {stu:playIng,title:'皮香香',address:'images/30.jpg',desc:'热爱生活',likes:'872',rid:'14'},
    {stu:playIng,title:'王二户外',address:'images/35.jpg',desc:'谢谢关注',likes:'263',rid:'18'},
    {stu:playIng,title:'🎵半仙儿',address:'images/14.jpg',desc:'月半弯',likes:'298',rid:'6'},
    {stu:playIng,title:'你的木子',address:'images/15.jpg',desc:'木子李',likes:'195',rid:'7'},
    {stu:playIng,title:'小橙子',address:'images/16.jpg',desc:'承蒙厚爱，万分感激',likes:'698',rid:'8'},
    {stu:playIng,title:'渔小鱼',address:'images/29.jpg',desc:'快乐随我行、',likes:'158',rid:'13'},
    {stu:playIng,title:'颖儿@',address:'images/34.jpg',desc:'世界那么大，我想去看看！',likes:'553',rid:'17'},
]


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