package eTicaret.business.abstracts;

import eTicaret.entities.concretes.Customer;

public interface CustomerService {
	void add(Customer customer);
	void login(Customer customer, String eMail, String password);
	

}
