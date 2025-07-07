package js.zubigaray.ecommerce_api.application.port.out;

import js.zubigaray.ecommerce_api.domain.model.Payment;

import java.util.Optional;

public interface IPaymentRepository {
    Payment save(Payment payment);
    Optional<Payment> findById(Long id);
}
