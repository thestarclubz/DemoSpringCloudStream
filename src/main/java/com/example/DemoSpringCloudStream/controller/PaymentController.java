package com.example.DemoSpringCloudStream.controller;

import com.example.DemoSpringCloudStream.model.GlobalProgressStream;
import com.example.DemoSpringCloudStream.model.Payment;
import com.example.DemoSpringCloudStream.service.PaymentService;
import com.example.DemoSpringCloudStream.service.ProgressService;
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
    @Autowired
    private ProgressService progressService;

    @PostMapping("/pay")
    public Payment pay(@RequestBody Payment payment) {
        return paymentService.pay(payment);
    }

    @PostMapping("/test")
    public GlobalProgressStream test(@RequestBody GlobalProgressStream globalProgressStream){
        return progressService.test(globalProgressStream);
    }
}
