package com.thought.it.controller;

import com.thought.it.entity.SeckillUser;
import com.thought.it.service.SeckillUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 用户登陆注册模块
 * Created by Administrator on 2019/10/20.
 */
@Controller
@RequestMapping("userRegister")
public class UserRegisterController {
    @Autowired
    private SeckillUserService seckillUserService;

    /**
     * 用户注册
     */
    @RequestMapping(value = "toRegister")
    public String toRegister(){
        return "user/toRegister";
    }

    /**
     * 用户注册
     * @param seckillUser
     */
    @RequestMapping(value = "register", method = RequestMethod.POST)
    public String register(HttpServletRequest request, SeckillUser seckillUser){
        seckillUserService.insertSeckillUser(seckillUser);
        HttpSession session = request.getSession();
        session.setAttribute("user", seckillUser);
        return  "home/home";
    }

    @RequestMapping(value = "tologin")
    public String toLogin(){
        return "user/tologin";
    }

    /**
     * 用户登陆
     * @param seckillUser
     */
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String addUser(HttpServletRequest request, SeckillUser seckillUser){
        String account = seckillUser.getUseraccount();
        String password = seckillUser.getUserpassword();
        SeckillUser user = seckillUserService.findUserByAccount(account);
        System.out.println(user);
        if (user == null){
            System.out.println("无此用户");
            request.setAttribute("errorinfo", "无此用户");
        } else if (!user.getUserpassword().equals(password)) {
            System.out.println("密码错误");
            request.setAttribute("errorinfo", "密码错误");
        }else {
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            return  "redirect:/home/toUserHome";
        }
       return "home/error";
    }

    @RequestMapping(value = "logout")
    public String logout(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.removeAttribute("user");
        return "home/home";
    }
}
