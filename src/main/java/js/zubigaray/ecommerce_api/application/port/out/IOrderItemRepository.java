package js.zubigaray.ecommerce_api.application.port.out;

import js.zubigaray.ecommerce_api.domain.model.OrderItem;

import java.util.List;

public interface IOrderItemRepository {
    OrderItem save(OrderItem item);
    List<OrderItem> findByOrderId(Long orderId);
}
