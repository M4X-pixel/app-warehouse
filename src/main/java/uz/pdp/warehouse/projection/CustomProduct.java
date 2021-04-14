package uz.pdp.warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehouse.entity.product.Attachment;
import uz.pdp.warehouse.entity.product.Category;
import uz.pdp.warehouse.entity.product.Measurement;
import uz.pdp.warehouse.entity.product.Product;

@Projection(types = Product.class)
public interface CustomProduct {
    Integer getId();
    String getName();
    Category getCategory();
    Attachment getAttachment();
    String getCode();
    Measurement getMeasurement();
    boolean getActive();
}
