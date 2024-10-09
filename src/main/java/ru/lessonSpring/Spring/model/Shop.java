package ru.lessonSpring.Spring.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashMap;
import java.util.Map;


@Component
@SessionScope
public class Shop {
    private final Map<String, Integer> cart;

    public Shop(Shop cart) {
        this.cart = new HashMap<>();
    }

    public Map<String, Integer> getCart() {
        return cart;
    }

    public void addItem(String item, int count) {
        cart.merge(item, count, Integer::sum);
    }
}
