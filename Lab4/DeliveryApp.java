package edu.ua.khpi.architectural.solutions.lab4;

public class DeliveryApp {
    private Strategy strategy;

    public void getStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public double calculateDeliveryCost(double distance) {
        return strategy.calculateCost(distance);
    }
}