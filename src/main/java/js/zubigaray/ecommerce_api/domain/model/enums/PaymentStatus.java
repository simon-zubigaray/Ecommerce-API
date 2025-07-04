package js.zubigaray.ecommerce_api.domain.model.enums;

public enum PaymentStatus {
    PENDING,       // Esperando confirmación o procesando el pago
    COMPLETED,     // Pago realizado con éxito
    FAILED,        // Pago fallido (rechazado por el proveedor, fondos insuficientes, etc.)
    CANCELLED,     // Pago cancelado antes de completarse
    REFUNDED       // Pago devuelto al cliente
}
