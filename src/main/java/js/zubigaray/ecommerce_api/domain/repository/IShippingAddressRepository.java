package js.zubigaray.ecommerce_api.domain.repository;

import js.zubigaray.ecommerce_api.domain.model.ShippingAddress;

import java.util.List;
import java.util.Optional;

public interface IShippingAddressRepository {
    Optional<ShippingAddress> findById(Long id);
    List<ShippingAddress> findByUserId(Long userId);
    ShippingAddress save(ShippingAddress address);
    void deleteById(Long id);
}
