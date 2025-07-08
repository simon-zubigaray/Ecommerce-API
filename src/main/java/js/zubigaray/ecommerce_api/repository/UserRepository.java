package js.zubigaray.ecommerce_api.repository;

import js.zubigaray.ecommerce_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {}
