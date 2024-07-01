package msgservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import msgservice.domain.*;
import msgservice.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class StatIncreased extends AbstractEvent {

    private Long id;
    private Long userId;
    private Long userRate;
    private String history;
    private String rate;
    private String stat;

    public StatIncreased(Stat aggregate) {
        super(aggregate);
    }

    public StatIncreased() {
        super();
    }
}
//>>> DDD / Domain Event
