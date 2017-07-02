package org.AirlineRepositories.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="flight")
public class Flight {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="airlineid")
	private int airlineid;
	private Integer flightId;
	private String airlineName;
	private String origin;
	private String destination;
	private String departureTime;
	private String arrivalTime;
	private String duration;
	private Integer totalSeats;
	private double price;
	private Integer availableSeats;
	@OneToMany(mappedBy="flight",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private FlightDetails flightdetails;
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Flight(int airlineid, Integer flightId, String airlineName, String origin, String destination,
			String departureTime, String arrivalTime, String duration, Integer totalSeats, double price,
			Integer availableSeats, FlightDetails flightdetails) {
		super();
		this.airlineid = airlineid;
		this.flightId = flightId;
		this.airlineName = airlineName;
		this.origin = origin;
		this.destination = destination;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.duration = duration;
		this.totalSeats = totalSeats;
		this.price = price;
		this.availableSeats = availableSeats;
		this.flightdetails = flightdetails;
	}
	public Flight(int airlineid, String airline_name, String from_location, String to_location, String dept_time,
			String arrival_time, String duration,Integer seats) {
		// TODO Auto-generated constructor stub
		this.airlineid=airlineid;
		this.airlineName=airline_name;
		this.origin=from_location;
		this.destination=to_location;
		this.departureTime=dept_time;
		this.arrivalTime=arrival_time;
		this.duration=duration;
		this.availableSeats=seats;
	}
	public int getAirlineid() {
		return airlineid;
	}
	public void setAirlineid(int airlineid) {
		this.airlineid = airlineid;
	}
	public Integer getFlightId() {
		return flightId;
	}
	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Integer getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(Integer totalSeats) {
		this.totalSeats = totalSeats;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Integer getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(Integer availableSeats) {
		this.availableSeats = availableSeats;
	}
	public FlightDetails getFlightdetails() {
		return flightdetails;
	}
	public void setFlightdetails(FlightDetails flightdetails) {
		this.flightdetails = flightdetails;
	}

}
