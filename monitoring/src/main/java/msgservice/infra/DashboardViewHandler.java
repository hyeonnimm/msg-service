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
public class DashboardViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private DashboardRepository dashboardRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenReserved_then_CREATE_1(@Payload Reserved reserved) {
        try {
            if (!reserved.validate()) return;

            // view 객체 생성
            Dashboard dashboard = new Dashboard();
            // view 객체에 이벤트의 Value 를 set 함
            dashboard.setId(reserved.getId());
            dashboard.setUserId(Long.valueOf(reserved.getUserId()));
            dashboard.setMsgTitle(reserved.getMsgTitle());
            dashboard.setReserveDt(Long.valueOf(reserved.getReserveDt()));
            dashboard.setReserveQt(reserved.getReserveQt());
            dashboard.setStatus(reserved.getStatus());
            // view 레파지 토리에 save
            dashboardRepository.save(dashboard);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenMsgSent_then_UPDATE_1(@Payload MsgSent msgSent) {
        try {
            if (!msgSent.validate()) return;
            // view 객체 조회

            List<Dashboard> dashboardList = dashboardRepository.findByStatus(
                msgSent.getStatus()
            );
            for (Dashboard dashboard : dashboardList) {
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                dashboard.setStatus(msgSent.getStatus());
                // view 레파지 토리에 save
                dashboardRepository.save(dashboard);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //>>> DDD / CQRS
}
