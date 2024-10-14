package org.example;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @RestController
    public class MessageController {

        @GetMapping("/")
        public String hello() {
            List<String> items = new ArrayList<>();
            items.add("Item1");
            items.add("Item2");
            Order pedido = new Order("Alice","Perez", CustomerType.VIP, items, 1200);
            pedido.applyDiscount();
            pedido.calculateTax();
            return "Hello, this is a static message from Heroku!. This is the order details: "
                    + pedido.returnOrderDetails();
        }
    }
}