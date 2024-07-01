package msgservice.domain;

import java.util.*;
import lombok.*;
import msgservice.domain.*;
import msgservice.infra.AbstractEvent;

@Data
@ToString
public class MsgSent extends AbstractEvent {

    private Long id;
    private Long reservationId;
    private String msgTitle;
    private String msgContent;
    private Date reserveDt;
    private String dstNum;
    private String callbackNum;
    private String status;
}
