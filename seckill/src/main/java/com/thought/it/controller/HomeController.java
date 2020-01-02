package com.thought.it.controller;

import com.sun.org.apache.xerces.internal.impl.dv.xs.DateDV;
import com.thought.it.entity.SkOrder;
import com.thought.it.entity.SkProductDetail;
import com.thought.it.entity.SkProductInfo;
import com.thought.it.service.MerchantService;
import com.thought.it.service.SkOrderService;
import com.thought.it.service.SkProductDetailService;
import com.thought.it.service.SkProductService;
import com.thought.it.vo.ConstomSkProductVo;
import com.thought.it.vo.SkProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2019/10/20.
 */
@Controller
@RequestMapping("home")
public class HomeController {

    @Autowired
    private SkProductService skProductService;

    @Autowired
    private SkProductDetailService skProductDetailService;

    @Autowired
    private SkOrderService skOrderService;

    @RequestMapping("toUserHome")
    public String toUserHome(HttpServletRequest request){
        SkProductVo productVo = new SkProductVo();
        ConstomSkProductVo constomSkProductVo = new ConstomSkProductVo();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String nowStr = format.format(new Date());
        constomSkProductVo.setStartEndtime(nowStr);
        constomSkProductVo.setAuditstate(2);
        productVo.setConstomSkProductVo(constomSkProductVo);
        List<SkProductInfo> skProductList = skProductService.listSkProduct(productVo);
        request.setAttribute("skProductList", skProductList);
        return "home/home";
    }

    @RequestMapping("toViewPage")
    public String toViewPage(HttpServletRequest request, int productId){
        SkProductInfo skProduct= skProductService.findSkProductById(productId);
        SkProductDetail skProductDetail = skProductDetailService.findProductDetailById(productId);
        request.setAttribute("skProduct", skProduct);
        request.setAttribute("skProductDetail", skProductDetail);
        return "order/selldetail";
    }

    @RequestMapping("toMerchantHome")
    public String toMerchantHome(){
        return "merchanthome/home";
    }
}
