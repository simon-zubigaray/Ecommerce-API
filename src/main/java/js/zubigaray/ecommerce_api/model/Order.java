package js.zubigaray.ecommerce_api.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import js.zubigaray.ecommerce_api.model.enums.StatusOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private LocalDateTime date;

    private BigDecimal total;

    @Enumerated(EnumType.STRING)
    @NotNull
    private StatusOrder status;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<DetailsOrder> detailsOrders;
}

