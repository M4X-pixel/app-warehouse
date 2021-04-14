package uz.pdp.warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehouse.entity.Currency;
import uz.pdp.warehouse.entity.Warehouse;
import uz.pdp.warehouse.entity.input.Input;
import uz.pdp.warehouse.entity.input.Supplier;

import java.util.Date;

@Projection(types = Input.class)
public interface CustomInput {
    Integer getId();
    Date getDate();
    Warehouse getWarehouse();
    Supplier getSupplier();
    Currency getCurrency();
    Integer getFactureNumber();
    String getCode();
}
