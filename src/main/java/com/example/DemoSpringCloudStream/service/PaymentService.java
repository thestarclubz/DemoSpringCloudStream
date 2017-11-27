package com.example.DemoSpringCloudStream.service;

import com.example.DemoSpringCloudStream.events.NotificationSource;
import com.example.DemoSpringCloudStream.model.Payment;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.stereotype.Service;

@Service
@EnableBinding(Source.class)
public class PaymentService {

    private NotificationSource notificationSource;

    public PaymentService(NotificationSource notificationSource) {
        this.notificationSource = notificationSource;
    }

    public Payment pay(Payment payment) {
        //do business logic
        notificationPaymentSuccess(payment.getEmail(), "payment success message");
        payment.setPaymentStatus("success");
        return payment;
    }

    private void notificationPaymentSuccess(String email, String message) {
        notificationSource.publishPaymentSuccess(email, message);
    }
}
