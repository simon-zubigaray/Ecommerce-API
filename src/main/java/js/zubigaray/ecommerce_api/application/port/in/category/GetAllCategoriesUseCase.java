package js.zubigaray.ecommerce_api.application.port.in.category;

import js.zubigaray.ecommerce_api.domain.model.Category;

import java.util.List;

public interface GetAllCategoriesUseCase {
    List<Category> getAllCategories();
}
