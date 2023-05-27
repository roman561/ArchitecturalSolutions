package edu.ua.khpi.architectural.solutions.lab5;

abstract class   MainApi {
    protected abstract void validate(BaseEntity entity);
    protected abstract void save(BaseEntity entity);
    protected abstract void notifyAdministrator(BaseEntity entity);

    public void update(BaseEntity entity) {
        validate(entity);
        save(entity);
    }
}
