package edu.ua.khpi.architectural.solutions.lab4;

public class SelfPickupStrategy implements Strategy{
    @Override
    public double calculateCost(double distance) {

        return distance;
    }
}