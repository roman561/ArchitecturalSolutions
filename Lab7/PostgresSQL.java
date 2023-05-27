package edu.ua.khpi.architectural.solutions.lab7;

class PostgresSQL extends Database {
    @Override
    void connect() {
        System.out.println("Connected to PostgresSQL");
    }

    @Override
    void executeQuery(String query) {
        System.out.println("Executed query: " + query);
    }

}
