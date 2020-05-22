package com.cloud.payment.controller;

import com.cloud.api.entities.CommonResult;
import com.cloud.api.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.cloud.payment.service.PaymentService;

import java.util.List;

@Controller
@RequestMapping("payment")
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/save")
    @ResponseBody
    public CommonResult save(String serial) {
        CommonResult result;
        Payment payment = new Payment();
        payment.setSerial(serial);
        int code = paymentService.save(payment);
        if (code > 0) {
            log.info("*********添加成功,添加行数" + code);
            result = new CommonResult(200, "添加成功,服务端口：" + port);
        } else {
            log.info("*********添加失败");
            result = new CommonResult(400, "添加失败,服务端口：" + port);
        }
        return result;
    }


    @RequestMapping("/get")
    @ResponseBody
    public CommonResult get(Long id) {
        CommonResult result;
        Payment payment = paymentService.getPaymentById(id);
        if (null != payment) {
            log.info("*********查询结果" + payment);
            result = new CommonResult(200, "查询成功,服务端口：" + port, payment);
        } else {
            log.info("*********查询数据为空*******");
            result = new CommonResult(400, "查询数据为空,服务端口：" + port);
        }
        return result;
    }

    @RequestMapping("/getList")
    @ResponseBody
    public CommonResult getList() {
        CommonResult result;
        List<Payment> paymentList = paymentService.getPaymentList();
        result = new CommonResult(200, "查询成功,服务端口：" + port, paymentList);
        return result;
    }
}
