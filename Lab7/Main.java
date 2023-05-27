package edu.ua.khpi.architectural.solutions.lab7;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        PostgresSQL postgresSQL = new PostgresSQL();
        singleton.addDatabase("PostgresSQL", postgresSQL);
        Database postgresql = singleton.getDatabase("PostgresSQL");
        postgresql.connect();
        postgresql.executeQuery("Select * users");

        MongoDB mongoDB = new MongoDB();
        singleton.addDatabase("MongoDB", mongoDB);
        Database mongodb = singleton.getDatabase("MongoDB");
        mongodb.connect();
        mongodb.executeQuery("db.users.find()");


    }
}
