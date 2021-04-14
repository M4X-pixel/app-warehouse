package uz.pdp.warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehouse.entity.product.Category;

@Projection(types = Category.class)
public interface CustomCategory {
    Integer getid();
    String getName();
    Category getParentCategory();
    boolean getActive();

}
