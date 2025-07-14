package js.zubigaray.ecommerce_api.repository;

import js.zubigaray.ecommerce_api.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
