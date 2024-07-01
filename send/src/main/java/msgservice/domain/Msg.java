package msgservice.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import msgservice.SendApplication;
import msgservice.domain.MsgSent;
import msgservice.domain.SendCompleted;
import msgservice.domain.SendFailed;

@Entity
@Table(name = "Msg_table")
@Data
//<<< DDD / Aggregate Root
public class Msg {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long reservationId;

    private String msgTitle;

    private String msgContent;

    private Date reserveDt;

    private String dstNum;

    private String callbackNum;

    private String status;

    @PostPersist
    public void onPostPersist() {
        MsgSent msgSent = new MsgSent(this);
        msgSent.publishAfterCommit();

        SendFailed sendFailed = new SendFailed(this);
        sendFailed.publishAfterCommit();

        SendCompleted sendCompleted = new SendCompleted(this);
        sendCompleted.publishAfterCommit();
    }

    public static MsgRepository repository() {
        MsgRepository msgRepository = SendApplication.applicationContext.getBean(
            MsgRepository.class
        );
        return msgRepository;
    }

    //<<< Clean Arch / Port Method
    public static void startSend(Reserved reserved) {
        //implement business logic here:

        /** Example 1:  new item 
        Msg msg = new Msg();
        repository().save(msg);

        MsgSent msgSent = new MsgSent(msg);
        msgSent.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(reserved.get???()).ifPresent(msg->{
            
            msg // do something
            repository().save(msg);

            MsgSent msgSent = new MsgSent(msg);
            msgSent.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
