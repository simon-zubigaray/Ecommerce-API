package js.zubigaray.ecommerce_api.service.interfaces;

import js.zubigaray.ecommerce_api.dto.ProductDTO;
import js.zubigaray.ecommerce_api.model.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    List<Product> getAllProducts();
    Optional<Product> getProductById(Integer id);
    void createProduct(ProductDTO dto);
    void editProduct(Integer id, ProductDTO dto);
    void deleteProduct(Integer id);
    List<Product> getProductsByCategory(String categoryName);
    List<Product> getProductsByName(String name);
}
