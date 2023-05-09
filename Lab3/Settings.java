package edu.ua.khpi.architectural.solutions.lab3;

public class Settings {
    private boolean receiveEmailNotifications;
    private boolean receivePushNotifications;

    public SettingsSnapshot saveToSnapshot() {
        return new SettingsSnapshot(receiveEmailNotifications, receivePushNotifications);
    }

    public void restoreFromSnapshot(SettingsSnapshot snapshot) {
        this.receiveEmailNotifications = snapshot.getReceiveEmailNotifications();
        this.receivePushNotifications = snapshot.getReceivePushNotifications();
    }
}