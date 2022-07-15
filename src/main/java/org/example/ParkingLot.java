package org.example;

public class ParkingLot {
    private int size = 0;
    private int hourlyFee = 0;
    private int dailyFee = 0;
    private int prescribedHours = 0;

    public ParkingLot(int size, int hourlyFee, int dailyFee, int prescribedHours) {
        this.size = size;
        this.hourlyFee = hourlyFee;
        this.dailyFee = dailyFee;
        this.prescribedHours = prescribedHours;
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
}
