package com.vivian.springcloud.controller;

import com.vivian.springcloud.entities.CommonResult;
import com.vivian.springcloud.entities.Payment;
import com.vivian.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class paymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("插入结果: " + result);
        if(result > 0) {
            return new CommonResult(200, "插入成功, 端口号" + serverPort);
        } else {
            return new CommonResult(-1, "插入失败, 端口号" + serverPort);
        }
    }

    @RequestMapping(value = "/payment/get", method = RequestMethod.GET)
    public CommonResult getPaymentById (@RequestParam("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("查询成功,id= {} ,端口号: {} ", id, serverPort);
        if(payment != null) {
            return new CommonResult(200, "查询成功, 端口为 " + serverPort, payment);
        } else {
            return new CommonResult(-1, "查询id=" + id + "失败");
        }
    }
}
