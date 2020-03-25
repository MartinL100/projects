package com.cbat.starsymbol.controller;

import com.baidu.ueditor.ActionEnter;
import com.cbat.starsymbol.bean.TxtBean;
import com.cbat.starsymbol.param.TxtLevel;
import com.cbat.starsymbol.service.ITxtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@PropertySource({"classpath:application.properties"})
@RestController
public class TxtController {
    @Autowired
    ITxtService txtService;
    @Value("${img.path}")
    private String imgPath;
    @RequestMapping("/getHotTxt")
    public List<TxtBean> getHotTxt(){
        TxtBean txtBean = new TxtBean();
        txtBean.setTxtLevel(TxtLevel.LV_2);
        return txtService.findTxt(txtBean);
    }

    @RequestMapping("/addTxt")
    public void addTxt(TxtBean txtBean){
        txtService.addTxt(txtBean);
    }

    @RequestMapping("/getTxt")
    public TxtBean findTxtById(TxtBean txtBean){
        return txtService.findTxt(txtBean).get(0);
    }




    @RequestMapping(value="/config")

    public Object config(HttpServletRequest request, HttpServletResponse response) {

        response.setContentType("application/json");
        String rootPath = ClassUtils.getDefaultClassLoader().getResource("").getPath() + "static/ueditor/jsp";
        String actionName = request.getParameter("action");
        //图片、文件、视频上传
        if(actionName.equals("uploadImg") || actionName.equals("uploadvideo")|| actionName.equals("uploadfile")){
//            String uploadPath = ClassUtils.getDefaultClassLoader().getResource("static").getPath();
            String uploadPath = imgPath;
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            String date = sdf.format(new Date());
            String path = uploadPath + date ;
            File tmpFile = new File(path);
            if(!tmpFile.exists()){
                tmpFile.mkdirs();
            }
            MultipartHttpServletRequest multipareRequest = (MultipartHttpServletRequest) request;
            MultipartFile file1 = multipareRequest.getFile("upfile");
            if(file1.isEmpty()){
                return "上传错误";
            }
            //本地存储文件的名称
            String localImageName = "java" + System.currentTimeMillis()+file1.getOriginalFilename();
            try {
                String filePath = path + "/" + localImageName ;
                file1.transferTo(new File(filePath));
            } catch (IOException e) {
                e.printStackTrace();
            }
            //文件保存地址
            String imageUrl = date + "/" + localImageName;
            String prefix = file1.getOriginalFilename().substring(file1.getOriginalFilename().lastIndexOf(".")+1);
            Map<String,Object> result = new HashMap<>();
            result.put("original",file1.getOriginalFilename());
            result.put("name",file1.getOriginalFilename());
            result.put("url",imageUrl);
            result.put("size",file1.getSize());
            result.put("type","."+prefix);
            result.put("state","SUCCESS");
            return result ;

        }else if (actionName.equals("uploadscrawl")){

            return null ;
        }else if (actionName.equals("config")){
            try {
                response.setCharacterEncoding("UTF-8");
                String exec = new ActionEnter(request, rootPath).exec();
                PrintWriter writer = response.getWriter();
                writer.write(exec);
                writer.flush();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null ;

    }

}
