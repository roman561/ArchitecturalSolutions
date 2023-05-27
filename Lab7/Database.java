package edu.ua.khpi.architectural.solutions.lab7;

abstract class Database {
    abstract void connect();
    abstract void executeQuery(String query);
}
