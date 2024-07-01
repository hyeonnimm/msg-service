package msgservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import msgservice.domain.*;
import msgservice.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Reserved extends AbstractEvent {

    private Long id;
    private String userId;
    private String msgTitle;
    private String msgContent;
    private Date reserveDt;
    private String callbackNum;
    private List<String> dstNum;
    private Long reserveQt;
    private String status;

    public Reserved(MsgReq aggregate) {
        super(aggregate);
    }

    public Reserved() {
        super();
    }
}
//>>> DDD / Domain Event
