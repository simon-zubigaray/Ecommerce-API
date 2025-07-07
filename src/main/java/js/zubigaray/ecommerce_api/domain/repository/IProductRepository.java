package js.zubigaray.ecommerce_api.domain.repository;

import js.zubigaray.ecommerce_api.domain.model.Product;

import java.util.List;
import java.util.Optional;

public interface IProductRepository {
    Optional<Product> findById(Long id);
    List<Product> findAll();
    Product save(Product product);
    void deleteById(Long id);
}