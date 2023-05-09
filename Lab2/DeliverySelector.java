package edu.ua.khpi.architectural.solutions.lab2;

import java.util.Date;

public class DeliverySelector {
    private RegistrationMediator mediator;

    public DeliverySelector(RegistrationMediator mediator) {
        this.mediator = mediator;
    }

    public void selectDelivery(Date date) {
        mediator.deliverOn(date);
    }

}