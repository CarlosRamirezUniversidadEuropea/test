package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Hello world!");
            System.out.println("Starting app...");

            try {
                Thread.sleep(2000);
                System.out.println("Welcome to my Java app!");
                Thread.sleep(2000);
                System.out.println("Would you like to proceed? (yes/no)");
                // Simulate user input
                Thread.sleep(2000);
                System.out.println("yes");
                Thread.sleep(2000);
                System.out.println("Great! I will create the order for you with the details.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            List<String> items = new ArrayList<>();
            items.add("Item1");
            items.add("Item2");

            Order pedido = new Order("Alice", "Perez", CustomerType.VIP, items, 1200);
            pedido.printOrderDetails();
        }
    }
}