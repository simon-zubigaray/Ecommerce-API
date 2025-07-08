package js.zubigaray.ecommerce_api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import js.zubigaray.ecommerce_api.model.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "The firstname is required")
    private String firstname;

    @NotBlank(message = "The lastname is required")
    private String lastname;

    @Email(message = "The email must be valid")
    @NotBlank(message = "The email is required")
    private String email;

    @Size(min = 8, max = 30, message = "Password must be between 8 and 30 characters")
    @NotBlank(message = "The password is required")
    @JsonIgnore
    private String password;

    @NotBlank(message = "The address is required")
    private String address;

    @NotBlank(message = "The phone number is required")
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "The role is required")
    private Role role;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Cart> carts;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Order> orders;
}
