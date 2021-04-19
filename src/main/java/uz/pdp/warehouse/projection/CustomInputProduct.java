package uz.pdp.warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehouse.entity.input.Input;
import uz.pdp.warehouse.entity.input.InputProduct;
import uz.pdp.warehouse.entity.product.Product;

import java.util.Date;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {

    Integer getId();
    Product getProduct();
    Integer getAmount();
    double getPrice();
    Date getExpireDate();
    Input getInput();

}
