package msgservice.infra;

import msgservice.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class MsgHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Msg>> {

    @Override
    public EntityModel<Msg> process(EntityModel<Msg> model) {
        return model;
    }
}
