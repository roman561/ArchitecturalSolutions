package edu.ua.khpi.architectural.solutions.lab10;

import java.util.ArrayList;
import java.util.List;

public class Fieldset implements FormElement {
    private List<FormElement> elements;

    public Fieldset() {
        elements = new ArrayList<>();
    }

    public void addElement(FormElement element) {
        elements.add(element);
    }

    @Override
    public void render() {
        System.out.println(" <fieldset> ");
        for (FormElement element : elements) {
            element.render();
        }
        System.out.println(" </fieldset> ");
    }

    @Override
    public String toString() {
        return " Fieldset { " +
                " elements= " + elements +
                '}';
    }
}
