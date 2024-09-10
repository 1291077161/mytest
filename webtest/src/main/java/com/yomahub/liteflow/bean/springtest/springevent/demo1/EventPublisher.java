package com.yomahub.liteflow.bean.springtest.springevent.demo1;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class EventPublisher {
    private final ApplicationEventPublisher publisher;

    public EventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void publishEvent(String message) {
        OrderProductEvent event = new OrderProductEvent(this, message);
        publisher.publishEvent(event);
    }
}
