package msgservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import msgservice.domain.*;
import msgservice.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class RateIncreased extends AbstractEvent {

    private Long id;
    private Long userId;
    private Long userRate;
    private String history;
    private String rate;
    private String stat;

    public RateIncreased(Stat aggregate) {
        super(aggregate);
    }

    public RateIncreased() {
        super();
    }
}
//>>> DDD / Domain Event
