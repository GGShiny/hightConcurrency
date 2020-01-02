package com.thought.it.controller;

import com.thought.it.entity.SeckillUser;
import com.thought.it.service.SeckillUserService;
import com.thought.it.vo.SeckillUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2019/10/16.
 */
@Controller
@RequestMapping("user")
public class SeckillUserController {

    @Autowired
    private SeckillUserService seckillUserService;


    @RequestMapping("toAdd")
    public String toAdd(){
        return "user/add";
    }

    /**
     * 添加用户
     * @param seckillUser
     */
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String addUser(SeckillUser seckillUser){
        seckillUserService.insertSeckillUser(seckillUser);
        System.out.println(seckillUser);
        return  "redirect:findByVo";
    }

    @RequestMapping("toUpdate")
    public String toUpdate(HttpServletRequest request, int id){
        SeckillUser seckillUser = seckillUserService.findSeckillUserById(id);
        request.setAttribute("user", seckillUser);
        System.out.println(seckillUser);
        return "user/update";
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public String update(HttpServletRequest request, SeckillUser seckillUser){
        seckillUserService.updateSeckillUser(seckillUser);
        System.out.println(seckillUser);
        return  "redirect:findByVo";
    }

    @RequestMapping("del")
    public String deleteUser(int id){
        seckillUserService.deleteSeckillUserById(id);
        System.out.println(id);
        return  "redirect:findByVo";
    }

    @RequestMapping("findById")
    public String findById(HttpServletRequest request, int id){
        SeckillUser user = seckillUserService.findSeckillUserById(id);
        request.setAttribute("user", user);
        System.out.println(user);
        return "user/view";
    }

    @RequestMapping("findByVo")
    public String findByVo(HttpServletRequest request, SeckillUserVo seckillUserVo){
        List<SeckillUser> seckillUserList = seckillUserService.findSeckillUserByVo(seckillUserVo);
        request.setAttribute("seckillUserList", seckillUserList);
        System.out.println(seckillUserList);
        return "user/list";
    }
}
