package js.zubigaray.ecommerce_api.domain.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ShippingAddressDTO {

    @NotNull(message = "El ID del usuario es obligatorio")
    private Long userId;

    @NotBlank(message = "La dirección es obligatoria")
    private String address;

    @NotBlank(message = "La ciudad es obligatoria")
    private String city;

    @NotBlank(message = "El código postal es obligatorio")
    private String postalCode;

    @NotBlank(message = "El país es obligatorio")
    private String country;

    @NotBlank(message = "El número de teléfono es obligatorio")
    private String phoneNumber;
}