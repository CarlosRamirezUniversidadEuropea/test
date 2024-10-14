package org.example;

import java.util.List;
import java.util.ArrayList;


// Carlos Ramírez
public class Order {
    public String customerName;
    public String customerType;
    public String apellido;
    public List<String> items;
    public double totalAmount;
    public double discount;
    public double tax;
    public CustomerType type;

    /**
     * Public constructor of Order class
     * @param nombre
     * @param customerType
     * @param items
     * @param totalAmount
     */
    public Order(String nombre,String apellido,
                 CustomerType customerType,
                 List<String> items,
                 double totalAmount) {
        customerName = apellido;
        this.apellido = nombre;
        this.type = customerType;
        this.items = items;
        this.totalAmount = totalAmount;
        this.discount = 0;
        this.tax = 0;
    }

    /**
     * Si el cliente es regular
     *      totamAmount mayor a 100, se aplica un 5%
     *      totamAmount mayor a 500, se aplica un 10%
     */
    public void applyDiscount() {
        if (this.customerType.equals("Regular")) {
            if (this.totalAmount > 100) {
                this.discount = this.totalAmount * 0.05;
            }
            if (this.totalAmount > 500) {
                this.discount = this.totalAmount * 0.1;
            }
        } else if (this.customerType.equals(CustomerType.VIP)) {
            if (this.totalAmount > 100) {
                this.discount = this.totalAmount * 0.1;
            }
            if (this.totalAmount > 500) {
                this.discount = this.totalAmount * 0.15;
            }
        }


        if (this.totalAmount > 1000) {
            this.discount = this.totalAmount * 0.2;
        }
    }

    public void calculateTax() {
        this.tax = this.totalAmount * 0.15;
    }

    public void printOrderDetails() {
        double finalAmount = totalAmount - this.discount + this.tax;
        System.out.println("Customer: " + this.customerName);
        System.out.println("Customer Type: " + this.customerType);
        System.out.println("Items: " + String.join(", ", this.items));
        System.out.println("Total Amount: " + this.totalAmount);
        System.out.println("Discount: " + this.discount);
        System.out.println("Tax: " + this.tax);
        System.out.println("Final Amount: " + finalAmount);
    }
}
