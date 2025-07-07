package js.zubigaray.ecommerce_api.domain.repository;

import js.zubigaray.ecommerce_api.domain.model.Order;

import java.util.List;
import java.util.Optional;

public interface IOrderRepository {
    Optional<Order> findById(Long id);
    List<Order> findByUserId(Long userId);
    Order save(Order order);
}
