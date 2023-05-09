package edu.ua.khpi.architectural.solutions.lab3;

public class SettingsCaretaker {
    private SettingsSnapshot snapshot;

    public void saveSnapshot(SettingsSnapshot snapshot) {
        this.snapshot = snapshot;
    }

    public SettingsSnapshot getSnapshot() {
        return snapshot;
    }
}