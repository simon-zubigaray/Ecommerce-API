package js.zubigaray.ecommerce_api.application.port.in.payment;

import js.zubigaray.ecommerce_api.domain.model.Payment;

public interface ProcessPaymentUseCase {
    Payment processPayment(Long orderId, PaymentDetailsDTO details);
    // PaymentDetailsDTO podría contener tarjeta, tipo, monto, etc.
}
