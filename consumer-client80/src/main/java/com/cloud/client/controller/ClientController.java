package com.cloud.client.controller;

import com.cloud.api.entities.CommonResult;
import com.cloud.api.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;


/**
 * 模拟客户端--调用服务的controller
 */
@Controller
@RequestMapping("client")
@Slf4j
public class ClientController {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${server-url.nacos-user-server}")
    private String serverUrl;

    @RequestMapping("/save")
    @ResponseBody
    public CommonResult save(String serial) {
        return restTemplate.getForObject(serverUrl + "/payment/save/" + serial, CommonResult.class);
    }


    @RequestMapping("/get")
    @ResponseBody
    public CommonResult get(Long id) {
        return restTemplate.getForObject(serverUrl + "/payment/get/" + id, CommonResult.class);
    }

    @RequestMapping("/getList")
    @ResponseBody
    public CommonResult getList() {
        return restTemplate.getForObject(serverUrl + "/payment/getList", CommonResult.class);
    }
}
