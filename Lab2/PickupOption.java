package edu.ua.khpi.architectural.solutions.lab2;

public class PickupOption {
    private RegistrationMediator mediator;

    public PickupOption(RegistrationMediator mediator) {
        this.mediator = mediator;
    }

    public void togglePickupOption(boolean enabled) {
        mediator.enablePickup(enabled);
    }
}