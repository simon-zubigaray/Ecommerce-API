package js.zubigaray.ecommerce_api.application.port.out;

import js.zubigaray.ecommerce_api.domain.model.CartItem;

import java.util.List;

public interface ICartItemRepository {
    CartItem save(CartItem item);
    void delete(CartItem item);
    List<CartItem> findByCartId(Long cartId);
}
