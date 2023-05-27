package edu.ua.khpi.architectural.solutions.lab10;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FormElement usernameInput = new InputElement("username");
        FormElement countrySelect = new SelectElement("country", List.of("USA", "Canada", "Europe"));

        Fieldset personalInfoFieldset = new Fieldset();
        personalInfoFieldset.addElement(usernameInput);
        personalInfoFieldset.addElement(countrySelect);

        personalInfoFieldset.render();
    }

}
