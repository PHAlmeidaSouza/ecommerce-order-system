package com.example.ecommerce_order_system.producer;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class JmsProducerService {
    private final JmsTemplate jmsTemplate;

    public JmsProducerService(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void sendMessage(String queueName, String message) {
        jmsTemplate.convertAndSend(queueName, message);
    }
}
