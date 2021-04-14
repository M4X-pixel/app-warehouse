package uz.pdp.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehouse.entity.Warehouse;
import uz.pdp.warehouse.projection.CustomWareHouse;

@RepositoryRestResource(path = "warehouse", collectionResourceRel = "list", excerptProjection = CustomWareHouse.class)
public interface WarehouseRepository extends JpaRepository<Warehouse,Integer> {

}
