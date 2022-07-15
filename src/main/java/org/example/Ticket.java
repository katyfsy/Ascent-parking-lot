package org.example;

public class Ticket {
    private double timeEntered;
    private String carLicensePlate;
    private String carColor;
    public Ticket(double timeEntered, Car car) {
        this.timeEntered = timeEntered;
        this.carLicensePlate = car.getLicensePlate();
        this.carColor = car.getColor();
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
}

