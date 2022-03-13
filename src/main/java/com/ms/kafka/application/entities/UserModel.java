package com.ms.kafka.application.entities;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserModel {
    private String name;
    private String userName;
    private CartModel cartModel;
}
