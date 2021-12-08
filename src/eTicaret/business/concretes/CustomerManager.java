package eTicaret.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import eTicaret.business.abstracts.CustomerService;
import eTicaret.business.abstracts.Verify;
import eTicaret.core.abstracts.GoogleService;
import eTicaret.dataAccess.abstracts.CustomerDao;
import eTicaret.entities.concretes.Customer;

public class CustomerManager implements CustomerService {

	private CustomerDao customerDao;
	private Verify verify;
	private GoogleService googleService;

	public CustomerManager(CustomerDao customerDao, Verify verify, GoogleService googleService) {
		super();
		this.customerDao = customerDao;
		this.verify=verify;
		this.googleService= googleService;
	}
	String regex = "^(.+)@(.+)\\.(.+)$"; 
	Pattern pattern = Pattern.compile(regex);
	
	List<String> checkEmail = new ArrayList<String>();
	@Override
	public void add(Customer customer ) {
		if(customer.getFirstName().length()<2 || customer.getLastName().length()<2) {
			System.out.println("isim veya soyisim 2 karakterden küçük olamaz.");
			return;
		}
		else if(customer.getPassword().length()<6) {
			System.out.println("Parola iki karakterden küçük olamaz.");
			return;
		}
		else if(checkEmail.contains(customer.geteMail())) {
			System.out.println("Email kullanýlmaktadýr."+customer.getFirstName());
			return;
		}
		else if (pattern.matcher(customer.geteMail()).matches()==false) {
			System.out.println("Geçerli bir eposta giriniz. "+customer.getFirstName()+ " ornek@ornek.com");
			return;
		}
		this.checkEmail.add(customer.geteMail());
		this.customerDao.add(customer);
		this.verify.verify(customer);
		this.verify.isVerify(customer);
		
	}
	@Override
	public void login(Customer customer, String eMail, String password) {
		if(customer.geteMail()==eMail & customer.getPassword()==password) {
			System.out.println("Giriþ baþarýlý");
			
		}else {
			System.out.println("Giriþ baþarýsýz.");
		}
			
		}
	
		
	}

	
		
	


	
