package js.zubigaray.ecommerce_api.domain.model.enums;

public enum OrderStatus {
    PENDING,           // Orden creada pero aún no procesada
    CONFIRMED,         // Orden confirmada (pago aprobado)
    PROCESSING,        // Preparando los productos
    SHIPPED,           // Orden enviada
    DELIVERED,         // Entregada al cliente
    CANCELLED,         // Cancelada por el usuario o el sistema
    RETURNED,          // Devuelta por el cliente
    FAILED             // Falló el pago o entrega
}
