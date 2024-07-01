package msgservice.domain;

import java.util.*;
import lombok.*;
import msgservice.domain.*;
import msgservice.infra.AbstractEvent;

@Data
@ToString
public class Reserved extends AbstractEvent {

    private Long id;
    private String userId;
    private String msgTitle;
    private String msgContent;
    private Date reserveDt;
    private String callbackNum;
    private Object dstNum;
    private Long reserveQt;
    private String status;
}
