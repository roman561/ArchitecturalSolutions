package edu.ua.khpi.architectural.solutions.lab5;

public class OrderApi extends MainApi {
    protected void validate(BaseEntity entity) {
        Order order = (Order) entity;
        if (!order.validate()) {
            throw new IllegalException("Validation failed");
        }
    }

    protected void save(BaseEntity entity) {
        Order order = (Order) entity;
    }

    protected void notifyAdmin(BaseEntity entity) {
    }

    public void update(Order order) {
        super.update(order);
        String json = order.toJson();
    }
}
