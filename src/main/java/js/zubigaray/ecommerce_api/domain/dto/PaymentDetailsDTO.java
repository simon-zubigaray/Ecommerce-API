package js.zubigaray.ecommerce_api.domain.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import js.zubigaray.ecommerce_api.domain.model.enums.PaymentStatus;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class PaymentDetailsDTO {

    @NotNull(message = "El ID de la orden es obligatorio")
    private Long orderId;

    @NotNull(message = "El monto es obligatorio")
    @Positive(message = "El monto debe ser mayor que cero")
    private BigDecimal amount;

    @NotBlank(message = "El método de pago es obligatorio")
    private String paymentMethod;

    @NotNull(message = "El estado del pago es obligatorio")
    @Enumerated(EnumType.STRING)
    private PaymentStatus status;
}