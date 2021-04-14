package uz.pdp.warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehouse.entity.output.Client;

@Projection(types = Client.class)
public interface CustomClient {
    Integer getId();
    String getName();
    Integer getPhoneNumber();
}
