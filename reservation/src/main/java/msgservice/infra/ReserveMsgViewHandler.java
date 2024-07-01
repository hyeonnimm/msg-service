package msgservice.infra;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import msgservice.config.kafka.KafkaProcessor;
import msgservice.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class ReserveMsgViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private ReserveMsgRepository reserveMsgRepository;
    //>>> DDD / CQRS
}
