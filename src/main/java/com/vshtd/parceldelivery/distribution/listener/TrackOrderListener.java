package com.vshtd.parceldelivery.distribution.listener;

import com.vshtd.parceldelivery.distribution.model.mqo.ParcelOrderTrackMQO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

@Slf4j
public class TrackOrderListener {

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(value = "${rabbitmq.track-order.queue}", durable = "true", autoDelete = "false"),
            exchange = @Exchange(value = "${rabbitmq.track-order.exchange}"),
            key = "${rabbitmq.track-order.rk}")
    )
    public void receive(ParcelOrderTrackMQO order) {
        log.info("Rabbit listener has been received order track event: " + order);
    }
}
