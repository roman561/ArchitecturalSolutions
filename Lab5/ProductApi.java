package edu.ua.khpi.architectural.solutions.lab5;

public class ProductApi extends MainApi {
    protected void validate(BaseEntity entity) {
        Product product = (Product) entity;
        if (!product.validate()) {
            product.notifyAdministrator();
            throw new IllegalException("Validation failed");
        }
    }

    protected void save(BaseEntity entity) {
    }

    protected void notifyAdministrator(BaseEntity entity) {
    }
}
