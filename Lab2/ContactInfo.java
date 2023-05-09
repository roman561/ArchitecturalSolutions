package edu.ua.khpi.architectural.solutions.lab2;

public class ContactInfo {
    private RegistrationMediator mediator;
    public ContactInfo(RegistrationMediator mediator) {
        this.mediator = mediator;
    }
    public void enableInfo(boolean enabled) {
        mediator.enableContactInfo(enabled);
    }

    public void updateName(String name) {
        mediator.updateName(name);
    }

    public void updatePhoneNumber(String phoneNumber) {
        mediator.updatePhoneNumber(phoneNumber);
    }
}