package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	//need to inject session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getCustomers() {
		
		Session session=sessionFactory.getCurrentSession();
		
		Query<Customer> theQuery=session.createQuery("from Customer order by lastName", Customer.class);
		List<Customer> customers=theQuery.getResultList();
		return customers;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(theCustomer);
	}

	@Override
	public Customer getCustomers(int theId) {
		
		Session session=sessionFactory.getCurrentSession();
		Customer theCustomer=session.get(Customer.class, theId);
		
		return theCustomer;
	}

	@Override
	public void deleteCustomer(int theId) {
		Session session=sessionFactory.getCurrentSession();
		Customer theCustomer=session.get(Customer.class, theId);
		session.delete(theCustomer);
	}

	@Override
	public List<Customer> getCustomersByName(String theSearchName) {
		
		Session session=sessionFactory.getCurrentSession();
		Query theQuery=null;
		
		if(theSearchName!=null && theSearchName.trim().length()>0)
		{
			theQuery=session.createQuery("from Customer where lower(firstName) like :theName or lower(lastName) like :theName", Customer.class);
			theQuery.setParameter("theName", "%"+theSearchName.toLowerCase()+"%");
		}
		else
		{
			theQuery=session.createQuery("from Customer",Customer.class);
		}
		List<Customer> customers=theQuery.getResultList();
		
		return customers;
	}

}
