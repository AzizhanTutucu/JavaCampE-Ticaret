package eTicaret.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTicaret.dataAccess.abstracts.CustomerDao;
import eTicaret.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao {
	List<Customer> customers = new ArrayList<Customer>();

	@Override
	public void add(Customer customer) {
		System.out.println("Kullanýcý eklendi "+ customer.getFirstName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Kullanýcý silindi "+ customer.getFirstName());
		
	}

	@Override
	public void uptade(Customer customer) {
		
		System.out.println("Kullanýcý güncellendi "+ customer.getFirstName());
	}

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}


