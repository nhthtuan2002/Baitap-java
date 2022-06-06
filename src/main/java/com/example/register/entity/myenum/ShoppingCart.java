package com.example.register.entity.myenum;

import com.example.register.entity.Product;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ShoppingCart {
    private double totalPrice;
    private String shipName;
    private String shipAddress;
    private String shipPhone;
    private String shipNote;
    private HashMap<Integer, CartItem> items;

    public ShoppingCart() {
        items = new HashMap<>();
    }

    public List<CartItem> getListItems() {
        return new ArrayList<>(items.values());
    }
    public boolean add(Product product, int quantity) {
        CartItem cartItem = null;
        if (items.containsKey(product.getId())){
            cartItem = items.get(product.getId());
            cartItem.setQuantity(cartItem.getQuantity() + quantity);
        }else {
            cartItem = CardItem.CartItemBuilder.aCartItem()
                    .productId(product.getId())
                    .productName(product.getName())
                    .productThumnail(product.getPrice())
                    .untiPrice(product.getPrice())
                    .quantity(quantity)
                    .build();
        }
        items.put(product.getId(), cartItem);
        return true;
    }
}


