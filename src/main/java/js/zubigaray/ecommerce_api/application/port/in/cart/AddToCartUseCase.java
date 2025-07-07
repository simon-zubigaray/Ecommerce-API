package js.zubigaray.ecommerce_api.application.port.in.cart;

public interface AddToCartUseCase {
    void addProductToCart(Long userId, Long productId, int quantity);
}
