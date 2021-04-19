package uz.pdp.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehouse.entity.input.InputProduct;
import uz.pdp.warehouse.projection.CustomInputProduct;

@RepositoryRestResource(path = "inputProduct", collectionResourceRel = "list", excerptProjection = CustomInputProduct.class)
public interface InputProductRepository extends JpaRepository<InputProduct,Integer> {
}
