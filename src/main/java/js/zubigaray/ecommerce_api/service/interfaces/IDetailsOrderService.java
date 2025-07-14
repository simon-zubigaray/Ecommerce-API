package js.zubigaray.ecommerce_api.service.interfaces;

import js.zubigaray.ecommerce_api.model.DetailsOrder;

import java.util.Optional;

public interface IDetailsOrderService {
    Optional<DetailsOrder> getDetailsOfAnOrder(Integer id);
}
