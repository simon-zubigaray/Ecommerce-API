package js.zubigaray.ecommerce_api.service.interfaces;

public interface IProductCartService {
    void addProductToCart(Integer cartId, Integer productCart);
    void updateProductQuantityInCart(Integer cartId, Integer productCart);
    void removeProductToCart(Integer cartId, Integer productCart);
    void getAllProductsInTheCart(Integer cartId);
}
