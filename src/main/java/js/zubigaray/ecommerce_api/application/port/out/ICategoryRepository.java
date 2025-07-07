package js.zubigaray.ecommerce_api.application.port.out;

import js.zubigaray.ecommerce_api.domain.model.Category;

import java.util.List;
import java.util.Optional;

public interface ICategoryRepository {
    List<Category> findAll();
    Optional<Category> findById(Long id);
}
