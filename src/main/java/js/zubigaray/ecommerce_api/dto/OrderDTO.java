package js.zubigaray.ecommerce_api.dto;

import js.zubigaray.ecommerce_api.model.enums.StatusOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    private Integer id;
    private Integer userId;
    private LocalDateTime date;
    private BigDecimal total;
    private StatusOrder status;
}
