package msgservice.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import msgservice.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/msgReqs")
@Transactional
public class MsgReqController {

    @Autowired
    MsgReqRepository msgReqRepository;

    @RequestMapping(
        value = "msgReqs/",
        method = RequestMethod.POST,
        produces = "application/json;charset=UTF-8"
    )
    public MsgReq reserve(
        HttpServletRequest request,
        HttpServletResponse response,
        @RequestBody ReserveCommand reserveCommand
    ) throws Exception {
        System.out.println("##### /msgReq/reserve  called #####");
        // MsgReq.reserve(reserveCommand);
        // msgReq
        // msgReqRepository.save(msgReq);
        // return MsgReq;
        return MsgReq.reserve(reserveCommand) ;
    }
}
//>>> Clean Arch / Inbound Adaptor
