package js.zubigaray.ecommerce_api.service.interfaces;

import js.zubigaray.ecommerce_api.dto.CartDTO;
import js.zubigaray.ecommerce_api.model.Cart;

import java.util.List;
import java.util.Optional;

public interface ICartService {
    List<Cart> getAllCarts();
    Optional<Cart> getCartById(Integer id);
    void createCart(CartDTO dto);
    void editCart(Integer id, CartDTO dto);
    void deleteCart(Integer id);
    Optional<Cart> getCartByUserId(Integer id);
}
