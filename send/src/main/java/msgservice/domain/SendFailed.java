package msgservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import msgservice.domain.*;
import msgservice.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class SendFailed extends AbstractEvent {

    private Long id;
    private Long reservationId;
    private String msgTitle;
    private String msgContent;
    private Date reserveDt;
    private String dstNum;
    private String callbackNum;
    private String status;

    public SendFailed(Msg aggregate) {
        super(aggregate);
    }

    public SendFailed() {
        super();
    }
}
//>>> DDD / Domain Event
