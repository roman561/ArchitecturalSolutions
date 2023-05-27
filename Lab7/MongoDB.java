package edu.ua.khpi.architectural.solutions.lab7;

class MongoDB extends Database {
    @Override
    void connect() {
        System.out.println("Connected to MongoDB");
    }

    @Override
    void executeQuery(String query) {
        System.out.println("Executed query: " + query);
    }
}
