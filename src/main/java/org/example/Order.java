package org.example;

import java.util.List;
import java.util.ArrayList;


// Carlos Ramírez Lizán
public class Order {

    public String customerName;
    public CustomerType customerType;
    public List<String> items;
    public double totalAmount;
    public double discount;
    public double tax;

    /**
     * Public constructor of Order class
     * @param nombre
     * @param customerType
     * @param items
     * @param totalAmount
     */
    public Order(String nombre,
                 CustomerType customerType,
                 List<String> items,
                 double totalAmount) {
        customerName = nombre;
        this.customerType = customerType;
        this.items = items;
        this.totalAmount = totalAmount;
        this.discount = 0;
        this.tax = 0;
    }

    /**
     * If customer is regular
     *      totamAmount mayor a 100, se aplica un 5%
     *      totamAmount mayor a 500, se aplica un 10%
     */
    public void applyDiscount() {
        if (this.customerType.equals(CustomerType.REGULAR)) {
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

    public String returnOrderDetails() {
        double finalAmount = totalAmount - this.discount + this.tax;
        return "Customer: " + this.customerName +
                " Customer Type: " + this.customerType +
                " Items: " + String.join(", ", this.items) +
                " Total Amount: " + this.totalAmount +
                " Discount: " + this.discount +
                " Tax: " + this.tax +
                " Final Amount: " + finalAmount;
    }
}
