package az.nadir.springbootrabbitmq.controller;

import az.nadir.springbootrabbitmq.model.Notification;
import az.nadir.springbootrabbitmq.service.NotificationProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("message")
@RequiredArgsConstructor
public class RabbitMqController {

    private final NotificationProducer notificationProducer;

    @PostMapping("sent-queue")
    public void sentToQueue(@RequestBody Notification notification) {
        notificationProducer.senToQueue(notification);
    }
}
