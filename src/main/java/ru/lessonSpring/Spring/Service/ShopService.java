package ru.lessonSpring.Spring.Service;

import org.springframework.stereotype.Service;
import ru.lessonSpring.Spring.model.Shop;

import java.util.Map;

@Service
public class ShopService {
    private final Shop shop;

    public ShopService(Shop shop) {
        this.shop = shop;
    }

    public Map<String, Integer> getCart() {
        return shop.getCart();
    }

    public void add(String productName, int count) {
        shop.addItem(productName, count);
    }
}
