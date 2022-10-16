package az.nadir.springbootrabbitmq.service;

import az.nadir.springbootrabbitmq.model.Notification;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NotificationListener {

    @RabbitListener(queues = "${sr.rabbit.queue.name}")
    public void handleMessage(Notification notification) {
        log.info("handleMessage.start Message received");
        System.out.println(notification.toString());
    }
}
