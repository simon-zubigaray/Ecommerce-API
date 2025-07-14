package js.zubigaray.ecommerce_api.repository;

import js.zubigaray.ecommerce_api.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {
}
