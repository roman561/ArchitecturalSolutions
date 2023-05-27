package edu.ua.khpi.architectural.solutions.lab5;

public class UserApi extends MainApi {
    protected void validate(BaseEntity entity) {
        User user = (User) entity;
        if (user.getEmail() != null) {
            throw new IllegalException("Email cannot be updated");
        }
        if (!user.validate()) {
            throw new IllegalException("Validation failed");
        }
    }
    protected void save(BaseEntity entity) {
    }

    protected void notifyAdministrator(BaseEntity entity) {
    }
}
