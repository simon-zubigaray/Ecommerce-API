package js.zubigaray.ecommerce_api.application.port.out;

import js.zubigaray.ecommerce_api.domain.model.Order;

import java.util.List;
import java.util.Optional;

public interface IOrderRepository {
    Order save(Order order);
    Optional<Order> findById(Long id);
    List<Order> findByUserId(Long userId);
}
