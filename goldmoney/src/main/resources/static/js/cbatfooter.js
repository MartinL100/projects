var netData={
     tel:"028-8555-8633"
    ,address:"成都市武侯区佳灵路3号2栋12层1205号"
    ,name:"成都金税宝财税咨询有限公司"
    ,nickName:"金税宝"
    ,ICPID:"蜀ICP备19011451号"
    ,year:"2020"
    ,title:"金税宝"
    ,imgUrl:"/img/towma.jpg"
}






var footer = " <div class=\"footerdiv\">\n" +
    "        <div class=\"footer-left\">\n" +
    "          <div >\n" +
    "              <ul>\n" +
    "                  <li>公司注册</li>\n" +
    "                  <li>公司变更</li>\n" +
    "                  <li>公司剥离</li>\n" +
    "              </ul>\n" +
    "          </div>\n" +
    "            <div>\n" +
    "                <ul>\n" +
    "                    <li>公司注销</li>\n" +
    "                    <li>代理记账</li>\n" +
    "                    <li>税务筹划</li>\n" +
    "                </ul>\n" +
    "            </div>\n" +
    "            <div>\n" +
    "                <ul>\n" +
    "                    <li>审计</li>\n" +
    "                    <li>验资</li>\n" +
    "                    <li>更多</li>\n" +
    "                </ul>\n" +
    "            </div>\n" +
    "\n" +
    "        </div>\n" +
    "        <div class=\"footer-right\">\n" +
    "            <div >\n" +
    "                <ul>\n" +
    "                    <li>  联系电话："+netData.tel+" </li>\n" +
    "                    <li>公司名称："+netData.name+"</li>\n" +
    "                    <li>  公司地址："+netData.address+"</li>\n" +
    "                </ul>\n" +
    "\n" +
    "            </div>\n" +
    "        <div>\n" +
    "            <img src='"+netData.imgUrl+"'alt=\"联系方式\" style=\"width: 80px;height: 80px\"/>\n" +
    "            <br/> <br/> <br/>\n" +
    "            扫一扫，了解更多\n" +
    "        </div>\n" +
    "\n" +
    "            <div >\n" +
    "\n" +
    "\n" +
    "            </div>\n" +
    "\n" +
    "        </div>\n" +
    "\n" +
    "    </div>\n" +
    "    <div align=\"center\" class=\"beian\" >\n" +
    netData.name+" 版权所有 "+netData.nickName+"平台  备案号:<a href='http://www.beian.miit.gov.cn/'>"+netData.ICPID+"<a/>\n" +
    "        <br/>\n" +
    "        Copyright @"+netData.year+" All rights reserved.\n" +
    "    </div>";

// var talkWin="<div class='cbat-talk-win'></div>";

$("#cbat-footer").html(footer);
document.title=netData.title