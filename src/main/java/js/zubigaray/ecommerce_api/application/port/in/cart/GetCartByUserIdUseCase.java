package js.zubigaray.ecommerce_api.application.port.in.cart;

import js.zubigaray.ecommerce_api.domain.model.Cart;

public interface GetCartByUserIdUseCase {
    Cart getCartByUserId(Long userId);
}
