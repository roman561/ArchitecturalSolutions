package edu.ua.khpi.architectural.solutions.lab10;

import java.util.List;
class SelectElement implements FormElement {
    private String name;
    private List<String> options;

    public SelectElement(String name, List<String> options) {
        this.name = name;
        this.options = options;
    }

    @Override
    public String toString() {
        return " SelectElement{ " +
                " name=' " + name + '\'' +
                " , options= " + options +
                '}';
    }

    @Override
    public void render() {
        System.out.println(" <select name=\" " + name + "\">");
        for (String option : options) {
            System.out.println(" <option value=\" " + option + "\">" + option + " </option> ");
        }
        System.out.println(" </select> ");
    }
}
