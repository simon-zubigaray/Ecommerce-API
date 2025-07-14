package js.zubigaray.ecommerce_api.repository;

import js.zubigaray.ecommerce_api.model.ProductCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCartRepository extends JpaRepository<ProductCart, Integer> {
}
