package fooddelivery.infra;
import fooddelivery.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class DeliveItemHateoasProcessor implements RepresentationModelProcessor<EntityModel<DeliveItem>>  {

    @Override
    public EntityModel<DeliveItem> process(EntityModel<DeliveItem> model) {

        
        return model;
    }
    
}
