package js.zubigaray.ecommerce_api.domain.repository;

import js.zubigaray.ecommerce_api.domain.model.CartItem;

import java.util.List;

public interface ICartItemRepository {
    List<CartItem> findByCartId(Long cartId);
    CartItem save(CartItem cartItem);
    void deleteById(Long id);
}
