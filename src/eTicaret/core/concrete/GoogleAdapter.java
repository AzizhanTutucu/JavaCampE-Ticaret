package eTicaret.core.concrete;

import eTicaret.core.abstracts.GoogleService;
import eTicaret.google.GoogleManager;

public class GoogleAdapter implements GoogleService{

	@Override
	public void addToGoogle(String message) {
		GoogleManager googleManager= new GoogleManager();
		googleManager.add("Google ile kaydolundu. ");
		
	}

}
