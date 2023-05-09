package edu.ua.khpi.architectural.solutions.lab2;

public class Main {
    public static void main(String[] args) {
        RegistrationPage registrationPage = new RegistrationPage();
        PickupOption pickup = new PickupOption(registrationPage);
        ContactInfo contactInfo = new ContactInfo(registrationPage);
        DeliverySelector dateSelector = new DeliverySelector(registrationPage);
        System.out.println(registrationPage);
        System.out.println(dateSelector);
        System.out.println(pickupCheckbox);
        System.out.println(contactFields);
    }
}