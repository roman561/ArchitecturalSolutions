package edu.ua.khpi.architectural.solutions.lab1;

import java.util.List;

public class MyChoiceIterator implements TouristAreaIterator {
    private List<TouristArea> places;
    private int position = 0;

    public MyChoiceIterator(List<TouristArea> places) {
        this.places = places;
    }

    @Override
    public boolean hasNext() {
        return position < places.size();
    }

    @Override
    public Object next() {
        TouristArea place = places.get(position);
        position++;
        return place;
    }

}