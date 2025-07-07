package js.zubigaray.ecommerce_api.domain.repository;

import js.zubigaray.ecommerce_api.domain.model.Category;

import java.util.List;
import java.util.Optional;

public interface ICategoryRepository {
    Optional<Category> findById(Long id);
    List<Category> findAll();
    Category save(Category category);
}
