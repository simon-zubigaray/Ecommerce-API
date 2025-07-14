package js.zubigaray.ecommerce_api.repository;

import js.zubigaray.ecommerce_api.model.DetailsOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailsOrderRepository extends JpaRepository<DetailsOrder, Integer> {
}
