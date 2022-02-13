package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "CHART")
public class Chart {
    @Id
    private UUID uuid;
    @Column(name = "PRODUCT_ID")
    private List<Product> productList;
    @Column(name = "USER_ID")
    private User user;
}
