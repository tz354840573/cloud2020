package com.cloud.rabbitmq;

public interface MessageProvider {
    /**
     * 发送
     * */
    void send(String message);
}
