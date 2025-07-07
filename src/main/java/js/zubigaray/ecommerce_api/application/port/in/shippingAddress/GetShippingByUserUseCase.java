package js.zubigaray.ecommerce_api.application.port.in.shippingAddress;

import js.zubigaray.ecommerce_api.domain.model.ShippingAddress;

import java.util.List;

public interface GetShippingByUserUseCase {
    List<ShippingAddress> getAddressesByUser(Long userId);
}
