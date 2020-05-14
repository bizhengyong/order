package com.imooc.order.message;

import com.imooc.product.common.ProductInfoOutPut;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author: bizy
 * @date: 2020/05/14 23:06
 */
@Component
public class ProductInfoReceiver {

    @RabbitListener(queuesToDeclare = @Queue("productInfo"))
    public void process(String message) {
        //message => ProductInfoOutPut
    }
}
