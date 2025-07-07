package js.zubigaray.ecommerce_api.application.port.out;

import js.zubigaray.ecommerce_api.domain.model.Cart;

import java.util.Optional;

public interface ICartRepository {
    Cart save(Cart cart);
    Optional<Cart> findByUserId(Long userId);
    void delete(Cart cart);
}
