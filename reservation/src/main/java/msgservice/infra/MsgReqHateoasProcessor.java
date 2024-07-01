package msgservice.infra;

import msgservice.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class MsgReqHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<MsgReq>> {

    @Override
    public EntityModel<MsgReq> process(EntityModel<MsgReq> model) {
        model.add(
            Link.of(model.getRequiredLink("self").getHref() + "/").withRel("")
        );

        return model;
    }
}
