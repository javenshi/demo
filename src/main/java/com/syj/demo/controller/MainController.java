package com.syj.demo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.syj.demo.dao.AnnouncementDao;
import com.syj.demo.dao.UserDao;
import com.syj.demo.entity.Blogs;
import com.syj.demo.service.IndexService;
import com.syj.demo.util.JavaMail;
import com.syj.demo.util.MyException;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MainController {


    @Autowired
    IndexService indexService;
    @Autowired
    AnnouncementDao announcementDao;
    @Autowired
    JavaMail jm;
    @RequestMapping(value = {"","/"})
    public String main(){
        return "index";
    }

    @RequestMapping(value = "in",method = RequestMethod.GET)
    public String in(){
        return  "page/in";
    }
    @RequestMapping(value = "write",method = RequestMethod.GET)
    public String write(){
        return  "page/write";
    }
    @RequestMapping(value = "err",method = RequestMethod.GET)
    public String error(){
        return  "error";
    }
    @ResponseBody
    @RequestMapping(value = "index",method = RequestMethod.GET)
    public Map<String,Object> index(@RequestParam(value = "pageNum",defaultValue = "1")String pageNum){
        Map<String,Object> map=new HashMap<>();
        //System.out.println(pageNum);
        PageHelper.startPage(Integer.parseInt(pageNum),5);
        List<Blogs> blogsList=indexService.findAllBlogs();
        PageInfo page = new PageInfo(blogsList);
        map.put("announcement",announcementDao.findAll());
        //System.out.println(blogsList.size());
        map.put("blogs",blogsList);
        map.put("pages",page.getPages());
       // map.put("test1","test1");
        return map;
    }
    @ResponseBody
    @RequestMapping(value = "yzm/{i}",method = RequestMethod.GET)
    public Map<String,Object> yzm(@RequestParam("email")String email) throws MyException {
        //System.out.println("---------------------------");
        Map<String,Object> map=new HashMap<>();
        String str=jm.sendRigisterMail(email);
        map.put("yzm",str);
        return map;
    }
}
