package org.AirlineRepositories.entity;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class FlightDetails {

	private Flight flight;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="PassengerProfileId", referencedColumnName="flightId")
	private int flightId;
    private String flightDepartureDate;
    private Double price;
    private Integer available_seats;
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getFlightDepartureDate() {
		return flightDepartureDate;
	}
	public void setFlightDepartureDate(String flightDepartureDate) {
		this.flightDepartureDate = flightDepartureDate;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getAvailable_seats() {
		return available_seats;
	}
	public void setAvailable_seats(Integer available_seats) {
		this.available_seats = available_seats;
	}
	public FlightDetails(Flight flight, int flightId, String flightDepartureDate, Double price,
			Integer available_seats) {
		super();
		this.flight = flight;
		this.flightId = flightId;
		this.flightDepartureDate = flightDepartureDate;
		this.price = price;
		this.available_seats = available_seats;
	}
	public FlightDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
  
}
