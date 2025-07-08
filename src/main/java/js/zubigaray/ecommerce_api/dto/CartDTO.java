package js.zubigaray.ecommerce_api.dto;

import js.zubigaray.ecommerce_api.model.enums.StatusCart;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartDTO {
    private Integer id;
    private Integer userId;
    private StatusCart statusCart;
}
