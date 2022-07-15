package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParkingLot {
    private int size = 0;
    private int hourlyFee = 0;
    private int dailyFee = 0;
    private int prescribedHours = 0;

    private Ticket[] carParked;

    private boolean[] parkingSlotsStatus;

    public ParkingLot(int size, int hourlyFee, int dailyFee, int prescribedHours) {
        this.size = size;
        this.hourlyFee = hourlyFee;
        this.dailyFee = dailyFee;
        this.prescribedHours = prescribedHours;
        this.parkingSlotsStatus = new boolean[size];
        this.carParked = new Ticket[size];
        Arrays.fill(this.parkingSlotsStatus, true);
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

    public boolean[] getParkingSlot() {
        return parkingSlotsStatus;
    }

    public int getNextAvailableParkingSlot() {
        for(int i = 0; i < size; i++) {
            if (parkingSlotsStatus[i] == true) {
                return i + 1;
            }
        }
        return -1;
    }

    public void parkCar(Ticket ticket) {
        parkingSlotsStatus[ticket.getParkingSlot() - 1] = false;
        carParked[ticket.getParkingSlot() - 1] = ticket;
    }

    public int carLeaves(Ticket ticket, double exitTime) {
        parkingSlotsStatus[ticket.getParkingSlot() - 1] = true;
        carParked[ticket.getParkingSlot() - 1] = null;
        return getFee(ticket, exitTime);
    }

    public int getFee(Ticket ticket, double exitTime) {
        double timePassed = exitTime - ticket.getTimeEntered();
        if (timePassed < 1) {
            return 0;
        } else if (timePassed < prescribedHours) {
            return (int) Math.ceil(timePassed) * hourlyFee;
        } else {
            return dailyFee;
        }
    }

    public List<String> getLicensePlatesOfColour(String color) {
        List<String> licensePlates = new ArrayList<>();
        for (int i = 0; i < parkingSlotsStatus.length; i ++) {
            if (parkingSlotsStatus[i] == false) {
                if ((carParked[i].getCarColor()).equals(color)) {
                    licensePlates.add(carParked[i].getCarLicensePlate());
                }
            }
        }
        return licensePlates;
    }

    public List<Integer> getSlotNumbersByColour(String color) {
        List<Integer> slotNumbers = new ArrayList<>();
        for (int i = 0; i < parkingSlotsStatus.length; i ++) {
            if (parkingSlotsStatus[i] == false) {
                if ((carParked[i].getCarColor()).equals(color)) {
                    slotNumbers.add(carParked[i].getParkingSlot());
                }
            }
        }
        return slotNumbers;
    }

    public int getSlotNumbersByLicensePlate(String licensePlate) {
        for (int i = 0; i < parkingSlotsStatus.length; i ++) {
            if (parkingSlotsStatus[i] == false) {
                if ((carParked[i].getCarLicensePlate()).equals(licensePlate)) {
                    return carParked[i].getParkingSlot();
                }
            }
        }
        return -1;
    }
}
