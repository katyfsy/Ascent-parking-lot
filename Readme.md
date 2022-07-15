# Parking Lot
This is a project to manage a parking lot. It has an automated ticketing system that facilitates the interactions between any user and the parking lot.

### Project Detailing & Use Cases
- A parking lot can hold up to 'n' cars at any given point in time.
- Parking in this lot has a per whole hour fee.  Customers who spend less than 1 whole hour, are not charged anything.
- Parking in this lot has a daily fee based on a number of hours chosen by the owner.  The daily fee would kick in after the prescribed number of whole hours has passed.
- Parking spaces are numbered from 1 to the maximum number of spaces on the lot
- When a car enters the parking lot, a ticket is created. The ticket issuing process includes documenting the time entered, license plate number and the color of the car and allocating an available parking slot to the car. The ticket ID should be a random sequence of numbers and characters.
- Upon exit, the customer returns the ticket which then marks the slot they were using as being available.  The system should calculate the time, in whole hours after the first hour, rounded up, and charge the customer accordingly either the hourly rate, or the daily rate.
- The ticketing system should be able to provide
    - License plate numbers of all cars of a particular colour
    - Slot number in which a car with a given license plate number is parked
    - Slot numbers of all slots where a car of a particular color is parked

### Stretch Goal
- Add a command line interface to expose all the features of the app