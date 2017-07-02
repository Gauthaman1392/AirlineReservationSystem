package org.AirlineRepositories.DAO;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import org.AirlineRepositories.entity.Flight;

public interface DAOInterface {

	public boolean save(Flight flight) throws SecurityException, RollbackException, HeuristicMixedException,
			HeuristicRollbackException, SystemException;

	public Flight get(int flightid);

	public boolean delete(int flightid) throws SecurityException, RollbackException, HeuristicMixedException,
			HeuristicRollbackException, SystemException;

	public boolean update(Flight flight) throws SecurityException, RollbackException, HeuristicMixedException,
			HeuristicRollbackException, SystemException;

}