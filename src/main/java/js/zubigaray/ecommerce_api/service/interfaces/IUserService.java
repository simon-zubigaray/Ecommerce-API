package js.zubigaray.ecommerce_api.service.interfaces;

import js.zubigaray.ecommerce_api.dto.UserDTO;
import js.zubigaray.ecommerce_api.model.User;

import java.util.List;

public interface IUserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    void createUser(UserDTO dto);
    void editUser(UserDTO dto);
    void deleteUser(Long id);
    User getUserByEmail(String email);
}
