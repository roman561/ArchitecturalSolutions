package edu.ua.khpi.architectural.solutions.lab5;

public class Product extends BaseEntity {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public boolean validate() {
        return true;
    }
    public void notifyAdmin() {
    }
}
