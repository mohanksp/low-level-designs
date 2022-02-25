package core.oodesign.structural.facade;

public class TravelPackageFacadeImpl implements TravelPackageFacade {

	@Override
	public void book() {

		FlightBooking flight = new FlightBookingImpl();
		flight.book();
		
		HotalBooking hotal = new HotalBookingImpl();
		hotal.book();
		
		CabBooking cab = new CabBookingImpl();
		cab.book();
		
		System.out.println("Travel package Booked");
	}

}
