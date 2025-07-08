package js.zubigaray.ecommerce_api.dto;

import js.zubigaray.ecommerce_api.model.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private String address;
    private String phoneNumber;
    private Role role;
}
