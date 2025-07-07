package js.zubigaray.ecommerce_api.application.port.in.shippingAddress;

import js.zubigaray.ecommerce_api.domain.model.ShippingAddress;

public interface AddShippingAddressUseCase {
    ShippingAddress addAddress(Long userId, ShippingAddressDTO dto);
}
