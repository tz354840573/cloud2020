package com.cloud.payment.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;

/**
 * 消息消费者-这里测试，在需要的service实现类里面加入注解@EnableBinding(Sink.class)就可以使用rabbit监听
 */
@EnableBinding(Sink.class)
@Slf4j
public class RabbitConsumeController {
    @StreamListener(Sink.INPUT)
    public void input(Message<String> message) {
        log.info("***********收到rabbitmq消息：" + message.getPayload());
    }
}
