package js.zubigaray.ecommerce_api.application.port.in.user;

import js.zubigaray.ecommerce_api.domain.model.User;

public interface CreateUserUseCase {
    User createUser(UserDTO dto);
}
