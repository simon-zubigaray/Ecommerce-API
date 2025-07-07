package js.zubigaray.ecommerce_api.application.port.in.order;

import js.zubigaray.ecommerce_api.domain.model.Order;

import java.util.List;

public interface GetOrdersByUserIdUseCase {
    List<Order> getOrdersByUserId(Long userId);
}
