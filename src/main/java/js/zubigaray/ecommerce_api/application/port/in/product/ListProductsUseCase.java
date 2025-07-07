package js.zubigaray.ecommerce_api.application.port.in.product;

import js.zubigaray.ecommerce_api.domain.model.Product;

import java.util.List;

public interface ListProductsUseCase {
    List<Product> listAllProducts();
}
