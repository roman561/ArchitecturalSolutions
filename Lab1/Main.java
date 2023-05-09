package edu.ua.khpi.architectural.solutions.lab1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<TouristArea> places = new ArrayList<>();
        places.add(new TouristArea("Place1", "Recommended"));
        places.add(new TouristArea("Place2", "Recommended"));
        places.add(new TouristArea("LocalPlace1", "Recommended by local guide"));
        System.out.println(places);

    }
}