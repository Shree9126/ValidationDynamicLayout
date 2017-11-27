package com.mindnotix.dynamiclayoutvalidation;



import java.util.List;

/**
 * Awesome Pojo Generator
 */

public class Surcharge {

    private String booking_id;

   // private List<Booking_surcharge> booking_surcharge;

    private String type;

    private String token;

    public void setBooking_id(String booking_id) {
        this.booking_id = booking_id;
    }

    public String getBooking_id() {
        return booking_id;
    }

//    public void setBooking_surcharge(List<Booking_surcharge> booking_surcharge) {
//        this.booking_surcharge = booking_surcharge;
//    }
//
//    public List<Booking_surcharge> getBooking_surcharge() {
//        return booking_surcharge;
//    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}