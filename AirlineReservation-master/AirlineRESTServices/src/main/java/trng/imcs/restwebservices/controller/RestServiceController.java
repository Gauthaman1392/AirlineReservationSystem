package trng.imcs.restwebservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import trng.imcs.restwebservices.beans.FlightInformation;
import trng.imcs.restwebservices.services.FlightService;

@RestController
@RequestMapping("/rest")
public class RestServiceController {

	@Autowired
	FlightService flightService;

	@RequestMapping(value = "/{flightID}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_HTML_VALUE })
	public ResponseEntity<?> getFlight(@PathVariable String flightID) {

		FlightInformation flightInfo = flightService.getFlightInfo(Integer.parseInt(flightID));
		if (flightInfo == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(flightInfo, HttpStatus.ACCEPTED);
		}
	}

	@RequestMapping(method = RequestMethod.POST, consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_HTML_VALUE })
	public ResponseEntity<?> createFlight(@RequestBody FlightInformation flightInfo) {

		FlightInformation newFlightInfo = flightService.saveFlightDetails(flightInfo);
		return new ResponseEntity<>(newFlightInfo, HttpStatus.CREATED);
	}

	@RequestMapping(method = RequestMethod.PUT, consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public FlightInformation updateFlight(@RequestBody FlightInformation flightInfo){
		return flightService.updateFlight(flightInfo);
	}

	
	 @RequestMapping(value = "/{flightID}", method = RequestMethod.DELETE) public
	  ResponseEntity<?> deleteFlight(@PathVariable Integer flightID) { 
		 Integer fId = flightService.deleteFlight(flightID); 
		 if (fId == null) {
	  return new ResponseEntity<>(HttpStatus.BAD_REQUEST); } else {
	  
	  return new ResponseEntity<>(HttpStatus.ACCEPTED); }
	  
	  }
}
