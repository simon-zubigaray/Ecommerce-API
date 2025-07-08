package js.zubigaray.ecommerce_api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductCartDTO {
    private Integer id;
    private Integer cartId;
    private Integer productId;
    private int quantity;
}
