package js.zubigaray.ecommerce_api.application.port.in.product;

import js.zubigaray.ecommerce_api.domain.model.Product;

public interface CreateProductUseCase {
    Product createProduct(ProductDTO dto);
}
