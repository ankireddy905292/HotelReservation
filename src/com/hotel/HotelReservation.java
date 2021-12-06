package com.hotel;

public class HotelReservation {
    public static void main(String[] args) {

        HotelReservationMethods hotelReservationMethods = new HotelReservationMethods();
        hotelReservationMethods.addHotel("LakeWood", 110, 90);
        hotelReservationMethods.addHotel("BridgeWood", 150, 50);
        hotelReservationMethods.addHotel("RidgeWood", 220, 150);
        hotelReservationMethods.getHotelDetails();
        System.out.println("Welcome to solve hotel Reservation System");
    }
}



