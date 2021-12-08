package eTicaret;

import eTicaret.business.abstracts.CustomerService;
import eTicaret.business.concretes.CustomerManager;
import eTicaret.business.concretes.EmailVerify;
import eTicaret.core.concrete.GoogleAdapter;
import eTicaret.dataAccess.concretes.HibernateCustomerDao;
import eTicaret.entities.concretes.Customer;




public class Main {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerManager(new HibernateCustomerDao(), new EmailVerify(), new GoogleAdapter());
		Customer customer = new Customer("Azizhan","Tutucu","aziztutucu@ornek.com","123456");
		Customer customer2= new Customer("Ali","mehmet","ali@ornek.com","654321");
		customerService.add(customer);
		customerService.login(customer,"aziztutucu@ornek.com", "123456");
		customerService.add(customer2);
		customerService.login(customer2,"ali@ornek.com", "654321");
	
	}

}
