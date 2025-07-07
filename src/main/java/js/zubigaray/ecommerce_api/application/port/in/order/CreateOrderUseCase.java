package js.zubigaray.ecommerce_api.application.port.in.order;

import js.zubigaray.ecommerce_api.domain.model.Order;

public interface CreateOrderUseCase {
    Order createOrder(Long userId);
}
