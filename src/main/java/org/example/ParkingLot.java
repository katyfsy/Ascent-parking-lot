package org.example;

public class ParkingLot {
    private int size = 0;
    private int hourlyFee = 0;
    private int dailyFee = 0;
    private int prescribedHours = 0;

    private Ticket[] parkingSlots;

    public ParkingLot(int size, int hourlyFee, int dailyFee, int prescribedHours) {
        this.size = size;
        this.hourlyFee = hourlyFee;
        this.dailyFee = dailyFee;
        this.prescribedHours = prescribedHours;
        this.parkingSlots = new Ticket[size];
    }

    public int getSize() {
        return size;
    }

    public int getHourlyFee() {
        return hourlyFee;
    }
    public int getDailyFee() {
        return dailyFee;
    }

    public int getPrescribedHours() {
        return prescribedHours;
    }

    public Ticket[] getParkingSlot() {
        return parkingSlots;
    }
}
