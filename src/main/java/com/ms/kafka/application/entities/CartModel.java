package com.ms.kafka.application.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;
import java.util.UUID;

//@Entity
//@Table(name = "CART")
public class CartModel {
    //@Id
    private UUID uuid;
    //@Column(name = "PRODUCT_ID")
    private List<ProductModel> productModelList;
    //@Column(name = "USER_ID")
    private UserModel userModel;
}
