package com.thought.it.controller;

import com.thought.it.entity.Merchant;
import com.thought.it.entity.SeckillUser;
import com.thought.it.service.MerchantService;
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
@RequestMapping("merchantRegister")
public class MerchantRegisterController {
    @Autowired
    private MerchantService merchantService;

    /**
     * 用户注册
     */
    @RequestMapping(value = "toRegister")
    public String toRegister(){
        return "merchant/toRegister";
    }

    /**
     * 用户注册
     * @param merchant
     */
    @RequestMapping(value = "register", method = RequestMethod.POST)
    public String register(HttpServletRequest request, Merchant merchant){
        merchantService.insertMerchant(merchant);
        System.out.println(merchant);
        HttpSession session = request.getSession();
        session.setAttribute("merchant", merchant);
        return  "merchanthome/home";
    }

    @RequestMapping(value = "tologin")
    public String toLogin(){
        return "merchant/tologin";
    }

    /**
     * 用户登陆
     * @param merchant
     */
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(HttpServletRequest request, Merchant merchant){
        String account = merchant.getMerchantaccount();
        String password = merchant.getMerchantpassword();
        Merchant findMerchant = merchantService.findMerchantByAccount(account);
        System.out.println("findMerchant"+findMerchant+"=====account:"+account+"====password:"+ password + "=merchant:" +merchant);
        if (findMerchant == null){
            System.out.println("无此商家");
            request.setAttribute("errorinfo", "无此商家");
        } else if (!findMerchant.getMerchantpassword().equals(password)) {
            System.out.println("密码错误");
            request.setAttribute("errorinfo", "密码错误");
        }else {
            HttpSession session = request.getSession();
            session.setAttribute("merchant", findMerchant);
            return  "merchanthome/home";
        }
       return "merchanthome/error";
    }

    @RequestMapping(value = "logout")
    public String logout(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.removeAttribute("merchant");
        return "home/home";
    }
}
