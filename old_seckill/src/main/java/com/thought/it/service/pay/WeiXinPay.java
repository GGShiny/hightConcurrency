package com.thought.it.service.pay;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/10/22.
 */
@Service
public class WeiXinPay implements OrderToPay {
    @Override
    public int payWithOrder(String tradeserialnumber, int payAmount) {
        System.out.println("微信支付成功");
        return 1;
    }

    @Override
    public int refundOrder(String tradeserialnumber, int payAmount) {
        System.out.println("微信退款成功");
        return 1;
    }
}
