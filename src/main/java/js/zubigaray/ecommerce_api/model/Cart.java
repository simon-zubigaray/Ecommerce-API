package js.zubigaray.ecommerce_api.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import js.zubigaray.ecommerce_api.model.enums.StatusCart;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "The status is required")
    private StatusCart statusCart;
}

