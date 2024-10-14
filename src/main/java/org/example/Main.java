package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<String> items = new ArrayList<>();
        items.add("Item1");
        items.add("Item2");

        Order pedido = new Order("Alice","Perez", CustomerType.VIP, items, 1200);
        pedido.printOrderDetails();
    }
}