package com.cloud.client.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced //必写，用RestTemplate结合Ribbon做负载均衡的时候，nacos自带有负载均衡
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
