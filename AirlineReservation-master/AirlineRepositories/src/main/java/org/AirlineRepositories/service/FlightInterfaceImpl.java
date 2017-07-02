package org.AirlineRepositories.service;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import org.AirlineRepositories.DAO.FlightInterface;
import org.AirlineRepositories.entity.Flight;

public class FlightInterfaceImpl implements FlightInterface {
	
	private DAOImpl daoImplementation;

	public boolean createdetails(Flight flight) throws SecurityException, RollbackException, HeuristicMixedException,
			HeuristicRollbackException, SystemException {
		// TODO Auto-generated method stub
		boolean flag = daoImplementation.save(flight);
		return true;
	}

	public Flight finddetails(int flightid) {
		// TODO Auto-generated method stub
		Flight flight = daoImplementation.get(flightid);
		return flight;
	}

	public boolean deletedetails(int flightid) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
		// TODO Auto-generated method stub
		boolean flag = daoImplementation.delete(flightid);
		return true;
	}

	public boolean updatedetails(Flight flight) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
		// TODO Auto-generated method stub
		boolean flag = daoImplementation.update(flight);
		return true;	
	}

}
