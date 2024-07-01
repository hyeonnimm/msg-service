package msgservice.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import msgservice.StatApplication;
import msgservice.domain.RateIncreased;
import msgservice.domain.StatIncreased;

@Entity
@Table(name = "Stat_table")
@Data
//<<< DDD / Aggregate Root
public class Stat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long userId;

    private String rate;

    private String history;

    private String stat;

    @PostPersist
    public void onPostPersist() {
        RateIncreased rateIncreased = new RateIncreased(this);
        rateIncreased.publishAfterCommit();

        StatIncreased statIncreased = new StatIncreased(this);
        statIncreased.publishAfterCommit();
    }

    public static StatRepository repository() {
        StatRepository statRepository = StatApplication.applicationContext.getBean(
            StatRepository.class
        );
        return statRepository;
    }

    //<<< Clean Arch / Port Method
    public static void increaseRate(SendCompleted sendCompleted) {
        //implement business logic here:

        /** Example 1:  new item 
        Stat stat = new Stat();
        repository().save(stat);

        RateIncreased rateIncreased = new RateIncreased(stat);
        rateIncreased.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(sendCompleted.get???()).ifPresent(stat->{
            
            stat // do something
            repository().save(stat);

            RateIncreased rateIncreased = new RateIncreased(stat);
            rateIncreased.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void increaseStat(SendFailed sendFailed) {
        //implement business logic here:

        /** Example 1:  new item 
        Stat stat = new Stat();
        repository().save(stat);

        StatIncreased statIncreased = new StatIncreased(stat);
        statIncreased.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(sendFailed.get???()).ifPresent(stat->{
            
            stat // do something
            repository().save(stat);

            StatIncreased statIncreased = new StatIncreased(stat);
            statIncreased.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void increaseStat(SendCompleted sendCompleted) {
        //implement business logic here:

        /** Example 1:  new item 
        Stat stat = new Stat();
        repository().save(stat);

        StatIncreased statIncreased = new StatIncreased(stat);
        statIncreased.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(sendCompleted.get???()).ifPresent(stat->{
            
            stat // do something
            repository().save(stat);

            StatIncreased statIncreased = new StatIncreased(stat);
            statIncreased.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void increaseStat(MsgSent msgSent) {
        //implement business logic here:

        /** Example 1:  new item 
        Stat stat = new Stat();
        repository().save(stat);

        StatIncreased statIncreased = new StatIncreased(stat);
        statIncreased.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(msgSent.get???()).ifPresent(stat->{
            
            stat // do something
            repository().save(stat);

            StatIncreased statIncreased = new StatIncreased(stat);
            statIncreased.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
