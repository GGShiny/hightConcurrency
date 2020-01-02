package com.thought.it.dao;

import com.thought.it.entity.Merchant;
import com.thought.it.entity.SkOrder;
import com.thought.it.vo.SkOrderVo;

import java.util.List;

/**
 * Created by Administrator on 2019/10/21.
 */
public interface SkOrderDao {
    public void insertSkOrder(SkOrder skOrder);

    public List<SkOrder> findOrderById(int userid);

    public List<Merchant> findOrderByMerchantId(int merchantId);

    public void updateOrderStateById(SkOrderVo skOrderVo);

    public void applyRefund(SkOrderVo skOrderVo);
}
