package org.example;

import java.util.Random;

public class Ticket {
    private double timeEntered;
    private String carLicensePlate;
    private String carColor;
    private String id;
    public Ticket(double timeEntered, Car car) {
        this.timeEntered = timeEntered;
        this.carLicensePlate = car.getLicensePlate();
        this.carColor = car.getColor();
        this.id = getSaltString();
    }

    protected String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 7) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }

    public double getTimeEntered() {
        return timeEntered;
    }

    public String getCarLicensePlate() {
        return carLicensePlate;
    }

    public String getCarColor() {
        return carColor;
    }

    public String getTicketID() {
        return id;
    }
}

