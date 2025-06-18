package OverLoading;

public class TravelBooking {

	    //  Bus ticket
	    public void bookTicket(String busNumber, String date) {
	        System.out.println("Bus Ticket Booked: " + busNumber + " on " + date);
	    }

	    //  Flight ticket
	    public void bookTicket(String flightNumber, String date, String seatClass) {
	        System.out.println("Flight Ticket Booked: " + flightNumber + " on " + date + " (Class: " + seatClass + ")");
	    }

	    // Train ticket
	    public void bookTicket(String trainNumber, String date, int coachNumber) {
	        System.out.println("Train Ticket Booked: " + trainNumber + " on " + date + " (Coach: " + coachNumber + ")");
	    }

	    public static void main(String[] args) {
	        TravelBooking booking = new TravelBooking();
	        booking.bookTicket("BUS100", "2025-05-10");
	        booking.bookTicket("FL200", "2025-06-15", "Economy");
	        booking.bookTicket("TR300", "2025-07-01", 5);
	    }
	}
