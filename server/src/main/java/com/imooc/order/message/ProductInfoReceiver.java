package com.imooc.order.message;

import com.fasterxml.jackson.core.type.TypeReference;
import com.imooc.order.utils.JsonUtil;
import com.imooc.product.common.ProductInfoOutPut;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: bizy
 * @date: 2020/05/14 23:06
 */
@Component
@Slf4j
public class ProductInfoReceiver {

    public static final String PRODUCT_STOCK_TEMPLATE = "product_stock_%s";

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RabbitListener(queuesToDeclare = @Queue("productInfo"))
    public void process(String message) {
        //message => ProductInfoOutPut
        List<ProductInfoOutPut> productInfoOutPutList = (List<ProductInfoOutPut>) JsonUtil.fromJson(message,
                new TypeReference<List<ProductInfoOutPut>>(){});
        log.info("从队列【{}】接收到消息:{}","productInfo",productInfoOutPutList);

        //存储到redis中
        for (ProductInfoOutPut productInfoOutPut : productInfoOutPutList) {
            stringRedisTemplate.opsForValue().set(String.format(PRODUCT_STOCK_TEMPLATE,productInfoOutPut.getProductIcon()),
                    String.valueOf(productInfoOutPut.getProductStock()));
        }
    }
}
