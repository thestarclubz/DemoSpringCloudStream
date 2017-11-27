package com.example.DemoSpringCloudStream.controller;

import com.example.DemoSpringCloudStream.model.Payment;
import com.example.DemoSpringCloudStream.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/pay")
    public Payment pay(@RequestBody Payment payment) {
        return paymentService.pay(payment);
    }
}
