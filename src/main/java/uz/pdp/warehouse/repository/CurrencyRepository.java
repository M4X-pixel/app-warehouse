package uz.pdp.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehouse.entity.Currency;
import uz.pdp.warehouse.projection.Customcurrency;

@RepositoryRestResource(path = "currency", collectionResourceRel = "list", excerptProjection = Customcurrency.class)
public interface CurrencyRepository extends JpaRepository<Currency,Integer> {
}
