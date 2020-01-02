package com.thought.it.service;

import com.thought.it.dao.SkOrderDao;
import com.thought.it.entity.Merchant;
import com.thought.it.entity.SkOrder;
import com.thought.it.vo.ConstomOrderVo;
import com.thought.it.vo.SkOrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/10/21.
 */
@Service
public class SkOrderService {

    @Autowired
    private SkOrderDao skOrderDao;

    public void insertSkOrder(SkOrder skOrder){
        skOrderDao.insertSkOrder(skOrder);
    };

    public List<SkOrder> findOrderById(int userid){
        return skOrderDao.findOrderById(userid);
    };

    public void updateOrderStateById(int paystatus, int id, int paytype){
        SkOrderVo skOrderVo = new SkOrderVo();
        ConstomOrderVo constomOrderVo = new ConstomOrderVo();
        constomOrderVo.setPaystatus(paystatus);
        constomOrderVo.setId(id);
        constomOrderVo.setPaytype(paytype);
        skOrderVo.setConstomOrderVo(constomOrderVo);
        skOrderDao.updateOrderStateById(skOrderVo);
    };

    public List<Merchant> findOrderByMerchantId(int merchantId){
        return skOrderDao.findOrderByMerchantId(merchantId);
    };

    public void applyRefund(int paystatus, int orderId){
        SkOrderVo skOrderVo = new SkOrderVo();
        ConstomOrderVo constomOrderVo = new ConstomOrderVo();
        constomOrderVo.setPaystatus(paystatus);
        constomOrderVo.setId(orderId);
        skOrderDao.applyRefund(skOrderVo);
    };
}
