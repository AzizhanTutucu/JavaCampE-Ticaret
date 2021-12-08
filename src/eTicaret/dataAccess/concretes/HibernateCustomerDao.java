package eTicaret.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTicaret.dataAccess.abstracts.CustomerDao;
import eTicaret.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao {
	List<Customer> customers = new ArrayList<Customer>();

	@Override
	public void add(Customer customer) {
		System.out.println("Kullan�c� eklendi "+ customer.getFirstName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Kullan�c� silindi "+ customer.getFirstName());
		
	}

	@Override
	public void uptade(Customer customer) {
		
		System.out.println("Kullan�c� g�ncellendi "+ customer.getFirstName());
	}

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}


