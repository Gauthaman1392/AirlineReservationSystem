package org.AirlineRepositories.DAO;

import javax.persistence.RollbackException;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.SystemException;

import org.AirlineRepositories.entity.Flight;


public interface FlightInterface {
	
	boolean createdetails(Flight flight) throws SecurityException, javax.transaction.RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException;
	   
	Flight finddetails(int flightid);

    
    boolean deletedetails(int flightid) throws SecurityException, javax.transaction.RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException;
    
    boolean updatedetails(Flight flight) throws SecurityException, javax.transaction.RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException;
}
