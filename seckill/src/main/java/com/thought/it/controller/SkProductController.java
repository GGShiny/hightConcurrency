package com.thought.it.controller;

import com.thought.it.entity.SkProductInfo;
import com.thought.it.service.SkProductService;
import com.thought.it.vo.SkProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2019/10/18.
 */
@Controller
@RequestMapping("product")
public class SkProductController {

    @Autowired
    private SkProductService skProductService;

    @RequestMapping(value = "toApplySkProduct")
    public String toApplySkProduct(){
        return "product/add";
    }

    @RequestMapping(value = "applySkProduct", method = RequestMethod.POST)
    public String applySkProduct(SkProductInfo skProductInfo){
        skProductService.applySkProduct(skProductInfo);
        System.out.println(skProductInfo);
        return "redirect:listProduct";
    }

    @RequestMapping("listProduct")
    public String listSkProduct(HttpServletRequest request, SkProductVo skProductVo){
        List<SkProductInfo> list = skProductService.listSkProduct(skProductVo);
        request.setAttribute("list", list);
        return "product/list";
    }

    @RequestMapping(value = "findSkProductById")
    public String findSkProductById(HttpServletRequest request, int id){
        SkProductInfo skProduct = skProductService.findSkProductById(id);
        request.setAttribute("skProduct", skProduct);
        return "product/view";
    }

    @RequestMapping(value = "del")
    public String delSkProduct(int id){
        skProductService.delSkProduct(id);
        return "redirect:listProduct";
    }

    @RequestMapping(value = "toUpdateProduct")
    public String toUpdateSkProduct(HttpServletRequest request, int id){
        SkProductInfo skProduct = skProductService.findSkProductById(id);
        Date startTime = skProduct.getStarttime();
        Date endTime = skProduct.getEndtime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String startTimeStr = dateFormat.format(startTime);
        String endTimeStr = dateFormat.format(endTime);
        skProduct.setStartTimeStr(startTimeStr);
        skProduct.setEndTimeStr(endTimeStr);
        request.setAttribute("skProduct", skProduct);
        return "product/update";
    }

    @RequestMapping(value = "updateProduct", method = RequestMethod.POST)
    public String updateSkProduct(SkProductInfo skProductInfo){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String startTimeStr = skProductInfo.getStartTimeStr();
        String endTimeStr = skProductInfo.getEndTimeStr();
        try {
            Date startTime = format.parse(startTimeStr);
            Date endTime = format.parse(endTimeStr);
            skProductInfo.setStarttime(startTime);
            skProductInfo.setEndtime(endTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        skProductService.updateSkProduct(skProductInfo);
        System.out.println(skProductInfo);
        return "redirect:listProduct";
    }

    @RequestMapping(value = "toUpdateProductState")
    public String toUpdateProductState(HttpServletRequest request, int id){
        SkProductInfo skProduct = skProductService.findSkProductById(id);
        Date startTime = skProduct.getStarttime();
        Date endTime = skProduct.getEndtime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String startTimeStr = dateFormat.format(startTime);
        String endTimeStr = dateFormat.format(endTime);
        skProduct.setStartTimeStr(startTimeStr);
        skProduct.setEndTimeStr(endTimeStr);
        request.setAttribute("skProduct", skProduct);
        return "product/auditProduct";
    }

    @RequestMapping(value = "updateProductState",method = RequestMethod.POST)
    public String updateSkProductState(int id, int state){
        skProductService.updateSkProductState(id, state);
        return "redirect:listProduct";
    }
}
