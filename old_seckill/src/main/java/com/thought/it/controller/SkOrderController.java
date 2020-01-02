package com.thought.it.controller;

import com.thought.it.dao.SkOrderDao;
import com.thought.it.entity.Merchant;
import com.thought.it.entity.SeckillUser;
import com.thought.it.entity.SkOrder;
import com.thought.it.entity.SkProductInfo;
import com.thought.it.service.SkOrderService;
import com.thought.it.service.SkProductService;
import com.thought.it.service.pay.WeiXinPay;
import com.thought.it.service.pay.XinHangKaPay;
import com.thought.it.service.pay.ZhiFuBaoPay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2019/10/21.
 */
@Controller
@RequestMapping("order")
public class SkOrderController {

    @Autowired
    private SkOrderService skOrderService;

    @Autowired
    private SkProductService skProductService;

    @Autowired
    private WeiXinPay weiXinPay;

    @Autowired
    private ZhiFuBaoPay zhiFuBaoPay;

    @Autowired
    private XinHangKaPay xinHangKaPay;

    @RequestMapping(value = "payOrder")
    public String payOrder(SkOrder skOrder){
        skOrder.setCreatetime(new Date());
        int payState = 1;
        skOrder.setPaystatus(payState);
        String orderNum = UUID.randomUUID().toString();
        skOrder.setTradeserialnumber(orderNum);
        skOrderService.insertSkOrder(skOrder);
        return "redirect:/home/toUserHome";
    }

    @RequestMapping(value = "toPayOrder")
    public String toPayOrder(HttpServletRequest request, int id, int num){
        SkProductInfo skProduct = skProductService.findSkProductById(id);
        request.setAttribute("skProduct", skProduct);
        request.setAttribute("productnum", num);
        int payAmount = num * skProduct.getSeckillprice();
        request.setAttribute("payAmount", payAmount);
        HttpSession session = request.getSession();
        SeckillUser user = (SeckillUser) session.getAttribute("user");
        if (user != null) {
            request.setAttribute("userid", user.getId());
        }else {
            request.setAttribute("error", "未登录");
            return "user/tologin";
        }
        return "order/payorder";
    }

    @RequestMapping(value = "findOrderById")
    public String findOrderById(HttpServletRequest request){
        String retUrl = "order/list";
        HttpSession session = request.getSession();
        SeckillUser user = (SeckillUser) session.getAttribute("user");
        if (user != null){
            List<SkOrder> orderList = skOrderService.findOrderById(user.getId());
            request.setAttribute("orderList", orderList);
        }else {
            request.setAttribute("error", "未登录");
            retUrl = "user/tologin";
        }
        return retUrl;
    }

    @RequestMapping(value = "findOrderByMerchantId")
    public String findOrderByMerchantId(HttpServletRequest request){
        String retUrl = "order/merchantOrderList";
        HttpSession session = request.getSession();
        Merchant merchant = (Merchant) session.getAttribute("merchant");
        if (merchant != null){
            List<Merchant> merchantList = skOrderService.findOrderByMerchantId(merchant.getId());
            request.setAttribute("orderList", merchantList);
        }else {
            request.setAttribute("error", "未登录");
            retUrl = "merchant/tologin";
        }
        return retUrl;
    }

    /**
     *
     * @param request
     * @param payType   支付类型
     * @param tradeserialnumber 订单流水号
     * @param payAmount 支付金额
     * @return
     */
    @RequestMapping(value = "payWithOrder", method = RequestMethod.POST)
    public String payWithOrder(HttpServletRequest request, int payType, int id, String tradeserialnumber, int payAmount){
        int paystates = 2;
        if (payType == 1){   //支付宝
            paystates = zhiFuBaoPay.payWithOrder(tradeserialnumber, payAmount);
        }else if (payType == 2){  //微信
            paystates = weiXinPay.payWithOrder(tradeserialnumber, payAmount);
        }else if (payType == 3){  //银行卡
            paystates = xinHangKaPay.payWithOrder(tradeserialnumber, payAmount);
        }
        if (paystates == 1){
            skOrderService.updateOrderStateById(2, id, payType);
        }
        return "redirect:/order/findOrderById";
    }

    /**
     *跳转到支付页面
     * @param request
     * @param tradeserialnumber 订单流水号
     * @param payAmount 支付金额
     * @return
     */
    @RequestMapping(value = "toPayWithOrder")
    public String toPayWithOrder(HttpServletRequest request, int id, String tradeserialnumber, int payAmount){
        request.setAttribute("id", id);
        request.setAttribute("tradeserialnumber", tradeserialnumber);
        request.setAttribute("payAmount", payAmount);
        return "order/payreal";
    }

    @RequestMapping(value = "applyRefund")
    public String applyRefund(HttpServletRequest request, int orderId, int paytype ){
        String retUrl = "redirect:/order/findOrderById";
        HttpSession session = request.getSession();
        SeckillUser merchant = (SeckillUser) session.getAttribute("user");
        if (merchant != null){
            skOrderService.updateOrderStateById(4, orderId, paytype);
        }else {
            request.setAttribute("error", "未登录");
            retUrl = "user/tologin";
        }
        return retUrl;
    }

    @RequestMapping(value = "auditRefund")
    public String auditRefund(HttpServletRequest request,String tradeserialnumber, int payAmount, int orderId, int paytype, int paystatus){
        String retUrl = "redirect:/order/findOrderByMerchantId";
        HttpSession session = request.getSession();
        Merchant merchant = (Merchant) session.getAttribute("merchant");

        if (merchant != null){
            if(paystatus == 3){ //paystatus 1.未支付   2.已支付   3.退款成功  4.申请退款  5.拒绝退款

                if (paytype == 1){   //支付宝
                    paystatus = zhiFuBaoPay.refundOrder(tradeserialnumber, payAmount);
                }else if (paytype == 2){  //微信
                    paystatus = weiXinPay.refundOrder(tradeserialnumber, payAmount);
                }else if (paytype == 3){  //银行卡
                    paystatus = xinHangKaPay.refundOrder(tradeserialnumber, payAmount);
                }

                if (paystatus == 1){
                    skOrderService.updateOrderStateById(3, orderId, paytype);
                }

            }else if (paystatus == 5){
                skOrderService.updateOrderStateById(5, orderId, paytype);
            }

        }else {
            request.setAttribute("error", "未登录");
            retUrl = "merchant/tologin";
        }
        return retUrl;
    }
}
