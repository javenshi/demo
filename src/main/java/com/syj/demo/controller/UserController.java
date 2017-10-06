package com.syj.demo.controller;


import com.syj.demo.dao.UserDao;
import com.syj.demo.entity.User;
import com.syj.demo.util.CookieUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserDao userDao;
    @ResponseBody
    @RequestMapping("/rigister")
    public Map<String,Object> rigister(@RequestParam("username")String username,
                                       @RequestParam("password")String password,
                                       @RequestParam("email")String email, HttpServletResponse response){
        User user=new User(username,password,email);
       // System.out.println(user);
        user.setUserId(userDao.insertUser(user));
        CookieUtil.addCookie(response,"userInfo",user.getUserId()+"");
       // System.out.println(user);
        Map<String,Object> map=new HashMap<>();
        map.put("user",user);
        return map;
    }
    @ResponseBody
    @RequestMapping("/findUser/{i}")
    public Map<String,Object> findUser(@RequestParam("username")String username){
        User user= userDao.findUser(username);
        Map<String,Object> map=new HashMap<>();
        //System.out.println(user!=null);
        map.put("isUser",user!=null);
        return map;
    }
    @ResponseBody
    @RequestMapping("/login")
    public Map<String,Object> login(@RequestParam("username")String username,
                                    @RequestParam("password")String password,
                                    HttpServletResponse response){
        User user= userDao.findUserByNameAndPw(username,password);
        Map<String,Object> map=new HashMap<>();
        System.out.println(user);
        CookieUtil.addCookie(response,"userInfo",user.getUserId()+"");
        map.put("user",user);
        return map;
    }
    @ResponseBody
    @RequestMapping("/getUserCookie")
    public Map<String,Object> getCookie(HttpServletRequest request){
        Map<String,Object> map=new HashMap<>();
        if(CookieUtil.getCookieByName(request,"userInfo")!=null){
            map.put("userIn",true);
        }else{
            map.put("userIn",false);
        }
        return map;
    }
}
