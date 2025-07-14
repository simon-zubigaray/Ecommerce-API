package js.zubigaray.ecommerce_api.service.interfaces;

import js.zubigaray.ecommerce_api.dto.OrderDTO;
import js.zubigaray.ecommerce_api.model.Order;

import java.util.List;
import java.util.Optional;

public interface IOrderService {
    List<Order> getAllOrders();
    Optional<Order> getOrderById(Integer id);
    void createOrder(OrderDTO dto);
    void editOrder(Integer id, OrderDTO dto);
    List<Order> getOrdersByUserId(Integer id);
}
