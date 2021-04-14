package uz.pdp.warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehouse.entity.Currency;
import uz.pdp.warehouse.entity.Warehouse;
import uz.pdp.warehouse.entity.output.Client;
import uz.pdp.warehouse.entity.output.Output;

import java.util.Date;

@Projection(types = Output.class)
public interface CustomOutput {
    Integer getId();
    Date getDate();
    Warehouse getWarehouse();
    Currency getCurrency();
    Integer getFactureNumber();
    String getCode();
    Client getClient();
}
