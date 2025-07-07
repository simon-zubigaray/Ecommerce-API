package js.zubigaray.ecommerce_api.domain.repository;

import js.zubigaray.ecommerce_api.domain.model.OrderItem;

import java.util.List;

public interface IOrderItemRepository {
    List<OrderItem> findByOrderId(Long orderId);
    OrderItem save(OrderItem orderItem);
    void deleteById(Long id);
}