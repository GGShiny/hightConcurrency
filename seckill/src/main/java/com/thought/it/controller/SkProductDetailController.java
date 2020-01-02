package com.thought.it.controller;

import com.thought.it.entity.SkProductDetail;
import com.thought.it.service.SkProductDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2019/10/20.
 */
@Controller
@RequestMapping("skProductDetail")
public class SkProductDetailController {

    @Autowired
    private SkProductDetailService skProductDetailService;

    @RequestMapping(value = "toAdd")
    public String toAdd(HttpServletRequest request, int productid, int merchantid){
        request.setAttribute("productid", productid);
        request.setAttribute("merchantid", merchantid);
        return "productDetail/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String add(SkProductDetail skProductDetail){
        skProductDetailService.insertSkProductDetail(skProductDetail);
        return "redirect:/product/listProduct";
    }

    @RequestMapping(value = "findById")
    public String findProductDetailById(HttpServletRequest request, int productid){
        SkProductDetail productDetail = skProductDetailService.findProductDetailById(productid);
        request.setAttribute("productDetail", productDetail);
        return "productDetail/view";
    }

    @RequestMapping(value = "toUpdate")
    public String toUpdate(HttpServletRequest request, int productid){
        SkProductDetail productDetail = skProductDetailService.findProductDetailById(productid);
        request.setAttribute("productid", productid);
        request.setAttribute("productDetail", productDetail);
        return "productDetail/update";
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public String update(SkProductDetail skProductDetail){
        skProductDetailService.updateProductDetail(skProductDetail);
        System.out.println(skProductDetail);
        return "redirect:/product/listProduct";
    }
}
