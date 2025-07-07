package js.zubigaray.ecommerce_api.domain.repository;

import js.zubigaray.ecommerce_api.domain.model.User;

import java.util.Optional;

public interface IUserRepository {
    Optional<User> findById(Long id);
    Optional<User> findByEmail(String email);
    User save(User user);
}
