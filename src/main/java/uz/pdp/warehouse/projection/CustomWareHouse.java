package uz.pdp.warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehouse.entity.User;
import uz.pdp.warehouse.entity.Warehouse;

import java.util.List;

@Projection(types = Warehouse.class)
public interface CustomWareHouse {
    Integer getId();

    String getName();

    boolean getActive();

    List<User> getUsers();

}
