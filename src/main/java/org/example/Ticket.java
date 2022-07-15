package org.example;

public class Ticket {
    private double timeEntered;
    private String carLicensePlate;
    public Ticket(double timeEntered, Car car) {
        this.timeEntered = timeEntered;
        this.carLicensePlate = car.getLicensePlate();
    }

    public double getTimeEntered() {
        return timeEntered;
    }

    public String getCarLicensePlate() {
        return carLicensePlate;
    }
}

