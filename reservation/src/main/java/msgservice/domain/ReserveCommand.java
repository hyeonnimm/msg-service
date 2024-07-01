package msgservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class ReserveCommand {

    private Long userId;
    private String msgTitle;
    private String msgContent;
    private Long reserveQt;
}
