package edu.ua.khpi.architectural.solutions.lab3;

public class Main {
    public static void main(String[] args) {
        Settings Settings = new Settings();

        SettingsCaretaker caretaker = new SettingsCaretaker();
        caretaker.saveSnapshot(Settings.saveToSnapshot());
    }
}