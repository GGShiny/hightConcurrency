package com.thought.it.service.pay;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/10/22.
 */
@Service
public interface OrderToPay {
    public int payWithOrder(String tradeserialnumber, int payAmount);

    public int refundOrder(String tradeserialnumber, int payAmount);
}
