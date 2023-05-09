package edu.ua.khpi.architectural.solutions.lab1;

import java.util.List;

public class NavigatorIterator implements TouristAreaIterator{
    private List<TouristArea> places;
    private int position = 0;

    public NavigatorIterator(List<TouristArea> places) {
        this.places = places;
    }

    @Override
    public boolean hasNext() {
        while (position < places.size()) {
            TouristArea place = places.get(position);
            if (place.getLocation().equals("Recommended")) {
                return true;
            }
            position++;
        }
        return false;
    }

    @Override
    public Object next() {
        TouristArea place = places.get(position);
        position++;
        return place;
    }
}