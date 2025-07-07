package js.zubigaray.ecommerce_api.domain.repository;

import js.zubigaray.ecommerce_api.domain.model.Cart;

import java.util.List;
import java.util.Optional;

public interface ICartRepository {
    Optional<Cart> findById(Long id);
    Cart save(Cart cart);
    void deleteById(Long id);
    List<Cart> findByUserId(Long userId);
}