package js.zubigaray.ecommerce_api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetailsOrderDTO {
    private Integer id;
    private Integer orderId;
    private Integer productId;
    private int quantity;
    private BigDecimal unitPrice;
}
