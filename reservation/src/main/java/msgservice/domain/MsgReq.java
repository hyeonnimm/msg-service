package msgservice.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.*;
import javax.persistence.*;
import lombok.Data;
import msgservice.ReservationApplication;

@Entity
@Table(name = "MsgReq_table")
@Data
//<<< DDD / Aggregate Root
public class MsgReq {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long userId;

    private String msgTitle;

    private String msgContent;

    private Date reserveDt;

    @ElementCollection
    private List<String> dstNum;

    private String callbackNum;

    private Long reserveQt;

    private String status;

    @PostPersist
    public void onPostPersist() {}

    public static MsgReqRepository repository() {
        MsgReqRepository msgReqRepository = ReservationApplication.applicationContext.getBean(
            MsgReqRepository.class
        );
        return msgReqRepository;
    }

    //<<< Clean Arch / Port Method
    // public static void reserve(ReserveCommand reserveCommand) {
    public static MsgReq reserve(ReserveCommand reserveCommand) {
        //implement business logic here:
        MsgReq msgReq = new MsgReq();
        msgReq.setUserId(reserveCommand.getUserId());
        msgReq.setMsgTitle(reserveCommand.getMsgTitle());
        msgReq.setMsgContent(reserveCommand.getMsgContent());
        msgReq.setReserveQt(reserveCommand.getReserveQt());

        msgReq.setReserveDt(new Date());
        msgReq.setCallbackNum("114");
        msgReq.setDstNum(Arrays.asList("A", "B"));
        msgReq.setStatus("Reserved");

        repository().save(msgReq);


        // Reserved reserved = new Reserved(msgReq);
        // reserved.publishAfterCommit();
        return msgReq ;
    }

    //>>> Clean Arch / Port Method

    //<<< Clean Arch / Port Method
    public static void updateStatus(MsgSent msgSent) {
        //implement business logic here:

        /** Example 1:  new item 
        MsgReq msgReq = new MsgReq();
        repository().save(msgReq);

        */

        /** Example 2:  finding and process
        
        repository().findById(msgSent.get???()).ifPresent(msgReq->{
            
            msgReq // do something
            repository().save(msgReq);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void updateStatus(SendCompleted sendCompleted) {
        //implement business logic here:

        /** Example 1:  new item 
        MsgReq msgReq = new MsgReq();
        repository().save(msgReq);

        */

        /** Example 2:  finding and process
        
        repository().findById(sendCompleted.get???()).ifPresent(msgReq->{
            
            msgReq // do something
            repository().save(msgReq);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void updateStatus(SendFailed sendFailed) {
        //implement business logic here:

        /** Example 1:  new item 
        MsgReq msgReq = new MsgReq();
        repository().save(msgReq);

        */

        /** Example 2:  finding and process
        
        repository().findById(sendFailed.get???()).ifPresent(msgReq->{
            
            msgReq // do something
            repository().save(msgReq);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
