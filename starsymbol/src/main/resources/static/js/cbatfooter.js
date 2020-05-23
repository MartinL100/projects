var netData={
     tel:"028-8555-3793"
    ,address:"成都市武侯区佳灵路3号2栋12层1205号"
    ,name:"四川星标企业管理有限公司"
    ,nickName:"星标企管家"
    ,ICPID:" 蜀ICP备19009776号-1"
    ,year:"2020"
    ,title:"星标企管家"
    ,imgUrl:"/img/towma.jpg"
}






var footer = " <div class=\"footerdiv\">\n" +
    "        <div class=\"footer-left\">\n" +
    "          <div >\n" +
    "              <ul>\n" +
    "                  <li>公司注册</li>\n" +
    "                  <li>公司变更</li>\n" +
    "                  <li>公司转让</li>\n" +
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
    "                    <li>审计验资</li>\n" +
    "                    <li style='color: orangered'>行政许可</li>\n" +
    "                    <li>更多服务</li>\n" +
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
    "            <img src='"+netData.imgUrl+"' alt=\"联系方式\" style=\"width: 80px;height: 80px\"/>\n" +
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
    netData.name+" 版权所有 "+netData.nickName+"平台  备案号:"+netData.ICPID+"\n" +
    "        <br/>\n" +
    "        Copyright @"+netData.year+" All rights reserved.\n" +
    "    </div>";



$("#cbat-footer").html(footer);
document.title=netData.title











var header=" <div class=\"index_head_c\">\n" +
    "        <div class=\"logo\"><img src=\"/img/logo.png\" alt=\"星标企管家\"></div>\n" +
    "        <div class=\"nav\">\n" +
    "            <a href=\"/index.html\" class=\"nav_list\"><i>网站首页</i>\n" +
    "                <label></label>\n" +
    "            </a>\n" +
    "            <a href=\"/page/License.html\"  class=\"nav_list TopActiveMenu ps \">\n" +
    "                <i style='color: orangered;font-weight: bold'>行政许可</i>\n" +
    "                <label></label>\n" +
    "            </a>\n" +
    "            <a href=\"/page/RegistCompany.html\" class=\"nav_list TopActiveMenu ps \" id=\"drop_down2\">\n" +
    "                <i>公司注册</i>\n" +
    "                <label></label>\n" +
    "            </a>\n" +
    "            <a href=\"/page/changeCompany.html\"  class=\"nav_list TopActiveMenu ps \" id=\"drop_down311 \">\n" +
    "            <i>公司变更</i>\n" +
    "            <label></label>\n" +
    "            </a>\n" +
    "            <a href=\"/page/sellCompany.html\"  class=\"nav_list TopActiveMenu ps \" id=\"drop_down322 \">\n" +
    "            <i>公司转让</i>\n" +
    "            <label></label>\n" +
    "            </a>\n" +
    "            <a href=\"/page/delCompany.html\"  class=\"nav_list TopActiveMenu ps \" id=\"drop_down31 \">\n" +
    "            <i>公司注销</i>\n" +
    "            <label></label>\n" +
    "            </a>\n" +
    "            <a href=\"/page/calcMoney.html\"  class=\"nav_list TopActiveMenu ps \" id=\"drop_down32 \">\n" +
    "                <i>代理记账</i>\n" +
    "                <label></label>\n" +
    "            </a>\n" +
    "            <a href=\"/page/others.html\"  class=\"nav_list TopActiveMenu ps \" id=\"drop_down33 \">\n" +
    "                <i>其它</i>\n" +
    "                <label></label>\n" +
    "            </a>\n" +
    "        </div>\n" +
    "\n" +
    "    </div>";


$("#cbat-head").html(header);