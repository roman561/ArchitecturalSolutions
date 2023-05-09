package edu.ua.khpi.architectural.solutions.lab2;

import java.util.Date;

public interface RegistrationMediator {
    void deliverOn(Date date);
    void enableContactInfo(boolean enabled);
    void enablePickup(boolean enabled);
    void updateName(String name);
    void updatePhoneNumber(String phoneNumber);
}