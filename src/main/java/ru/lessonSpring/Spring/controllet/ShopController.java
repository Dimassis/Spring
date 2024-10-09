package ru.lessonSpring.Spring.controllet;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.lessonSpring.Spring.Service.ShopService;

import java.util.Map;

@RestController
@RequestMapping(path = "/store/order")
public class ShopController {
    private final ShopService service;

    public ShopController(ShopService shopService) {
        this.service = shopService;
    }
    @GetMapping(path = "/get")
    public Map<String, Integer> get() {
        return service.getCart();
    }

    @GetMapping(path = "/add")
    public String add(@RequestParam String product,
                      @RequestParam int count) {
        service.add(product, count);
        return "success";
    }


}
