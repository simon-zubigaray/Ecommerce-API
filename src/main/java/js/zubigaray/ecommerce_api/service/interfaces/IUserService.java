package js.zubigaray.ecommerce_api.service.interfaces;

import js.zubigaray.ecommerce_api.dto.UserDTO;
import js.zubigaray.ecommerce_api.model.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    List<User> getAllUsers();
    Optional<User> getUserById(Integer id);
    void createUser(UserDTO dto);
    void editUser(Integer id, UserDTO dto);
    void deleteUser(Integer id);
    Optional<User> getUserByEmail(String email);
}
