package edu.ua.khpi.architectural.solutions.lab5;

public class Order extends BaseEntity {
    private Product product;
    private User user;
    private int quantity;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean validate() {
        return true;
    }

    public String toJson() {
        return null;
    }
}
