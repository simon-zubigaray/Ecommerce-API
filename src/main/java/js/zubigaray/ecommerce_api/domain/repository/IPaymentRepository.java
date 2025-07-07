package js.zubigaray.ecommerce_api.domain.repository;

import js.zubigaray.ecommerce_api.domain.model.Payment;

import java.util.Optional;

public interface IPaymentRepository {
    Optional<Payment> findById(Long id);
    Payment save(Payment payment);
}