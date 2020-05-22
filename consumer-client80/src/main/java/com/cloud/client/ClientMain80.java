package com.cloud.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient   //nacos使用注解
@SpringBootApplication
public class ClientMain80 {
    public static void main(String[] args) {
        SpringApplication.run(ClientMain80.class);
    }
}
