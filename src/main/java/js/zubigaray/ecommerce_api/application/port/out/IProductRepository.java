package js.zubigaray.ecommerce_api.application.port.out;

import js.zubigaray.ecommerce_api.domain.model.Product;

import java.util.List;
import java.util.Optional;

public interface IProductRepository {
    List<Product> findAll();
    Optional<Product> findById(Long id);
    Product save(Product product);
    void deleteById(Long id);
}
