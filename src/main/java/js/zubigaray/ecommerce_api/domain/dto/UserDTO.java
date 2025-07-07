package js.zubigaray.ecommerce_api.domain.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import js.zubigaray.ecommerce_api.domain.model.enums.Role;
import lombok.Data;

@Data
public class UserDTO {

    @NotBlank(message = "El nombre es obligatorio")
    private String name;

    @Email(message = "El email debe ser válido")
    @NotBlank(message = "El email es obligatorio")
    private String email;

    @NotBlank(message = "La contraseña es obligatoria")
    @Size(min = 8, max = 20, message = "La contraseña debe tener entre 8 y 20 caracteres")
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;
}
