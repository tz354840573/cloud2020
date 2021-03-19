package com.cloud.payment.controller;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * 消息消费者-这里测试，在需要的service实现类里面加入注解@EnableBinding(Sink.class)就可以使用rabbit监听
 * */
@EnableBinding(Sink.class)
public class RabbitConsumeContorller {
}
