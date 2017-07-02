package trng.imcs.restwebservices.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import trng.imcs.restwebservices.beans.FlightInformation;


@Service
public class FlightService {
	private final AtomicLong empIdGen = new AtomicLong();

	List<FlightInformation> flightInformations = new ArrayList<FlightInformation>();

	public FlightInformation getFlightInfo(Integer flightID) {
		FlightInformation flightInformation = new FlightInformation();
		flightInformation.setAirlineId(1001);
		flightInformation.setAirlineName("AmericanAirlines");
		flightInformation.setArrivalTime("08:00");
		flightInformation.setDuration("14");
		flightInformation.setDepartureTime("01:00");
		flightInformation.setAvailableSeats(200);
		flightInformation.setDestination("France");
		flightInformation.setOrigin("USA");
		flightInformation.setPrice(800.0);
		flightInformation.setTotalSeats(120);
		flightInformation.setFlightId(flightID);
		
		return flightInformation;
	}

	public FlightInformation saveFlightDetails(FlightInformation flightInfo) {
		//flightInfo.setEmpNo("" + empIdGen.incrementAndGet());
		//flightInfo.add(employee);
		return flightInfo;
	}

	public FlightInformation updateFlight(FlightInformation source) {
		FlightInformation flightInfo = getFlightInfo(source.getAirlineId());
		flightInfo.setAirlineName(source.getAirlineName());
		flightInfo.setArrivalTime(source.getArrivalTime());
		flightInfo.setDuration(source.getDuration());
		flightInfo.setDepartureTime(source.getDepartureTime());
		flightInfo.setAvailableSeats(source.getAvailableSeats());
		flightInfo.setDestination(source.getDestination());
		flightInfo.setOrigin(source.getOrigin());
		flightInfo.setPrice(source.getPrice());
		flightInfo.setTotalSeats(source.getTotalSeats());
		flightInfo.setFlightId(source.getFlightId());
		

		return flightInfo;
	}
	public Integer deleteFlight(Integer flightId) {

		for (FlightInformation flightInformation : flightInformations) {
			if (flightInformation.getAirlineId().equals(flightId)) {
				flightInformations.remove(flightInformation);
				return flightId;
			}
		}
		return null;
	}


}
