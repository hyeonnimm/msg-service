package msgservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import msgservice.infra.AbstractEvent;

@Data
public class MsgSent extends AbstractEvent {

    private Long id;
    private Long ReservationId;
    private String MsgTitle;
    private String MsgContent;
    private Date ReserveDt;
    private String DstNum;
    private String CallbackNum;
    private String status;
}
