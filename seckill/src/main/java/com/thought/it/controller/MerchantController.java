package com.thought.it.controller;

import com.thought.it.entity.Merchant;
import com.thought.it.service.MerchantService;
import com.thought.it.vo.MerchantVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2019/10/15.
 */
@Controller
@RequestMapping("merchantController")
public class MerchantController {

    @Autowired
    private MerchantService merchantService;

    @RequestMapping("toAdd")
    public String toAdd(){
        return "merchant/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String add(Merchant merchant){
        merchantService.insertMerchant(merchant);
        System.out.println(merchant);
        return "redirect:findByVo";
    }

    @RequestMapping("toUpdate")
    public String toUpdate(HttpServletRequest request, int id){
        Merchant merchant = merchantService.findMerchantById(id);
        System.out.println("================="+merchant);
        request.setAttribute("merchant", merchant);
        return "merchant/update";
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public String update(HttpServletRequest request,Merchant merchant){
        System.out.println(merchant);
        merchantService.updateMerchant(merchant);
        return "redirect:findByVo";
    }

    @RequestMapping("del")
    public String delMerchant(int id){
        merchantService.deleteMerchantById(id);
        return "redirect:findByVo";
    }

    @RequestMapping("findMerchantById")
    public String find(HttpServletRequest request, int id){
        Merchant merchant = merchantService.findMerchantById(id);
        request.setAttribute("merchant", merchant);
        System.out.println("================="+merchant);
        return "merchant/view";
    }

    @RequestMapping("findByVo")
    public String findByVo(HttpServletRequest request, MerchantVo merchantVo){
        List<Merchant> list = merchantService.findMerchantByVo(merchantVo);
        System.out.println(list);
        request.setAttribute("merchantList", list);
        return "merchant/list";
    }
}
