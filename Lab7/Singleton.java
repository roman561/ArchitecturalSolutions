package edu.ua.khpi.architectural.solutions.lab7;

import java.util.HashMap;
import java.util.Map;

public class Singleton {
    private static Singleton instance;
    private Map<String,Database> databases;
    private Singleton() {
        databases = new HashMap<>();
    }
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        } return instance;
    }
    public void addDatabase(String name, Database database) {
        databases.put(name, database);
    }

   public Database getDatabase(String name) {
       return databases.get(name);
   }
}
