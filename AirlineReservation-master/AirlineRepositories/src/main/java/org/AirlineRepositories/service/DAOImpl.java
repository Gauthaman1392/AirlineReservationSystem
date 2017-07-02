package org.AirlineRepositories.service;

import javax.management.Query;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.AirlineRepositories.entity.Flight;
import org.AirlineRepositories.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DAOImpl implements org.AirlineRepositories.DAO.DAOInterface {
	
	HibernateUtils hibernateUtil = new HibernateUtils();
	SessionFactory factory = hibernateUtil.buildSessionFactory();
	Session session = factory.openSession(); 	
	DAOImpl daoImplementation = new DAOImpl();

	public boolean save(Flight flight) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException  {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Transaction transaction = (Transaction) session.beginTransaction();
		session.save(flight);
		transaction.commit();
		session.close();
		return false;
		
	}

	public Flight get(int flightid) {
		// TODO Auto-generated method stub
		factory = hibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		Flight flight = (Flight) session.get(Flight.class, flightid);
		session.getTransaction().commit();
		session.close();

		return flight;	
	}

	public boolean delete(int flightid) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Transaction transaction = (Transaction) session.beginTransaction();
		String hql = "delete Employee where id =: id";
		Query query = (Query) session.createQuery(hql).setParameter("id", flightid);
		((org.hibernate.Query) query).executeUpdate();
		transaction.commit();
		session.close();
		return true;
		
	}

	public boolean update(Flight flight) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Transaction transaction = (Transaction) session.beginTransaction();
		session.update(flight);

		transaction.commit();
		session.close();

		return true;
	}

}
