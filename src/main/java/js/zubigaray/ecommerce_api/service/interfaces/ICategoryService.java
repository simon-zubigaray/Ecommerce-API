package js.zubigaray.ecommerce_api.service.interfaces;

import js.zubigaray.ecommerce_api.dto.CategoryDTO;
import js.zubigaray.ecommerce_api.model.Category;

import java.util.List;
import java.util.Optional;

public interface ICategoryService {
    List<Category> getAllCategories();
    Optional<Category> getCategory(Integer id);
    void createCategory(CategoryDTO dto);
    void editCategory(Integer id, CategoryDTO dto);
    void deleteCategory(Integer id);
}
