package com.imooc.order;

import org.junit.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 发送mq消息测试
 * @author: bizy
 * @date: 2020/05/13 20:19
 */
@Component
public class MqSenderTest extends OrderApplicationTests {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Test
    public void send() {
        amqpTemplate.convertAndSend("myQueue","new " + new Date());
    }

    @Test
    public void sendOrder() {
        amqpTemplate.convertAndSend("myOrder","computer","new " + new Date());
    }

}