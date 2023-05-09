package edu.ua.khpi.architectural.solutions.lab4;

public class ExternalDeliveryStrategy implements Strategy {
    @Override
    public double calculateCost(double distance) {

        return distance;
    }
}