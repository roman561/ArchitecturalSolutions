package edu.ua.khpi.architectural.solutions.lab2;

import java.util.Date;
import java.util.List;

public class RegistrationPage implements RegistrationMediator {

    private Date deliveryDate;
    private boolean isPickup;
    private boolean showContactInfo;
    private String name;
    private String phoneNumber;

    @Override
    public void deliverOn(Date date) {
        this.deliveryDate = date;
    }

    @Override
    public void enableContactInfo(boolean enabled) {
        this.showContactFields = enabled;
    }

    @Override
    public void enablePickup(boolean enabled) {
        this.isPickup = enabled;
        if (enabled) {
            this.showContactInfo = false;
        }
    }

    public void updateName(String name) {
        this.name = name;
    }

    public void updatePhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}