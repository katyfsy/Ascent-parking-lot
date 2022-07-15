package org.example;

public class ParkingLot {
    private int size = 0;
    private int hourlyFee = 0;
    public ParkingLot(int size, int hourlyFee) {
        this.size = size;
        this.hourlyFee = hourlyFee;
    }

    public int getSize() {
        return size;
    }

    public int getHourlyFee() {
        return hourlyFee;
    }
}
