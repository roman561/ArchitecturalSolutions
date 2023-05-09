package edu.ua.khpi.architectural.solutions.lab3;

public class SettingsSnapshot {
    private final boolean receiveEmailNotifications;
    private final boolean receivePushNotifications;

    public SettingsSnapshot(boolean receiveEmailNotifications, boolean receivePushNotifications) {
        this.receiveEmailNotifications = receiveEmailNotifications;
        this.receivePushNotifications = receivePushNotifications;
    }

    public boolean getReceiveEmailNotifications() {
        return receiveEmailNotifications;
    }

    public boolean getReceivePushNotifications() {
        return receivePushNotifications;
    }
}