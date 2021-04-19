package uz.pdp.warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehouse.entity.output.Output;
import uz.pdp.warehouse.entity.output.OutputProduct;
import uz.pdp.warehouse.entity.product.Product;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {

    Integer getId();
    Product getProduct();
    Integer getAmount();
    double getPrice();
    Output getOutput();
}
