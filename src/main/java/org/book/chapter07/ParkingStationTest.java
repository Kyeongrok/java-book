package org.book.chapter07;

public class ParkingStationTest {
    public static void main(String[] args) {
        ParkingStation parkingStation = new ParkingStation();
        parkingStation.pay(3000);
        parkingStation.pay(new Ticket());
        parkingStation.pay(1000, new Ticket());
    }
}
