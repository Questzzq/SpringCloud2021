package com.vivian.springcloud.controller;

import com.vivian.springcloud.entities.CommonResult;
import com.vivian.springcloud.entities.Payment;
import com.vivian.springcloud.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class paymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        System.out.println("插入结果: " + result);
        if(result > 0) {
            return new CommonResult(200, "插入成功");
        } else {
            return new CommonResult(-1, "插入失败");
        }
    }

    @RequestMapping(value = "/payment/get", method = RequestMethod.GET)
    public CommonResult getPaymentById (@RequestParam("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        System.out.println("查询成功: " + id);
        if(payment != null) {
            return new CommonResult(200, "查询成功", payment);
        } else {
            return new CommonResult(-1, "查询id=" + id + "失败");
        }
    }
}
