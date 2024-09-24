package com.example.ecommerce_order_system.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class JmsConsumerService {
    private final JavaMailSender mailSender;

    public JmsConsumerService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    @JmsListener(destination = "user.queue")
    public void consumeMessage(String email) {
        sendEmail(email);
    }

    private void sendEmail(String toEmail) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(toEmail);
        message.setSubject("Bem-vindo ao Sistema");
        message.setText("Obrigado por se cadastrar!");

        mailSender.send(message);
    }
}
