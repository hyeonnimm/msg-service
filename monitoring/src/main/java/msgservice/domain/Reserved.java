package msgservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import msgservice.infra.AbstractEvent;

@Data
public class Reserved extends AbstractEvent {

    private Long id;
    private String userId;
    private String MsgTitle;
    private String MsgContent;
    private Date ReserveDt;
    private String CallbackNum;
    private List<String> DstNum;
    private Long ReserveQt;
    private String status;
}
