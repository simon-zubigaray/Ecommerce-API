package js.zubigaray.ecommerce_api.application.port.out;

import js.zubigaray.ecommerce_api.domain.model.ShippingAddress;

import java.util.List;

public interface IShippingAddressRepository {
    ShippingAddress save(ShippingAddress address);
    List<ShippingAddress> findByUserId(Long userId);
}
