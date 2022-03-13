package com.ms.kafka.application.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "PRODUCT")
public class ProductModel {
    @Id
    @Column(name = "ID")
    private UUID uuid;
    @Column(name="PRODUCT_NAME")
    private String productName;
    @Column(name = "PRODUCT_PRICE")
    private Long productPrice;
}
