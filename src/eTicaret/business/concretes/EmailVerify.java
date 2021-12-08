package eTicaret.business.concretes;

import eTicaret.business.abstracts.Verify;
import eTicaret.entities.concretes.Customer;

public class EmailVerify implements Verify{

	@Override
	public void verify(Customer customer) {
		System.out.println("Email doðrulama yollandý. "+ customer.geteMail());
		
	}

	@Override
	public void isVerify(Customer customer) {
		System.out.println("Email doðrulandý. "+ customer.geteMail());
		
	}

}
