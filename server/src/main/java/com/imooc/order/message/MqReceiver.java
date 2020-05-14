package com.imooc.order.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author: bizy
 * @date: 2020/05/13 23:17
 */
@Slf4j
@Component
public class MqReceiver {

//    1.@RabbitListener(queues = "myQueue")
//    2.自动创建队列
    @RabbitListener(queuesToDeclare = @Queue("myQueue"))
    public void process(String message) {
        log.info("MqReceiver,{}",message);
    }

}
